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
		LPAREN=5, RPAREN=6, LCARET=7, RCARET=8, SEMICOLON=9, EQUAL=10, PLUS=11, 
		MINUS=12, ASTERISK=13, RSLASH=14, PRINT=15, VAR=16, TRUE=17, FALSE=18, 
		NULL=19, IDENTIFIER=20, WhiteSpace=21;
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
		"LPAREN", "RPAREN", "LCARET", "RCARET", "SEMICOLON", "EQUAL", "PLUS", 
		"MINUS", "ASTERISK", "RSLASH", "PRINT", "VAR", "TRUE", "FALSE", "NULL", 
		"IDENTIFIER", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'console.log'", "'var'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "LCARET", "RCARET", "SEMICOLON", "EQUAL", "PLUS", 
		"MINUS", "ASTERISK", "RSLASH", "PRINT", "VAR", "TRUE", "FALSE", "NULL", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u012d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\3\2\3\2\3\3\3\3\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3\5\5\5f\n\5"+
		"\5\5h\n\5\3\6\3\6\3\6\5\6m\n\6\3\6\5\6p\n\6\3\6\3\6\3\6\5\6u\n\6\3\6\3"+
		"\6\5\6y\n\6\5\6{\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0083\n\b\f\b\16\b\u0086"+
		"\13\b\3\b\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13\b\5\b\u0091\n\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u009a\n\n\3\13\3\13\3\13\3\f\3\f\7\f"+
		"\u00a1\n\f\f\f\16\f\u00a4\13\f\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\7\17\u00b1\n\17\f\17\16\17\u00b4\13\17\3\17\3\17\5\17"+
		"\u00b8\n\17\3\20\3\20\3\20\5\20\u00bd\n\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\5\23\u00c6\n\23\3\24\3\24\3\24\5\24\u00cb\n\24\3\25\3\25\7\25"+
		"\u00cf\n\25\f\25\16\25\u00d2\13\25\3\26\3\26\7\26\u00d6\n\26\f\26\16\26"+
		"\u00d9\13\26\3\27\3\27\5\27\u00dd\n\27\3\30\3\30\5\30\u00e1\n\30\3\30"+
		"\3\30\3\30\5\30\u00e6\n\30\3\30\5\30\u00e9\n\30\3\31\3\31\5\31\u00ed\n"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\6+"+
		"\u0128\n+\r+\16+\u0129\3+\3+\2\2,\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\3/\4\61\5\63\6\65"+
		"\7\67\b9\t;\n=\13?\fA\rC\16E\17G\20I\21K\22M\23O\24Q\25S\26U\27\3\2\30"+
		"\3\2\62;\3\2\63;\5\2\62;CHch\4\2GGgg\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2"+
		"\13\13\16\16\"\"\4\2\f\f\17\17\5\2$$))^^\3\2\"\u0080\4\2))^^\4\2$$^^\3"+
		"\2**\3\2++\3\2>>\3\2@@\3\2==\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\u0135\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\tg\3\2\2"+
		"\2\13z\3\2\2\2\r|\3\2\2\2\17\u0090\3\2\2\2\21\u0092\3\2\2\2\23\u0099\3"+
		"\2\2\2\25\u009b\3\2\2\2\27\u009e\3\2\2\2\31\u00a8\3\2\2\2\33\u00aa\3\2"+
		"\2\2\35\u00ac\3\2\2\2\37\u00bc\3\2\2\2!\u00be\3\2\2\2#\u00c0\3\2\2\2%"+
		"\u00c5\3\2\2\2\'\u00ca\3\2\2\2)\u00cc\3\2\2\2+\u00d3\3\2\2\2-\u00dc\3"+
		"\2\2\2/\u00e8\3\2\2\2\61\u00ec\3\2\2\2\63\u00ee\3\2\2\2\65\u00f0\3\2\2"+
		"\2\67\u00f2\3\2\2\29\u00f4\3\2\2\2;\u00f6\3\2\2\2=\u00f8\3\2\2\2?\u00fa"+
		"\3\2\2\2A\u00fc\3\2\2\2C\u00fe\3\2\2\2E\u0100\3\2\2\2G\u0102\3\2\2\2I"+
		"\u0104\3\2\2\2K\u0110\3\2\2\2M\u0114\3\2\2\2O\u0119\3\2\2\2Q\u011f\3\2"+
		"\2\2S\u0124\3\2\2\2U\u0127\3\2\2\2WX\t\2\2\2X\4\3\2\2\2YZ\t\3\2\2Z\6\3"+
		"\2\2\2[_\5\3\2\2\\^\5\3\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`"+
		"\b\3\2\2\2a_\3\2\2\2bh\7\62\2\2ce\5\5\3\2df\5\7\4\2ed\3\2\2\2ef\3\2\2"+
		"\2fh\3\2\2\2gb\3\2\2\2gc\3\2\2\2h\n\3\2\2\2ij\5\t\5\2jl\7\60\2\2km\5\7"+
		"\4\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5\25\13\2on\3\2\2\2op\3\2\2\2p{\3"+
		"\2\2\2qr\7\60\2\2rt\5\7\4\2su\5\25\13\2ts\3\2\2\2tu\3\2\2\2u{\3\2\2\2"+
		"vx\5\t\5\2wy\5\25\13\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2zi\3\2\2\2zq\3\2\2"+
		"\2zv\3\2\2\2{\f\3\2\2\2|}\t\4\2\2}\16\3\2\2\2~\177\7\62\2\2\177\u0080"+
		"\7z\2\2\u0080\u0084\3\2\2\2\u0081\u0083\5\r\7\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0091\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\62\2\2\u0088\u0089\7Z\2\2\u0089"+
		"\u008d\3\2\2\2\u008a\u008c\5\r\7\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090~\3\2\2\2\u0090\u0087\3\2\2\2\u0091\20\3\2\2\2\u0092"+
		"\u0093\t\5\2\2\u0093\22\3\2\2\2\u0094\u009a\5\7\4\2\u0095\u0096\7-\2\2"+
		"\u0096\u009a\5\7\4\2\u0097\u0098\7/\2\2\u0098\u009a\5\7\4\2\u0099\u0094"+
		"\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2\2\2\u009a\24\3\2\2\2\u009b"+
		"\u009c\5\21\t\2\u009c\u009d\5\23\n\2\u009d\26\3\2\2\2\u009e\u00a2\t\6"+
		"\2\2\u009f\u00a1\t\7\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\30\3\2\2\2\u00a4\u00a2\3\2\2"+
		"\2\u00a5\u00a9\5\33\16\2\u00a6\u00a9\5\37\20\2\u00a7\u00a9\5\35\17\2\u00a8"+
		"\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\32\3\2\2"+
		"\2\u00aa\u00ab\t\b\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae"+
		"\7\61\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\n\t\2\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b7"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\5\37\20\2\u00b6\u00b8\7\2\2\3"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\36\3\2\2\2\u00b9\u00ba"+
		"\7\17\2\2\u00ba\u00bd\7\f\2\2\u00bb\u00bd\t\t\2\2\u00bc\u00b9\3\2\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd \3\2\2\2\u00be\u00bf\t\n\2\2\u00bf\"\3\2\2"+
		"\2\u00c0\u00c1\t\13\2\2\u00c1$\3\2\2\2\u00c2\u00c6\n\f\2\2\u00c3\u00c4"+
		"\7^\2\2\u00c4\u00c6\5#\22\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"&\3\2\2\2\u00c7\u00cb\n\r\2\2\u00c8\u00c9\7^\2\2\u00c9\u00cb\5#\22\2\u00ca"+
		"\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb(\3\2\2\2\u00cc\u00d0\5%\23\2"+
		"\u00cd\u00cf\5%\23\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1*\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d7\5\'\24\2\u00d4\u00d6\5\'\24\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8,\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00dd\5\13\6\2\u00db\u00dd\5\17\b\2\u00dc\u00da\3\2\2\2"+
		"\u00dc\u00db\3\2\2\2\u00dd.\3\2\2\2\u00de\u00e0\7$\2\2\u00df\u00e1\5+"+
		"\26\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e9\7$\2\2\u00e3\u00e5\7)\2\2\u00e4\u00e6\5)\25\2\u00e5\u00e4\3\2\2"+
		"\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\7)\2\2\u00e8\u00de"+
		"\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\60\3\2\2\2\u00ea\u00ed\5M\'\2\u00eb"+
		"\u00ed\5O(\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\62\3\2\2\2"+
		"\u00ee\u00ef\5Q)\2\u00ef\64\3\2\2\2\u00f0\u00f1\t\16\2\2\u00f1\66\3\2"+
		"\2\2\u00f2\u00f3\t\17\2\2\u00f38\3\2\2\2\u00f4\u00f5\t\20\2\2\u00f5:\3"+
		"\2\2\2\u00f6\u00f7\t\21\2\2\u00f7<\3\2\2\2\u00f8\u00f9\t\22\2\2\u00f9"+
		">\3\2\2\2\u00fa\u00fb\t\23\2\2\u00fb@\3\2\2\2\u00fc\u00fd\t\24\2\2\u00fd"+
		"B\3\2\2\2\u00fe\u00ff\t\25\2\2\u00ffD\3\2\2\2\u0100\u0101\t\26\2\2\u0101"+
		"F\3\2\2\2\u0102\u0103\t\27\2\2\u0103H\3\2\2\2\u0104\u0105\7e\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107\u0108\7u\2\2\u0108\u0109\7q\2\2"+
		"\u0109\u010a\7n\2\2\u010a\u010b\7g\2\2\u010b\u010c\7\60\2\2\u010c\u010d"+
		"\7n\2\2\u010d\u010e\7q\2\2\u010e\u010f\7i\2\2\u010fJ\3\2\2\2\u0110\u0111"+
		"\7x\2\2\u0111\u0112\7c\2\2\u0112\u0113\7t\2\2\u0113L\3\2\2\2\u0114\u0115"+
		"\7v\2\2\u0115\u0116\7t\2\2\u0116\u0117\7w\2\2\u0117\u0118\7g\2\2\u0118"+
		"N\3\2\2\2\u0119\u011a\7h\2\2\u011a\u011b\7c\2\2\u011b\u011c\7n\2\2\u011c"+
		"\u011d\7u\2\2\u011d\u011e\7g\2\2\u011eP\3\2\2\2\u011f\u0120\7p\2\2\u0120"+
		"\u0121\7w\2\2\u0121\u0122\7n\2\2\u0122\u0123\7n\2\2\u0123R\3\2\2\2\u0124"+
		"\u0125\5\27\f\2\u0125T\3\2\2\2\u0126\u0128\5\31\r\2\u0127\u0126\3\2\2"+
		"\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\b+\2\2\u012cV\3\2\2\2\36\2_eglotxz\u0084\u008d\u0090"+
		"\u0099\u00a2\u00a8\u00b2\u00b7\u00bc\u00c5\u00ca\u00d0\u00d7\u00dc\u00e0"+
		"\u00e5\u00e8\u00ec\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}