/*******************************************************************************
 * Copyright (C) 2013, 2014, 2015 by Inria and Paris-Sud University
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
package fr.inria.oak.paxquery.algebra.test.parser;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import fr.inria.oak.paxquery.algebra.operators.BaseLogicalOperator;
import fr.inria.oak.paxquery.algebra.operators.binary.CartesianProduct;
import fr.inria.oak.paxquery.algebra.operators.binary.Join;
import fr.inria.oak.paxquery.algebra.operators.binary.LeftOuterJoin;
import fr.inria.oak.paxquery.algebra.operators.binary.LeftOuterNestedJoin;
import fr.inria.oak.paxquery.algebra.operators.binary.LeftOuterNestedJoinWithAggregation;
import fr.inria.oak.paxquery.algebra.operators.border.XMLConstruct;
import fr.inria.oak.paxquery.algebra.operators.border.XMLScan;
import fr.inria.oak.paxquery.algebra.operators.unary.Aggregation;
import fr.inria.oak.paxquery.algebra.operators.unary.DuplicateElimination;
import fr.inria.oak.paxquery.algebra.operators.unary.Flatten;
import fr.inria.oak.paxquery.algebra.operators.unary.GroupBy;
import fr.inria.oak.paxquery.algebra.operators.unary.GroupByWithAggregation;
import fr.inria.oak.paxquery.algebra.operators.unary.Navigation;
import fr.inria.oak.paxquery.algebra.operators.unary.Projection;
import fr.inria.oak.paxquery.algebra.operators.unary.Selection;
import fr.inria.oak.paxquery.common.aggregation.AggregationType;
import fr.inria.oak.paxquery.common.predicates.ArithmeticOperation;
import fr.inria.oak.paxquery.common.predicates.ArithmeticOperation.Operation;
import fr.inria.oak.paxquery.common.predicates.ConjunctivePredicate;
import fr.inria.oak.paxquery.common.predicates.DisjunctivePredicate;
import fr.inria.oak.paxquery.common.predicates.BasePredicate;
import fr.inria.oak.paxquery.common.predicates.BasePredicate.PredicateType;
import fr.inria.oak.paxquery.common.predicates.SimplePredicate;
import fr.inria.oak.paxquery.common.xml.construction.ApplyConstruct;
import fr.inria.oak.paxquery.common.xml.navigation.NavigationTreePattern;
import fr.inria.oak.paxquery.common.xml.navigation.NavigationTreePatternUtils;

/** Token Manager. */
public class LogicalPlanParserTokenManager implements LogicalPlanParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 35;
            return 13;
         }
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 35;
            return 21;
         }
         if ((active0 & 0x10000L) != 0L)
            return 43;
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 35;
            return 16;
         }
         if ((active0 & 0x277f00000L) != 0L)
         {
            jjmatchedKind = 35;
            return 27;
         }
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 35;
            return 40;
         }
         return -1;
      case 1:
         if ((active0 & 0x3fff80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 1;
            return 27;
         }
         return -1;
      case 2:
         if ((active0 & 0x3fff80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 2;
            return 27;
         }
         return -1;
      case 3:
         if ((active0 & 0x100000L) != 0L)
            return 27;
         if ((active0 & 0x3ffe80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 3;
            return 27;
         }
         return -1;
      case 4:
         if ((active0 & 0x3ffe80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 4;
            return 27;
         }
         return -1;
      case 5:
         if ((active0 & 0x3ffe80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 5;
            return 27;
         }
         return -1;
      case 6:
         if ((active0 & 0x18fe80000L) != 0L)
         {
            if (jjmatchedPos != 6)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 6;
            }
            return 27;
         }
         if ((active0 & 0x270000000L) != 0L)
            return 27;
         return -1;
      case 7:
         if ((active0 & 0x1cfe80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 7;
            return 27;
         }
         return -1;
      case 8:
         if ((active0 & 0x1c7e80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 8;
            return 27;
         }
         if ((active0 & 0x8000000L) != 0L)
            return 27;
         return -1;
      case 9:
         if ((active0 & 0x1c1e80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 9;
            return 27;
         }
         if ((active0 & 0x6000000L) != 0L)
            return 27;
         return -1;
      case 10:
         if ((active0 & 0x100000000L) != 0L)
            return 27;
         if ((active0 & 0xc1e80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 10;
            return 27;
         }
         return -1;
      case 11:
         if ((active0 & 0xc0e80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 11;
            return 27;
         }
         if ((active0 & 0x1000000L) != 0L)
            return 27;
         return -1;
      case 12:
         if ((active0 & 0xc0c80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 12;
            return 27;
         }
         if ((active0 & 0x200000L) != 0L)
            return 27;
         return -1;
      case 13:
         if ((active0 & 0xc0c80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 13;
            return 27;
         }
         return -1;
      case 14:
         if ((active0 & 0xc0c80000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 14;
            return 27;
         }
         return -1;
      case 15:
         if ((active0 & 0xc0c00000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 15;
            return 27;
         }
         if ((active0 & 0x80000L) != 0L)
            return 27;
         return -1;
      case 16:
         if ((active0 & 0xc0c00000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 16;
            return 27;
         }
         return -1;
      case 17:
         if ((active0 & 0xc0c00000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 17;
            return 27;
         }
         return -1;
      case 18:
         if ((active0 & 0xc0000000L) != 0L)
         {
            if (jjmatchedPos != 18)
            {
               jjmatchedKind = 35;
               jjmatchedPos = 18;
            }
            return 27;
         }
         if ((active0 & 0xc00000L) != 0L)
            return 27;
         return -1;
      case 19:
         if ((active0 & 0x40800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 19;
            return 27;
         }
         if ((active0 & 0x80000000L) != 0L)
            return 27;
         return -1;
      case 20:
         if ((active0 & 0x40800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 20;
            return 27;
         }
         return -1;
      case 21:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 21;
            return 27;
         }
         if ((active0 & 0x40000000L) != 0L)
            return 27;
         return -1;
      case 22:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 22;
            return 27;
         }
         return -1;
      case 23:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 23;
            return 27;
         }
         return -1;
      case 24:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 24;
            return 27;
         }
         return -1;
      case 25:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 25;
            return 27;
         }
         return -1;
      case 26:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 26;
            return 27;
         }
         return -1;
      case 27:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 27;
            return 27;
         }
         return -1;
      case 28:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 28;
            return 27;
         }
         return -1;
      case 29:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 29;
            return 27;
         }
         return -1;
      case 30:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 30;
            return 27;
         }
         return -1;
      case 31:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 31;
            return 27;
         }
         return -1;
      case 32:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 35;
            jjmatchedPos = 32;
            return 27;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 5;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 36:
         return jjStopAtPos(0, 17);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 40:
         return jjStopAtPos(0, 8);
      case 41:
         return jjStopAtPos(0, 9);
      case 44:
         return jjStopAtPos(0, 7);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 71:
         return jjMoveStringLiteralDfa1_0(0x60000000L);
      case 74:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0xe00000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 88:
         return jjMoveStringLiteralDfa1_0(0x201000000L);
      case 91:
         return jjStopAtPos(0, 10);
      case 93:
         return jjStopAtPos(0, 11);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 38:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         break;
      case 77:
         return jjMoveStringLiteralDfa2_0(active0, 0x201000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2080000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8e00000L);
      case 103:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x64000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 124:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x201000000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0xe00000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x64000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 106:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 110:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 27);
         break;
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x10e80000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x60000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 79:
         return jjMoveStringLiteralDfa5_0(active0, 0xe00000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x208000000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x104080000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x60000000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 66:
         return jjMoveStringLiteralDfa6_0(active0, 0x60000000L);
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x202000000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x84000000L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0xe00000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x180000000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x8080000L);
      case 110:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(6, 28, 27);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(6, 33, 27);
         break;
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x6e00000L);
      case 121:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 87:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000000L);
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0xe00000L);
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x6000000L);
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x181000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa9_0(active0, 0x80000000L);
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x140000000L);
      case 110:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(8, 27, 27);
         return jjMoveStringLiteralDfa9_0(active0, 0x80000L);
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x6000000L);
      case 114:
         return jjMoveStringLiteralDfa9_0(active0, 0x1e00000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa10_0(active0, 0x80000000L);
      case 74:
         return jjMoveStringLiteralDfa10_0(active0, 0x200000L);
      case 78:
         return jjMoveStringLiteralDfa10_0(active0, 0xc00000L);
      case 80:
         return jjMoveStringLiteralDfa10_0(active0, 0x80000L);
      case 110:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(9, 25, 27);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(9, 26, 27);
         break;
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x100000000L);
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000000L);
      case 117:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000L);
      case 101:
         return jjMoveStringLiteralDfa11_0(active0, 0xc00000L);
      case 104:
         return jjMoveStringLiteralDfa11_0(active0, 0x40000000L);
      case 108:
         return jjMoveStringLiteralDfa11_0(active0, 0x80000000L);
      case 110:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(10, 32, 27);
         break;
      case 111:
         return jjMoveStringLiteralDfa11_0(active0, 0x200000L);
      case 114:
         return jjMoveStringLiteralDfa11_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa12_0(active0, 0x40000000L);
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x80200000L);
      case 111:
         return jjMoveStringLiteralDfa12_0(active0, 0x80000L);
      case 115:
         return jjMoveStringLiteralDfa12_0(active0, 0xc00000L);
      case 116:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(11, 24, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa13_0(active0, 0x80000L);
      case 103:
         return jjMoveStringLiteralDfa13_0(active0, 0x40000000L);
      case 109:
         return jjMoveStringLiteralDfa13_0(active0, 0x80000000L);
      case 110:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(12, 21, 27);
         break;
      case 116:
         return jjMoveStringLiteralDfa13_0(active0, 0xc00000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa14_0(active0, 0xc00000L);
      case 103:
         return jjMoveStringLiteralDfa14_0(active0, 0x40000000L);
      case 105:
         return jjMoveStringLiteralDfa14_0(active0, 0x80000000L);
      case 117:
         return jjMoveStringLiteralDfa14_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa15_0(active0, 0x80000L);
      case 100:
         return jjMoveStringLiteralDfa15_0(active0, 0xc00000L);
      case 110:
         return jjMoveStringLiteralDfa15_0(active0, 0x80000000L);
      case 114:
         return jjMoveStringLiteralDfa15_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 74:
         return jjMoveStringLiteralDfa16_0(active0, 0xc00000L);
      case 97:
         return jjMoveStringLiteralDfa16_0(active0, 0x80000000L);
      case 101:
         return jjMoveStringLiteralDfa16_0(active0, 0x40000000L);
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(15, 19, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 103:
         return jjMoveStringLiteralDfa17_0(active0, 0x40000000L);
      case 111:
         return jjMoveStringLiteralDfa17_0(active0, 0xc00000L);
      case 116:
         return jjMoveStringLiteralDfa17_0(active0, 0x80000000L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa18_0(active0, 0x40000000L);
      case 105:
         return jjMoveStringLiteralDfa18_0(active0, 0x80c00000L);
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
private int jjMoveStringLiteralDfa18_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(16, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(17, active0);
      return 18;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 18;
         }
         return jjMoveStringLiteralDfa19_0(active0, 0x800000L);
      case 111:
         return jjMoveStringLiteralDfa19_0(active0, 0x80000000L);
      case 116:
         return jjMoveStringLiteralDfa19_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(17, active0);
}
private int jjMoveStringLiteralDfa19_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(17, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(18, active0);
      return 19;
   }
   switch(curChar)
   {
      case 87:
         return jjMoveStringLiteralDfa20_0(active0, 0x800000L);
      case 105:
         return jjMoveStringLiteralDfa20_0(active0, 0x40000000L);
      case 110:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(19, 31, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(18, active0);
}
private int jjMoveStringLiteralDfa20_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(18, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(19, active0);
      return 20;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa21_0(active0, 0x800000L);
      case 111:
         return jjMoveStringLiteralDfa21_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(19, active0);
}
private int jjMoveStringLiteralDfa21_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(19, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(20, active0);
      return 21;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(21, 30, 27);
         break;
      case 116:
         return jjMoveStringLiteralDfa22_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(20, active0);
}
private int jjMoveStringLiteralDfa22_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(20, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(21, active0);
      return 22;
   }
   switch(curChar)
   {
      case 104:
         return jjMoveStringLiteralDfa23_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(21, active0);
}
private int jjMoveStringLiteralDfa23_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(21, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(22, active0);
      return 23;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa24_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(22, active0);
}
private int jjMoveStringLiteralDfa24_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(22, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(23, active0);
      return 24;
   }
   switch(curChar)
   {
      case 103:
         return jjMoveStringLiteralDfa25_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(23, active0);
}
private int jjMoveStringLiteralDfa25_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(23, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(24, active0);
      return 25;
   }
   switch(curChar)
   {
      case 103:
         return jjMoveStringLiteralDfa26_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(24, active0);
}
private int jjMoveStringLiteralDfa26_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(24, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(25, active0);
      return 26;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa27_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(25, active0);
}
private int jjMoveStringLiteralDfa27_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(25, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(26, active0);
      return 27;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa28_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(26, active0);
}
private int jjMoveStringLiteralDfa28_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(26, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(27, active0);
      return 28;
   }
   switch(curChar)
   {
      case 103:
         return jjMoveStringLiteralDfa29_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(27, active0);
}
private int jjMoveStringLiteralDfa29_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(27, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(28, active0);
      return 29;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa30_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(28, active0);
}
private int jjMoveStringLiteralDfa30_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(28, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(29, active0);
      return 30;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa31_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(29, active0);
}
private int jjMoveStringLiteralDfa31_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(29, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(30, active0);
      return 31;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa32_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(30, active0);
}
private int jjMoveStringLiteralDfa32_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(30, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(31, active0);
      return 32;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa33_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(31, active0);
}
private int jjMoveStringLiteralDfa33_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(31, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(32, active0);
      return 33;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(33, 23, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(32, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 43;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 40:
               case 27:
                  if ((0x3ff600000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(27);
                  break;
               case 13:
                  if ((0x3ff600000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(27);
                  break;
               case 21:
                  if ((0x3ff600000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(27);
                  break;
               case 6:
                  if ((0x3ff600000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAdd(27);
                  }
                  else if ((0x7000000000000000L & l) != 0L)
                  {
                     if (kind > 12)
                        kind = 12;
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(29, 30);
                  else if (curChar == 33)
                     jjCheckNAdd(8);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 34)
                        kind = 34;
                     jjCheckNAdd(26);
                  }
                  else if (curChar == 60)
                     jjCheckNAdd(8);
                  else if (curChar == 62)
                     jjCheckNAdd(8);
                  break;
               case 16:
                  if ((0x3ff600000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(27);
                  break;
               case 43:
               case 24:
                  jjCheckNAddTwoStates(24, 25);
                  break;
               case 0:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 42)
                     jjAddStates(0, 1);
                  break;
               case 3:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(4, 2);
                  break;
               case 4:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(4, 2);
                  break;
               case 5:
                  if (curChar == 47 && kind > 3)
                     kind = 3;
                  break;
               case 7:
                  if ((0x7000000000000000L & l) != 0L && kind > 12)
                     kind = 12;
                  break;
               case 8:
                  if (curChar == 61 && kind > 12)
                     kind = 12;
                  break;
               case 9:
                  if (curChar == 33)
                     jjCheckNAdd(8);
                  break;
               case 10:
                  if (curChar == 62)
                     jjCheckNAdd(8);
                  break;
               case 11:
                  if (curChar == 60)
                     jjCheckNAdd(8);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAdd(26);
                  break;
               case 28:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(29, 30);
                  break;
               case 29:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(29, 30);
                  break;
               case 30:
                  if (curChar == 34 && kind > 36)
                     kind = 36;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 40:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAdd(27);
                  }
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 41;
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 13:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAdd(27);
                  }
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 21:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAdd(27);
                  }
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 6:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAdd(27);
                  }
                  else if (curChar == 124)
                     jjCheckNAddTwoStates(24, 25);
                  if (curChar == 83)
                     jjAddStates(2, 3);
                  else if (curChar == 77)
                     jjAddStates(4, 6);
                  else if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 16:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     jjCheckNAdd(27);
                  }
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 43:
                  if ((0xefffffffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(24, 25);
                  else if (curChar == 124)
                  {
                     if (kind > 18)
                        kind = 18;
                  }
                  break;
               case 1:
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
               case 4:
                  jjCheckNAddTwoStates(4, 2);
                  break;
               case 12:
                  if (curChar == 68 && kind > 13)
                     kind = 13;
                  break;
               case 14:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 86 && kind > 13)
                     kind = 13;
                  break;
               case 17:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 84 && kind > 14)
                     kind = 14;
                  break;
               case 19:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 22:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 124)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 24:
                  if ((0xefffffffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 25:
                  if (curChar == 124 && kind > 18)
                     kind = 18;
                  break;
               case 27:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(27);
                  break;
               case 29:
                  jjAddStates(7, 8);
                  break;
               case 31:
                  if (curChar == 77)
                     jjAddStates(4, 6);
                  break;
               case 32:
                  if (curChar == 76 && kind > 13)
                     kind = 13;
                  break;
               case 33:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 88 && kind > 14)
                     kind = 14;
                  break;
               case 35:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 78 && kind > 14)
                     kind = 14;
                  break;
               case 37:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 83)
                     jjAddStates(2, 3);
                  break;
               case 39:
                  if (curChar == 66 && kind > 13)
                     kind = 13;
                  break;
               case 41:
                  if (curChar == 77 && kind > 14)
                     kind = 14;
                  break;
               case 42:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 43:
               case 24:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(4, 2);
                  break;
               case 29:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(7, 8);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 43 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   3, 5, 40, 42, 33, 35, 37, 29, 30, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\54", "\50", "\51", "\133", "\135", 
null, null, null, "\46\46", "\174\174", "\44", null, 
"\103\141\162\164\145\163\151\141\156\120\162\157\144\165\143\164", "\112\157\151\156", "\114\145\146\164\117\165\164\145\162\112\157\151\156", 
"\114\145\146\164\117\165\164\145\162\116\145\163\164\145\144\112\157\151\156", 
"\114\145\146\164\117\165\164\145\162\116\145\163\164\145\144\112\157\151\156\127\151\164\150\101\147\147\162\145\147\141\164\151\157\156", "\130\115\114\103\157\156\163\164\162\165\143\164", 
"\116\141\166\151\147\141\164\151\157\156", "\120\162\157\152\145\143\164\151\157\156", 
"\123\145\154\145\143\164\151\157\156", "\106\154\141\164\164\145\156", "\107\162\157\165\160\102\171", 
"\107\162\157\165\160\102\171\127\151\164\150\101\147\147\162\145\147\141\164\151\157\156", 
"\104\165\160\154\151\143\141\164\145\105\154\151\155\151\156\141\164\151\157\156", "\101\147\147\162\145\147\141\164\151\157\156", 
"\130\115\114\123\143\141\156", null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[43];
private final int[] jjstateSet = new int[86];
protected char curChar;
/** Constructor. */
public LogicalPlanParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public LogicalPlanParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 43; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
