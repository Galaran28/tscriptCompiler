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
		"Digit", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\4\5\4@\n\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\5\6O\n\6\3\7\3\7"+
		"\3\7\5\7T\n\7\3\b\3\b\3\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\t\5\t`\n\t\3\n"+
		"\3\n\3\n\3\n\7\nf\n\n\f\n\16\ni\13\n\3\n\3\n\3\13\3\13\5\13o\n\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\6\31\u00a2\n\31\r\31\16\31\u00a3\3\31\3\31"+
		"\2\2\32\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\3\23\4\25\5\27\6\31\7\33\b\35"+
		"\t\37\n!\13#\f%\r\'\16)\17+\20-\21/\22\61\23\3\2\21\3\2\62;\6\2&&C\\a"+
		"ac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\4\2C\\c|\3\2\63"+
		";\3\2\62\62\3\2-\60\3\2**\3\2++\3\2==\3\2??\3\2--\3\2,,\u00ac\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2"+
		"\2\5\65\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rS\3\2\2\2\17U\3\2\2"+
		"\2\21_\3\2\2\2\23a\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33t\3\2"+
		"\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u008a\3\2"+
		"\2\2)\u008e\3\2\2\2+\u0093\3\2\2\2-\u0099\3\2\2\2/\u009e\3\2\2\2\61\u00a1"+
		"\3\2\2\2\63\64\t\2\2\2\64\4\3\2\2\2\659\t\3\2\2\668\t\4\2\2\67\66\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\6\3\2\2\2;9\3\2\2\2<@\5\t\5\2=@"+
		"\5\r\7\2>@\5\13\6\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\b\3\2\2\2AB\t\5\2\2"+
		"B\n\3\2\2\2CD\7\61\2\2DE\7\61\2\2EI\3\2\2\2FH\n\6\2\2GF\3\2\2\2HK\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KI\3\2\2\2LO\5\r\7\2MO\7\2\2\3NL\3\2"+
		"\2\2NM\3\2\2\2O\f\3\2\2\2PQ\7\17\2\2QT\7\f\2\2RT\t\6\2\2SP\3\2\2\2SR\3"+
		"\2\2\2T\16\3\2\2\2UV\t\7\2\2V\20\3\2\2\2W[\t\b\2\2XZ\5\3\2\2YX\3\2\2\2"+
		"Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\`\3\2\2\2][\3\2\2\2^`\t\t\2\2_W\3\2\2"+
		"\2_^\3\2\2\2`\22\3\2\2\2ag\7$\2\2bf\5\3\2\2cf\5\17\b\2df\t\n\2\2eb\3\2"+
		"\2\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2"+
		"\2\2jk\7$\2\2k\24\3\2\2\2lo\5)\25\2mo\5+\26\2nl\3\2\2\2nm\3\2\2\2o\26"+
		"\3\2\2\2pq\5-\27\2q\30\3\2\2\2rs\t\13\2\2s\32\3\2\2\2tu\t\f\2\2u\34\3"+
		"\2\2\2vw\t\r\2\2w\36\3\2\2\2xy\t\16\2\2y \3\2\2\2z{\t\17\2\2{\"\3\2\2"+
		"\2|}\t\20\2\2}$\3\2\2\2~\177\7e\2\2\177\u0080\7q\2\2\u0080\u0081\7p\2"+
		"\2\u0081\u0082\7u\2\2\u0082\u0083\7q\2\2\u0083\u0084\7n\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7\60\2\2\u0086\u0087\7n\2\2\u0087\u0088\7q\2\2\u0088"+
		"\u0089\7i\2\2\u0089&\3\2\2\2\u008a\u008b\7x\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7t\2\2\u008d(\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7w\2\2\u0091\u0092\7g\2\2\u0092*\3\2\2\2\u0093\u0094\7h\2\2\u0094"+
		"\u0095\7c\2\2\u0095\u0096\7n\2\2\u0096\u0097\7u\2\2\u0097\u0098\7g\2\2"+
		"\u0098,\3\2\2\2\u0099\u009a\7p\2\2\u009a\u009b\7w\2\2\u009b\u009c\7n\2"+
		"\2\u009c\u009d\7n\2\2\u009d.\3\2\2\2\u009e\u009f\5\5\3\2\u009f\60\3\2"+
		"\2\2\u00a0\u00a2\5\7\4\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\31"+
		"\2\2\u00a6\62\3\2\2\2\16\29?INS[_egn\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}