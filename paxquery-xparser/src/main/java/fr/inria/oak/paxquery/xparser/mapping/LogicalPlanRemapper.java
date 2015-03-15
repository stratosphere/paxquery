package fr.inria.oak.paxquery.xparser.mapping;

import java.util.ArrayList;
import java.util.List;

import fr.inria.oak.paxquery.algebra.logicalplan.LogicalPlan;
import fr.inria.oak.paxquery.algebra.operators.BaseLogicalOperator;
import fr.inria.oak.paxquery.algebra.operators.binary.CartesianProduct;
import fr.inria.oak.paxquery.algebra.operators.binary.LeftOuterNestedJoin;
import fr.inria.oak.paxquery.algebra.operators.border.*;
import fr.inria.oak.paxquery.algebra.operators.unary.Aggregation;
import fr.inria.oak.paxquery.algebra.operators.unary.DuplicateElimination;
import fr.inria.oak.paxquery.algebra.operators.unary.GroupBy;
import fr.inria.oak.paxquery.algebra.operators.unary.Selection;
import fr.inria.oak.paxquery.common.exception.PAXQueryExecutionException;
import fr.inria.oak.paxquery.common.predicates.ConjunctivePredicate;
import fr.inria.oak.paxquery.common.predicates.DisjunctivePredicate;
import fr.inria.oak.paxquery.common.predicates.SimplePredicate;
import fr.inria.oak.paxquery.common.xml.construction.ConstructionTreePatternNode;
import fr.inria.oak.paxquery.common.xml.construction.ConstructionTreePatternNode.ContentType;
import fr.inria.oak.paxquery.common.xml.navigation.Variable;

/**
 * Goes through a logical plan and updates the positions of the columns used as data inputs.
 * This update is needed since after having parsed the query the variables' positions in the pattern node forest are recomputed.
 * @author jalvaro
 */
public class LogicalPlanRemapper {
	public static boolean print = true;

	/**
	 * Goes through a logical plan and updates the positions of the columns used as data inputs.
	 * @param logicalPlan the plan to go through
	 * @param varMap a VarMap object containing the variables remapping information
	 */
	public static void remapLogicalPlan(LogicalPlan logicalPlan, VarMap varMap) {
		traverseLogicalPlanDFS(logicalPlan.getRoot(), varMap);		
	}

	/**
	 * Goes through a logical plan in POSTORDER and updates the positions of the columns used as data inputs.
	 * The postorder traversal guarantees that the operator update is done bottom-up and allows to calculate the 
	 * length of the tuple generated by each operator.
	 * @param logicalPlan the plan to go through
	 * @param varMap a VarMap object containing the variables remapping information
	 */
	private static Integer traverseLogicalPlanDFS(BaseLogicalOperator operator, VarMap varMap) {
		ArrayList<Integer> sublengths = new ArrayList<Integer>();
		ArrayList<BaseLogicalOperator> children = operator.getChildren();
		if(children != null) {
			//recursive call for descendant sub-trees, recursion ends when children.size()==0
			for(BaseLogicalOperator child : children)
				sublengths.add(traverseLogicalPlanDFS(child, varMap));
		}
		//visit this node
		Integer outputLength = visitLogicalOperator(operator, varMap, sublengths);
		return outputLength;
	}
	
	/**
	 * Change the temporary positions of variables used in operator to their final temporary positions according to varMap
	 * @param operator the logical operator
	 * @param varMap a VarMap object containing the temporary positions of variables
	 */
	private static Integer visitLogicalOperator(BaseLogicalOperator operator, VarMap varMap, ArrayList<Integer> sublengths) {
		Integer outputLength;
		if(operator instanceof XMLTreeConstruct)
			outputLength = visitLogicalOperator((XMLTreeConstruct) operator, varMap, sublengths);
		else if(operator instanceof DuplicateElimination)
			outputLength = visitLogicalOperator((DuplicateElimination) operator, varMap, sublengths);
		else if(operator instanceof Selection)
			outputLength = visitLogicalOperator((Selection) operator, varMap, sublengths);
		else if(operator instanceof GroupBy)
			outputLength = visitLogicalOperator((GroupBy) operator, varMap, sublengths);
		else if(operator instanceof LeftOuterNestedJoin)
			outputLength = visitLogicalOperator((LeftOuterNestedJoin) operator, varMap, sublengths);
		else if(operator instanceof Aggregation)
			outputLength = visitLogicalOperator((Aggregation) operator, varMap, sublengths);
		else if(operator instanceof CartesianProduct)
			outputLength = visitLogicalOperator((CartesianProduct) operator, varMap, sublengths);
		else if(operator instanceof XMLScan)
			outputLength = visitLogicalOperator((XMLScan) operator, varMap, sublengths);
		else
			throw new PAXQueryExecutionException("Variable remapping not implemented for operator " + operator.getName());

		return outputLength;
	}
	
