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
package fr.inria.oak.paxquery.xparser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, AGGR_FUNCT=29, TEXTFUNCTION=30, SLASH=31, 
		SLASHSLASH=32, OR=33, AND=34, NOT=35, EQ=36, EQ_S=37, NE=38, NE_S=39, 
		LT=40, LT_S=41, LE=42, LE_S=43, GT=44, GT_S=45, GE=46, GE_S=47, OP_ADD=48, 
		OP_SUB=49, OP_MUL=50, VAR=51, LEFTCURL=52, RIGHTCURL=53, OPEN_ATTR_VAR_DOUBLE=54, 
		OPEN_ATTR_VAR_SINGLE=55, CLOSE_ATTR_VAR_DOUBLE=56, CLOSE_ATTR_VAR_SINGLE=57, 
		OPEN_CLOSING_TAG=58, CLOSE_OPENING_TAG=59, QNAME_TOKEN=60, SINGLE_QUOTE=61, 
		DOUBLE_QUOTE=62, COMMA=63, STRING_LITERAL=64, REFERENCE=65, ENTITY_REF=66, 
		CHAR_REF=67, INTEGER_LITERAL=68, DECIMAL_LITERAL=69, DIGITS=70, WS=71;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'group by'", "'substring'", "'true'", "'return'", "'>>'", "'<<'", "'concat'", 
		"'for'", "':='", "'('", "'is'", "'false'", "'ceiling'", "'mod'", "'['", 
		"'distinct-values'", "'collection'", "']'", "'contains'", "'@'", "'where'", 
		"'let'", "'div'", "'in'", "'floor'", "')'", "'doc'", "'empty'", "AGGR_FUNCT", 
		"'text()'", "'/'", "'//'", "'or'", "'and'", "'not'", "'eq'", "'='", "'ne'", 
		"'!='", "'lt'", "'<'", "'le'", "'<='", "'gt'", "'>'", "'ge'", "'>='", 
		"'+'", "'-'", "'*'", "VAR", "'{'", "'}'", "OPEN_ATTR_VAR_DOUBLE", "OPEN_ATTR_VAR_SINGLE", 
		"CLOSE_ATTR_VAR_DOUBLE", "CLOSE_ATTR_VAR_SINGLE", "OPEN_CLOSING_TAG", 
		"CLOSE_OPENING_TAG", "QNAME_TOKEN", "'''", "'\"'", "','", "STRING_LITERAL", 
		"REFERENCE", "ENTITY_REF", "CHAR_REF", "INTEGER_LITERAL", "DECIMAL_LITERAL", 
		"DIGITS", "WS"
	};
	public static final String[] ruleNames = {
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "AGGR_FUNCT", "TEXTFUNCTION", "SLASH", "SLASHSLASH", 
		"OR", "AND", "NOT", "EQ", "EQ_S", "NE", "NE_S", "LT", "LT_S", "LE", "LE_S", 
		"GT", "GT_S", "GE", "GE_S", "OP_ADD", "OP_SUB", "OP_MUL", "VAR", "LEFTCURL", 
		"RIGHTCURL", "OPEN_ATTR_VAR_DOUBLE", "OPEN_ATTR_VAR_SINGLE", "CLOSE_ATTR_VAR_DOUBLE", 
		"CLOSE_ATTR_VAR_SINGLE", "OPEN_CLOSING_TAG", "CLOSE_OPENING_TAG", "QNAME_TOKEN", 
		"SINGLE_QUOTE", "DOUBLE_QUOTE", "COMMA", "STRING_LITERAL", "REFERENCE", 
		"ENTITY_REF", "CHAR_REF", "INTEGER_LITERAL", "DECIMAL_LITERAL", "DIGITS", 
		"NCNAME_TOK", "NMSTART", "NMCHAR", "LETTER", "BASE_CHAR", "IDEOGRAPHIC", 
		"COMBINING_CHAR", "DIGIT", "EXTENDER", "LOCAL_PART", "WS"
	};


	public XQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2I\u022e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u014e\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)"+
		"\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\5\67\u0197\n\67\3\67\3\67\38\38\58\u019d\n8\38\38\39\39\59\u01a3"+
		"\n9\39\39\3:\3:\5:\u01a9\n:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\5=\u01b6"+
		"\n=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\7A\u01c3\nA\fA\16A\u01c6\13A\3A\3"+
		"A\3A\3A\3A\7A\u01cd\nA\fA\16A\u01d0\13A\3A\3A\5A\u01d4\nA\3B\3B\5B\u01d8"+
		"\nB\3C\3C\3C\3C\3D\3D\3D\3D\6D\u01e2\nD\rD\16D\u01e3\3D\3D\3D\3D\3D\3"+
		"D\6D\u01ec\nD\rD\16D\u01ed\3D\5D\u01f1\nD\3E\3E\3F\3F\3F\3F\3F\7F\u01fa"+
		"\nF\fF\16F\u01fd\13F\5F\u01ff\nF\3G\6G\u0202\nG\rG\16G\u0203\3H\3H\7H"+
		"\u0208\nH\fH\16H\u020b\13H\3I\3I\5I\u020f\nI\3J\3J\3J\3J\3J\5J\u0216\n"+
		"J\3K\3K\5K\u021a\nK\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\6R\u0229\n"+
		"R\rR\16R\u022a\3R\3R\2\2S\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2"+
		"\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3I\3\2\r\5\2$$}}\177\177\5\2))}}"+
		"\177\177\3\2\62;\5\2\62;CHch\4\2/\60aa\u00cb\2C\\c|\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u0133\u0136\u0140\u0143\u014a\u014c\u0180\u0182\u01c5\u01cf"+
		"\u01f2\u01f6\u01f7\u01fc\u0219\u0252\u02aa\u02bd\u02c3\u0388\u0388\u038a"+
		"\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0\u03d2\u03d8\u03dc\u03dc\u03de"+
		"\u03de\u03e0\u03e0\u03e2\u03e2\u03e4\u03f5\u0403\u040e\u0410\u0451\u0453"+
		"\u045e\u0460\u0483\u0492\u04c6\u04c9\u04ca\u04cd\u04ce\u04d2\u04ed\u04f0"+
		"\u04f7\u04fa\u04fb\u0533\u0558\u055b\u055b\u0563\u0588\u05d2\u05ec\u05f2"+
		"\u05f4\u0623\u063c\u0643\u064c\u0673\u06b9\u06bc\u06c0\u06c2\u06d0\u06d2"+
		"\u06d5\u06d7\u06d7\u06e7\u06e8\u0907\u093b\u093f\u093f\u095a\u0963\u0987"+
		"\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09de"+
		"\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c"+
		"\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74"+
		"\u0a76\u0a87\u0a8d\u0a8f\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4"+
		"\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ae2\u0ae2\u0b07\u0b0e\u0b11\u0b12\u0b15"+
		"\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b38\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61"+
		"\u0b63\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0"+
		"\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\u0bb9\u0bbb\u0c07\u0c0e\u0c10"+
		"\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90"+
		"\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0ce0\u0ce0\u0ce2\u0ce3\u0d07"+
		"\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63\u0e03\u0e30\u0e32"+
		"\u0e32\u0e34\u0e35\u0e42\u0e47\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c"+
		"\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9"+
		"\u0ea9\u0eac\u0ead\u0eaf\u0eb0\u0eb2\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2"+
		"\u0ec6\u0f42\u0f49\u0f4b\u0f6b\u10a2\u10c7\u10d2\u10f8\u1102\u1102\u1104"+
		"\u1105\u1107\u1109\u110b\u110b\u110d\u110e\u1110\u1114\u113e\u113e\u1140"+
		"\u1140\u1142\u1142\u114e\u114e\u1150\u1150\u1152\u1152\u1156\u1157\u115b"+
		"\u115b\u1161\u1163\u1165\u1165\u1167\u1167\u1169\u1169\u116b\u116b\u116f"+
		"\u1170\u1174\u1175\u1177\u1177\u11a0\u11a0\u11aa\u11aa\u11ad\u11ad\u11b0"+
		"\u11b1\u11b9\u11ba\u11bc\u11bc\u11be\u11c4\u11ed\u11ed\u11f2\u11f2\u11fb"+
		"\u11fb\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a"+
		"\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82"+
		"\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8"+
		"\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2128\u2128\u212c\u212d\u2130"+
		"\u2130\u2182\u2184\u3043\u3096\u30a3\u30fc\u3107\u312e\uac02\ud7a5\5\2"+
		"\u3009\u3009\u3023\u302b\u4e02\u9fa7X\2\u0302\u0347\u0362\u0363\u0485"+
		"\u0488\u0593\u05a3\u05a5\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6"+
		"\u05c6\u064d\u0654\u0672\u0672\u06d8\u06e6\u06e9\u06ea\u06ec\u06ef\u0903"+
		"\u0905\u093e\u093e\u0940\u094f\u0953\u0956\u0964\u0965\u0983\u0985\u09be"+
		"\u09be\u09c0\u09c6\u09c9\u09ca\u09cd\u09cf\u09d9\u09d9\u09e4\u09e5\u0a04"+
		"\u0a04\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a72\u0a73\u0a83"+
		"\u0a85\u0abe\u0abe\u0ac0\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0b03\u0b05\u0b3e"+
		"\u0b3e\u0b40\u0b45\u0b49\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b84\u0b85\u0bc0"+
		"\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9\u0c03\u0c05\u0c40\u0c46\u0c48"+
		"\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c84\u0c85\u0cc0\u0cc6\u0cc8\u0cca\u0ccc"+
		"\u0ccf\u0cd7\u0cd8\u0d04\u0d05\u0d40\u0d45\u0d48\u0d4a\u0d4c\u0d4f\u0d59"+
		"\u0d59\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50\u0eb3\u0eb3\u0eb6\u0ebb\u0ebd"+
		"\u0ebe\u0eca\u0ecf\u0f1a\u0f1b\u0f37\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40"+
		"\u0f41\u0f73\u0f86\u0f88\u0f8d\u0f92\u0f97\u0f99\u0f99\u0f9b\u0faf\u0fb3"+
		"\u0fb9\u0fbb\u0fbb\u20d2\u20de\u20e3\u20e3\u302c\u3031\u309b\u309c\21"+
		"\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8"+
		"\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52"+
		"\u0e5b\u0ed2\u0edb\u0f22\u0f2b\f\2\u00b9\u00b9\u02d2\u02d3\u0389\u0389"+
		"\u0642\u0642\u0e48\u0e48\u0ec8\u0ec8\u3007\u3007\u3033\u3037\u309f\u30a0"+
		"\u30fe\u3100\5\2\13\f\17\17\"\"\u0240\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2"+
		"\2\5\u00ae\3\2\2\2\7\u00b8\3\2\2\2\t\u00bd\3\2\2\2\13\u00c4\3\2\2\2\r"+
		"\u00c7\3\2\2\2\17\u00ca\3\2\2\2\21\u00d1\3\2\2\2\23\u00d5\3\2\2\2\25\u00d8"+
		"\3\2\2\2\27\u00da\3\2\2\2\31\u00dd\3\2\2\2\33\u00e3\3\2\2\2\35\u00eb\3"+
		"\2\2\2\37\u00ef\3\2\2\2!\u00f1\3\2\2\2#\u0101\3\2\2\2%\u010c\3\2\2\2\'"+
		"\u010e\3\2\2\2)\u0117\3\2\2\2+\u0119\3\2\2\2-\u011f\3\2\2\2/\u0123\3\2"+
		"\2\2\61\u0127\3\2\2\2\63\u012a\3\2\2\2\65\u0130\3\2\2\2\67\u0132\3\2\2"+
		"\29\u0136\3\2\2\2;\u014d\3\2\2\2=\u014f\3\2\2\2?\u0156\3\2\2\2A\u0158"+
		"\3\2\2\2C\u015b\3\2\2\2E\u015e\3\2\2\2G\u0162\3\2\2\2I\u0166\3\2\2\2K"+
		"\u0169\3\2\2\2M\u016b\3\2\2\2O\u016e\3\2\2\2Q\u0171\3\2\2\2S\u0174\3\2"+
		"\2\2U\u0176\3\2\2\2W\u0179\3\2\2\2Y\u017c\3\2\2\2[\u017f\3\2\2\2]\u0181"+
		"\3\2\2\2_\u0184\3\2\2\2a\u0187\3\2\2\2c\u0189\3\2\2\2e\u018b\3\2\2\2g"+
		"\u018d\3\2\2\2i\u0190\3\2\2\2k\u0192\3\2\2\2m\u0194\3\2\2\2o\u019a\3\2"+
		"\2\2q\u01a0\3\2\2\2s\u01a6\3\2\2\2u\u01ac\3\2\2\2w\u01af\3\2\2\2y\u01b5"+
		"\3\2\2\2{\u01b9\3\2\2\2}\u01bb\3\2\2\2\177\u01bd\3\2\2\2\u0081\u01d3\3"+
		"\2\2\2\u0083\u01d7\3\2\2\2\u0085\u01d9\3\2\2\2\u0087\u01f0\3\2\2\2\u0089"+
		"\u01f2\3\2\2\2\u008b\u01fe\3\2\2\2\u008d\u0201\3\2\2\2\u008f\u0205\3\2"+
		"\2\2\u0091\u020e\3\2\2\2\u0093\u0215\3\2\2\2\u0095\u0219\3\2\2\2\u0097"+
		"\u021b\3\2\2\2\u0099\u021d\3\2\2\2\u009b\u021f\3\2\2\2\u009d\u0221\3\2"+
		"\2\2\u009f\u0223\3\2\2\2\u00a1\u0225\3\2\2\2\u00a3\u0228\3\2\2\2\u00a5"+
		"\u00a6\7i\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7w\2\2"+
		"\u00a9\u00aa\7r\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad"+
		"\7{\2\2\u00ad\4\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1"+
		"\7d\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7i\2\2\u00b7\6\3\2\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7g\2\2"+
		"\u00bc\b\3\2\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7v"+
		"\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7p\2\2\u00c3\n"+
		"\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6\7@\2\2\u00c6\f\3\2\2\2\u00c7\u00c8"+
		"\7>\2\2\u00c8\u00c9\7>\2\2\u00c9\16\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7c\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0\20\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\22\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6\u00d7\7?\2\2\u00d7"+
		"\24\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9\26\3\2\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\30\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2\32\3\2\2\2\u00e3"+
		"\u00e4\7e\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7n\2\2"+
		"\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7i\2\2\u00ea\34\3\2"+
		"\2\2\u00eb\u00ec\7o\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7f\2\2\u00ee\36"+
		"\3\2\2\2\u00ef\u00f0\7]\2\2\u00f0 \3\2\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7p\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7/\2\2"+
		"\u00fa\u00fb\7x\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe"+
		"\7w\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7u\2\2\u0100\"\3\2\2\2\u0101\u0102"+
		"\7e\2\2\u0102\u0103\7q\2\2\u0103\u0104\7n\2\2\u0104\u0105\7n\2\2\u0105"+
		"\u0106\7g\2\2\u0106\u0107\7e\2\2\u0107\u0108\7v\2\2\u0108\u0109\7k\2\2"+
		"\u0109\u010a\7q\2\2\u010a\u010b\7p\2\2\u010b$\3\2\2\2\u010c\u010d\7_\2"+
		"\2\u010d&\3\2\2\2\u010e\u010f\7e\2\2\u010f\u0110\7q\2\2\u0110\u0111\7"+
		"p\2\2\u0111\u0112\7v\2\2\u0112\u0113\7c\2\2\u0113\u0114\7k\2\2\u0114\u0115"+
		"\7p\2\2\u0115\u0116\7u\2\2\u0116(\3\2\2\2\u0117\u0118\7B\2\2\u0118*\3"+
		"\2\2\2\u0119\u011a\7y\2\2\u011a\u011b\7j\2\2\u011b\u011c\7g\2\2\u011c"+
		"\u011d\7t\2\2\u011d\u011e\7g\2\2\u011e,\3\2\2\2\u011f\u0120\7n\2\2\u0120"+
		"\u0121\7g\2\2\u0121\u0122\7v\2\2\u0122.\3\2\2\2\u0123\u0124\7f\2\2\u0124"+
		"\u0125\7k\2\2\u0125\u0126\7x\2\2\u0126\60\3\2\2\2\u0127\u0128\7k\2\2\u0128"+
		"\u0129\7p\2\2\u0129\62\3\2\2\2\u012a\u012b\7h\2\2\u012b\u012c\7n\2\2\u012c"+
		"\u012d\7q\2\2\u012d\u012e\7q\2\2\u012e\u012f\7t\2\2\u012f\64\3\2\2\2\u0130"+
		"\u0131\7+\2\2\u0131\66\3\2\2\2\u0132\u0133\7f\2\2\u0133\u0134\7q\2\2\u0134"+
		"\u0135\7e\2\2\u01358\3\2\2\2\u0136\u0137\7g\2\2\u0137\u0138\7o\2\2\u0138"+
		"\u0139\7r\2\2\u0139\u013a\7v\2\2\u013a\u013b\7{\2\2\u013b:\3\2\2\2\u013c"+
		"\u013d\7e\2\2\u013d\u013e\7q\2\2\u013e\u013f\7w\2\2\u013f\u0140\7p\2\2"+
		"\u0140\u014e\7v\2\2\u0141\u0142\7c\2\2\u0142\u0143\7x\2\2\u0143\u014e"+
		"\7i\2\2\u0144\u0145\7o\2\2\u0145\u0146\7c\2\2\u0146\u014e\7z\2\2\u0147"+
		"\u0148\7o\2\2\u0148\u0149\7k\2\2\u0149\u014e\7p\2\2\u014a\u014b\7u\2\2"+
		"\u014b\u014c\7w\2\2\u014c\u014e\7o\2\2\u014d\u013c\3\2\2\2\u014d\u0141"+
		"\3\2\2\2\u014d\u0144\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e"+
		"<\3\2\2\2\u014f\u0150\7v\2\2\u0150\u0151\7g\2\2\u0151\u0152\7z\2\2\u0152"+
		"\u0153\7v\2\2\u0153\u0154\7*\2\2\u0154\u0155\7+\2\2\u0155>\3\2\2\2\u0156"+
		"\u0157\7\61\2\2\u0157@\3\2\2\2\u0158\u0159\7\61\2\2\u0159\u015a\7\61\2"+
		"\2\u015aB\3\2\2\2\u015b\u015c\7q\2\2\u015c\u015d\7t\2\2\u015dD\3\2\2\2"+
		"\u015e\u015f\7c\2\2\u015f\u0160\7p\2\2\u0160\u0161\7f\2\2\u0161F\3\2\2"+
		"\2\u0162\u0163\7p\2\2\u0163\u0164\7q\2\2\u0164\u0165\7v\2\2\u0165H\3\2"+
		"\2\2\u0166\u0167\7g\2\2\u0167\u0168\7s\2\2\u0168J\3\2\2\2\u0169\u016a"+
		"\7?\2\2\u016aL\3\2\2\2\u016b\u016c\7p\2\2\u016c\u016d\7g\2\2\u016dN\3"+
		"\2\2\2\u016e\u016f\7#\2\2\u016f\u0170\7?\2\2\u0170P\3\2\2\2\u0171\u0172"+
		"\7n\2\2\u0172\u0173\7v\2\2\u0173R\3\2\2\2\u0174\u0175\7>\2\2\u0175T\3"+
		"\2\2\2\u0176\u0177\7n\2\2\u0177\u0178\7g\2\2\u0178V\3\2\2\2\u0179\u017a"+
		"\7>\2\2\u017a\u017b\7?\2\2\u017bX\3\2\2\2\u017c\u017d\7i\2\2\u017d\u017e"+
		"\7v\2\2\u017eZ\3\2\2\2\u017f\u0180\7@\2\2\u0180\\\3\2\2\2\u0181\u0182"+
		"\7i\2\2\u0182\u0183\7g\2\2\u0183^\3\2\2\2\u0184\u0185\7@\2\2\u0185\u0186"+
		"\7?\2\2\u0186`\3\2\2\2\u0187\u0188\7-\2\2\u0188b\3\2\2\2\u0189\u018a\7"+
		"/\2\2\u018ad\3\2\2\2\u018b\u018c\7,\2\2\u018cf\3\2\2\2\u018d\u018e\7&"+
		"\2\2\u018e\u018f\5\u008fH\2\u018fh\3\2\2\2\u0190\u0191\7}\2\2\u0191j\3"+
		"\2\2\2\u0192\u0193\7\177\2\2\u0193l\3\2\2\2\u0194\u0196\7$\2\2\u0195\u0197"+
		"\5\u00a3R\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2"+
		"\2\u0198\u0199\7}\2\2\u0199n\3\2\2\2\u019a\u019c\7)\2\2\u019b\u019d\5"+
		"\u00a3R\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2"+
		"\u019e\u019f\7}\2\2\u019fp\3\2\2\2\u01a0\u01a2\7\177\2\2\u01a1\u01a3\5"+
		"\u00a3R\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2"+
		"\u01a4\u01a5\7$\2\2\u01a5r\3\2\2\2\u01a6\u01a8\7\177\2\2\u01a7\u01a9\5"+
		"\u00a3R\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2"+
		"\u01aa\u01ab\7)\2\2\u01abt\3\2\2\2\u01ac\u01ad\5S*\2\u01ad\u01ae\7\61"+
		"\2\2\u01aev\3\2\2\2\u01af\u01b0\7\61\2\2\u01b0\u01b1\5[.\2\u01b1x\3\2"+
		"\2\2\u01b2\u01b3\5\u008fH\2\u01b3\u01b4\7<\2\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\5\u00a1"+
		"Q\2\u01b8z\3\2\2\2\u01b9\u01ba\7)\2\2\u01ba|\3\2\2\2\u01bb\u01bc\7$\2"+
		"\2\u01bc~\3\2\2\2\u01bd\u01be\7.\2\2\u01be\u0080\3\2\2\2\u01bf\u01c4\5"+
		"}?\2\u01c0\u01c3\5\u00a3R\2\u01c1\u01c3\n\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\5}?\2\u01c8\u01d4"+
		"\3\2\2\2\u01c9\u01ce\5{>\2\u01ca\u01cd\5\u00a3R\2\u01cb\u01cd\n\3\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1"+
		"\u01d2\5{>\2\u01d2\u01d4\3\2\2\2\u01d3\u01bf\3\2\2\2\u01d3\u01c9\3\2\2"+
		"\2\u01d4\u0082\3\2\2\2\u01d5\u01d8\5\u0085C\2\u01d6\u01d8\5\u0087D\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u0084\3\2\2\2\u01d9\u01da\7("+
		"\2\2\u01da\u01db\5\u008fH\2\u01db\u01dc\7=\2\2\u01dc\u0086\3\2\2\2\u01dd"+
		"\u01de\7(\2\2\u01de\u01df\7%\2\2\u01df\u01e1\3\2\2\2\u01e0\u01e2\t\4\2"+
		"\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01f1\7=\2\2\u01e6\u01e7\7(\2\2\u01e7"+
		"\u01e8\7%\2\2\u01e8\u01e9\7z\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\t\5\2"+
		"\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\7=\2\2\u01f0\u01dd\3\2\2\2\u01f0"+
		"\u01e6\3\2\2\2\u01f1\u0088\3\2\2\2\u01f2\u01f3\5\u008dG\2\u01f3\u008a"+
		"\3\2\2\2\u01f4\u01f5\7\60\2\2\u01f5\u01ff\5\u008dG\2\u01f6\u01f7\5\u008d"+
		"G\2\u01f7\u01fb\7\60\2\2\u01f8\u01fa\t\4\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01ff\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01f4\3\2\2\2\u01fe\u01f6\3\2\2\2\u01ff"+
		"\u008c\3\2\2\2\u0200\u0202\5\u009dO\2\u0201\u0200\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u008e\3\2\2\2\u0205"+
		"\u0209\5\u0091I\2\u0206\u0208\5\u0093J\2\u0207\u0206\3\2\2\2\u0208\u020b"+
		"\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0090\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020c\u020f\5\u0095K\2\u020d\u020f\7a\2\2\u020e\u020c\3"+
		"\2\2\2\u020e\u020d\3\2\2\2\u020f\u0092\3\2\2\2\u0210\u0216\5\u0095K\2"+
		"\u0211\u0216\5\u009bN\2\u0212\u0216\5\u009fP\2\u0213\u0216\5\u009dO\2"+
		"\u0214\u0216\t\6\2\2\u0215\u0210\3\2\2\2\u0215\u0211\3\2\2\2\u0215\u0212"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216\u0094\3\2\2\2\u0217"+
		"\u021a\5\u0097L\2\u0218\u021a\5\u0099M\2\u0219\u0217\3\2\2\2\u0219\u0218"+
		"\3\2\2\2\u021a\u0096\3\2\2\2\u021b\u021c\t\7\2\2\u021c\u0098\3\2\2\2\u021d"+
		"\u021e\t\b\2\2\u021e\u009a\3\2\2\2\u021f\u0220\t\t\2\2\u0220\u009c\3\2"+
		"\2\2\u0221\u0222\t\n\2\2\u0222\u009e\3\2\2\2\u0223\u0224\t\13\2\2\u0224"+
		"\u00a0\3\2\2\2\u0225\u0226\5\u008fH\2\u0226\u00a2\3\2\2\2\u0227\u0229"+
		"\t\f\2\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\bR\2\2\u022d\u00a4\3\2"+
		"\2\2\32\2\u014d\u0196\u019c\u01a2\u01a8\u01b5\u01c2\u01c4\u01cc\u01ce"+
		"\u01d3\u01d7\u01e3\u01ed\u01f0\u01fb\u01fe\u0203\u0209\u020e\u0215\u0219"+
		"\u022a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}