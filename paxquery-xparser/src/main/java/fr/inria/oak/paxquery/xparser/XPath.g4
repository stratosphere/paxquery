grammar XPath;

import XLexer;

/* Non-terminals */
xpath: expr_xp ;
expr_xp : orExpr_xp ;
orExpr_xp : andExpr_xp ( OR andExpr_xp )* ;
andExpr_xp : comparativeExpr_xp ( AND comparativeExpr_xp )* ;
comparativeExpr_xp : arithmeticExpr_xp ( ( EQ_S | NE_S | LT_S | GT_S | LE_S | GE_S) arithmeticExpr_xp)? ;
arithmeticExpr_xp : unaryExpr ( ( OP_ADD | OP_SUB | OP_MUL | 'div' | 'mod') unaryExpr )? ;
unaryExpr : ( OP_SUB )* valueExpr ;
valueExpr : filterExpr (pathExpr)? | pathExpr ;

//Actually SLASH (relativePathExpr)? is the correct expression (so '/' is accepted as valid XPath), but we are using
//SLASH (relativePathExpr) since expressions such as '$a/' and '$a/item/' are not valid in XQuery.
pathExpr : SLASH relativePathExpr			#pathExpr_slash
			| SLASHSLASH relativePathExpr 	#pathExpr_slashslash
			| relativePathExpr				#pathExpr_relativePathExpr
			;
relativePathExpr : stepExpr (relativePathExpr2)* ;
relativePathExpr2 :  SLASH stepExpr			#relativePathExpr2_slash
					| SLASHSLASH stepExpr	#relativePathExpr2_slashslash
					;

stepExpr : axisStep ;
axisStep : forwardStep predicateList_xp ;
forwardStep : abbrevForwardStep ;
abbrevForwardStep : ( '@' )? nodeTest ;
nodeTest : kindTest | nameTest ;
kindTest : textTest;
nameTest : 'div' | 'mod' | qName ;
filterExpr : primaryExpr predicateList_xp ;
predicateList_xp : ( predicate_xp )* ;
predicate_xp : '[' expr_xp ']' ;
primaryExpr : literal | parenthesizedExpr | functionCall ;
literal :  numericLiteral | STRING_LITERAL ;
numericLiteral : (OP_SUB)? ( INTEGER_LITERAL | DECIMAL_LITERAL ) ;
parenthesizedExpr : '(' expr_xp ')' ;
functionCall : functionName '(' ( expr_xp ( COMMA expr_xp )* )? ')' ;
functionName : 'concat' | 'substring' | NOT | 'floor' | 'ceiling' | 'true' | 'false' ;
textTest : 'text()' ;
qName : QNAME_TOKEN ;
