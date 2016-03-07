// Generated from Tscript.g4 by ANTLR 4.5.1
package ts.parse;

  import ts.Location;
  import ts.tree.*;
  import static ts.parse.TreeBuilder.*;
  import java.util.List;
  import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TscriptParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_emptyStatement = 4, RULE_ifStatement = 5, RULE_iterationStatement = 6, 
		RULE_controlStatement = 7, RULE_varStatement = 8, RULE_expressionStatement = 9, 
		RULE_printStatement = 10, RULE_expression = 11, RULE_assignmentExpression = 12, 
		RULE_leftHandSideExpression = 13, RULE_equalityExpression = 14, RULE_relationalExpression = 15, 
		RULE_additiveExpression = 16, RULE_multiplicativeExpression = 17, RULE_unaryExpression = 18, 
		RULE_primaryExpression = 19;
	public static final String[] ruleNames = {
		"program", "statementList", "statement", "block", "emptyStatement", "ifStatement", 
		"iterationStatement", "controlStatement", "varStatement", "expressionStatement", 
		"printStatement", "expression", "assignmentExpression", "leftHandSideExpression", 
		"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "primaryExpression"
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

	@Override
	public String getGrammarFileName() { return "Tscript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public TscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementListContext sl;
		public TerminalNode EOF() { return getToken(TscriptParser.EOF, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((ProgramContext)_localctx).sl = statementList(0);
			setState(41);
			match(EOF);
			 semanticValue = buildProgram(loc(_localctx.start), ((ProgramContext)_localctx).sl.lval); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<Statement> lval;
		public StatementListContext sl;
		public StatementContext s;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		return statementList(0);
	}

	private StatementListContext statementList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementListContext _localctx = new StatementListContext(_ctx, _parentState);
		StatementListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statementList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((StatementListContext)_localctx).lval =  new ArrayList<Statement>(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementListContext(_parentctx, _parentState);
					_localctx.sl = _prevctx;
					_localctx.sl = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statementList);
					setState(47);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(48);
					((StatementListContext)_localctx).s = statement();
					 ((StatementListContext)_localctx).sl.lval.add(((StatementListContext)_localctx).s.lval);
					                ((StatementListContext)_localctx).lval =  ((StatementListContext)_localctx).sl.lval; 
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement lval;
		public BlockContext b;
		public VarStatementContext v;
		public EmptyStatementContext em;
		public ExpressionStatementContext e;
		public IfStatementContext ifs;
		public IterationStatementContext i;
		public ControlStatementContext c;
		public PrintStatementContext p;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarStatementContext varStatement() {
			return getRuleContext(VarStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((StatementContext)_localctx).b = block();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).b.lval; 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((StatementContext)_localctx).v = varStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).v.lval; 
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				((StatementContext)_localctx).em = emptyStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).em.lval; 
				}
				break;
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case EXCLAMATIONPOINT:
			case MINUS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				((StatementContext)_localctx).e = expressionStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).e.lval; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				((StatementContext)_localctx).ifs = ifStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).ifs.lval; 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				((StatementContext)_localctx).i = iterationStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).i.lval; 
				}
				break;
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				((StatementContext)_localctx).c = controlStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).c.lval; 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				((StatementContext)_localctx).p = printStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).p.lval; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Statement lval;
		public StatementListContext sl;
		public TerminalNode LBRACK() { return getToken(TscriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TscriptParser.RBRACK, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LBRACK);
			setState(83);
			((BlockContext)_localctx).sl = statementList(0);
			setState(84);
			match(RBRACK);
			 ((BlockContext)_localctx).lval =  buildBlock(loc(_localctx.start), ((BlockContext)_localctx).sl.lval); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public Statement lval;
		public TerminalNode SEMICOLON() { return getToken(TscriptParser.SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SEMICOLON);
			 ((EmptyStatementContext)_localctx).lval =  buildEmptyStatement(loc(_localctx.start)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public Statement lval;
		public ExpressionContext e;
		public StatementContext s1;
		public StatementContext s2;
		public StatementContext s;
		public TerminalNode IF() { return getToken(TscriptParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(TscriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TscriptParser.RPAREN, 0); }
		public TerminalNode ELSE() { return getToken(TscriptParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(IF);
				setState(91);
				match(LPAREN);
				setState(92);
				((IfStatementContext)_localctx).e = expression();
				setState(93);
				match(RPAREN);
				setState(94);
				((IfStatementContext)_localctx).s1 = statement();
				setState(95);
				match(ELSE);
				setState(96);
				((IfStatementContext)_localctx).s2 = statement();
				 ((IfStatementContext)_localctx).lval =  buildIfStatement(loc(_localctx.start), ((IfStatementContext)_localctx).e.lval, ((IfStatementContext)_localctx).s1.lval, ((IfStatementContext)_localctx).s2.lval); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(IF);
				setState(100);
				match(LPAREN);
				setState(101);
				((IfStatementContext)_localctx).e = expression();
				setState(102);
				match(RPAREN);
				setState(103);
				((IfStatementContext)_localctx).s = statement();
				 ((IfStatementContext)_localctx).lval =  buildIfStatement(loc(_localctx.start), ((IfStatementContext)_localctx).e.lval, ((IfStatementContext)_localctx).s.lval, ((IfStatementContext)_localctx).s.lval); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public Statement lval;
		public ExpressionContext e;
		public StatementContext s;
		public TerminalNode WHILE() { return getToken(TscriptParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(TscriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TscriptParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iterationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHILE);
			setState(109);
			match(LPAREN);
			setState(110);
			((IterationStatementContext)_localctx).e = expression();
			setState(111);
			match(RPAREN);
			setState(112);
			((IterationStatementContext)_localctx).s = statement();
			 ((IterationStatementContext)_localctx).lval =  buildWhileStatement(loc(_localctx.start), ((IterationStatementContext)_localctx).e.lval, ((IterationStatementContext)_localctx).s.lval); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlStatementContext extends ParserRuleContext {
		public Statement lval;
		public Token CONTINUE;
		public Token BREAK;
		public TerminalNode CONTINUE() { return getToken(TscriptParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(TscriptParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(TscriptParser.BREAK, 0); }
		public ControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStatement; }
	}

	public final ControlStatementContext controlStatement() throws RecognitionException {
		ControlStatementContext _localctx = new ControlStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_controlStatement);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((ControlStatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(116);
				match(SEMICOLON);
				 ((ControlStatementContext)_localctx).lval =  buildControlStatement(loc(_localctx.start), (((ControlStatementContext)_localctx).CONTINUE!=null?((ControlStatementContext)_localctx).CONTINUE.getText():null)); 
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((ControlStatementContext)_localctx).BREAK = match(BREAK);
				setState(119);
				match(SEMICOLON);
				 ((ControlStatementContext)_localctx).lval =  buildControlStatement(loc(_localctx.start), (((ControlStatementContext)_localctx).BREAK!=null?((ControlStatementContext)_localctx).BREAK.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarStatementContext extends ParserRuleContext {
		public Statement lval;
		public Token IDENTIFIER;
		public TerminalNode VAR() { return getToken(TscriptParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TscriptParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(TscriptParser.SEMICOLON, 0); }
		public VarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varStatement; }
	}

	public final VarStatementContext varStatement() throws RecognitionException {
		VarStatementContext _localctx = new VarStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(VAR);
			setState(124);
			((VarStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(125);
			match(SEMICOLON);
			 ((VarStatementContext)_localctx).lval =  buildVarStatement(loc(_localctx.start), (((VarStatementContext)_localctx).IDENTIFIER!=null?((VarStatementContext)_localctx).IDENTIFIER.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public Statement lval;
		public ExpressionContext e;
		public TerminalNode SEMICOLON() { return getToken(TscriptParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((ExpressionStatementContext)_localctx).e = expression();
			setState(129);
			match(SEMICOLON);
			 ((ExpressionStatementContext)_localctx).lval =  buildExpressionStatement(loc(_localctx.start), ((ExpressionStatementContext)_localctx).e.lval); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public Statement lval;
		public ExpressionContext e;
		public TerminalNode PRINT() { return getToken(TscriptParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(TscriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TscriptParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(TscriptParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(PRINT);
			setState(133);
			match(LPAREN);
			setState(134);
			((PrintStatementContext)_localctx).e = expression();
			setState(135);
			match(RPAREN);
			setState(136);
			match(SEMICOLON);
			 ((PrintStatementContext)_localctx).lval =  buildPrintStatement(loc(_localctx.start), ((PrintStatementContext)_localctx).e.lval); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression lval;
		public AssignmentExpressionContext a;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((ExpressionContext)_localctx).a = assignmentExpression();
			 ((ExpressionContext)_localctx).lval =  ((ExpressionContext)_localctx).a.lval; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public Expression lval;
		public EqualityExpressionContext r;
		public LeftHandSideExpressionContext l;
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(TscriptParser.EQUAL, 0); }
		public LeftHandSideExpressionContext leftHandSideExpression() {
			return getRuleContext(LeftHandSideExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentExpression);
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((AssignmentExpressionContext)_localctx).r = equalityExpression(0);
				 ((AssignmentExpressionContext)_localctx).lval =  ((AssignmentExpressionContext)_localctx).r.lval; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((AssignmentExpressionContext)_localctx).l = leftHandSideExpression();
				setState(146);
				match(EQUAL);
				setState(147);
				((AssignmentExpressionContext)_localctx).r = equalityExpression(0);
				 checkAssignmentDestination(loc(_localctx.start), ((AssignmentExpressionContext)_localctx).l.lval);
				      ((AssignmentExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.ASSIGN,
				        ((AssignmentExpressionContext)_localctx).l.lval, ((AssignmentExpressionContext)_localctx).r.lval); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideExpressionContext extends ParserRuleContext {
		public Expression lval;
		public PrimaryExpressionContext p;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public LeftHandSideExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSideExpression; }
	}

	public final LeftHandSideExpressionContext leftHandSideExpression() throws RecognitionException {
		LeftHandSideExpressionContext _localctx = new LeftHandSideExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_leftHandSideExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((LeftHandSideExpressionContext)_localctx).p = primaryExpression();
			 ((LeftHandSideExpressionContext)_localctx).lval =  ((LeftHandSideExpressionContext)_localctx).p.lval; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression lval;
		public EqualityExpressionContext l;
		public RelationalExpressionContext a;
		public RelationalExpressionContext r;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public List<TerminalNode> EQUAL() { return getTokens(TscriptParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(TscriptParser.EQUAL, i);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			((EqualityExpressionContext)_localctx).a = relationalExpression(0);
			((EqualityExpressionContext)_localctx).lval =  ((EqualityExpressionContext)_localctx).a.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(159);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(160);
					match(EQUAL);
					setState(161);
					match(EQUAL);
					setState(162);
					((EqualityExpressionContext)_localctx).r = relationalExpression(0);
					((EqualityExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.EQUALS,
					                  ((EqualityExpressionContext)_localctx).l.lval, ((EqualityExpressionContext)_localctx).r.lval); 
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression lval;
		public RelationalExpressionContext l;
		public AdditiveExpressionContext a;
		public AdditiveExpressionContext r;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode LCARET() { return getToken(TscriptParser.LCARET, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode RCARET() { return getToken(TscriptParser.RCARET, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171);
			((RelationalExpressionContext)_localctx).a = additiveExpression(0);
			((RelationalExpressionContext)_localctx).lval =  ((RelationalExpressionContext)_localctx).a.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(174);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(175);
						match(LCARET);
						setState(176);
						((RelationalExpressionContext)_localctx).r = additiveExpression(0);
						((RelationalExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.LESSTHAN,
						                  ((RelationalExpressionContext)_localctx).l.lval, ((RelationalExpressionContext)_localctx).r.lval); 
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(179);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(180);
						match(RCARET);
						setState(181);
						((RelationalExpressionContext)_localctx).r = additiveExpression(0);
						((RelationalExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.GREATERTHAN,
						                  ((RelationalExpressionContext)_localctx).l.lval, ((RelationalExpressionContext)_localctx).r.lval); 
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression lval;
		public AdditiveExpressionContext l;
		public MultiplicativeExpressionContext m;
		public MultiplicativeExpressionContext r;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TscriptParser.PLUS, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TscriptParser.MINUS, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			((AdditiveExpressionContext)_localctx).m = multiplicativeExpression(0);
			 ((AdditiveExpressionContext)_localctx).lval =  ((AdditiveExpressionContext)_localctx).m.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(193);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(194);
						match(PLUS);
						setState(195);
						((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						 ((AdditiveExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.ADD,
						                  ((AdditiveExpressionContext)_localctx).l.lval, ((AdditiveExpressionContext)_localctx).r.lval); 
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(198);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(199);
						match(MINUS);
						setState(200);
						((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						 ((AdditiveExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.SUB,
						                  ((AdditiveExpressionContext)_localctx).l.lval, ((AdditiveExpressionContext)_localctx).r.lval); 
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression lval;
		public MultiplicativeExpressionContext l;
		public UnaryExpressionContext p;
		public UnaryExpressionContext r;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(TscriptParser.ASTERISK, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode RSLASH() { return getToken(TscriptParser.RSLASH, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			((MultiplicativeExpressionContext)_localctx).p = unaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).lval =  ((MultiplicativeExpressionContext)_localctx).p.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(212);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(213);
						match(ASTERISK);
						setState(214);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						 ((MultiplicativeExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.MULTIPLY,
						                  ((MultiplicativeExpressionContext)_localctx).l.lval, ((MultiplicativeExpressionContext)_localctx).r.lval); 
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(217);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(218);
						match(RSLASH);
						setState(219);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						 ((MultiplicativeExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.DIVIDE,
						                  ((MultiplicativeExpressionContext)_localctx).l.lval, ((MultiplicativeExpressionContext)_localctx).r.lval); 
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Expression lval;
		public PrimaryExpressionContext p;
		public UnaryExpressionContext e;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TscriptParser.MINUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode EXCLAMATIONPOINT() { return getToken(TscriptParser.EXCLAMATIONPOINT, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unaryExpression);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((UnaryExpressionContext)_localctx).p = primaryExpression();
				 ((UnaryExpressionContext)_localctx).lval =  ((UnaryExpressionContext)_localctx).p.lval; 
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(MINUS);
				setState(231);
				((UnaryExpressionContext)_localctx).e = unaryExpression();
				 ((UnaryExpressionContext)_localctx).lval =  buildUnaryOperator(loc(_localctx.start), Unop.SUB, ((UnaryExpressionContext)_localctx).e.lval); 
				}
				break;
			case EXCLAMATIONPOINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(EXCLAMATIONPOINT);
				setState(235);
				((UnaryExpressionContext)_localctx).e = unaryExpression();
				 ((UnaryExpressionContext)_localctx).lval =  buildUnaryOperator(loc(_localctx.start), Unop.LNOT, ((UnaryExpressionContext)_localctx).e.lval); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public Expression lval;
		public Token IDENTIFIER;
		public Token NUMERIC_LITERAL;
		public Token STRING_LITERAL;
		public Token BOOLEAN_LITERAL;
		public Token NULL_LITERAL;
		public ExpressionContext e;
		public TerminalNode IDENTIFIER() { return getToken(TscriptParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(TscriptParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TscriptParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(TscriptParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(TscriptParser.NULL_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(TscriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TscriptParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primaryExpression);
		try {
			setState(255);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((PrimaryExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((PrimaryExpressionContext)_localctx).lval =  buildIdentifier(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).IDENTIFIER!=null?((PrimaryExpressionContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL = match(NUMERIC_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildNumericLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL!=null?((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildStringLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildBooleanLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)); 
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				((PrimaryExpressionContext)_localctx).NULL_LITERAL = match(NULL_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildNullLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).NULL_LITERAL!=null?((PrimaryExpressionContext)_localctx).NULL_LITERAL.getText():null)); 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(LPAREN);
				setState(251);
				((PrimaryExpressionContext)_localctx).e = expression();
				setState(252);
				match(RPAREN);
				 ((PrimaryExpressionContext)_localctx).lval =  ((PrimaryExpressionContext)_localctx).e.lval; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 14:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 15:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 16:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 17:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0104\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0099\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00a8\n\20\f\20\16\20\u00ab\13\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00bb\n\21"+
		"\f\21\16\21\u00be\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00ce\n\22\f\22\16\22\u00d1\13\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e1"+
		"\n\23\f\23\16\23\u00e4\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u00f1\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0102\n\25\3\25\2\7\4\36 \"$"+
		"\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u0108\2*\3\2\2\2"+
		"\4.\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\nY\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20"+
		"{\3\2\2\2\22}\3\2\2\2\24\u0082\3\2\2\2\26\u0086\3\2\2\2\30\u008d\3\2\2"+
		"\2\32\u0098\3\2\2\2\34\u009a\3\2\2\2\36\u009d\3\2\2\2 \u00ac\3\2\2\2\""+
		"\u00bf\3\2\2\2$\u00d2\3\2\2\2&\u00f0\3\2\2\2(\u0101\3\2\2\2*+\5\4\3\2"+
		"+,\7\2\2\3,-\b\2\1\2-\3\3\2\2\2./\b\3\1\2/\60\b\3\1\2\60\67\3\2\2\2\61"+
		"\62\f\3\2\2\62\63\5\6\4\2\63\64\b\3\1\2\64\66\3\2\2\2\65\61\3\2\2\2\66"+
		"9\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:;\5\b\5\2;"+
		"<\b\4\1\2<S\3\2\2\2=>\5\22\n\2>?\b\4\1\2?S\3\2\2\2@A\5\n\6\2AB\b\4\1\2"+
		"BS\3\2\2\2CD\5\24\13\2DE\b\4\1\2ES\3\2\2\2FG\5\f\7\2GH\b\4\1\2HS\3\2\2"+
		"\2IJ\5\16\b\2JK\b\4\1\2KS\3\2\2\2LM\5\20\t\2MN\b\4\1\2NS\3\2\2\2OP\5\26"+
		"\f\2PQ\b\4\1\2QS\3\2\2\2R:\3\2\2\2R=\3\2\2\2R@\3\2\2\2RC\3\2\2\2RF\3\2"+
		"\2\2RI\3\2\2\2RL\3\2\2\2RO\3\2\2\2S\7\3\2\2\2TU\7\13\2\2UV\5\4\3\2VW\7"+
		"\f\2\2WX\b\5\1\2X\t\3\2\2\2YZ\7\16\2\2Z[\b\6\1\2[\13\3\2\2\2\\]\7\32\2"+
		"\2]^\7\7\2\2^_\5\30\r\2_`\7\b\2\2`a\5\6\4\2ab\7\33\2\2bc\5\6\4\2cd\b\7"+
		"\1\2dm\3\2\2\2ef\7\32\2\2fg\7\7\2\2gh\5\30\r\2hi\7\b\2\2ij\5\6\4\2jk\b"+
		"\7\1\2km\3\2\2\2l\\\3\2\2\2le\3\2\2\2m\r\3\2\2\2no\7\31\2\2op\7\7\2\2"+
		"pq\5\30\r\2qr\7\b\2\2rs\5\6\4\2st\b\b\1\2t\17\3\2\2\2uv\7\34\2\2vw\7\16"+
		"\2\2w|\b\t\1\2xy\7\35\2\2yz\7\16\2\2z|\b\t\1\2{u\3\2\2\2{x\3\2\2\2|\21"+
		"\3\2\2\2}~\7\25\2\2~\177\7\36\2\2\177\u0080\7\16\2\2\u0080\u0081\b\n\1"+
		"\2\u0081\23\3\2\2\2\u0082\u0083\5\30\r\2\u0083\u0084\7\16\2\2\u0084\u0085"+
		"\b\13\1\2\u0085\25\3\2\2\2\u0086\u0087\7\24\2\2\u0087\u0088\7\7\2\2\u0088"+
		"\u0089\5\30\r\2\u0089\u008a\7\b\2\2\u008a\u008b\7\16\2\2\u008b\u008c\b"+
		"\f\1\2\u008c\27\3\2\2\2\u008d\u008e\5\32\16\2\u008e\u008f\b\r\1\2\u008f"+
		"\31\3\2\2\2\u0090\u0091\5\36\20\2\u0091\u0092\b\16\1\2\u0092\u0099\3\2"+
		"\2\2\u0093\u0094\5\34\17\2\u0094\u0095\7\17\2\2\u0095\u0096\5\36\20\2"+
		"\u0096\u0097\b\16\1\2\u0097\u0099\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0093"+
		"\3\2\2\2\u0099\33\3\2\2\2\u009a\u009b\5(\25\2\u009b\u009c\b\17\1\2\u009c"+
		"\35\3\2\2\2\u009d\u009e\b\20\1\2\u009e\u009f\5 \21\2\u009f\u00a0\b\20"+
		"\1\2\u00a0\u00a9\3\2\2\2\u00a1\u00a2\f\3\2\2\u00a2\u00a3\7\17\2\2\u00a3"+
		"\u00a4\7\17\2\2\u00a4\u00a5\5 \21\2\u00a5\u00a6\b\20\1\2\u00a6\u00a8\3"+
		"\2\2\2\u00a7\u00a1\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\37\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\21\1"+
		"\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\b\21\1\2\u00af\u00bc\3\2\2\2\u00b0"+
		"\u00b1\f\4\2\2\u00b1\u00b2\7\t\2\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4\b"+
		"\21\1\2\u00b4\u00bb\3\2\2\2\u00b5\u00b6\f\3\2\2\u00b6\u00b7\7\n\2\2\u00b7"+
		"\u00b8\5\"\22\2\u00b8\u00b9\b\21\1\2\u00b9\u00bb\3\2\2\2\u00ba\u00b0\3"+
		"\2\2\2\u00ba\u00b5\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd!\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\22\1\2"+
		"\u00c0\u00c1\5$\23\2\u00c1\u00c2\b\22\1\2\u00c2\u00cf\3\2\2\2\u00c3\u00c4"+
		"\f\4\2\2\u00c4\u00c5\7\20\2\2\u00c5\u00c6\5$\23\2\u00c6\u00c7\b\22\1\2"+
		"\u00c7\u00ce\3\2\2\2\u00c8\u00c9\f\3\2\2\u00c9\u00ca\7\21\2\2\u00ca\u00cb"+
		"\5$\23\2\u00cb\u00cc\b\22\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c3\3\2\2\2"+
		"\u00cd\u00c8\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\23\1\2\u00d3"+
		"\u00d4\5&\24\2\u00d4\u00d5\b\23\1\2\u00d5\u00e2\3\2\2\2\u00d6\u00d7\f"+
		"\4\2\2\u00d7\u00d8\7\22\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da\b\23\1\2\u00da"+
		"\u00e1\3\2\2\2\u00db\u00dc\f\3\2\2\u00dc\u00dd\7\23\2\2\u00dd\u00de\5"+
		"&\24\2\u00de\u00df\b\23\1\2\u00df\u00e1\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3%\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5(\25\2\u00e6\u00e7"+
		"\b\24\1\2\u00e7\u00f1\3\2\2\2\u00e8\u00e9\7\21\2\2\u00e9\u00ea\5&\24\2"+
		"\u00ea\u00eb\b\24\1\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\7\r\2\2\u00ed\u00ee"+
		"\5&\24\2\u00ee\u00ef\b\24\1\2\u00ef\u00f1\3\2\2\2\u00f0\u00e5\3\2\2\2"+
		"\u00f0\u00e8\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1\'\3\2\2\2\u00f2\u00f3\7"+
		"\36\2\2\u00f3\u0102\b\25\1\2\u00f4\u00f5\7\3\2\2\u00f5\u0102\b\25\1\2"+
		"\u00f6\u00f7\7\4\2\2\u00f7\u0102\b\25\1\2\u00f8\u00f9\7\5\2\2\u00f9\u0102"+
		"\b\25\1\2\u00fa\u00fb\7\6\2\2\u00fb\u0102\b\25\1\2\u00fc\u00fd\7\7\2\2"+
		"\u00fd\u00fe\5\30\r\2\u00fe\u00ff\7\b\2\2\u00ff\u0100\b\25\1\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00f2\3\2\2\2\u0101\u00f4\3\2\2\2\u0101\u00f6\3\2\2\2\u0101"+
		"\u00f8\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u00fc\3\2\2\2\u0102)\3\2\2\2"+
		"\20\67Rl{\u0098\u00a9\u00ba\u00bc\u00cd\u00cf\u00e0\u00e2\u00f0\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}