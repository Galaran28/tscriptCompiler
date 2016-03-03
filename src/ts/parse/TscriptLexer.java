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
		VAR=19, TRUE=20, FALSE=21, NULL=22, WHILE=23, IDENTIFIER=24, WhiteSpace=25;
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
		"VAR", "TRUE", "FALSE", "NULL", "WHILE", "IDENTIFIER", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'console.log'", "'var'", "'true'", 
		"'false'", "'null'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "LCARET", "RCARET", "LBRACK", "RBRACK", "EXCLAMATIONPOINT", 
		"SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "RSLASH", "PRINT", 
		"VAR", "TRUE", "FALSE", "NULL", "WHILE", "IDENTIFIER", "WhiteSpace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u0141\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\7\4f\n\4\f\4\16\4i\13"+
		"\4\3\5\3\5\3\5\5\5n\n\5\5\5p\n\5\3\6\3\6\3\6\5\6u\n\6\3\6\5\6x\n\6\3\6"+
		"\3\6\3\6\5\6}\n\6\3\6\3\6\5\6\u0081\n\6\5\6\u0083\n\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\b\3\b\3\b\3\b\7\b\u0094\n"+
		"\b\f\b\16\b\u0097\13\b\5\b\u0099\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a2"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\7\f\u00a9\n\f\f\f\16\f\u00ac\13\f\3\r\3\r"+
		"\3\r\5\r\u00b1\n\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00b9\n\17\f\17"+
		"\16\17\u00bc\13\17\3\17\3\17\5\17\u00c0\n\17\3\20\3\20\3\20\5\20\u00c5"+
		"\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u00ce\n\23\3\24\3\24\3\24"+
		"\5\24\u00d3\n\24\3\25\3\25\7\25\u00d7\n\25\f\25\16\25\u00da\13\25\3\26"+
		"\3\26\7\26\u00de\n\26\f\26\16\26\u00e1\13\26\3\27\3\27\5\27\u00e5\n\27"+
		"\3\30\3\30\5\30\u00e9\n\30\3\30\3\30\3\30\5\30\u00ee\n\30\3\30\5\30\u00f1"+
		"\n\30\3\31\3\31\5\31\u00f5\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3/\6/\u013c\n/\r"+
		"/\16/\u013d\3/\3/\2\2\60\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2"+
		"\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\3/\4\61\5\63\6\65\7\67\b"+
		"9\t;\n=\13?\fA\rC\16E\17G\20I\21K\22M\23O\24Q\25S\26U\27W\30Y\31[\32]"+
		"\33\3\2\33\3\2\62;\3\2\63;\5\2\62;CHch\4\2GGgg\6\2&&C\\aac|\7\2&&\62;"+
		"C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\5\2$$))^^\3\2\"\u0080\4\2))"+
		"^^\4\2$$^^\3\2**\3\2++\3\2>>\3\2@@\3\2}}\3\2\177\177\3\2##\3\2==\3\2?"+
		"?\3\2--\3\2//\3\2,,\3\2\61\61\u0149\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2"+
		"\2\to\3\2\2\2\13\u0082\3\2\2\2\r\u0084\3\2\2\2\17\u0098\3\2\2\2\21\u009a"+
		"\3\2\2\2\23\u00a1\3\2\2\2\25\u00a3\3\2\2\2\27\u00a6\3\2\2\2\31\u00b0\3"+
		"\2\2\2\33\u00b2\3\2\2\2\35\u00b4\3\2\2\2\37\u00c4\3\2\2\2!\u00c6\3\2\2"+
		"\2#\u00c8\3\2\2\2%\u00cd\3\2\2\2\'\u00d2\3\2\2\2)\u00d4\3\2\2\2+\u00db"+
		"\3\2\2\2-\u00e4\3\2\2\2/\u00f0\3\2\2\2\61\u00f4\3\2\2\2\63\u00f6\3\2\2"+
		"\2\65\u00f8\3\2\2\2\67\u00fa\3\2\2\29\u00fc\3\2\2\2;\u00fe\3\2\2\2=\u0100"+
		"\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E\u0108\3\2\2\2G"+
		"\u010a\3\2\2\2I\u010c\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2\2\2O\u0112\3\2"+
		"\2\2Q\u011e\3\2\2\2S\u0122\3\2\2\2U\u0127\3\2\2\2W\u012d\3\2\2\2Y\u0132"+
		"\3\2\2\2[\u0138\3\2\2\2]\u013b\3\2\2\2_`\t\2\2\2`\4\3\2\2\2ab\t\3\2\2"+
		"b\6\3\2\2\2cg\5\3\2\2df\5\3\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2h\b\3\2\2\2ig\3\2\2\2jp\7\62\2\2km\5\5\3\2ln\5\7\4\2ml\3\2\2\2mn\3\2"+
		"\2\2np\3\2\2\2oj\3\2\2\2ok\3\2\2\2p\n\3\2\2\2qr\5\t\5\2rt\7\60\2\2su\5"+
		"\7\4\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\5\25\13\2wv\3\2\2\2wx\3\2\2\2x"+
		"\u0083\3\2\2\2yz\7\60\2\2z|\5\7\4\2{}\5\25\13\2|{\3\2\2\2|}\3\2\2\2}\u0083"+
		"\3\2\2\2~\u0080\5\t\5\2\177\u0081\5\25\13\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082q\3\2\2\2\u0082y\3\2\2\2\u0082~\3\2"+
		"\2\2\u0083\f\3\2\2\2\u0084\u0085\t\4\2\2\u0085\16\3\2\2\2\u0086\u0087"+
		"\7\62\2\2\u0087\u0088\7z\2\2\u0088\u008c\3\2\2\2\u0089\u008b\5\r\7\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0099\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\62\2\2\u0090"+
		"\u0091\7Z\2\2\u0091\u0095\3\2\2\2\u0092\u0094\5\r\7\2\u0093\u0092\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0086\3\2\2\2\u0098\u008f\3\2"+
		"\2\2\u0099\20\3\2\2\2\u009a\u009b\t\5\2\2\u009b\22\3\2\2\2\u009c\u00a2"+
		"\5\7\4\2\u009d\u009e\7-\2\2\u009e\u00a2\5\7\4\2\u009f\u00a0\7/\2\2\u00a0"+
		"\u00a2\5\7\4\2\u00a1\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\5\21\t\2\u00a4\u00a5\5\23\n\2\u00a5"+
		"\26\3\2\2\2\u00a6\u00aa\t\6\2\2\u00a7\u00a9\t\7\2\2\u00a8\u00a7\3\2\2"+
		"\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\30"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\5\33\16\2\u00ae\u00b1\5\37\20"+
		"\2\u00af\u00b1\5\35\17\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\t\b\2\2\u00b3\34\3\2\2\2\u00b4"+
		"\u00b5\7\61\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b9\n"+
		"\t\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\5\37"+
		"\20\2\u00be\u00c0\7\2\2\3\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\36\3\2\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c5\7\f\2\2\u00c3\u00c5\t\t\2"+
		"\2\u00c4\u00c1\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5 \3\2\2\2\u00c6\u00c7"+
		"\t\n\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\t\13\2\2\u00c9$\3\2\2\2\u00ca\u00ce"+
		"\n\f\2\2\u00cb\u00cc\7^\2\2\u00cc\u00ce\5#\22\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce&\3\2\2\2\u00cf\u00d3\n\r\2\2\u00d0\u00d1\7^\2\2\u00d1"+
		"\u00d3\5#\22\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3(\3\2\2\2"+
		"\u00d4\u00d8\5%\23\2\u00d5\u00d7\5%\23\2\u00d6\u00d5\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9*\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00df\5\'\24\2\u00dc\u00de\5\'\24\2\u00dd\u00dc\3"+
		"\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		",\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\5\13\6\2\u00e3\u00e5\5\17\b"+
		"\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5.\3\2\2\2\u00e6\u00e8"+
		"\7$\2\2\u00e7\u00e9\5+\26\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00f1\7$\2\2\u00eb\u00ed\7)\2\2\u00ec\u00ee\5)\25"+
		"\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1"+
		"\7)\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1\60\3\2\2\2\u00f2"+
		"\u00f5\5S*\2\u00f3\u00f5\5U+\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2"+
		"\u00f5\62\3\2\2\2\u00f6\u00f7\5W,\2\u00f7\64\3\2\2\2\u00f8\u00f9\t\16"+
		"\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\t\17\2\2\u00fb8\3\2\2\2\u00fc\u00fd"+
		"\t\20\2\2\u00fd:\3\2\2\2\u00fe\u00ff\t\21\2\2\u00ff<\3\2\2\2\u0100\u0101"+
		"\t\22\2\2\u0101>\3\2\2\2\u0102\u0103\t\23\2\2\u0103@\3\2\2\2\u0104\u0105"+
		"\t\24\2\2\u0105B\3\2\2\2\u0106\u0107\t\25\2\2\u0107D\3\2\2\2\u0108\u0109"+
		"\t\26\2\2\u0109F\3\2\2\2\u010a\u010b\t\27\2\2\u010bH\3\2\2\2\u010c\u010d"+
		"\t\30\2\2\u010dJ\3\2\2\2\u010e\u010f\t\31\2\2\u010fL\3\2\2\2\u0110\u0111"+
		"\t\32\2\2\u0111N\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7q\2\2\u0114\u0115"+
		"\7p\2\2\u0115\u0116\7u\2\2\u0116\u0117\7q\2\2\u0117\u0118\7n\2\2\u0118"+
		"\u0119\7g\2\2\u0119\u011a\7\60\2\2\u011a\u011b\7n\2\2\u011b\u011c\7q\2"+
		"\2\u011c\u011d\7i\2\2\u011dP\3\2\2\2\u011e\u011f\7x\2\2\u011f\u0120\7"+
		"c\2\2\u0120\u0121\7t\2\2\u0121R\3\2\2\2\u0122\u0123\7v\2\2\u0123\u0124"+
		"\7t\2\2\u0124\u0125\7w\2\2\u0125\u0126\7g\2\2\u0126T\3\2\2\2\u0127\u0128"+
		"\7h\2\2\u0128\u0129\7c\2\2\u0129\u012a\7n\2\2\u012a\u012b\7u\2\2\u012b"+
		"\u012c\7g\2\2\u012cV\3\2\2\2\u012d\u012e\7p\2\2\u012e\u012f\7w\2\2\u012f"+
		"\u0130\7n\2\2\u0130\u0131\7n\2\2\u0131X\3\2\2\2\u0132\u0133\7y\2\2\u0133"+
		"\u0134\7j\2\2\u0134\u0135\7k\2\2\u0135\u0136\7n\2\2\u0136\u0137\7g\2\2"+
		"\u0137Z\3\2\2\2\u0138\u0139\5\27\f\2\u0139\\\3\2\2\2\u013a\u013c\5\31"+
		"\r\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b/\2\2\u0140^\3\2\2\2\36"+
		"\2gmotw|\u0080\u0082\u008c\u0095\u0098\u00a1\u00aa\u00b0\u00ba\u00bf\u00c4"+
		"\u00cd\u00d2\u00d8\u00df\u00e4\u00e8\u00ed\u00f0\u00f4\u013d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}