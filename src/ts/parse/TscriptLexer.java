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
		LPAREN=5, RPAREN=6, LCARET=7, RCARET=8, EXCLAMATIONPOINT=9, SEMICOLON=10, 
		EQUAL=11, PLUS=12, MINUS=13, ASTERISK=14, RSLASH=15, PRINT=16, VAR=17, 
		TRUE=18, FALSE=19, NULL=20, IDENTIFIER=21, WhiteSpace=22;
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
		"LPAREN", "RPAREN", "LCARET", "RCARET", "EXCLAMATIONPOINT", "SEMICOLON", 
		"EQUAL", "PLUS", "MINUS", "ASTERISK", "RSLASH", "PRINT", "VAR", "TRUE", 
		"FALSE", "NULL", "IDENTIFIER", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'console.log'", "'var'", "'true'", "'false'", 
		"'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "LCARET", "RCARET", "EXCLAMATIONPOINT", "SEMICOLON", 
		"EQUAL", "PLUS", "MINUS", "ASTERISK", "RSLASH", "PRINT", "VAR", "TRUE", 
		"FALSE", "NULL", "IDENTIFIER", "WhiteSpace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0131\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\3\2\3\2\3\3\3\3\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4\3\5\3\5\3\5\5"+
		"\5h\n\5\5\5j\n\5\3\6\3\6\3\6\5\6o\n\6\3\6\5\6r\n\6\3\6\3\6\3\6\5\6w\n"+
		"\6\3\6\3\6\5\6{\n\6\5\6}\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0085\n\b\f\b"+
		"\16\b\u0088\13\b\3\b\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16\b\u0091\13\b\5\b"+
		"\u0093\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3"+
		"\f\3\f\7\f\u00a3\n\f\f\f\16\f\u00a6\13\f\3\r\3\r\3\r\5\r\u00ab\n\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\7\17\u00b3\n\17\f\17\16\17\u00b6\13\17\3\17"+
		"\3\17\5\17\u00ba\n\17\3\20\3\20\3\20\5\20\u00bf\n\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\5\23\u00c8\n\23\3\24\3\24\3\24\5\24\u00cd\n\24\3\25"+
		"\3\25\7\25\u00d1\n\25\f\25\16\25\u00d4\13\25\3\26\3\26\7\26\u00d8\n\26"+
		"\f\26\16\26\u00db\13\26\3\27\3\27\5\27\u00df\n\27\3\30\3\30\5\30\u00e3"+
		"\n\30\3\30\3\30\3\30\5\30\u00e8\n\30\3\30\5\30\u00eb\n\30\3\31\3\31\5"+
		"\31\u00ef\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3*\3+\3+\3,\6,\u012c\n,\r,\16,\u012d\3,\3,\2\2-\3\2\5\2\7\2\t\2\13\2"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-"+
		"\3/\4\61\5\63\6\65\7\67\b9\t;\n=\13?\fA\rC\16E\17G\20I\21K\22M\23O\24"+
		"Q\25S\26U\27W\30\3\2\31\3\2\62;\3\2\63;\5\2\62;CHch\4\2GGgg\6\2&&C\\a"+
		"ac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\5\2$$))^^\3\2\""+
		"\u0080\4\2))^^\4\2$$^^\3\2**\3\2++\3\2>>\3\2@@\3\2##\3\2==\3\2??\3\2-"+
		"-\3\2//\3\2,,\3\2\61\61\u0139\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\ti\3\2\2\2\13|\3\2\2\2\r~\3\2\2\2"+
		"\17\u0092\3\2\2\2\21\u0094\3\2\2\2\23\u009b\3\2\2\2\25\u009d\3\2\2\2\27"+
		"\u00a0\3\2\2\2\31\u00aa\3\2\2\2\33\u00ac\3\2\2\2\35\u00ae\3\2\2\2\37\u00be"+
		"\3\2\2\2!\u00c0\3\2\2\2#\u00c2\3\2\2\2%\u00c7\3\2\2\2\'\u00cc\3\2\2\2"+
		")\u00ce\3\2\2\2+\u00d5\3\2\2\2-\u00de\3\2\2\2/\u00ea\3\2\2\2\61\u00ee"+
		"\3\2\2\2\63\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00f4\3\2\2\29\u00f6\3\2"+
		"\2\2;\u00f8\3\2\2\2=\u00fa\3\2\2\2?\u00fc\3\2\2\2A\u00fe\3\2\2\2C\u0100"+
		"\3\2\2\2E\u0102\3\2\2\2G\u0104\3\2\2\2I\u0106\3\2\2\2K\u0108\3\2\2\2M"+
		"\u0114\3\2\2\2O\u0118\3\2\2\2Q\u011d\3\2\2\2S\u0123\3\2\2\2U\u0128\3\2"+
		"\2\2W\u012b\3\2\2\2YZ\t\2\2\2Z\4\3\2\2\2[\\\t\3\2\2\\\6\3\2\2\2]a\5\3"+
		"\2\2^`\5\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\b\3\2\2\2ca\3"+
		"\2\2\2dj\7\62\2\2eg\5\5\3\2fh\5\7\4\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2id"+
		"\3\2\2\2ie\3\2\2\2j\n\3\2\2\2kl\5\t\5\2ln\7\60\2\2mo\5\7\4\2nm\3\2\2\2"+
		"no\3\2\2\2oq\3\2\2\2pr\5\25\13\2qp\3\2\2\2qr\3\2\2\2r}\3\2\2\2st\7\60"+
		"\2\2tv\5\7\4\2uw\5\25\13\2vu\3\2\2\2vw\3\2\2\2w}\3\2\2\2xz\5\t\5\2y{\5"+
		"\25\13\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|k\3\2\2\2|s\3\2\2\2|x\3\2\2\2}"+
		"\f\3\2\2\2~\177\t\4\2\2\177\16\3\2\2\2\u0080\u0081\7\62\2\2\u0081\u0082"+
		"\7z\2\2\u0082\u0086\3\2\2\2\u0083\u0085\5\r\7\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0093\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\62\2\2\u008a\u008b\7Z\2\2\u008b"+
		"\u008f\3\2\2\2\u008c\u008e\5\r\7\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0080\3\2\2\2\u0092\u0089\3\2\2\2\u0093\20\3\2\2"+
		"\2\u0094\u0095\t\5\2\2\u0095\22\3\2\2\2\u0096\u009c\5\7\4\2\u0097\u0098"+
		"\7-\2\2\u0098\u009c\5\7\4\2\u0099\u009a\7/\2\2\u009a\u009c\5\7\4\2\u009b"+
		"\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c\24\3\2\2"+
		"\2\u009d\u009e\5\21\t\2\u009e\u009f\5\23\n\2\u009f\26\3\2\2\2\u00a0\u00a4"+
		"\t\6\2\2\u00a1\u00a3\t\7\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\30\3\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7\u00ab\5\33\16\2\u00a8\u00ab\5\37\20\2\u00a9\u00ab\5\35\17\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\32\3\2\2"+
		"\2\u00ac\u00ad\t\b\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0"+
		"\7\61\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\n\t\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b9"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\5\37\20\2\u00b8\u00ba\7\2\2\3"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\36\3\2\2\2\u00bb\u00bc"+
		"\7\17\2\2\u00bc\u00bf\7\f\2\2\u00bd\u00bf\t\t\2\2\u00be\u00bb\3\2\2\2"+
		"\u00be\u00bd\3\2\2\2\u00bf \3\2\2\2\u00c0\u00c1\t\n\2\2\u00c1\"\3\2\2"+
		"\2\u00c2\u00c3\t\13\2\2\u00c3$\3\2\2\2\u00c4\u00c8\n\f\2\2\u00c5\u00c6"+
		"\7^\2\2\u00c6\u00c8\5#\22\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"&\3\2\2\2\u00c9\u00cd\n\r\2\2\u00ca\u00cb\7^\2\2\u00cb\u00cd\5#\22\2\u00cc"+
		"\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd(\3\2\2\2\u00ce\u00d2\5%\23\2"+
		"\u00cf\u00d1\5%\23\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3*\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d9\5\'\24\2\u00d6\u00d8\5\'\24\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da,\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00df\5\13\6\2\u00dd\u00df\5\17\b\2\u00de\u00dc\3\2\2\2"+
		"\u00de\u00dd\3\2\2\2\u00df.\3\2\2\2\u00e0\u00e2\7$\2\2\u00e1\u00e3\5+"+
		"\26\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00eb\7$\2\2\u00e5\u00e7\7)\2\2\u00e6\u00e8\5)\25\2\u00e7\u00e6\3\2\2"+
		"\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\7)\2\2\u00ea\u00e0"+
		"\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb\60\3\2\2\2\u00ec\u00ef\5O(\2\u00ed"+
		"\u00ef\5Q)\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\62\3\2\2\2"+
		"\u00f0\u00f1\5S*\2\u00f1\64\3\2\2\2\u00f2\u00f3\t\16\2\2\u00f3\66\3\2"+
		"\2\2\u00f4\u00f5\t\17\2\2\u00f58\3\2\2\2\u00f6\u00f7\t\20\2\2\u00f7:\3"+
		"\2\2\2\u00f8\u00f9\t\21\2\2\u00f9<\3\2\2\2\u00fa\u00fb\t\22\2\2\u00fb"+
		">\3\2\2\2\u00fc\u00fd\t\23\2\2\u00fd@\3\2\2\2\u00fe\u00ff\t\24\2\2\u00ff"+
		"B\3\2\2\2\u0100\u0101\t\25\2\2\u0101D\3\2\2\2\u0102\u0103\t\26\2\2\u0103"+
		"F\3\2\2\2\u0104\u0105\t\27\2\2\u0105H\3\2\2\2\u0106\u0107\t\30\2\2\u0107"+
		"J\3\2\2\2\u0108\u0109\7e\2\2\u0109\u010a\7q\2\2\u010a\u010b\7p\2\2\u010b"+
		"\u010c\7u\2\2\u010c\u010d\7q\2\2\u010d\u010e\7n\2\2\u010e\u010f\7g\2\2"+
		"\u010f\u0110\7\60\2\2\u0110\u0111\7n\2\2\u0111\u0112\7q\2\2\u0112\u0113"+
		"\7i\2\2\u0113L\3\2\2\2\u0114\u0115\7x\2\2\u0115\u0116\7c\2\2\u0116\u0117"+
		"\7t\2\2\u0117N\3\2\2\2\u0118\u0119\7v\2\2\u0119\u011a\7t\2\2\u011a\u011b"+
		"\7w\2\2\u011b\u011c\7g\2\2\u011cP\3\2\2\2\u011d\u011e\7h\2\2\u011e\u011f"+
		"\7c\2\2\u011f\u0120\7n\2\2\u0120\u0121\7u\2\2\u0121\u0122\7g\2\2\u0122"+
		"R\3\2\2\2\u0123\u0124\7p\2\2\u0124\u0125\7w\2\2\u0125\u0126\7n\2\2\u0126"+
		"\u0127\7n\2\2\u0127T\3\2\2\2\u0128\u0129\5\27\f\2\u0129V\3\2\2\2\u012a"+
		"\u012c\5\31\r\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3"+
		"\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b,\2\2\u0130"+
		"X\3\2\2\2\36\2aginqvz|\u0086\u008f\u0092\u009b\u00a4\u00aa\u00b4\u00b9"+
		"\u00be\u00c7\u00cc\u00d2\u00d9\u00de\u00e2\u00e7\u00ea\u00ee\u012d\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}