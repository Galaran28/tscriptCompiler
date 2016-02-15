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
		LPAREN=5, RPAREN=6, SEMICOLON=7, EQUAL=8, PLUS=9, MINUS=10, ASTERISK=11, 
		RSLASH=12, PRINT=13, VAR=14, TRUE=15, FALSE=16, NULL=17, IDENTIFIER=18, 
		WhiteSpace=19;
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
		"LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
		"RSLASH", "PRINT", "VAR", "TRUE", "FALSE", "NULL", "IDENTIFIER", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'console.log'", "'var'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
		"RSLASH", "PRINT", "VAR", "TRUE", "FALSE", "NULL", "IDENTIFIER", "WhiteSpace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0125\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3\5\3\5\5\5b\n\5\5\5d\n\5\3"+
		"\6\3\6\3\6\5\6i\n\6\3\6\5\6l\n\6\3\6\3\6\3\6\5\6q\n\6\3\6\3\6\5\6u\n\6"+
		"\5\6w\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082\13\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\5\b\u008d\n\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0096\n\n\3\13\3\13\3\13\3\f\3\f\7\f\u009d\n\f"+
		"\f\f\16\f\u00a0\13\f\3\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\7\17\u00ad\n\17\f\17\16\17\u00b0\13\17\3\17\3\17\5\17\u00b4\n\17"+
		"\3\20\3\20\3\20\5\20\u00b9\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23"+
		"\u00c2\n\23\3\24\3\24\3\24\5\24\u00c7\n\24\3\25\3\25\7\25\u00cb\n\25\f"+
		"\25\16\25\u00ce\13\25\3\26\3\26\7\26\u00d2\n\26\f\26\16\26\u00d5\13\26"+
		"\3\27\3\27\5\27\u00d9\n\27\3\30\3\30\5\30\u00dd\n\30\3\30\3\30\3\30\5"+
		"\30\u00e2\n\30\3\30\5\30\u00e5\n\30\3\31\3\31\5\31\u00e9\n\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\6)\u0120\n)\r)\16)\u0121\3)"+
		"\3)\2\2*\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35"+
		"\2\37\2!\2#\2%\2\'\2)\2+\2-\3/\4\61\5\63\6\65\7\67\b9\t;\n=\13?\fA\rC"+
		"\16E\17G\20I\21K\22M\23O\24Q\25\3\2\26\3\2\62;\3\2\63;\5\2\62;CHch\4\2"+
		"GGgg\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\5"+
		"\2$$))^^\3\2\"\u0080\4\2))^^\4\2$$^^\3\2**\3\2++\3\2==\3\2??\3\2--\3\2"+
		"//\3\2,,\3\2\61\61\u012d\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tc\3"+
		"\2\2\2\13v\3\2\2\2\rx\3\2\2\2\17\u008c\3\2\2\2\21\u008e\3\2\2\2\23\u0095"+
		"\3\2\2\2\25\u0097\3\2\2\2\27\u009a\3\2\2\2\31\u00a4\3\2\2\2\33\u00a6\3"+
		"\2\2\2\35\u00a8\3\2\2\2\37\u00b8\3\2\2\2!\u00ba\3\2\2\2#\u00bc\3\2\2\2"+
		"%\u00c1\3\2\2\2\'\u00c6\3\2\2\2)\u00c8\3\2\2\2+\u00cf\3\2\2\2-\u00d8\3"+
		"\2\2\2/\u00e4\3\2\2\2\61\u00e8\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2"+
		"\2\67\u00ee\3\2\2\29\u00f0\3\2\2\2;\u00f2\3\2\2\2=\u00f4\3\2\2\2?\u00f6"+
		"\3\2\2\2A\u00f8\3\2\2\2C\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u0108\3\2\2\2I"+
		"\u010c\3\2\2\2K\u0111\3\2\2\2M\u0117\3\2\2\2O\u011c\3\2\2\2Q\u011f\3\2"+
		"\2\2ST\t\2\2\2T\4\3\2\2\2UV\t\3\2\2V\6\3\2\2\2W[\5\3\2\2XZ\5\3\2\2YX\3"+
		"\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\b\3\2\2\2][\3\2\2\2^d\7\62\2\2"+
		"_a\5\5\3\2`b\5\7\4\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2c^\3\2\2\2c_\3\2\2\2"+
		"d\n\3\2\2\2ef\5\t\5\2fh\7\60\2\2gi\5\7\4\2hg\3\2\2\2hi\3\2\2\2ik\3\2\2"+
		"\2jl\5\25\13\2kj\3\2\2\2kl\3\2\2\2lw\3\2\2\2mn\7\60\2\2np\5\7\4\2oq\5"+
		"\25\13\2po\3\2\2\2pq\3\2\2\2qw\3\2\2\2rt\5\t\5\2su\5\25\13\2ts\3\2\2\2"+
		"tu\3\2\2\2uw\3\2\2\2ve\3\2\2\2vm\3\2\2\2vr\3\2\2\2w\f\3\2\2\2xy\t\4\2"+
		"\2y\16\3\2\2\2z{\7\62\2\2{|\7z\2\2|\u0080\3\2\2\2}\177\5\r\7\2~}\3\2\2"+
		"\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008d\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\62\2\2\u0084\u0085\7Z\2\2\u0085"+
		"\u0089\3\2\2\2\u0086\u0088\5\r\7\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008cz\3\2\2\2\u008c\u0083\3\2\2\2\u008d\20\3\2\2\2\u008e"+
		"\u008f\t\5\2\2\u008f\22\3\2\2\2\u0090\u0096\5\7\4\2\u0091\u0092\7-\2\2"+
		"\u0092\u0096\5\7\4\2\u0093\u0094\7/\2\2\u0094\u0096\5\7\4\2\u0095\u0090"+
		"\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096\24\3\2\2\2\u0097"+
		"\u0098\5\21\t\2\u0098\u0099\5\23\n\2\u0099\26\3\2\2\2\u009a\u009e\t\6"+
		"\2\2\u009b\u009d\t\7\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\30\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a1\u00a5\5\33\16\2\u00a2\u00a5\5\37\20\2\u00a3\u00a5\5\35\17\2\u00a4"+
		"\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\32\3\2\2"+
		"\2\u00a6\u00a7\t\b\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa"+
		"\7\61\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\n\t\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b3"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\5\37\20\2\u00b2\u00b4\7\2\2\3"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\36\3\2\2\2\u00b5\u00b6"+
		"\7\17\2\2\u00b6\u00b9\7\f\2\2\u00b7\u00b9\t\t\2\2\u00b8\u00b5\3\2\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b9 \3\2\2\2\u00ba\u00bb\t\n\2\2\u00bb\"\3\2\2"+
		"\2\u00bc\u00bd\t\13\2\2\u00bd$\3\2\2\2\u00be\u00c2\n\f\2\2\u00bf\u00c0"+
		"\7^\2\2\u00c0\u00c2\5#\22\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"&\3\2\2\2\u00c3\u00c7\n\r\2\2\u00c4\u00c5\7^\2\2\u00c5\u00c7\5#\22\2\u00c6"+
		"\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7(\3\2\2\2\u00c8\u00cc\5%\23\2"+
		"\u00c9\u00cb\5%\23\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd*\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d3\5\'\24\2\u00d0\u00d2\5\'\24\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4,\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d9\5\13\6\2\u00d7\u00d9\5\17\b\2\u00d8\u00d6\3\2\2\2"+
		"\u00d8\u00d7\3\2\2\2\u00d9.\3\2\2\2\u00da\u00dc\7$\2\2\u00db\u00dd\5+"+
		"\26\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e5\7$\2\2\u00df\u00e1\7)\2\2\u00e0\u00e2\5)\25\2\u00e1\u00e0\3\2\2"+
		"\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\7)\2\2\u00e4\u00da"+
		"\3\2\2\2\u00e4\u00df\3\2\2\2\u00e5\60\3\2\2\2\u00e6\u00e9\5I%\2\u00e7"+
		"\u00e9\5K&\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\62\3\2\2\2"+
		"\u00ea\u00eb\5M\'\2\u00eb\64\3\2\2\2\u00ec\u00ed\t\16\2\2\u00ed\66\3\2"+
		"\2\2\u00ee\u00ef\t\17\2\2\u00ef8\3\2\2\2\u00f0\u00f1\t\20\2\2\u00f1:\3"+
		"\2\2\2\u00f2\u00f3\t\21\2\2\u00f3<\3\2\2\2\u00f4\u00f5\t\22\2\2\u00f5"+
		">\3\2\2\2\u00f6\u00f7\t\23\2\2\u00f7@\3\2\2\2\u00f8\u00f9\t\24\2\2\u00f9"+
		"B\3\2\2\2\u00fa\u00fb\t\25\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7e\2\2\u00fd"+
		"\u00fe\7q\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7q\2\2"+
		"\u0101\u0102\7n\2\2\u0102\u0103\7g\2\2\u0103\u0104\7\60\2\2\u0104\u0105"+
		"\7n\2\2\u0105\u0106\7q\2\2\u0106\u0107\7i\2\2\u0107F\3\2\2\2\u0108\u0109"+
		"\7x\2\2\u0109\u010a\7c\2\2\u010a\u010b\7t\2\2\u010bH\3\2\2\2\u010c\u010d"+
		"\7v\2\2\u010d\u010e\7t\2\2\u010e\u010f\7w\2\2\u010f\u0110\7g\2\2\u0110"+
		"J\3\2\2\2\u0111\u0112\7h\2\2\u0112\u0113\7c\2\2\u0113\u0114\7n\2\2\u0114"+
		"\u0115\7u\2\2\u0115\u0116\7g\2\2\u0116L\3\2\2\2\u0117\u0118\7p\2\2\u0118"+
		"\u0119\7w\2\2\u0119\u011a\7n\2\2\u011a\u011b\7n\2\2\u011bN\3\2\2\2\u011c"+
		"\u011d\5\27\f\2\u011dP\3\2\2\2\u011e\u0120\5\31\r\2\u011f\u011e\3\2\2"+
		"\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0124\b)\2\2\u0124R\3\2\2\2\36\2[achkptv\u0080\u0089\u008c"+
		"\u0095\u009e\u00a4\u00ae\u00b3\u00b8\u00c1\u00c6\u00cc\u00d3\u00d8\u00dc"+
		"\u00e1\u00e4\u00e8\u0121\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}