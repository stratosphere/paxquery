/*******************************************************************************
 * Copyright (C) 2013, 2014 by Inria and Paris-Sud University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package fr.inria.oak.paxquery.algebra.operators.border;

import java.util.ArrayList;
import java.util.HashMap;

import fr.inria.oak.paxquery.common.datamodel.metadata.MetadataTypes;
import fr.inria.oak.paxquery.common.datamodel.metadata.NestedMetadata;
import fr.inria.oak.paxquery.common.datamodel.metadata.NestedMetadataUtils;
import fr.inria.oak.paxquery.common.exception.PAXQueryExecutionException;
import fr.inria.oak.paxquery.common.xml.treepattern.core.TreePattern;


/**
 * XML scan logical operator.
 *
 */
public class XMLScan extends BaseLeafOperator {
	
	private static int i = 0;
	
	private final String pathDocuments;
	
	private final String[] documentNames;
	
	private final TreePattern navigationTreePattern;
	
	private final boolean attachDocumentID;
	
	
	public XMLScan(boolean attachDocumentID, String pathDocuments) throws PAXQueryExecutionException {
		this.ownName = "XMLCollectionParse";
		this.pathDocuments = pathDocuments;
		this.documentNames = null;
		this.navigationTreePattern = null;
		this.attachDocumentID = attachDocumentID;
		if(this.attachDocumentID)
			this.nestedMetadata = new NestedMetadata(2, new MetadataTypes[]{MetadataTypes.STRING_TYPE, MetadataTypes.STRING_TYPE});
		else
			this.nestedMetadata = new NestedMetadata(1, new MetadataTypes[]{MetadataTypes.STRING_TYPE});
		this.visible = true;
	}
	
	public XMLScan(boolean attachDocumentID, TreePattern navigationTreePattern, String pathDocuments) {
		this.ownName = "XMLCollectionNav";
		this.ownDetails = navigationTreePattern.getName();
		this.pathDocuments = pathDocuments;
		this.documentNames = null;
		this.navigationTreePattern = navigationTreePattern;
		this.attachDocumentID = attachDocumentID;
		if(this.attachDocumentID)
			this.nestedMetadata = NestedMetadataUtils.appendNRSMD(
					new NestedMetadata(1, new MetadataTypes[]{MetadataTypes.STRING_TYPE}),
					NestedMetadataUtils.getNRSMD(this.navigationTreePattern.getRoot(), new HashMap<Integer, HashMap<String, ArrayList<Integer>>>()));
		else
			this.nestedMetadata = NestedMetadataUtils.getNRSMD(this.navigationTreePattern.getRoot(), new HashMap<Integer, HashMap<String, ArrayList<Integer>>>());
		this.visible = true;
	}
	
	public XMLScan(boolean attachDocumentID, String pathDocuments, String... documentNames) {
		this.ownName = "XMLCollectionParse";
		this.pathDocuments = pathDocuments;
		this.documentNames = documentNames;
		this.navigationTreePattern = null;
		this.attachDocumentID = attachDocumentID;
		if(this.attachDocumentID)
			this.nestedMetadata = new NestedMetadata(2, new MetadataTypes[]{MetadataTypes.STRING_TYPE, MetadataTypes.STRING_TYPE});
		else
			this.nestedMetadata = new NestedMetadata(1, new MetadataTypes[]{MetadataTypes.STRING_TYPE});
		this.visible = true;
	}
	
	public XMLScan(boolean attachDocumentID, TreePattern navigationTreePattern, String pathDocuments, String... documentNames) {
		this.ownName = "XMLCollectionNav";
		this.ownDetails = navigationTreePattern.getName();
		this.pathDocuments = pathDocuments;
		this.documentNames = documentNames;
		this.navigationTreePattern = navigationTreePattern;
		this.attachDocumentID = attachDocumentID;
		if(this.attachDocumentID)
			this.nestedMetadata = NestedMetadataUtils.appendNRSMD(
					new NestedMetadata(1, new MetadataTypes[]{MetadataTypes.STRING_TYPE}),
					NestedMetadataUtils.getNRSMD(this.navigationTreePattern.getRoot(), new HashMap<Integer, HashMap<String, ArrayList<Integer>>>()));
		else
			this.nestedMetadata = NestedMetadataUtils.getNRSMD(this.navigationTreePattern.getRoot(), new HashMap<Integer, HashMap<String, ArrayList<Integer>>>());
		this.visible = true;
	}
	
	public String getPathDocuments() {
		return this.pathDocuments;
	}
	
	public String[] getDocumentNames() {
		return this.documentNames;
	}
	
	public TreePattern getNavigationTreePattern() {
		return this.navigationTreePattern;
	}
	
	public boolean isAttachDocumentID() {
		return this.attachDocumentID;
	}

	@Override
	public String getName() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.ownName);
		sb.append("(");
		sb.append(this.pathDocuments);
		sb.append("/");
		sb.append(this.documentNames==null?"*":this.documentNames.toString());
		sb.append(")");
		return new String(sb);
	}

	@Override
	public void recDisplayNRSMD() {
		this.nestedMetadata.display();
	}
	
	@Override
	public int getJoinDepth() {
		return 0;
	}
	
	@Override
	public int recursiveDotString(StringBuffer sb, int parentNo, int firstAvailableNo) {
		String color, fillColor;
		if(i==0) {
			color = "#ffcfbf";
			fillColor = "#ff9999";
		}
		else if(i==1) {
			color = "#99ff99";
			fillColor = "#cfffbf";
		}
		else {
			color = "#ff99cc";
			fillColor = "#ffbfef";
		}
		i++;
		this.navigationTreePattern.draw(".", String.valueOf(System.currentTimeMillis()), false, fillColor, color);
		
		int selfNumber = -1;
		if (this.visible) {
			selfNumber = firstAvailableNo;
			
			sb.append(selfNumber
					+ " [color=\"" + color + "\" style=\"filled\" fillcolor=\"" + fillColor + "\" label=\""
					+ this.ownName);
			
			if(this.ownDetails != null && !this.ownDetails.equals("")) {
				sb.append("("
					+ this.ownDetails
					+ ")");
			}
			
			sb.append("\"] ; \n");
			
			if (parentNo != -1){
				sb.append(parentNo + " -> " + selfNumber + "\n");
			}
			return (firstAvailableNo + 1);
		}
		
		return firstAvailableNo;
	}

}