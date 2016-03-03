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
		VAR=19, TRUE=20, FALSE=21, NULL=22, WHILE=23, IF=24, ELSE=25, IDENTIFIER=26, 
		WhiteSpace=27;
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
		"VAR", "TRUE", "FALSE", "NULL", "WHILE", "IF", "ELSE", "IDENTIFIER", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'console.log'", "'var'", "'true'", 
		"'false'", "'null'", "'while'", "'if'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "LCARET", "RCARET", "LBRACK", "RBRACK", "EXCLAMATIONPOINT", 
		"SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", "RSLASH", "PRINT", 
		"VAR", "TRUE", "FALSE", "NULL", "WHILE", "IF", "ELSE", "IDENTIFIER", "WhiteSpace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u014d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\7\4j\n\4\f\4\16\4m\13\4\3\5\3\5\3\5\5\5r\n\5\5\5t\n\5\3\6\3\6\3\6\5\6"+
		"y\n\6\3\6\5\6|\n\6\3\6\3\6\3\6\5\6\u0081\n\6\3\6\3\6\5\6\u0085\n\6\5\6"+
		"\u0087\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u008f\n\b\f\b\16\b\u0092\13\b\3"+
		"\b\3\b\3\b\3\b\7\b\u0098\n\b\f\b\16\b\u009b\13\b\5\b\u009d\n\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00a6\n\n\3\13\3\13\3\13\3\f\3\f\7\f\u00ad\n"+
		"\f\f\f\16\f\u00b0\13\f\3\r\3\r\3\r\5\r\u00b5\n\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\7\17\u00bd\n\17\f\17\16\17\u00c0\13\17\3\17\3\17\5\17\u00c4\n"+
		"\17\3\20\3\20\3\20\5\20\u00c9\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\5\23\u00d2\n\23\3\24\3\24\3\24\5\24\u00d7\n\24\3\25\3\25\7\25\u00db\n"+
		"\25\f\25\16\25\u00de\13\25\3\26\3\26\7\26\u00e2\n\26\f\26\16\26\u00e5"+
		"\13\26\3\27\3\27\5\27\u00e9\n\27\3\30\3\30\5\30\u00ed\n\30\3\30\3\30\3"+
		"\30\5\30\u00f2\n\30\3\30\5\30\u00f5\n\30\3\31\3\31\5\31\u00f9\n\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\61\6\61\u0148\n\61\r"+
		"\61\16\61\u0149\3\61\3\61\2\2\62\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\3/\4\61\5\63\6\65"+
		"\7\67\b9\t;\n=\13?\fA\rC\16E\17G\20I\21K\22M\23O\24Q\25S\26U\27W\30Y\31"+
		"[\32]\33_\34a\35\3\2\33\3\2\62;\3\2\63;\5\2\62;CHch\4\2GGgg\6\2&&C\\a"+
		"ac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\5\2$$))^^\3\2\""+
		"\u0080\4\2))^^\4\2$$^^\3\2**\3\2++\3\2>>\3\2@@\3\2}}\3\2\177\177\3\2#"+
		"#\3\2==\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\u0155\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\ts\3\2\2\2\13\u0086\3\2\2\2\r\u0088"+
		"\3\2\2\2\17\u009c\3\2\2\2\21\u009e\3\2\2\2\23\u00a5\3\2\2\2\25\u00a7\3"+
		"\2\2\2\27\u00aa\3\2\2\2\31\u00b4\3\2\2\2\33\u00b6\3\2\2\2\35\u00b8\3\2"+
		"\2\2\37\u00c8\3\2\2\2!\u00ca\3\2\2\2#\u00cc\3\2\2\2%\u00d1\3\2\2\2\'\u00d6"+
		"\3\2\2\2)\u00d8\3\2\2\2+\u00df\3\2\2\2-\u00e8\3\2\2\2/\u00f4\3\2\2\2\61"+
		"\u00f8\3\2\2\2\63\u00fa\3\2\2\2\65\u00fc\3\2\2\2\67\u00fe\3\2\2\29\u0100"+
		"\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0106\3\2\2\2A\u0108\3\2\2\2C"+
		"\u010a\3\2\2\2E\u010c\3\2\2\2G\u010e\3\2\2\2I\u0110\3\2\2\2K\u0112\3\2"+
		"\2\2M\u0114\3\2\2\2O\u0116\3\2\2\2Q\u0122\3\2\2\2S\u0126\3\2\2\2U\u012b"+
		"\3\2\2\2W\u0131\3\2\2\2Y\u0136\3\2\2\2[\u013c\3\2\2\2]\u013f\3\2\2\2_"+
		"\u0144\3\2\2\2a\u0147\3\2\2\2cd\t\2\2\2d\4\3\2\2\2ef\t\3\2\2f\6\3\2\2"+
		"\2gk\5\3\2\2hj\5\3\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\b\3\2"+
		"\2\2mk\3\2\2\2nt\7\62\2\2oq\5\5\3\2pr\5\7\4\2qp\3\2\2\2qr\3\2\2\2rt\3"+
		"\2\2\2sn\3\2\2\2so\3\2\2\2t\n\3\2\2\2uv\5\t\5\2vx\7\60\2\2wy\5\7\4\2x"+
		"w\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5\25\13\2{z\3\2\2\2{|\3\2\2\2|\u0087\3"+
		"\2\2\2}~\7\60\2\2~\u0080\5\7\4\2\177\u0081\5\25\13\2\u0080\177\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0087\3\2\2\2\u0082\u0084\5\t\5\2\u0083\u0085"+
		"\5\25\13\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2"+
		"\u0086u\3\2\2\2\u0086}\3\2\2\2\u0086\u0082\3\2\2\2\u0087\f\3\2\2\2\u0088"+
		"\u0089\t\4\2\2\u0089\16\3\2\2\2\u008a\u008b\7\62\2\2\u008b\u008c\7z\2"+
		"\2\u008c\u0090\3\2\2\2\u008d\u008f\5\r\7\2\u008e\u008d\3\2\2\2\u008f\u0092"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009d\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7\62\2\2\u0094\u0095\7Z\2\2\u0095\u0099\3\2"+
		"\2\2\u0096\u0098\5\r\7\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u008a\3\2\2\2\u009c\u0093\3\2\2\2\u009d\20\3\2\2\2\u009e\u009f"+
		"\t\5\2\2\u009f\22\3\2\2\2\u00a0\u00a6\5\7\4\2\u00a1\u00a2\7-\2\2\u00a2"+
		"\u00a6\5\7\4\2\u00a3\u00a4\7/\2\2\u00a4\u00a6\5\7\4\2\u00a5\u00a0\3\2"+
		"\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\24\3\2\2\2\u00a7\u00a8"+
		"\5\21\t\2\u00a8\u00a9\5\23\n\2\u00a9\26\3\2\2\2\u00aa\u00ae\t\6\2\2\u00ab"+
		"\u00ad\t\7\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\30\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b5"+
		"\5\33\16\2\u00b2\u00b5\5\37\20\2\u00b3\u00b5\5\35\17\2\u00b4\u00b1\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\32\3\2\2\2\u00b6\u00b7"+
		"\t\b\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\7\61\2\2\u00ba"+
		"\u00be\3\2\2\2\u00bb\u00bd\n\t\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c4\5\37\20\2\u00c2\u00c4\7\2\2\3\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7\17\2\2\u00c6"+
		"\u00c9\7\f\2\2\u00c7\u00c9\t\t\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9 \3\2\2\2\u00ca\u00cb\t\n\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\t"+
		"\13\2\2\u00cd$\3\2\2\2\u00ce\u00d2\n\f\2\2\u00cf\u00d0\7^\2\2\u00d0\u00d2"+
		"\5#\22\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2&\3\2\2\2\u00d3"+
		"\u00d7\n\r\2\2\u00d4\u00d5\7^\2\2\u00d5\u00d7\5#\22\2\u00d6\u00d3\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7(\3\2\2\2\u00d8\u00dc\5%\23\2\u00d9\u00db"+
		"\5%\23\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd*\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e3\5\'\24\2"+
		"\u00e0\u00e2\5\'\24\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4,\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e9\5\13\6\2\u00e7\u00e9\5\17\b\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9.\3\2\2\2\u00ea\u00ec\7$\2\2\u00eb\u00ed\5+\26\2\u00ec\u00eb"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f5\7$\2\2\u00ef"+
		"\u00f1\7)\2\2\u00f0\u00f2\5)\25\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\7)\2\2\u00f4\u00ea\3\2\2\2\u00f4"+
		"\u00ef\3\2\2\2\u00f5\60\3\2\2\2\u00f6\u00f9\5S*\2\u00f7\u00f9\5U+\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\62\3\2\2\2\u00fa\u00fb\5W,\2"+
		"\u00fb\64\3\2\2\2\u00fc\u00fd\t\16\2\2\u00fd\66\3\2\2\2\u00fe\u00ff\t"+
		"\17\2\2\u00ff8\3\2\2\2\u0100\u0101\t\20\2\2\u0101:\3\2\2\2\u0102\u0103"+
		"\t\21\2\2\u0103<\3\2\2\2\u0104\u0105\t\22\2\2\u0105>\3\2\2\2\u0106\u0107"+
		"\t\23\2\2\u0107@\3\2\2\2\u0108\u0109\t\24\2\2\u0109B\3\2\2\2\u010a\u010b"+
		"\t\25\2\2\u010bD\3\2\2\2\u010c\u010d\t\26\2\2\u010dF\3\2\2\2\u010e\u010f"+
		"\t\27\2\2\u010fH\3\2\2\2\u0110\u0111\t\30\2\2\u0111J\3\2\2\2\u0112\u0113"+
		"\t\31\2\2\u0113L\3\2\2\2\u0114\u0115\t\32\2\2\u0115N\3\2\2\2\u0116\u0117"+
		"\7e\2\2\u0117\u0118\7q\2\2\u0118\u0119\7p\2\2\u0119\u011a\7u\2\2\u011a"+
		"\u011b\7q\2\2\u011b\u011c\7n\2\2\u011c\u011d\7g\2\2\u011d\u011e\7\60\2"+
		"\2\u011e\u011f\7n\2\2\u011f\u0120\7q\2\2\u0120\u0121\7i\2\2\u0121P\3\2"+
		"\2\2\u0122\u0123\7x\2\2\u0123\u0124\7c\2\2\u0124\u0125\7t\2\2\u0125R\3"+
		"\2\2\2\u0126\u0127\7v\2\2\u0127\u0128\7t\2\2\u0128\u0129\7w\2\2\u0129"+
		"\u012a\7g\2\2\u012aT\3\2\2\2\u012b\u012c\7h\2\2\u012c\u012d\7c\2\2\u012d"+
		"\u012e\7n\2\2\u012e\u012f\7u\2\2\u012f\u0130\7g\2\2\u0130V\3\2\2\2\u0131"+
		"\u0132\7p\2\2\u0132\u0133\7w\2\2\u0133\u0134\7n\2\2\u0134\u0135\7n\2\2"+
		"\u0135X\3\2\2\2\u0136\u0137\7y\2\2\u0137\u0138\7j\2\2\u0138\u0139\7k\2"+
		"\2\u0139\u013a\7n\2\2\u013a\u013b\7g\2\2\u013bZ\3\2\2\2\u013c\u013d\7"+
		"k\2\2\u013d\u013e\7h\2\2\u013e\\\3\2\2\2\u013f\u0140\7g\2\2\u0140\u0141"+
		"\7n\2\2\u0141\u0142\7u\2\2\u0142\u0143\7g\2\2\u0143^\3\2\2\2\u0144\u0145"+
		"\5\27\f\2\u0145`\3\2\2\2\u0146\u0148\5\31\r\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\b\61\2\2\u014cb\3\2\2\2\36\2kqsx{\u0080\u0084\u0086\u0090"+
		"\u0099\u009c\u00a5\u00ae\u00b4\u00be\u00c3\u00c8\u00d1\u00d6\u00dc\u00e3"+
		"\u00e8\u00ec\u00f1\u00f4\u00f8\u0149\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}