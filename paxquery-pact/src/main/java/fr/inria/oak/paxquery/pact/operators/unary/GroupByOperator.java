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
package fr.inria.oak.paxquery.pact.operators.unary;

import java.util.Iterator;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.lang.SerializationUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.types.Record;
import org.apache.flink.util.Collector;

import fr.inria.oak.paxquery.common.datamodel.metadata.NestedMetadata;
import fr.inria.oak.paxquery.pact.configuration.PACTOperatorsConfiguration;


/**
 * GroupBy operator in PACT.
 * 
 */
public class GroupByOperator extends BaseGroupByOperator {
	
	private static final Log logger = LogFactory.getLog(GroupByOperator.class);

	
	protected int[] groupByColumns;

	protected int[] nestColumns;

	
	@Override
	public void open(Configuration parameters) throws Exception {
		super.open(parameters);
		
		String groupByColumnsEncoded = parameters.getString(PACTOperatorsConfiguration.GROUP_BY_COLUMNS_BINARY.toString(), null);
		byte[] groupByColumnsBytes = DatatypeConverter.parseBase64Binary(groupByColumnsEncoded);
		final int[] groupByColumns = (int[]) SerializationUtils.deserialize(groupByColumnsBytes);
		this.groupByColumns = groupByColumns;
		
		String nestColumnsEncoded = parameters.getString(PACTOperatorsConfiguration.NEST_COLUMNS_BINARY.toString(), null);
		byte[] nestColumnsBytes = DatatypeConverter.parseBase64Binary(nestColumnsEncoded);
		final int[] nestColumns = (int[]) SerializationUtils.deserialize(nestColumnsBytes);
		this.nestColumns = nestColumns;
	}

	@Override
	public void reduce(Iterator<Record> records, Collector<Record> collector) throws InstantiationException, IllegalAccessException {
		groupBy(this.inputRecordsSignature, records, this.groupByColumns, this.nestColumns, collector);
	}
	
	public static void groupBy(NestedMetadata inputRecordsSignature, Iterator<Record> records, int[] groupByColumns,
			int[] nestColumns, Collector<Record> collector) throws InstantiationException, IllegalAccessException {
		groupBy(inputRecordsSignature, records, groupByColumns, nestColumns, -1, null, false, false, collector);		
	}

}