	private static Integer visitLogicalOperator(XMLTreeConstruct construct, VarMap varMap, ArrayList<Integer> sublengths) {
		//first find the XMLScan operators that hang from construct
		ArrayList<BaseLogicalOperator> variableHolders = new ArrayList<BaseLogicalOperator>();
		findVariableHolderDescendants(construct, variableHolders);
		//then calculate the positions of the variables in those XMLScans relative to construct
		VariablePositionEquivalences equivalences = varMap.calculateFinalPositions(variableHolders);
		//then substitute
		substituteVariablesInCTP(construct.getConstructionTreePattern().getRoot(), equivalences);
		
		if(print == true && equivalences != null) {
			System.out.println("VarMap for " + construct.getClass().getSimpleName() +" " + varMap.printNamesFinals(equivalences));
			System.out.println("Output tuple length for "+construct.getClass().getSimpleName() + ": "+(sublengths.get(0)+1));
		}
		
		return sublengths.get(0);
	}
	
	private static void substituteVariablesInCTP(ConstructionTreePatternNode node, VariablePositionEquivalences equivalences) {
		//substitute
		substituteVariablesInCTPNode(node, equivalences);
		//go to children
		for(ConstructionTreePatternNode child : node.getChildren())
			substituteVariablesInCTP(child, equivalences);
	}
	
	private static void substituteVariablesInCTPNode(ConstructionTreePatternNode node, VariablePositionEquivalences equivalences) {
		if(node.getContentType() == ContentType.VARIABLE_PATH) {
			List<Integer> varPath = node.getVarPath();
			varPath.set(0, equivalences.getEquivalence(varPath.get(0)));
			for(int i = 1; i < varPath.size(); i++) {
				if(varPath.get(i) == -1)
					varPath.set(i, equivalences.getEquivalence(varPath.get(i)));
			}
			node.setVarPath(varPath);
		}
	}

	private static Integer visitLogicalOperator(DuplicateElimination dupElim, VarMap varMap, ArrayList<Integer> sublengths) { 
		//first find the XMLScan operators that hang from dupElim
		ArrayList<BaseLogicalOperator> variableHolders = new ArrayList<BaseLogicalOperator>();
		findVariableHolderDescendants(dupElim, variableHolders);
		//then calculate the positions of the variables in those XMLScans relative to dupElim
		VariablePositionEquivalences equivalences = varMap.calculateFinalPositions(variableHolders);
		//now substitute
		for(int i = 0; i < dupElim.columns.length; i++)
			dupElim.columns[i] = equivalences.getEquivalence(dupElim.columns[i]);
		dupElim.buildOwnDetails();
		
		return sublengths.get(0);
	}
	
	private static Integer visitLogicalOperator(Selection selection, VarMap varMap, ArrayList<Integer> sublengths) {
		//first find the XMLScan operators that hang from selection
		ArrayList<BaseLogicalOperator> variableHolders = new ArrayList<BaseLogicalOperator>();
		findVariableHolderDescendants(selection, variableHolders);
		//then calculate the positions of the variables in those XMLScans relative to selection
		VariablePositionEquivalences equivalences = varMap.calculateFinalPositions(variableHolders);
		//now substitute
		for(ConjunctivePredicate conjPred : ((DisjunctivePredicate) selection.getPred()).getConjunctivePreds()) {
			for(SimplePredicate simplePred : conjPred.getSimplePreds()) {
				if(simplePred.getColumn1() != -1)
					simplePred.setColumn1(equivalences.getEquivalence(simplePred.getColumn1()));
				if(simplePred.getColumn2() != -1)
				simplePred.setColumn2(equivalences.getEquivalence(simplePred.getColumn2()));
			}
		}		
		selection.buildOwnDetails();
		
		return sublengths.get(0);
	}
	
