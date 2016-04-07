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
		SEMICOLON=12, COLON=13, COMMA=14, DOT=15, EQUAL=16, PLUS=17, MINUS=18, 
		ASTERISK=19, RSLASH=20, PRINT=21, VAR=22, TRUE=23, FALSE=24, NULL=25, 
		WHILE=26, IF=27, ELSE=28, CONTINUE=29, BREAK=30, IDENTIFIER=31, WhiteSpace=32;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_emptyStatement = 4, RULE_ifStatement = 5, RULE_iterationStatement = 6, 
		RULE_controlStatement = 7, RULE_varStatement = 8, RULE_expressionStatement = 9, 
		RULE_printStatement = 10, RULE_expression = 11, RULE_assignmentExpression = 12, 
		RULE_leftHandSideExpression = 13, RULE_equalityExpression = 14, RULE_relationalExpression = 15, 
		RULE_additiveExpression = 16, RULE_multiplicativeExpression = 17, RULE_unaryExpression = 18, 
		RULE_primaryExpression = 19, RULE_objectLiteral = 20, RULE_propertyList = 21, 
		RULE_propertyAssignment = 22, RULE_propertyName = 23;
	public static final String[] ruleNames = {
		"program", "statementList", "statement", "block", "emptyStatement", "ifStatement", 
		"iterationStatement", "controlStatement", "varStatement", "expressionStatement", 
		"printStatement", "expression", "assignmentExpression", "leftHandSideExpression", 
		"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "primaryExpression", "objectLiteral", "propertyList", 
		"propertyAssignment", "propertyName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'console.log'", 
		"'var'", "'true'", "'false'", "'null'", "'while'", "'if'", "'else'", "'continue'", 
		"'break'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERIC_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "LCARET", "RCARET", "LBRACK", "RBRACK", "EXCLAMATIONPOINT", 
		"SEMICOLON", "COLON", "COMMA", "DOT", "EQUAL", "PLUS", "MINUS", "ASTERISK", 
		"RSLASH", "PRINT", "VAR", "TRUE", "FALSE", "NULL", "WHILE", "IF", "ELSE", 
		"CONTINUE", "BREAK", "IDENTIFIER", "WhiteSpace"
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
			setState(48);
			((ProgramContext)_localctx).sl = statementList(0);
			setState(49);
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
			setState(61);
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
					setState(55);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(56);
					((StatementListContext)_localctx).s = statement();
					 ((StatementListContext)_localctx).sl.lval.add(((StatementListContext)_localctx).s.lval);
					                ((StatementListContext)_localctx).lval =  ((StatementListContext)_localctx).sl.lval; 
					}
					} 
				}
				setState(63);
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
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((StatementContext)_localctx).b = block();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).b.lval; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((StatementContext)_localctx).v = varStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).v.lval; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				((StatementContext)_localctx).em = emptyStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).em.lval; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				((StatementContext)_localctx).e = expressionStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).e.lval; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				((StatementContext)_localctx).ifs = ifStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).ifs.lval; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				((StatementContext)_localctx).i = iterationStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).i.lval; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				((StatementContext)_localctx).c = controlStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).c.lval; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				((StatementContext)_localctx).p = printStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).p.lval; 
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
			setState(90);
			match(LBRACK);
			setState(91);
			((BlockContext)_localctx).sl = statementList(0);
			setState(92);
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
			setState(95);
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
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(IF);
				setState(99);
				match(LPAREN);
				setState(100);
				((IfStatementContext)_localctx).e = expression();
				setState(101);
				match(RPAREN);
				setState(102);
				((IfStatementContext)_localctx).s1 = statement();
				setState(103);
				match(ELSE);
				setState(104);
				((IfStatementContext)_localctx).s2 = statement();
				 ((IfStatementContext)_localctx).lval =  buildIfStatement(loc(_localctx.start), ((IfStatementContext)_localctx).e.lval, ((IfStatementContext)_localctx).s1.lval, ((IfStatementContext)_localctx).s2.lval); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(IF);
				setState(108);
				match(LPAREN);
				setState(109);
				((IfStatementContext)_localctx).e = expression();
				setState(110);
				match(RPAREN);
				setState(111);
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
			setState(116);
			match(WHILE);
			setState(117);
			match(LPAREN);
			setState(118);
			((IterationStatementContext)_localctx).e = expression();
			setState(119);
			match(RPAREN);
			setState(120);
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
			setState(129);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				((ControlStatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(124);
				match(SEMICOLON);
				 ((ControlStatementContext)_localctx).lval =  buildControlStatement(loc(_localctx.start), (((ControlStatementContext)_localctx).CONTINUE!=null?((ControlStatementContext)_localctx).CONTINUE.getText():null)); 
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				((ControlStatementContext)_localctx).BREAK = match(BREAK);
				setState(127);
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
			setState(131);
			match(VAR);
			setState(132);
			((VarStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(133);
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
			setState(136);
			((ExpressionStatementContext)_localctx).e = expression();
			setState(137);
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
			setState(140);
			match(PRINT);
			setState(141);
			match(LPAREN);
			setState(142);
			((PrintStatementContext)_localctx).e = expression();
			setState(143);
			match(RPAREN);
			setState(144);
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
			setState(147);
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
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((AssignmentExpressionContext)_localctx).r = equalityExpression(0);
				 ((AssignmentExpressionContext)_localctx).lval =  ((AssignmentExpressionContext)_localctx).r.lval; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((AssignmentExpressionContext)_localctx).l = leftHandSideExpression(0);
				setState(154);
				match(EQUAL);
				setState(155);
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
		public LeftHandSideExpressionContext l;
		public PrimaryExpressionContext p;
		public Token IDENTIFIER;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TscriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TscriptParser.IDENTIFIER, 0); }
		public LeftHandSideExpressionContext leftHandSideExpression() {
			return getRuleContext(LeftHandSideExpressionContext.class,0);
		}
		public LeftHandSideExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSideExpression; }
	}

	public final LeftHandSideExpressionContext leftHandSideExpression() throws RecognitionException {
		return leftHandSideExpression(0);
	}

	private LeftHandSideExpressionContext leftHandSideExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LeftHandSideExpressionContext _localctx = new LeftHandSideExpressionContext(_ctx, _parentState);
		LeftHandSideExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_leftHandSideExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			((LeftHandSideExpressionContext)_localctx).p = primaryExpression();
			 ((LeftHandSideExpressionContext)_localctx).lval =  ((LeftHandSideExpressionContext)_localctx).p.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LeftHandSideExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_leftHandSideExpression);
					setState(164);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(165);
					match(DOT);
					setState(166);
					((LeftHandSideExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					 ((LeftHandSideExpressionContext)_localctx).lval =  buildPropAccess(loc(_localctx.start), ((LeftHandSideExpressionContext)_localctx).l.lval, (((LeftHandSideExpressionContext)_localctx).IDENTIFIER!=null?((LeftHandSideExpressionContext)_localctx).IDENTIFIER.getText():null)); 
					}
					} 
				}
				setState(172);
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
			setState(174);
			((EqualityExpressionContext)_localctx).a = relationalExpression(0);
			((EqualityExpressionContext)_localctx).lval =  ((EqualityExpressionContext)_localctx).a.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
					setState(177);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(178);
					match(EQUAL);
					setState(179);
					match(EQUAL);
					setState(180);
					((EqualityExpressionContext)_localctx).r = relationalExpression(0);
					((EqualityExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.EQUALS,
					                  ((EqualityExpressionContext)_localctx).l.lval, ((EqualityExpressionContext)_localctx).r.lval); 
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(189);
			((RelationalExpressionContext)_localctx).a = additiveExpression(0);
			((RelationalExpressionContext)_localctx).lval =  ((RelationalExpressionContext)_localctx).a.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(192);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(193);
						match(LCARET);
						setState(194);
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
						setState(197);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(198);
						match(RCARET);
						setState(199);
						((RelationalExpressionContext)_localctx).r = additiveExpression(0);
						((RelationalExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.GREATERTHAN,
						                  ((RelationalExpressionContext)_localctx).l.lval, ((RelationalExpressionContext)_localctx).r.lval); 
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(208);
			((AdditiveExpressionContext)_localctx).m = multiplicativeExpression(0);
			 ((AdditiveExpressionContext)_localctx).lval =  ((AdditiveExpressionContext)_localctx).m.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(PLUS);
						setState(213);
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
						setState(216);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(217);
						match(MINUS);
						setState(218);
						((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						 ((AdditiveExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.SUB,
						                  ((AdditiveExpressionContext)_localctx).l.lval, ((AdditiveExpressionContext)_localctx).r.lval); 
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(227);
			((MultiplicativeExpressionContext)_localctx).p = unaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).lval =  ((MultiplicativeExpressionContext)_localctx).p.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(230);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(231);
						match(ASTERISK);
						setState(232);
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
						setState(235);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(236);
						match(RSLASH);
						setState(237);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						 ((MultiplicativeExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.DIVIDE,
						                  ((MultiplicativeExpressionContext)_localctx).l.lval, ((MultiplicativeExpressionContext)_localctx).r.lval); 
						}
						break;
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(256);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LBRACK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				((UnaryExpressionContext)_localctx).p = primaryExpression();
				 ((UnaryExpressionContext)_localctx).lval =  ((UnaryExpressionContext)_localctx).p.lval; 
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(MINUS);
				setState(249);
				((UnaryExpressionContext)_localctx).e = unaryExpression();
				 ((UnaryExpressionContext)_localctx).lval =  buildUnaryOperator(loc(_localctx.start), Unop.SUB, ((UnaryExpressionContext)_localctx).e.lval); 
				}
				break;
			case EXCLAMATIONPOINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(EXCLAMATIONPOINT);
				setState(253);
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
		public ObjectLiteralContext o;
		public ExpressionContext e;
		public TerminalNode IDENTIFIER() { return getToken(TscriptParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(TscriptParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TscriptParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(TscriptParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(TscriptParser.NULL_LITERAL, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
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
			setState(276);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				((PrimaryExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((PrimaryExpressionContext)_localctx).lval =  buildIdentifier(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).IDENTIFIER!=null?((PrimaryExpressionContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL = match(NUMERIC_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildNumericLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL!=null?((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildStringLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildBooleanLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)); 
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				((PrimaryExpressionContext)_localctx).NULL_LITERAL = match(NULL_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildNullLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).NULL_LITERAL!=null?((PrimaryExpressionContext)_localctx).NULL_LITERAL.getText():null)); 
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				((PrimaryExpressionContext)_localctx).o = objectLiteral();
				 ((PrimaryExpressionContext)_localctx).lval =  ((PrimaryExpressionContext)_localctx).o.lval; 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				match(LPAREN);
				setState(272);
				((PrimaryExpressionContext)_localctx).e = expression();
				setState(273);
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public Expression lval;
		public PropertyListContext pl;
		public TerminalNode LBRACK() { return getToken(TscriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TscriptParser.RBRACK, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_objectLiteral);
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(LBRACK);
				setState(279);
				((ObjectLiteralContext)_localctx).pl = propertyList(0);
				setState(280);
				match(RBRACK);
				 ((ObjectLiteralContext)_localctx).lval =  buildObjectLiteral(loc(_localctx.start), ((ObjectLiteralContext)_localctx).pl.lval); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(LBRACK);
				setState(284);
				match(RBRACK);
				 ((ObjectLiteralContext)_localctx).lval =  buildObjectLiteral(loc(_localctx.start), new ArrayList<Expression>()); 
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

	public static class PropertyListContext extends ParserRuleContext {
		public List<Expression> lval;
		public PropertyListContext pl;
		public PropertyAssignmentContext p;
		public TerminalNode COMMA() { return getToken(TscriptParser.COMMA, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public PropertyAssignmentContext propertyAssignment() {
			return getRuleContext(PropertyAssignmentContext.class,0);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		return propertyList(0);
	}

	private PropertyListContext propertyList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropertyListContext _localctx = new PropertyListContext(_ctx, _parentState);
		PropertyListContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_propertyList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((PropertyListContext)_localctx).lval =  new ArrayList<Expression>(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PropertyListContext(_parentctx, _parentState);
					_localctx.pl = _prevctx;
					_localctx.pl = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_propertyList);
					setState(291);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(292);
					match(COMMA);
					setState(293);
					((PropertyListContext)_localctx).p = propertyAssignment();
					 ((PropertyListContext)_localctx).pl.lval.add(((PropertyListContext)_localctx).p.lval);
					                ((PropertyListContext)_localctx).lval =  ((PropertyListContext)_localctx).pl.lval; 
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public Expression lval;
		public PropertyNameContext p;
		public AssignmentExpressionContext a;
		public TerminalNode COLON() { return getToken(TscriptParser.COLON, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((PropertyAssignmentContext)_localctx).p = propertyName();
			setState(302);
			match(COLON);
			setState(303);
			((PropertyAssignmentContext)_localctx).a = assignmentExpression();
			 ((PropertyAssignmentContext)_localctx).lval =  buildPropAssignment(loc(_localctx.start), ((PropertyAssignmentContext)_localctx).p.lval, ((PropertyAssignmentContext)_localctx).a.lval); 
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

	public static class PropertyNameContext extends ParserRuleContext {
		public Expression lval;
		public Token IDENTIFIER;
		public Token STRING_LITERAL;
		public Token NUMERIC_LITERAL;
		public TerminalNode IDENTIFIER() { return getToken(TscriptParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TscriptParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(TscriptParser.NUMERIC_LITERAL, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_propertyName);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				((PropertyNameContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((PropertyNameContext)_localctx).lval =  buildIdentifier(loc(_localctx.start), (((PropertyNameContext)_localctx).IDENTIFIER!=null?((PropertyNameContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				((PropertyNameContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((PropertyNameContext)_localctx).lval =  buildStringLiteral(loc(_localctx.start), (((PropertyNameContext)_localctx).STRING_LITERAL!=null?((PropertyNameContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				((PropertyNameContext)_localctx).NUMERIC_LITERAL = match(NUMERIC_LITERAL);
				 ((PropertyNameContext)_localctx).lval =  buildNumericLiteral(loc(_localctx.start), (((PropertyNameContext)_localctx).NUMERIC_LITERAL!=null?((PropertyNameContext)_localctx).NUMERIC_LITERAL.getText():null)); 
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
		case 13:
			return leftHandSideExpression_sempred((LeftHandSideExpressionContext)_localctx, predIndex);
		case 14:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 15:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 16:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 17:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 21:
			return propertyList_sempred((PropertyListContext)_localctx, predIndex);
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
	private boolean leftHandSideExpression_sempred(LeftHandSideExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean propertyList_sempred(PropertyListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7u\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a1\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ab\n\17\f\17\16\17\u00ae\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ba\n\20"+
		"\f\20\16\20\u00bd\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00cd\n\21\f\21\16\21\u00d0\13\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e0"+
		"\n\22\f\22\16\22\u00e3\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f3\n\23\f\23\16\23\u00f6\13\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0103\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0117\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0121\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u012b"+
		"\n\27\f\27\16\27\u012e\13\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u013b\n\31\3\31\2\t\4\34\36 \"$,\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\u0143\2\62\3\2\2\2\4\66\3\2\2"+
		"\2\6Z\3\2\2\2\b\\\3\2\2\2\na\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20\u0083\3"+
		"\2\2\2\22\u0085\3\2\2\2\24\u008a\3\2\2\2\26\u008e\3\2\2\2\30\u0095\3\2"+
		"\2\2\32\u00a0\3\2\2\2\34\u00a2\3\2\2\2\36\u00af\3\2\2\2 \u00be\3\2\2\2"+
		"\"\u00d1\3\2\2\2$\u00e4\3\2\2\2&\u0102\3\2\2\2(\u0116\3\2\2\2*\u0120\3"+
		"\2\2\2,\u0122\3\2\2\2.\u012f\3\2\2\2\60\u013a\3\2\2\2\62\63\5\4\3\2\63"+
		"\64\7\2\2\3\64\65\b\2\1\2\65\3\3\2\2\2\66\67\b\3\1\2\678\b\3\1\28?\3\2"+
		"\2\29:\f\3\2\2:;\5\6\4\2;<\b\3\1\2<>\3\2\2\2=9\3\2\2\2>A\3\2\2\2?=\3\2"+
		"\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\5\b\5\2CD\b\4\1\2D[\3\2\2\2EF\5"+
		"\22\n\2FG\b\4\1\2G[\3\2\2\2HI\5\n\6\2IJ\b\4\1\2J[\3\2\2\2KL\5\24\13\2"+
		"LM\b\4\1\2M[\3\2\2\2NO\5\f\7\2OP\b\4\1\2P[\3\2\2\2QR\5\16\b\2RS\b\4\1"+
		"\2S[\3\2\2\2TU\5\20\t\2UV\b\4\1\2V[\3\2\2\2WX\5\26\f\2XY\b\4\1\2Y[\3\2"+
		"\2\2ZB\3\2\2\2ZE\3\2\2\2ZH\3\2\2\2ZK\3\2\2\2ZN\3\2\2\2ZQ\3\2\2\2ZT\3\2"+
		"\2\2ZW\3\2\2\2[\7\3\2\2\2\\]\7\13\2\2]^\5\4\3\2^_\7\f\2\2_`\b\5\1\2`\t"+
		"\3\2\2\2ab\7\16\2\2bc\b\6\1\2c\13\3\2\2\2de\7\35\2\2ef\7\7\2\2fg\5\30"+
		"\r\2gh\7\b\2\2hi\5\6\4\2ij\7\36\2\2jk\5\6\4\2kl\b\7\1\2lu\3\2\2\2mn\7"+
		"\35\2\2no\7\7\2\2op\5\30\r\2pq\7\b\2\2qr\5\6\4\2rs\b\7\1\2su\3\2\2\2t"+
		"d\3\2\2\2tm\3\2\2\2u\r\3\2\2\2vw\7\34\2\2wx\7\7\2\2xy\5\30\r\2yz\7\b\2"+
		"\2z{\5\6\4\2{|\b\b\1\2|\17\3\2\2\2}~\7\37\2\2~\177\7\16\2\2\177\u0084"+
		"\b\t\1\2\u0080\u0081\7 \2\2\u0081\u0082\7\16\2\2\u0082\u0084\b\t\1\2\u0083"+
		"}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\21\3\2\2\2\u0085\u0086\7\30\2\2\u0086"+
		"\u0087\7!\2\2\u0087\u0088\7\16\2\2\u0088\u0089\b\n\1\2\u0089\23\3\2\2"+
		"\2\u008a\u008b\5\30\r\2\u008b\u008c\7\16\2\2\u008c\u008d\b\13\1\2\u008d"+
		"\25\3\2\2\2\u008e\u008f\7\27\2\2\u008f\u0090\7\7\2\2\u0090\u0091\5\30"+
		"\r\2\u0091\u0092\7\b\2\2\u0092\u0093\7\16\2\2\u0093\u0094\b\f\1\2\u0094"+
		"\27\3\2\2\2\u0095\u0096\5\32\16\2\u0096\u0097\b\r\1\2\u0097\31\3\2\2\2"+
		"\u0098\u0099\5\36\20\2\u0099\u009a\b\16\1\2\u009a\u00a1\3\2\2\2\u009b"+
		"\u009c\5\34\17\2\u009c\u009d\7\22\2\2\u009d\u009e\5\36\20\2\u009e\u009f"+
		"\b\16\1\2\u009f\u00a1\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u009b\3\2\2\2"+
		"\u00a1\33\3\2\2\2\u00a2\u00a3\b\17\1\2\u00a3\u00a4\5(\25\2\u00a4\u00a5"+
		"\b\17\1\2\u00a5\u00ac\3\2\2\2\u00a6\u00a7\f\3\2\2\u00a7\u00a8\7\21\2\2"+
		"\u00a8\u00a9\7!\2\2\u00a9\u00ab\b\17\1\2\u00aa\u00a6\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\35\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\b\20\1\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\b"+
		"\20\1\2\u00b2\u00bb\3\2\2\2\u00b3\u00b4\f\3\2\2\u00b4\u00b5\7\22\2\2\u00b5"+
		"\u00b6\7\22\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\b\20\1\2\u00b8\u00ba\3"+
		"\2\2\2\u00b9\u00b3\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\37\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\21\1"+
		"\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\b\21\1\2\u00c1\u00ce\3\2\2\2\u00c2"+
		"\u00c3\f\4\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00c6\b"+
		"\21\1\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\f\3\2\2\u00c8\u00c9\7\n\2\2\u00c9"+
		"\u00ca\5\"\22\2\u00ca\u00cb\b\21\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c2\3"+
		"\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\b\22\1\2"+
		"\u00d2\u00d3\5$\23\2\u00d3\u00d4\b\22\1\2\u00d4\u00e1\3\2\2\2\u00d5\u00d6"+
		"\f\4\2\2\u00d6\u00d7\7\23\2\2\u00d7\u00d8\5$\23\2\u00d8\u00d9\b\22\1\2"+
		"\u00d9\u00e0\3\2\2\2\u00da\u00db\f\3\2\2\u00db\u00dc\7\24\2\2\u00dc\u00dd"+
		"\5$\23\2\u00dd\u00de\b\22\1\2\u00de\u00e0\3\2\2\2\u00df\u00d5\3\2\2\2"+
		"\u00df\u00da\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2#\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\23\1\2\u00e5"+
		"\u00e6\5&\24\2\u00e6\u00e7\b\23\1\2\u00e7\u00f4\3\2\2\2\u00e8\u00e9\f"+
		"\4\2\2\u00e9\u00ea\7\25\2\2\u00ea\u00eb\5&\24\2\u00eb\u00ec\b\23\1\2\u00ec"+
		"\u00f3\3\2\2\2\u00ed\u00ee\f\3\2\2\u00ee\u00ef\7\26\2\2\u00ef\u00f0\5"+
		"&\24\2\u00f0\u00f1\b\23\1\2\u00f1\u00f3\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f2"+
		"\u00ed\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5%\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\5(\25\2\u00f8\u00f9"+
		"\b\24\1\2\u00f9\u0103\3\2\2\2\u00fa\u00fb\7\24\2\2\u00fb\u00fc\5&\24\2"+
		"\u00fc\u00fd\b\24\1\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\7\r\2\2\u00ff\u0100"+
		"\5&\24\2\u0100\u0101\b\24\1\2\u0101\u0103\3\2\2\2\u0102\u00f7\3\2\2\2"+
		"\u0102\u00fa\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\'\3\2\2\2\u0104\u0105\7"+
		"!\2\2\u0105\u0117\b\25\1\2\u0106\u0107\7\3\2\2\u0107\u0117\b\25\1\2\u0108"+
		"\u0109\7\4\2\2\u0109\u0117\b\25\1\2\u010a\u010b\7\5\2\2\u010b\u0117\b"+
		"\25\1\2\u010c\u010d\7\6\2\2\u010d\u0117\b\25\1\2\u010e\u010f\5*\26\2\u010f"+
		"\u0110\b\25\1\2\u0110\u0117\3\2\2\2\u0111\u0112\7\7\2\2\u0112\u0113\5"+
		"\30\r\2\u0113\u0114\7\b\2\2\u0114\u0115\b\25\1\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0104\3\2\2\2\u0116\u0106\3\2\2\2\u0116\u0108\3\2\2\2\u0116\u010a\3\2"+
		"\2\2\u0116\u010c\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u0111\3\2\2\2\u0117"+
		")\3\2\2\2\u0118\u0119\7\13\2\2\u0119\u011a\5,\27\2\u011a\u011b\7\f\2\2"+
		"\u011b\u011c\b\26\1\2\u011c\u0121\3\2\2\2\u011d\u011e\7\13\2\2\u011e\u011f"+
		"\7\f\2\2\u011f\u0121\b\26\1\2\u0120\u0118\3\2\2\2\u0120\u011d\3\2\2\2"+
		"\u0121+\3\2\2\2\u0122\u0123\b\27\1\2\u0123\u0124\b\27\1\2\u0124\u012c"+
		"\3\2\2\2\u0125\u0126\f\3\2\2\u0126\u0127\7\20\2\2\u0127\u0128\5.\30\2"+
		"\u0128\u0129\b\27\1\2\u0129\u012b\3\2\2\2\u012a\u0125\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d-\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\5\60\31\2\u0130\u0131\7\17\2\2\u0131\u0132"+
		"\5\32\16\2\u0132\u0133\b\30\1\2\u0133/\3\2\2\2\u0134\u0135\7!\2\2\u0135"+
		"\u013b\b\31\1\2\u0136\u0137\7\4\2\2\u0137\u013b\b\31\1\2\u0138\u0139\7"+
		"\3\2\2\u0139\u013b\b\31\1\2\u013a\u0134\3\2\2\2\u013a\u0136\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\61\3\2\2\2\24?Zt\u0083\u00a0\u00ac\u00bb\u00cc\u00ce"+
		"\u00df\u00e1\u00f2\u00f4\u0102\u0116\u0120\u012c\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}