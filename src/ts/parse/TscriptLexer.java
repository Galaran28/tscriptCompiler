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
		NUMERIC_LITERAL=1, STRING_LITERAL=2, LPAREN=3, RPAREN=4, SEMICOLON=5, 
		EQUAL=6, PLUS=7, ASTERISK=8, PRINT=9, VAR=10, IDENTIFIER=11, WhiteSpace=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Digit", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "Letter", "NUMERIC_LITERAL", "STRING_LITERAL", "LPAREN", 
		"RPAREN", "SEMICOLON", "EQUAL", "PLUS", "ASTERISK", "PRINT", "VAR", "IDENTIFIER", 
		"WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'console.log'", 
		"'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", 
		"EQUAL", "PLUS", "ASTERISK", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3"+
		"\4\3\4\3\4\5\4\66\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6"+
		"\3\6\3\6\5\6E\n\6\3\7\3\7\3\7\5\7J\n\7\3\b\3\b\3\t\3\t\7\tP\n\t\f\t\16"+
		"\tS\13\t\3\t\5\tV\n\t\3\n\3\n\3\n\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\6\24\u0082\n\24\r\24\16\24\u0083\3\24\3\24\2\2\25\3\2\5\2\7"+
		"\2\t\2\13\2\r\2\17\2\21\3\23\4\25\5\27\6\31\7\33\b\35\t\37\n!\13#\f%\r"+
		"\'\16\3\2\21\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\""+
		"\4\2\f\f\17\17\4\2C\\c|\3\2\63;\3\2\62\62\3\2-\60\3\2**\3\2++\3\2==\3"+
		"\2??\3\2--\3\2,,\u008b\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7\65\3\2\2\2\t"+
		"\67\3\2\2\2\139\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2"+
		"\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2"+
		"\2!n\3\2\2\2#z\3\2\2\2%~\3\2\2\2\'\u0081\3\2\2\2)*\t\2\2\2*\4\3\2\2\2"+
		"+/\t\3\2\2,.\t\4\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\6"+
		"\3\2\2\2\61/\3\2\2\2\62\66\5\t\5\2\63\66\5\r\7\2\64\66\5\13\6\2\65\62"+
		"\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\b\3\2\2\2\678\t\5\2\28\n\3\2\2"+
		"\29:\7\61\2\2:;\7\61\2\2;?\3\2\2\2<>\n\6\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2"+
		"\2\2?@\3\2\2\2@D\3\2\2\2A?\3\2\2\2BE\5\r\7\2CE\7\2\2\3DB\3\2\2\2DC\3\2"+
		"\2\2E\f\3\2\2\2FG\7\17\2\2GJ\7\f\2\2HJ\t\6\2\2IF\3\2\2\2IH\3\2\2\2J\16"+
		"\3\2\2\2KL\t\7\2\2L\20\3\2\2\2MQ\t\b\2\2NP\5\3\2\2ON\3\2\2\2PS\3\2\2\2"+
		"QO\3\2\2\2QR\3\2\2\2RV\3\2\2\2SQ\3\2\2\2TV\t\t\2\2UM\3\2\2\2UT\3\2\2\2"+
		"V\22\3\2\2\2W]\7$\2\2X\\\5\3\2\2Y\\\5\17\b\2Z\\\t\n\2\2[X\3\2\2\2[Y\3"+
		"\2\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a"+
		"\7$\2\2a\24\3\2\2\2bc\t\13\2\2c\26\3\2\2\2de\t\f\2\2e\30\3\2\2\2fg\t\r"+
		"\2\2g\32\3\2\2\2hi\t\16\2\2i\34\3\2\2\2jk\t\17\2\2k\36\3\2\2\2lm\t\20"+
		"\2\2m \3\2\2\2no\7e\2\2op\7q\2\2pq\7p\2\2qr\7u\2\2rs\7q\2\2st\7n\2\2t"+
		"u\7g\2\2uv\7\60\2\2vw\7n\2\2wx\7q\2\2xy\7i\2\2y\"\3\2\2\2z{\7x\2\2{|\7"+
		"c\2\2|}\7t\2\2}$\3\2\2\2~\177\5\5\3\2\177&\3\2\2\2\u0080\u0082\5\7\4\2"+
		"\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\24\2\2\u0086(\3\2\2\2\r\2/"+
		"\65?DIQU[]\u0083\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}