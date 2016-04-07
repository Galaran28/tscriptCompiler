// Generated from Tscript.g4 by ANTLR 4.5.1
package ts.parse;

  import ts.Location;
  import ts.tree.*;
  import static ts.parse.TreeBuilder.*;
  import java.util.List;
  import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TscriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERIC_LITERAL=1, STRING_LITERAL=2, BOOLEAN_LITERAL=3, NULL_LITERAL=4, 
		LPAREN=5, RPAREN=6, LCARET=7, RCARET=8, LBRACK=9, RBRACK=10, LSTAPLE=11, 
		RSTAPLE=12, EXCLAMATIONPOINT=13, SEMICOLON=14, COLON=15, COMMA=16, DOT=17, 
		EQUAL=18, PLUS=19, MINUS=20, ASTERISK=21, RSLASH=22, PRINT=23, VAR=24, 
		TRUE=25, FALSE=26, NULL=27, WHILE=28, IF=29, ELSE=30, CONTINUE=31, BREAK=32, 
		IDENTIFIER=33, WhiteSpace=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Digit", "NonZeroDigit", "Digits", "DecimalIntegerLiteral", "DecimalLiteral", 
		"HexDigit", "HexLiteral", "ExponentIndicator", "SignedInteger", "ExponentPart", 
		"IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "EscapeCharacter", "SourceCharacters", "SingleStringCharacter", 
		"DoubleStringCharacter", "SingleStringCharacters", "DoubleStringCharacters", 
		"NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "LCARET", "RCARET", "LBRACK", "RBRACK", "LSTAPLE", 
		"RSTAPLE", "EXCLAMATIONPOINT", "SEMICOLON", "COLON", "COMMA", "DOT", "EQUAL", 
		"PLUS", "MINUS", "ASTERISK", "RSLASH", "PRINT", "VAR", "TRUE", "FALSE", 
		"NULL", "WHILE", "IF", "ELSE", "CONTINUE", "BREAK", "IDENTIFIER", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'['", 
		"']'", null, null, null, null, null, null, null, null, null, null, "'console.log'", 
		"'var'", "'true'", "'false'", "'null'", "'while'", "'if'", "'else'", "'continue'", 
		"'break'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "LCARET", "RCARET", "LBRACK", "RBRACK", "LSTAPLE", 
		"RSTAPLE", "EXCLAMATIONPOINT", "SEMICOLON", "COLON", "COMMA", "DOT", "EQUAL", 
		"PLUS", "MINUS", "ASTERISK", "RSLASH", "PRINT", "VAR", "TRUE", "FALSE", 
		"NULL", "WHILE", "IF", "ELSE", "CONTINUE", "BREAK", "IDENTIFIER", "WhiteSpace"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	  // grab location info (filename/line/column) from token
	  // in order to stick into AST nodes for later error reporting
	  public Location loc(final Token token)
	  {
	    return new Location(getSourceName(), token.getLine(),
	      token.getCharPositionInLine());
	  }

	  // root of AST is stored here
	  // set by the action for the start symbol
	  private Program semanticValue;
	  public Program getSemanticValue()
	  {
	    return semanticValue;
	  }


	public TscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tscript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0174\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\7\4x\n"+
		"\4\f\4\16\4{\13\4\3\5\3\5\3\5\5\5\u0080\n\5\5\5\u0082\n\5\3\6\3\6\3\6"+
		"\5\6\u0087\n\6\3\6\5\6\u008a\n\6\3\6\3\6\3\6\5\6\u008f\n\6\3\6\3\6\5\6"+
		"\u0093\n\6\5\6\u0095\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u009d\n\b\f\b\16"+
		"\b\u00a0\13\b\3\b\3\b\3\b\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\5\b\u00ab"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\13\3\13\3\13\3\f\3\f"+
		"\7\f\u00bb\n\f\f\f\16\f\u00be\13\f\3\r\3\r\3\r\5\r\u00c3\n\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13\17\3\17\3\17"+
		"\5\17\u00d2\n\17\3\20\3\20\3\20\5\20\u00d7\n\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\5\23\u00e0\n\23\3\24\3\24\3\24\5\24\u00e5\n\24\3\25\3\25"+
		"\7\25\u00e9\n\25\f\25\16\25\u00ec\13\25\3\26\3\26\7\26\u00f0\n\26\f\26"+
		"\16\26\u00f3\13\26\3\27\3\27\5\27\u00f7\n\27\3\30\3\30\5\30\u00fb\n\30"+
		"\3\30\3\30\3\30\5\30\u0100\n\30\3\30\5\30\u0103\n\30\3\31\3\31\5\31\u0107"+
		"\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\38\68\u016f\n8\r8\168\u0170\38\38\2\29\3\2\5\2\7\2\t\2\13\2\r\2\17\2"+
		"\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\3/\4\61\5"+
		"\63\6\65\7\67\b9\t;\n=\13?\fA\rC\16E\17G\20I\21K\22M\23O\24Q\25S\26U\27"+
		"W\30Y\31[\32]\33_\34a\35c\36e\37g i!k\"m#o$\3\2\36\3\2\62;\3\2\63;\5\2"+
		"\62;CHch\4\2GGgg\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2"+
		"\f\f\17\17\5\2$$))^^\3\2\"\u0080\4\2))^^\4\2$$^^\3\2**\3\2++\3\2>>\3\2"+
		"@@\3\2}}\3\2\177\177\3\2##\3\2==\3\2<<\3\2..\3\2\60\60\3\2??\3\2--\3\2"+
		"//\3\2,,\3\2\61\61\u017c\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5"+
		"s\3\2\2\2\7u\3\2\2\2\t\u0081\3\2\2\2\13\u0094\3\2\2\2\r\u0096\3\2\2\2"+
		"\17\u00aa\3\2\2\2\21\u00ac\3\2\2\2\23\u00b3\3\2\2\2\25\u00b5\3\2\2\2\27"+
		"\u00b8\3\2\2\2\31\u00c2\3\2\2\2\33\u00c4\3\2\2\2\35\u00c6\3\2\2\2\37\u00d6"+
		"\3\2\2\2!\u00d8\3\2\2\2#\u00da\3\2\2\2%\u00df\3\2\2\2\'\u00e4\3\2\2\2"+
		")\u00e6\3\2\2\2+\u00ed\3\2\2\2-\u00f6\3\2\2\2/\u0102\3\2\2\2\61\u0106"+
		"\3\2\2\2\63\u0108\3\2\2\2\65\u010a\3\2\2\2\67\u010c\3\2\2\29\u010e\3\2"+
		"\2\2;\u0110\3\2\2\2=\u0112\3\2\2\2?\u0114\3\2\2\2A\u0116\3\2\2\2C\u0118"+
		"\3\2\2\2E\u011a\3\2\2\2G\u011c\3\2\2\2I\u011e\3\2\2\2K\u0120\3\2\2\2M"+
		"\u0122\3\2\2\2O\u0124\3\2\2\2Q\u0126\3\2\2\2S\u0128\3\2\2\2U\u012a\3\2"+
		"\2\2W\u012c\3\2\2\2Y\u012e\3\2\2\2[\u013a\3\2\2\2]\u013e\3\2\2\2_\u0143"+
		"\3\2\2\2a\u0149\3\2\2\2c\u014e\3\2\2\2e\u0154\3\2\2\2g\u0157\3\2\2\2i"+
		"\u015c\3\2\2\2k\u0165\3\2\2\2m\u016b\3\2\2\2o\u016e\3\2\2\2qr\t\2\2\2"+
		"r\4\3\2\2\2st\t\3\2\2t\6\3\2\2\2uy\5\3\2\2vx\5\3\2\2wv\3\2\2\2x{\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z\b\3\2\2\2{y\3\2\2\2|\u0082\7\62\2\2}\177\5\5\3"+
		"\2~\u0080\5\7\4\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081"+
		"|\3\2\2\2\u0081}\3\2\2\2\u0082\n\3\2\2\2\u0083\u0084\5\t\5\2\u0084\u0086"+
		"\7\60\2\2\u0085\u0087\5\7\4\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0089\3\2\2\2\u0088\u008a\5\25\13\2\u0089\u0088\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0095\3\2\2\2\u008b\u008c\7\60\2\2\u008c\u008e\5\7\4\2"+
		"\u008d\u008f\5\25\13\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0095"+
		"\3\2\2\2\u0090\u0092\5\t\5\2\u0091\u0093\5\25\13\2\u0092\u0091\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0083\3\2\2\2\u0094\u008b"+
		"\3\2\2\2\u0094\u0090\3\2\2\2\u0095\f\3\2\2\2\u0096\u0097\t\4\2\2\u0097"+
		"\16\3\2\2\2\u0098\u0099\7\62\2\2\u0099\u009a\7z\2\2\u009a\u009e\3\2\2"+
		"\2\u009b\u009d\5\r\7\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00ab\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\62\2\2\u00a2\u00a3\7Z\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a6\5\r"+
		"\7\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u0098\3\2"+
		"\2\2\u00aa\u00a1\3\2\2\2\u00ab\20\3\2\2\2\u00ac\u00ad\t\5\2\2\u00ad\22"+
		"\3\2\2\2\u00ae\u00b4\5\7\4\2\u00af\u00b0\7-\2\2\u00b0\u00b4\5\7\4\2\u00b1"+
		"\u00b2\7/\2\2\u00b2\u00b4\5\7\4\2\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\24\3\2\2\2\u00b5\u00b6\5\21\t\2\u00b6\u00b7"+
		"\5\23\n\2\u00b7\26\3\2\2\2\u00b8\u00bc\t\6\2\2\u00b9\u00bb\t\7\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\30\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c3\5\33\16\2\u00c0"+
		"\u00c3\5\37\20\2\u00c1\u00c3\5\35\17\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\32\3\2\2\2\u00c4\u00c5\t\b\2\2\u00c5"+
		"\34\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00cc\3\2"+
		"\2\2\u00c9\u00cb\n\t\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d2\5\37\20\2\u00d0\u00d2\7\2\2\3\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\36\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d7\7\f\2"+
		"\2\u00d5\u00d7\t\t\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7 "+
		"\3\2\2\2\u00d8\u00d9\t\n\2\2\u00d9\"\3\2\2\2\u00da\u00db\t\13\2\2\u00db"+
		"$\3\2\2\2\u00dc\u00e0\n\f\2\2\u00dd\u00de\7^\2\2\u00de\u00e0\5#\22\2\u00df"+
		"\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0&\3\2\2\2\u00e1\u00e5\n\r\2\2"+
		"\u00e2\u00e3\7^\2\2\u00e3\u00e5\5#\22\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5(\3\2\2\2\u00e6\u00ea\5%\23\2\u00e7\u00e9\5%\23\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb*\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f1\5\'\24\2\u00ee\u00f0"+
		"\5\'\24\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2,\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\5"+
		"\13\6\2\u00f5\u00f7\5\17\b\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		".\3\2\2\2\u00f8\u00fa\7$\2\2\u00f9\u00fb\5+\26\2\u00fa\u00f9\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0103\7$\2\2\u00fd\u00ff\7)\2"+
		"\2\u00fe\u0100\5)\25\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0103\7)\2\2\u0102\u00f8\3\2\2\2\u0102\u00fd\3\2\2\2\u0103"+
		"\60\3\2\2\2\u0104\u0107\5]/\2\u0105\u0107\5_\60\2\u0106\u0104\3\2\2\2"+
		"\u0106\u0105\3\2\2\2\u0107\62\3\2\2\2\u0108\u0109\5a\61\2\u0109\64\3\2"+
		"\2\2\u010a\u010b\t\16\2\2\u010b\66\3\2\2\2\u010c\u010d\t\17\2\2\u010d"+
		"8\3\2\2\2\u010e\u010f\t\20\2\2\u010f:\3\2\2\2\u0110\u0111\t\21\2\2\u0111"+
		"<\3\2\2\2\u0112\u0113\t\22\2\2\u0113>\3\2\2\2\u0114\u0115\t\23\2\2\u0115"+
		"@\3\2\2\2\u0116\u0117\7]\2\2\u0117B\3\2\2\2\u0118\u0119\7_\2\2\u0119D"+
		"\3\2\2\2\u011a\u011b\t\24\2\2\u011bF\3\2\2\2\u011c\u011d\t\25\2\2\u011d"+
		"H\3\2\2\2\u011e\u011f\t\26\2\2\u011fJ\3\2\2\2\u0120\u0121\t\27\2\2\u0121"+
		"L\3\2\2\2\u0122\u0123\t\30\2\2\u0123N\3\2\2\2\u0124\u0125\t\31\2\2\u0125"+
		"P\3\2\2\2\u0126\u0127\t\32\2\2\u0127R\3\2\2\2\u0128\u0129\t\33\2\2\u0129"+
		"T\3\2\2\2\u012a\u012b\t\34\2\2\u012bV\3\2\2\2\u012c\u012d\t\35\2\2\u012d"+
		"X\3\2\2\2\u012e\u012f\7e\2\2\u012f\u0130\7q\2\2\u0130\u0131\7p\2\2\u0131"+
		"\u0132\7u\2\2\u0132\u0133\7q\2\2\u0133\u0134\7n\2\2\u0134\u0135\7g\2\2"+
		"\u0135\u0136\7\60\2\2\u0136\u0137\7n\2\2\u0137\u0138\7q\2\2\u0138\u0139"+
		"\7i\2\2\u0139Z\3\2\2\2\u013a\u013b\7x\2\2\u013b\u013c\7c\2\2\u013c\u013d"+
		"\7t\2\2\u013d\\\3\2\2\2\u013e\u013f\7v\2\2\u013f\u0140\7t\2\2\u0140\u0141"+
		"\7w\2\2\u0141\u0142\7g\2\2\u0142^\3\2\2\2\u0143\u0144\7h\2\2\u0144\u0145"+
		"\7c\2\2\u0145\u0146\7n\2\2\u0146\u0147\7u\2\2\u0147\u0148\7g\2\2\u0148"+
		"`\3\2\2\2\u0149\u014a\7p\2\2\u014a\u014b\7w\2\2\u014b\u014c\7n\2\2\u014c"+
		"\u014d\7n\2\2\u014db\3\2\2\2\u014e\u014f\7y\2\2\u014f\u0150\7j\2\2\u0150"+
		"\u0151\7k\2\2\u0151\u0152\7n\2\2\u0152\u0153\7g\2\2\u0153d\3\2\2\2\u0154"+
		"\u0155\7k\2\2\u0155\u0156\7h\2\2\u0156f\3\2\2\2\u0157\u0158\7g\2\2\u0158"+
		"\u0159\7n\2\2\u0159\u015a\7u\2\2\u015a\u015b\7g\2\2\u015bh\3\2\2\2\u015c"+
		"\u015d\7e\2\2\u015d\u015e\7q\2\2\u015e\u015f\7p\2\2\u015f\u0160\7v\2\2"+
		"\u0160\u0161\7k\2\2\u0161\u0162\7p\2\2\u0162\u0163\7w\2\2\u0163\u0164"+
		"\7g\2\2\u0164j\3\2\2\2\u0165\u0166\7d\2\2\u0166\u0167\7t\2\2\u0167\u0168"+
		"\7g\2\2\u0168\u0169\7c\2\2\u0169\u016a\7m\2\2\u016al\3\2\2\2\u016b\u016c"+
		"\5\27\f\2\u016cn\3\2\2\2\u016d\u016f\5\31\r\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0173\b8\2\2\u0173p\3\2\2\2\36\2y\177\u0081\u0086\u0089\u008e"+
		"\u0092\u0094\u009e\u00a7\u00aa\u00b3\u00bc\u00c2\u00cc\u00d1\u00d6\u00df"+
		"\u00e4\u00ea\u00f1\u00f6\u00fa\u00ff\u0102\u0106\u0170\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}