	private static Integer visitLogicalOperator(GroupBy groupBy, VarMap varMap, ArrayList<Integer> sublengths) {
		//first find the XMLScan operators that hang from groupBy
		ArrayList<BaseLogicalOperator> variableHolders = new ArrayList<BaseLogicalOperator>();
		findVariableHolderDescendants(groupBy, variableHolders);
		//then calculate the positions of the variables in those XMLScans relative to groupBy
		VariablePositionEquivalences equivalences = varMap.calculateFinalPositions(variableHolders);
		//now substitute
		int[] columns = groupBy.getGroupByColumns();
		for(int i = 0; i < columns.length; i++)
			columns[i] = equivalences.getEquivalence(columns[i]);
		groupBy.setGroupByColumns(columns);
		if(print) {
			System.out.print("groupByColumns: { ");
			for(int i = 0; i < columns.length-1; i++) {
				System.out.print(columns[i] + ", ");
			}
			System.out.println(columns[columns.length-1]+" }");
		}

		columns = groupBy.getReduceByColumns();
		for(int i = 0; i < columns.length; i++)
			columns[i] = equivalences.getEquivalence(columns[i]);
		groupBy.setReduceByColumns(columns);
		if(print) {
			System.out.print("reduceByColumns: { ");
			for(int i = 0; i < columns.length-1; i++) {
				System.out.print(columns[i] + ", ");
			}
			System.out.println(columns[columns.length-1]+" }");
		}

		columns = groupBy.getNestColumns();
		for(int i = 0; i < columns.length; i++)
			columns[i] = equivalences.getEquivalence(columns[i]);
		groupBy.setNestColumns(columns);
		if(print) {
			System.out.print("nestColumns: { ");
			for(int i = 0; i < columns.length-1; i++) {
				System.out.print(columns[i] + ", ");
			}
			System.out.println(columns[columns.length-1]+" }");
		}
		
		//calculate the length of the output tuple
		//we find how many columns from the inner TP are nested
		int subtractIndex = 0;
		for(int i = variableHolders.size()-1; i > 0 && variableHolders.get(i) instanceof XMLScan && ((XMLScan)variableHolders.get(i)).isAttachDocumentID() == false; i--) {
			subtractIndex += ((XMLScan)variableHolders.get(i)).getNavigationTreePattern().getAllVariables().size();
		}
		//sublengths.get(0)-subtractIndex yields the number of outer columns
		//we add 1 for the nested column that includes all nested columns from the inner TP
		Integer finalLength = sublengths.get(0)-subtractIndex+1; 
		if(print == true && equivalences != null) {
			System.out.println("VarMap for " + groupBy.getClass().getSimpleName() +" " + varMap.printNamesFinals(equivalences));
			System.out.println("Output tuple length for "+groupBy.getClass().getSimpleName() + ": "+finalLength);
		}
		return finalLength;
	}
		
	private static Integer visitLogicalOperator(LeftOuterNestedJoin lonjoin, VarMap varMap, ArrayList<Integer> sublengths) {
		//remap documentIDColumn and nodeIDColumns
		//first find the XMLScan operators that hang from groupBy
		ArrayList<BaseLogicalOperator> variableHolders = new ArrayList<BaseLogicalOperator>();
		findVariableHolderDescendants(lonjoin, variableHolders);
		//then calculate the positions of the variables in those XMLScans relative to lonjoin
		VariablePositionEquivalences equivalences = varMap.calculateFinalPositions(variableHolders);
		//now substitute
		lonjoin.setDocumentIDColumn(equivalences.getEquivalence(lonjoin.getDocumentIDColumn()));
		if(print)
			System.out.println("documentIDColumn: "+lonjoin.getDocumentIDColumn());
		int[] nodeIDs = lonjoin.getNodeIDColumns();
		for(int i = 0; i < nodeIDs.length; i++)
			nodeIDs[i] = equivalences.getEquivalence(nodeIDs[i]);
		lonjoin.setNodeIDColumns(nodeIDs);
		if(print) {
			System.out.print("nodeIDColumns: {");
			for(int i = 0; i < nodeIDs.length-1; i++)
				System.out.print(nodeIDs[i] + ", ");
			if(nodeIDs.length > 0)
				System.out.println(nodeIDs[nodeIDs.length-1]+" }");
		}

		//now remap the predicate
		for(ConjunctivePredicate conjPred : ((DisjunctivePredicate)lonjoin.getPred()).getConjunctivePreds()) {
			for(SimplePredicate simplePred : conjPred.getSimplePreds()) {
				if(simplePred.getVariable1() != null)
					simplePred.setColumn1(equivalences.getEquivalence(simplePred.getColumn1()));
				if(simplePred.getVariable2() != null)
					simplePred.setColumn2(equivalences.getEquivalence(simplePred.getColumn2()));
			}
		}
		if(print)
			System.out.println("Predicate: "+lonjoin.getPred().toString());
		if(print == true && equivalences != null) {
			System.out.println("VarMap for " + lonjoin.getClass().getSimpleName() +" " + varMap.printNamesFinals(equivalences));
			System.out.println("Output tuple length for "+lonjoin.getClass().getSimpleName() + ": "+(sublengths.get(0)+1));
		}
		
		//return equivalences;
		return sublengths.get(0)+1;
	}
	
