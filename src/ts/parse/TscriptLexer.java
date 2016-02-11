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
		LPAREN=5, RPAREN=6, SEMICOLON=7, EQUAL=8, PLUS=9, ASTERISK=10, PRINT=11, 
		VAR=12, TRUE=13, FALSE=14, NULL=15, IDENTIFIER=16, WhiteSpace=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Digit", "NonZeroDigit", "Digits", "DecimalIntegerLiteral", "DecimalLiteral", 
		"HexDigit", "HexLiteral", "ExponentIndicator", "SignedInteger", "ExponentPart", 
		"IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "Letter", "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", 
		"NULL_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "ASTERISK", 
		"PRINT", "VAR", "TRUE", "FALSE", "NULL", "IDENTIFIER", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'console.log'", 
		"'var'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "ASTERISK", "PRINT", 
		"VAR", "TRUE", "FALSE", "NULL", "IDENTIFIER", "WhiteSpace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00f8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3"+
		"\5\3\5\5\5T\n\5\5\5V\n\5\3\6\3\6\3\6\5\6[\n\6\3\6\5\6^\n\6\3\6\3\6\3\6"+
		"\5\6c\n\6\3\6\3\6\5\6g\n\6\5\6i\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\bq\n\b\f"+
		"\b\16\bt\13\b\3\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\5\b\177\n\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0088\n\n\3\13\3\13\3\13\3\f\3\f\7\f\u008f"+
		"\n\f\f\f\16\f\u0092\13\f\3\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\7\17\u009f\n\17\f\17\16\17\u00a2\13\17\3\17\3\17\5\17\u00a6"+
		"\n\17\3\20\3\20\3\20\5\20\u00ab\n\20\3\21\3\21\3\22\3\22\5\22\u00b1\n"+
		"\22\3\23\3\23\3\23\3\23\7\23\u00b7\n\23\f\23\16\23\u00ba\13\23\3\23\3"+
		"\23\3\24\3\24\5\24\u00c0\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\6\"\u00f3\n\"\r\"\16"+
		"\"\u00f4\3\"\3\"\2\2#\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\3%\4\'\5)\6+\7-\b/\t\61\n\63\13\65\f\67\r9"+
		"\16;\17=\20?\21A\22C\23\3\2\22\3\2\62;\3\2\63;\5\2\62;CHch\4\2GGgg\6\2"+
		"&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\4\2C\\c|"+
		"\3\2-\60\3\2**\3\2++\3\2==\3\2??\3\2--\3\2,,\u0101\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2"+
		"\tU\3\2\2\2\13h\3\2\2\2\rj\3\2\2\2\17~\3\2\2\2\21\u0080\3\2\2\2\23\u0087"+
		"\3\2\2\2\25\u0089\3\2\2\2\27\u008c\3\2\2\2\31\u0096\3\2\2\2\33\u0098\3"+
		"\2\2\2\35\u009a\3\2\2\2\37\u00aa\3\2\2\2!\u00ac\3\2\2\2#\u00b0\3\2\2\2"+
		"%\u00b2\3\2\2\2\'\u00bf\3\2\2\2)\u00c1\3\2\2\2+\u00c3\3\2\2\2-\u00c5\3"+
		"\2\2\2/\u00c7\3\2\2\2\61\u00c9\3\2\2\2\63\u00cb\3\2\2\2\65\u00cd\3\2\2"+
		"\2\67\u00cf\3\2\2\29\u00db\3\2\2\2;\u00df\3\2\2\2=\u00e4\3\2\2\2?\u00ea"+
		"\3\2\2\2A\u00ef\3\2\2\2C\u00f2\3\2\2\2EF\t\2\2\2F\4\3\2\2\2GH\t\3\2\2"+
		"H\6\3\2\2\2IM\5\3\2\2JL\5\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2N\b\3\2\2\2OM\3\2\2\2PV\7\62\2\2QS\5\5\3\2RT\5\7\4\2SR\3\2\2\2ST\3\2"+
		"\2\2TV\3\2\2\2UP\3\2\2\2UQ\3\2\2\2V\n\3\2\2\2WX\5\t\5\2XZ\7\60\2\2Y[\5"+
		"\7\4\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\25\13\2]\\\3\2\2\2]^\3\2\2\2"+
		"^i\3\2\2\2_`\7\60\2\2`b\5\7\4\2ac\5\25\13\2ba\3\2\2\2bc\3\2\2\2ci\3\2"+
		"\2\2df\5\t\5\2eg\5\25\13\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hW\3\2\2\2h_\3"+
		"\2\2\2hd\3\2\2\2i\f\3\2\2\2jk\t\4\2\2k\16\3\2\2\2lm\7\62\2\2mn\7z\2\2"+
		"nr\3\2\2\2oq\5\r\7\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\177\3\2"+
		"\2\2tr\3\2\2\2uv\7\62\2\2vw\7Z\2\2w{\3\2\2\2xz\5\r\7\2yx\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~l\3\2\2\2~u\3\2\2\2\177"+
		"\20\3\2\2\2\u0080\u0081\t\5\2\2\u0081\22\3\2\2\2\u0082\u0088\5\7\4\2\u0083"+
		"\u0084\7-\2\2\u0084\u0088\5\7\4\2\u0085\u0086\7/\2\2\u0086\u0088\5\7\4"+
		"\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\24"+
		"\3\2\2\2\u0089\u008a\5\21\t\2\u008a\u008b\5\23\n\2\u008b\26\3\2\2\2\u008c"+
		"\u0090\t\6\2\2\u008d\u008f\t\7\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\30\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0097\5\33\16\2\u0094\u0097\5\37\20\2\u0095\u0097\5\35"+
		"\17\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\32\3\2\2\2\u0098\u0099\t\b\2\2\u0099\34\3\2\2\2\u009a\u009b\7\61\2\2"+
		"\u009b\u009c\7\61\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\n\t\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a5\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\5\37\20\2\u00a4\u00a6\7"+
		"\2\2\3\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\36\3\2\2\2\u00a7"+
		"\u00a8\7\17\2\2\u00a8\u00ab\7\f\2\2\u00a9\u00ab\t\t\2\2\u00aa\u00a7\3"+
		"\2\2\2\u00aa\u00a9\3\2\2\2\u00ab \3\2\2\2\u00ac\u00ad\t\n\2\2\u00ad\""+
		"\3\2\2\2\u00ae\u00b1\5\13\6\2\u00af\u00b1\5\17\b\2\u00b0\u00ae\3\2\2\2"+
		"\u00b0\u00af\3\2\2\2\u00b1$\3\2\2\2\u00b2\u00b8\7$\2\2\u00b3\u00b7\5\3"+
		"\2\2\u00b4\u00b7\5!\21\2\u00b5\u00b7\t\13\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7$\2\2\u00bc&\3\2\2\2\u00bd\u00c0\5;\36\2\u00be\u00c0\5=\37\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0(\3\2\2\2\u00c1\u00c2\5? \2\u00c2"+
		"*\3\2\2\2\u00c3\u00c4\t\f\2\2\u00c4,\3\2\2\2\u00c5\u00c6\t\r\2\2\u00c6"+
		".\3\2\2\2\u00c7\u00c8\t\16\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\t\17\2\2\u00ca"+
		"\62\3\2\2\2\u00cb\u00cc\t\20\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\t\21\2\2"+
		"\u00ce\66\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7"+
		"p\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		"\u00da\7i\2\2\u00da8\3\2\2\2\u00db\u00dc\7x\2\2\u00dc\u00dd\7c\2\2\u00dd"+
		"\u00de\7t\2\2\u00de:\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"\u00e2\7w\2\2\u00e2\u00e3\7g\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5"+
		"\u00e6\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9>\3\2\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7n\2"+
		"\2\u00ed\u00ee\7n\2\2\u00ee@\3\2\2\2\u00ef\u00f0\5\27\f\2\u00f0B\3\2\2"+
		"\2\u00f1\u00f3\5\31\r\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\""+
		"\2\2\u00f7D\3\2\2\2\31\2MSUZ]bfhr{~\u0087\u0090\u0096\u00a0\u00a5\u00aa"+
		"\u00b0\u00b6\u00b8\u00bf\u00f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}