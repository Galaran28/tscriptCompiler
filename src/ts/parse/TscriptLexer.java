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
		LPAREN=5, RPAREN=6, LCARET=7, RCARET=8, LBRACK=9, RBRACK=10, EXCLAMATIONPOINT=11, 
		SEMICOLON=12, EQUAL=13, PLUS=14, MINUS=15, ASTERISK=16, RSLASH=17, PRINT=18, 
		VAR=19, TRUE=20, FALSE=21, NULL=22, WHILE=23, IF=24, ELSE=25, CONTINUE=26, 
		BREAK=27, IDENTIFIER=28, WhiteSpace=29;
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
		"LPAREN", "RPAREN", "LCARET", "RCARET", "LBRACK", "RBRACK", "EXCLAMATIONPOINT", 
		"SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "RSLASH", "PRINT", 
		"VAR", "TRUE", "FALSE", "NULL", "WHILE", "IF", "ELSE", "CONTINUE", "BREAK", 
		"IDENTIFIER", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'console.log'", "'var'", "'true'", 
		"'false'", "'null'", "'while'", "'if'", "'else'", "'continue'", "'break'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "LCARET", "RCARET", "LBRACK", "RBRACK", "EXCLAMATIONPOINT", 
		"SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "RSLASH", "PRINT", 
		"VAR", "TRUE", "FALSE", "NULL", "WHILE", "IF", "ELSE", "CONTINUE", "BREAK", 
		"IDENTIFIER", "WhiteSpace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u0160\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\5\3\5\3\5\5\5v\n\5\5\5"+
		"x\n\5\3\6\3\6\3\6\5\6}\n\6\3\6\5\6\u0080\n\6\3\6\3\6\3\6\5\6\u0085\n\6"+
		"\3\6\3\6\5\6\u0089\n\6\5\6\u008b\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0093"+
		"\n\b\f\b\16\b\u0096\13\b\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f"+
		"\13\b\5\b\u00a1\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13"+
		"\3\13\3\f\3\f\7\f\u00b1\n\f\f\f\16\f\u00b4\13\f\3\r\3\r\3\r\5\r\u00b9"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13"+
		"\17\3\17\3\17\5\17\u00c8\n\17\3\20\3\20\3\20\5\20\u00cd\n\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\5\23\u00d6\n\23\3\24\3\24\3\24\5\24\u00db\n"+
		"\24\3\25\3\25\7\25\u00df\n\25\f\25\16\25\u00e2\13\25\3\26\3\26\7\26\u00e6"+
		"\n\26\f\26\16\26\u00e9\13\26\3\27\3\27\5\27\u00ed\n\27\3\30\3\30\5\30"+
		"\u00f1\n\30\3\30\3\30\3\30\5\30\u00f6\n\30\3\30\5\30\u00f9\n\30\3\31\3"+
		"\31\5\31\u00fd\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\63\6\63\u015b\n\63\r\63\16\63\u015c\3\63\3\63\2\2\64\3\2\5\2\7"+
		"\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2"+
		"\'\2)\2+\2-\3/\4\61\5\63\6\65\7\67\b9\t;\n=\13?\fA\rC\16E\17G\20I\21K"+
		"\22M\23O\24Q\25S\26U\27W\30Y\31[\32]\33_\34a\35c\36e\37\3\2\33\3\2\62"+
		";\3\2\63;\5\2\62;CHch\4\2GGgg\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13"+
		"\16\16\"\"\4\2\f\f\17\17\5\2$$))^^\3\2\"\u0080\4\2))^^\4\2$$^^\3\2**\3"+
		"\2++\3\2>>\3\2@@\3\2}}\3\2\177\177\3\2##\3\2==\3\2??\3\2--\3\2//\3\2,"+
		",\3\2\61\61\u0168\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3"+
		"\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tw\3\2\2\2\13\u008a\3\2\2\2\r\u008c\3\2\2"+
		"\2\17\u00a0\3\2\2\2\21\u00a2\3\2\2\2\23\u00a9\3\2\2\2\25\u00ab\3\2\2\2"+
		"\27\u00ae\3\2\2\2\31\u00b8\3\2\2\2\33\u00ba\3\2\2\2\35\u00bc\3\2\2\2\37"+
		"\u00cc\3\2\2\2!\u00ce\3\2\2\2#\u00d0\3\2\2\2%\u00d5\3\2\2\2\'\u00da\3"+
		"\2\2\2)\u00dc\3\2\2\2+\u00e3\3\2\2\2-\u00ec\3\2\2\2/\u00f8\3\2\2\2\61"+
		"\u00fc\3\2\2\2\63\u00fe\3\2\2\2\65\u0100\3\2\2\2\67\u0102\3\2\2\29\u0104"+
		"\3\2\2\2;\u0106\3\2\2\2=\u0108\3\2\2\2?\u010a\3\2\2\2A\u010c\3\2\2\2C"+
		"\u010e\3\2\2\2E\u0110\3\2\2\2G\u0112\3\2\2\2I\u0114\3\2\2\2K\u0116\3\2"+
		"\2\2M\u0118\3\2\2\2O\u011a\3\2\2\2Q\u0126\3\2\2\2S\u012a\3\2\2\2U\u012f"+
		"\3\2\2\2W\u0135\3\2\2\2Y\u013a\3\2\2\2[\u0140\3\2\2\2]\u0143\3\2\2\2_"+
		"\u0148\3\2\2\2a\u0151\3\2\2\2c\u0157\3\2\2\2e\u015a\3\2\2\2gh\t\2\2\2"+
		"h\4\3\2\2\2ij\t\3\2\2j\6\3\2\2\2ko\5\3\2\2ln\5\3\2\2ml\3\2\2\2nq\3\2\2"+
		"\2om\3\2\2\2op\3\2\2\2p\b\3\2\2\2qo\3\2\2\2rx\7\62\2\2su\5\5\3\2tv\5\7"+
		"\4\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wr\3\2\2\2ws\3\2\2\2x\n\3\2\2\2yz\5"+
		"\t\5\2z|\7\60\2\2{}\5\7\4\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\5"+
		"\25\13\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u008b\3\2\2\2\u0081\u0082"+
		"\7\60\2\2\u0082\u0084\5\7\4\2\u0083\u0085\5\25\13\2\u0084\u0083\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\u008b\3\2\2\2\u0086\u0088\5\t\5\2\u0087\u0089"+
		"\5\25\13\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2"+
		"\u008ay\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0086\3\2\2\2\u008b\f\3\2\2"+
		"\2\u008c\u008d\t\4\2\2\u008d\16\3\2\2\2\u008e\u008f\7\62\2\2\u008f\u0090"+
		"\7z\2\2\u0090\u0094\3\2\2\2\u0091\u0093\5\r\7\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00a1\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\62\2\2\u0098\u0099\7Z\2\2\u0099"+
		"\u009d\3\2\2\2\u009a\u009c\5\r\7\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u008e\3\2\2\2\u00a0\u0097\3\2\2\2\u00a1\20\3\2\2"+
		"\2\u00a2\u00a3\t\5\2\2\u00a3\22\3\2\2\2\u00a4\u00aa\5\7\4\2\u00a5\u00a6"+
		"\7-\2\2\u00a6\u00aa\5\7\4\2\u00a7\u00a8\7/\2\2\u00a8\u00aa\5\7\4\2\u00a9"+
		"\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\24\3\2\2"+
		"\2\u00ab\u00ac\5\21\t\2\u00ac\u00ad\5\23\n\2\u00ad\26\3\2\2\2\u00ae\u00b2"+
		"\t\6\2\2\u00af\u00b1\t\7\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\30\3\2\2\2\u00b4\u00b2\3\2\2"+
		"\2\u00b5\u00b9\5\33\16\2\u00b6\u00b9\5\37\20\2\u00b7\u00b9\5\35\17\2\u00b8"+
		"\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\32\3\2\2"+
		"\2\u00ba\u00bb\t\b\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00be"+
		"\7\61\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1\n\t\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\5\37\20\2\u00c6\u00c8\7\2\2\3"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\36\3\2\2\2\u00c9\u00ca"+
		"\7\17\2\2\u00ca\u00cd\7\f\2\2\u00cb\u00cd\t\t\2\2\u00cc\u00c9\3\2\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd \3\2\2\2\u00ce\u00cf\t\n\2\2\u00cf\"\3\2\2"+
		"\2\u00d0\u00d1\t\13\2\2\u00d1$\3\2\2\2\u00d2\u00d6\n\f\2\2\u00d3\u00d4"+
		"\7^\2\2\u00d4\u00d6\5#\22\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"&\3\2\2\2\u00d7\u00db\n\r\2\2\u00d8\u00d9\7^\2\2\u00d9\u00db\5#\22\2\u00da"+
		"\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00db(\3\2\2\2\u00dc\u00e0\5%\23\2"+
		"\u00dd\u00df\5%\23\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1*\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e7\5\'\24\2\u00e4\u00e6\5\'\24\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8,\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00ed\5\13\6\2\u00eb\u00ed\5\17\b\2\u00ec\u00ea\3\2\2\2"+
		"\u00ec\u00eb\3\2\2\2\u00ed.\3\2\2\2\u00ee\u00f0\7$\2\2\u00ef\u00f1\5+"+
		"\26\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f9\7$\2\2\u00f3\u00f5\7)\2\2\u00f4\u00f6\5)\25\2\u00f5\u00f4\3\2\2"+
		"\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\7)\2\2\u00f8\u00ee"+
		"\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9\60\3\2\2\2\u00fa\u00fd\5S*\2\u00fb"+
		"\u00fd\5U+\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\62\3\2\2\2"+
		"\u00fe\u00ff\5W,\2\u00ff\64\3\2\2\2\u0100\u0101\t\16\2\2\u0101\66\3\2"+
		"\2\2\u0102\u0103\t\17\2\2\u01038\3\2\2\2\u0104\u0105\t\20\2\2\u0105:\3"+
		"\2\2\2\u0106\u0107\t\21\2\2\u0107<\3\2\2\2\u0108\u0109\t\22\2\2\u0109"+
		">\3\2\2\2\u010a\u010b\t\23\2\2\u010b@\3\2\2\2\u010c\u010d\t\24\2\2\u010d"+
		"B\3\2\2\2\u010e\u010f\t\25\2\2\u010fD\3\2\2\2\u0110\u0111\t\26\2\2\u0111"+
		"F\3\2\2\2\u0112\u0113\t\27\2\2\u0113H\3\2\2\2\u0114\u0115\t\30\2\2\u0115"+
		"J\3\2\2\2\u0116\u0117\t\31\2\2\u0117L\3\2\2\2\u0118\u0119\t\32\2\2\u0119"+
		"N\3\2\2\2\u011a\u011b\7e\2\2\u011b\u011c\7q\2\2\u011c\u011d\7p\2\2\u011d"+
		"\u011e\7u\2\2\u011e\u011f\7q\2\2\u011f\u0120\7n\2\2\u0120\u0121\7g\2\2"+
		"\u0121\u0122\7\60\2\2\u0122\u0123\7n\2\2\u0123\u0124\7q\2\2\u0124\u0125"+
		"\7i\2\2\u0125P\3\2\2\2\u0126\u0127\7x\2\2\u0127\u0128\7c\2\2\u0128\u0129"+
		"\7t\2\2\u0129R\3\2\2\2\u012a\u012b\7v\2\2\u012b\u012c\7t\2\2\u012c\u012d"+
		"\7w\2\2\u012d\u012e\7g\2\2\u012eT\3\2\2\2\u012f\u0130\7h\2\2\u0130\u0131"+
		"\7c\2\2\u0131\u0132\7n\2\2\u0132\u0133\7u\2\2\u0133\u0134\7g\2\2\u0134"+
		"V\3\2\2\2\u0135\u0136\7p\2\2\u0136\u0137\7w\2\2\u0137\u0138\7n\2\2\u0138"+
		"\u0139\7n\2\2\u0139X\3\2\2\2\u013a\u013b\7y\2\2\u013b\u013c\7j\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7n\2\2\u013e\u013f\7g\2\2\u013fZ\3\2\2\2\u0140"+
		"\u0141\7k\2\2\u0141\u0142\7h\2\2\u0142\\\3\2\2\2\u0143\u0144\7g\2\2\u0144"+
		"\u0145\7n\2\2\u0145\u0146\7u\2\2\u0146\u0147\7g\2\2\u0147^\3\2\2\2\u0148"+
		"\u0149\7e\2\2\u0149\u014a\7q\2\2\u014a\u014b\7p\2\2\u014b\u014c\7v\2\2"+
		"\u014c\u014d\7k\2\2\u014d\u014e\7p\2\2\u014e\u014f\7w\2\2\u014f\u0150"+
		"\7g\2\2\u0150`\3\2\2\2\u0151\u0152\7d\2\2\u0152\u0153\7t\2\2\u0153\u0154"+
		"\7g\2\2\u0154\u0155\7c\2\2\u0155\u0156\7m\2\2\u0156b\3\2\2\2\u0157\u0158"+
		"\5\27\f\2\u0158d\3\2\2\2\u0159\u015b\5\31\r\2\u015a\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u015f\b\63\2\2\u015ff\3\2\2\2\36\2ouw|\177\u0084\u0088\u008a"+
		"\u0094\u009d\u00a0\u00a9\u00b2\u00b8\u00c2\u00c7\u00cc\u00d5\u00da\u00e0"+
		"\u00e7\u00ec\u00f0\u00f5\u00f8\u00fc\u015c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}