	private static Integer visitLogicalOperator(Aggregation aggregation, VarMap varMap, ArrayList<Integer> sublengths) {
		//remap aggregationPath
		ArrayList<BaseLogicalOperator> variableHolders = new ArrayList<BaseLogicalOperator>();
		findVariableHolderDescendants(aggregation, variableHolders);
		//calculate the positions of the variables in those XMLScans relative to aggregation
		VariablePositionEquivalences equivalences = varMap.calculateFinalPositions(variableHolders);
		//now substitute
		int[] aggregationPath = aggregation.getAggregationPath();
		for(int i = 0; i < aggregationPath.length; i++)
			aggregationPath[i] = equivalences.getEquivalence(aggregationPath[i]);
		aggregation.setAggregationPath(aggregationPath);		
		
		if(print) {
			System.out.print("AggregationPath: {");
			for(int i = 0; i < aggregationPath.length-1; i++)
				System.out.print(aggregationPath[i] + ", ");
			System.out.println(aggregationPath[aggregationPath.length-1]+"}");
		}
		printInfo(aggregation, varMap, equivalences, sublengths.get(0)+1);
		
		return sublengths.get(0)+1;	
	}
	
	private static Integer visitLogicalOperator(CartesianProduct cp, VarMap varMap, ArrayList<Integer> sublengths) {
		return sublengths.get(0) + sublengths.get(1);
	}
	
	private static Integer visitLogicalOperator(XMLScan scan, VarMap varMap, ArrayList<Integer> sublengths) {
		Integer resultingTupleLength = scan.getNavigationTreePattern().getAllVariables().size();
		if(scan.isAttachDocumentID() == true)
			resultingTupleLength = resultingTupleLength + 1;
		return resultingTupleLength;
	}
	
	/**
	 * Fills the scansList input list with pointers to all XMLScan objects that are descendants of operator. Recursive method. 
	 * @param operator the root of the subtree whose leaves are XMLScan operators
	 * @param variableHoldersList an ArrayList containing pointers to those XMLScan objects contained in the subtree whose root is operator
	 */
	private static void findVariableHolderDescendants(BaseLogicalOperator operator, ArrayList<BaseLogicalOperator> variableHoldersList) {
		if(variableHoldersList == null)
			variableHoldersList = new ArrayList<BaseLogicalOperator>();
		
		if(operator.getChildren() != null) {
			for(BaseLogicalOperator child : operator.getChildren())
				findVariableHolderDescendants(child, variableHoldersList);
		}
		
		if(operator instanceof XMLScan || operator instanceof Aggregation)
			variableHoldersList.add(operator);
	}
	/*private static void findVariableHolderDescendants(BaseLogicalOperator operator, ArrayList<BaseLogicalOperator> variableHoldersList) {
		if(variableHoldersList == null)
			variableHoldersList = new ArrayList<BaseLogicalOperator>();
		
		if(operator.getChildren() != null) {
			if(operator instanceof LeftOuterNestedJoin)
				findVariableHolderDescendants(((LeftOuterNestedJoin) operator).getLeft(), variableHoldersList);
			else {
				for(BaseLogicalOperator child : operator.getChildren())
					findVariableHolderDescendants(child, variableHoldersList);
			}
		}
		
		if(operator instanceof XMLScan || operator instanceof Aggregation)
			variableHoldersList.add(operator);
	}*/

	
	/**
	 * Returns true if "var" points to a node of any of the TPs contained in "scans"; false otherwise
	 * @param var the variable
	 * @param variableHolders the XMLScan objects that store TPs
	 * @return true if "var" points to a node of any of the TPs contained in "scans"; false otherwise; false if "var" or "scans" are null.
	 */
	private static boolean isVariableInVariableHolders(Variable var, ArrayList<BaseLogicalOperator> variableHolders) {
		if(var == null || variableHolders == null)
			return false;
		for(BaseLogicalOperator variableHolder : variableHolders) {
			if(variableHolder instanceof XMLScan && var.getTreePattern() == ((XMLScan)variableHolder).getNavigationTreePattern())
				return true;
			if(variableHolder instanceof Aggregation && var == ((Aggregation)variableHolder).getOuterVariable())
				return true;
		}
		return false;
	}
	
	private static void printInfo(BaseLogicalOperator operator, VarMap varMap, VariablePositionEquivalences equivalences, int outputTupleLength) {
		if(print == true && equivalences != null) {
			System.out.println("VarMap for " + operator.getClass().getSimpleName() +" " + varMap.printNamesFinals(equivalences));
			System.out.println("Output tuple length for "+operator.getClass().getSimpleName() + ": "+outputTupleLength);
		}

	}
}