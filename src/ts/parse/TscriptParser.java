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
		LPAREN=5, RPAREN=6, SEMICOLON=7, EQUAL=8, PLUS=9, ASTERISK=10, PRINT=11, 
		VAR=12, TRUE=13, FALSE=14, NULL=15, IDENTIFIER=16, WhiteSpace=17;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_varStatement = 3, 
		RULE_expressionStatement = 4, RULE_printStatement = 5, RULE_expression = 6, 
		RULE_assignmentExpression = 7, RULE_leftHandSideExpression = 8, RULE_additiveExpression = 9, 
		RULE_multiplicativeExpression = 10, RULE_primaryExpression = 11;
	public static final String[] ruleNames = {
		"program", "statementList", "statement", "varStatement", "expressionStatement", 
		"printStatement", "expression", "assignmentExpression", "leftHandSideExpression", 
		"additiveExpression", "multiplicativeExpression", "primaryExpression"
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
			setState(24);
			((ProgramContext)_localctx).sl = statementList(0);
			setState(25);
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
			setState(37);
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
					setState(31);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(32);
					((StatementListContext)_localctx).s = statement();
					 ((StatementListContext)_localctx).sl.lval.add(((StatementListContext)_localctx).s.lval);
					                ((StatementListContext)_localctx).lval =  ((StatementListContext)_localctx).sl.lval; 
					}
					} 
				}
				setState(39);
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
		public VarStatementContext v;
		public ExpressionStatementContext e;
		public PrintStatementContext p;
		public VarStatementContext varStatement() {
			return getRuleContext(VarStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
			setState(49);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((StatementContext)_localctx).v = varStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).v.lval; 
				}
				break;
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((StatementContext)_localctx).e = expressionStatement();
				 ((StatementContext)_localctx).lval =  ((StatementContext)_localctx).e.lval; 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
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
		enterRule(_localctx, 6, RULE_varStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(VAR);
			setState(52);
			((VarStatementContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(53);
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
		enterRule(_localctx, 8, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((ExpressionStatementContext)_localctx).e = expression();
			setState(57);
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
		enterRule(_localctx, 10, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(PRINT);
			setState(61);
			match(LPAREN);
			setState(62);
			((PrintStatementContext)_localctx).e = expression();
			setState(63);
			match(RPAREN);
			setState(64);
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
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
		public AdditiveExpressionContext a;
		public LeftHandSideExpressionContext l;
		public AssignmentExpressionContext r;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(TscriptParser.EQUAL, 0); }
		public LeftHandSideExpressionContext leftHandSideExpression() {
			return getRuleContext(LeftHandSideExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentExpression);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				((AssignmentExpressionContext)_localctx).a = additiveExpression(0);
				 ((AssignmentExpressionContext)_localctx).lval =  ((AssignmentExpressionContext)_localctx).a.lval; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((AssignmentExpressionContext)_localctx).l = leftHandSideExpression();
				setState(74);
				match(EQUAL);
				setState(75);
				((AssignmentExpressionContext)_localctx).r = assignmentExpression();
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
		enterRule(_localctx, 16, RULE_leftHandSideExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(84);
			((AdditiveExpressionContext)_localctx).m = multiplicativeExpression(0);
			 ((AdditiveExpressionContext)_localctx).lval =  ((AdditiveExpressionContext)_localctx).m.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(87);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(88);
					match(PLUS);
					setState(89);
					((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
					 ((AdditiveExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.ADD,
					                  ((AdditiveExpressionContext)_localctx).l.lval, ((AdditiveExpressionContext)_localctx).r.lval); 
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public PrimaryExpressionContext p;
		public PrimaryExpressionContext r;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(TscriptParser.ASTERISK, 0); }
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			((MultiplicativeExpressionContext)_localctx).p = primaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).lval =  ((MultiplicativeExpressionContext)_localctx).p.lval; 
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(101);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(102);
					match(ASTERISK);
					setState(103);
					((MultiplicativeExpressionContext)_localctx).r = primaryExpression();
					 ((MultiplicativeExpressionContext)_localctx).lval =  buildBinaryOperator(loc(_localctx.start), Binop.MULTIPLY,
					                  ((MultiplicativeExpressionContext)_localctx).l.lval, ((MultiplicativeExpressionContext)_localctx).r.lval); 
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 22, RULE_primaryExpression);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				((PrimaryExpressionContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				 ((PrimaryExpressionContext)_localctx).lval =  buildIdentifier(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).IDENTIFIER!=null?((PrimaryExpressionContext)_localctx).IDENTIFIER.getText():null)); 
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL = match(NUMERIC_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildNumericLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL!=null?((PrimaryExpressionContext)_localctx).NUMERIC_LITERAL.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				((PrimaryExpressionContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildStringLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).STRING_LITERAL!=null?((PrimaryExpressionContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL = match(BOOLEAN_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildBooleanLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL!=null?((PrimaryExpressionContext)_localctx).BOOLEAN_LITERAL.getText():null)); 
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				((PrimaryExpressionContext)_localctx).NULL_LITERAL = match(NULL_LITERAL);
				 ((PrimaryExpressionContext)_localctx).lval =  buildNullLiteral(loc(_localctx.start), (((PrimaryExpressionContext)_localctx).NULL_LITERAL!=null?((PrimaryExpressionContext)_localctx).NULL_LITERAL.getText():null)); 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(LPAREN);
				setState(122);
				((PrimaryExpressionContext)_localctx).e = expression();
				setState(123);
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
		case 9:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 10:
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
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u0083\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tQ\n\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13_\n\13\f\13\16\13b\13\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fm\n\f\f\f\16\fp\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0081\n\r\3\r\2\5\4\24"+
		"\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u0081\2\32\3\2\2\2\4\36\3\2\2"+
		"\2\6\63\3\2\2\2\b\65\3\2\2\2\n:\3\2\2\2\f>\3\2\2\2\16E\3\2\2\2\20P\3\2"+
		"\2\2\22R\3\2\2\2\24U\3\2\2\2\26c\3\2\2\2\30\u0080\3\2\2\2\32\33\5\4\3"+
		"\2\33\34\7\2\2\3\34\35\b\2\1\2\35\3\3\2\2\2\36\37\b\3\1\2\37 \b\3\1\2"+
		" \'\3\2\2\2!\"\f\3\2\2\"#\5\6\4\2#$\b\3\1\2$&\3\2\2\2%!\3\2\2\2&)\3\2"+
		"\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2*+\5\b\5\2+,\b\4\1\2,"+
		"\64\3\2\2\2-.\5\n\6\2./\b\4\1\2/\64\3\2\2\2\60\61\5\f\7\2\61\62\b\4\1"+
		"\2\62\64\3\2\2\2\63*\3\2\2\2\63-\3\2\2\2\63\60\3\2\2\2\64\7\3\2\2\2\65"+
		"\66\7\16\2\2\66\67\7\22\2\2\678\7\t\2\289\b\5\1\29\t\3\2\2\2:;\5\16\b"+
		"\2;<\7\t\2\2<=\b\6\1\2=\13\3\2\2\2>?\7\r\2\2?@\7\7\2\2@A\5\16\b\2AB\7"+
		"\b\2\2BC\7\t\2\2CD\b\7\1\2D\r\3\2\2\2EF\5\20\t\2FG\b\b\1\2G\17\3\2\2\2"+
		"HI\5\24\13\2IJ\b\t\1\2JQ\3\2\2\2KL\5\22\n\2LM\7\n\2\2MN\5\20\t\2NO\b\t"+
		"\1\2OQ\3\2\2\2PH\3\2\2\2PK\3\2\2\2Q\21\3\2\2\2RS\5\30\r\2ST\b\n\1\2T\23"+
		"\3\2\2\2UV\b\13\1\2VW\5\26\f\2WX\b\13\1\2X`\3\2\2\2YZ\f\3\2\2Z[\7\13\2"+
		"\2[\\\5\26\f\2\\]\b\13\1\2]_\3\2\2\2^Y\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3"+
		"\2\2\2a\25\3\2\2\2b`\3\2\2\2cd\b\f\1\2de\5\30\r\2ef\b\f\1\2fn\3\2\2\2"+
		"gh\f\3\2\2hi\7\f\2\2ij\5\30\r\2jk\b\f\1\2km\3\2\2\2lg\3\2\2\2mp\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2o\27\3\2\2\2pn\3\2\2\2qr\7\22\2\2r\u0081\b\r\1\2"+
		"st\7\3\2\2t\u0081\b\r\1\2uv\7\4\2\2v\u0081\b\r\1\2wx\7\5\2\2x\u0081\b"+
		"\r\1\2yz\7\6\2\2z\u0081\b\r\1\2{|\7\7\2\2|}\5\16\b\2}~\7\b\2\2~\177\b"+
		"\r\1\2\177\u0081\3\2\2\2\u0080q\3\2\2\2\u0080s\3\2\2\2\u0080u\3\2\2\2"+
		"\u0080w\3\2\2\2\u0080y\3\2\2\2\u0080{\3\2\2\2\u0081\31\3\2\2\2\b\'\63"+
		"P`n\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}