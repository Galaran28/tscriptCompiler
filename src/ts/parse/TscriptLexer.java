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
		NUMERIC_LITERAL=1, STRING_LITERAL=2, BOOLEAN_LITERAL=3, LPAREN=4, RPAREN=5, 
		SEMICOLON=6, EQUAL=7, PLUS=8, ASTERISK=9, PRINT=10, VAR=11, TRUE=12, FALSE=13, 
		IDENTIFIER=14, WhiteSpace=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Digit", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "Letter", "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", 
		"LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "ASTERISK", "PRINT", 
		"VAR", "TRUE", "FALSE", "IDENTIFIER", "WhiteSpace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'console.log'", 
		"'var'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "LPAREN", 
		"RPAREN", "SEMICOLON", "EQUAL", "PLUS", "ASTERISK", "PRINT", "VAR", "TRUE", 
		"FALSE", "IDENTIFIER", "WhiteSpace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\7\6D\n\6\f\6\16\6G\13\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\5\7P\n\7\3"+
		"\b\3\b\3\t\3\t\7\tV\n\t\f\t\16\tY\13\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\7"+
		"\nb\n\n\f\n\16\ne\13\n\3\n\3\n\3\13\3\13\5\13k\n\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\6\27\u0097\n\27\r\27"+
		"\16\27\u0098\3\27\3\27\2\2\30\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\3\23\4"+
		"\25\5\27\6\31\7\33\b\35\t\37\n!\13#\f%\r\'\16)\17+\20-\21\3\2\21\3\2\62"+
		";\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\4\2"+
		"C\\c|\3\2\63;\3\2\62\62\3\2-\60\3\2**\3\2++\3\2==\3\2??\3\2--\3\2,,\u00a1"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7"+
		";\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21[\3\2\2\2\23"+
		"]\3\2\2\2\25j\3\2\2\2\27l\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35r\3\2\2\2"+
		"\37t\3\2\2\2!v\3\2\2\2#x\3\2\2\2%\u0084\3\2\2\2\'\u0088\3\2\2\2)\u008d"+
		"\3\2\2\2+\u0093\3\2\2\2-\u0096\3\2\2\2/\60\t\2\2\2\60\4\3\2\2\2\61\65"+
		"\t\3\2\2\62\64\t\4\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\6\3\2\2\2\67\65\3\2\2\28<\5\t\5\29<\5\r\7\2:<\5\13\6\2;8\3"+
		"\2\2\2;9\3\2\2\2;:\3\2\2\2<\b\3\2\2\2=>\t\5\2\2>\n\3\2\2\2?@\7\61\2\2"+
		"@A\7\61\2\2AE\3\2\2\2BD\n\6\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2"+
		"\2FJ\3\2\2\2GE\3\2\2\2HK\5\r\7\2IK\7\2\2\3JH\3\2\2\2JI\3\2\2\2K\f\3\2"+
		"\2\2LM\7\17\2\2MP\7\f\2\2NP\t\6\2\2OL\3\2\2\2ON\3\2\2\2P\16\3\2\2\2QR"+
		"\t\7\2\2R\20\3\2\2\2SW\t\b\2\2TV\5\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2"+
		"WX\3\2\2\2X\\\3\2\2\2YW\3\2\2\2Z\\\t\t\2\2[S\3\2\2\2[Z\3\2\2\2\\\22\3"+
		"\2\2\2]c\7$\2\2^b\5\3\2\2_b\5\17\b\2`b\t\n\2\2a^\3\2\2\2a_\3\2\2\2a`\3"+
		"\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7$\2\2g\24"+
		"\3\2\2\2hk\5\'\24\2ik\5)\25\2jh\3\2\2\2ji\3\2\2\2k\26\3\2\2\2lm\t\13\2"+
		"\2m\30\3\2\2\2no\t\f\2\2o\32\3\2\2\2pq\t\r\2\2q\34\3\2\2\2rs\t\16\2\2"+
		"s\36\3\2\2\2tu\t\17\2\2u \3\2\2\2vw\t\20\2\2w\"\3\2\2\2xy\7e\2\2yz\7q"+
		"\2\2z{\7p\2\2{|\7u\2\2|}\7q\2\2}~\7n\2\2~\177\7g\2\2\177\u0080\7\60\2"+
		"\2\u0080\u0081\7n\2\2\u0081\u0082\7q\2\2\u0082\u0083\7i\2\2\u0083$\3\2"+
		"\2\2\u0084\u0085\7x\2\2\u0085\u0086\7c\2\2\u0086\u0087\7t\2\2\u0087&\3"+
		"\2\2\2\u0088\u0089\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7w\2\2\u008b"+
		"\u008c\7g\2\2\u008c(\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7n\2\2\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092*\3\2\2\2\u0093"+
		"\u0094\5\5\3\2\u0094,\3\2\2\2\u0095\u0097\5\7\4\2\u0096\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\b\27\2\2\u009b.\3\2\2\2\16\2\65;EJOW[acj\u0098\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}