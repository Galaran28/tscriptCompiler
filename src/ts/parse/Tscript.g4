//
// an ANTLR parser specification for a Tscript subset
//

grammar Tscript;

@header {
  import ts.Location;
  import ts.tree.*;
  import static ts.parse.TreeBuilder.*;
  import java.util.List;
  import java.util.ArrayList;
}

@members {
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
}

// grammar proper

program
  : sl=statementList EOF
    { semanticValue = buildProgram(loc($start), $sl.lval); }
  ;

statementList
  returns [ List<Statement> lval ]
  : // empty rule
    { $lval = new ArrayList<Statement>(); }
  | sl=statementList s=statement
    { $sl.lval.add($s.lval);
      $lval = $sl.lval; }
  ;

statement
  returns [ Statement lval ]
  : v=varStatement
    { $lval = $v.lval; }
  | e=expressionStatement
    { $lval = $e.lval; }
  | p=printStatement
    { $lval = $p.lval; }
  ;

varStatement
  returns [ Statement lval ]
  : VAR IDENTIFIER SEMICOLON
    { $lval = buildVarStatement(loc($start), $IDENTIFIER.text); }
  ;

expressionStatement
  returns [ Statement lval ]
  : e=expression SEMICOLON
    { $lval = buildExpressionStatement(loc($start), $e.lval); }
  ;

printStatement
  returns [ Statement lval ]
  : PRINT LPAREN e=expression RPAREN SEMICOLON
    { $lval = buildPrintStatement(loc($start), $e.lval); }
  ;

expression
  returns [ Expression lval ]
  : a=assignmentExpression
    { $lval = $a.lval; }
  ;

assignmentExpression
  returns [ Expression lval ]
  : a=additiveExpression
    { $lval = $a.lval; }
  | l=leftHandSideExpression EQUAL r=assignmentExpression
    { checkAssignmentDestination(loc($start), $l.lval);
      $lval = buildBinaryOperator(loc($start), Binop.ASSIGN,
        $l.lval, $r.lval); }
  ;

leftHandSideExpression
  returns [ Expression lval ]
  : p=primaryExpression
    { $lval = $p.lval; }
  ;

additiveExpression
  returns [ Expression lval ]
  : m=multiplicativeExpression
    { $lval = $m.lval; }
  | l=additiveExpression PLUS r=multiplicativeExpression
    { $lval = buildBinaryOperator(loc($start), Binop.ADD,
        $l.lval, $r.lval); }
  | l=additiveExpression MINUS r=multiplicativeExpression
    { $lval = buildBinaryOperator(loc($start), Binop.SUB,
        $l.lval, $r.lval); }
  ;

multiplicativeExpression
  returns [ Expression lval ]
  : p=primaryExpression
    { $lval = $p.lval; }
  | l=multiplicativeExpression ASTERISK r=primaryExpression
    { $lval = buildBinaryOperator(loc($start), Binop.MULTIPLY,
        $l.lval, $r.lval); }
  ;

primaryExpression
  returns [ Expression lval ]
  : IDENTIFIER
    { $lval = buildIdentifier(loc($start), $IDENTIFIER.text); }
  | NUMERIC_LITERAL
    { $lval = buildNumericLiteral(loc($start), $NUMERIC_LITERAL.text); }
  | STRING_LITERAL
    { $lval = buildStringLiteral(loc($start), $STRING_LITERAL.text); }
  | BOOLEAN_LITERAL
    { $lval = buildBooleanLiteral(loc($start), $BOOLEAN_LITERAL.text); }
  | NULL_LITERAL
    { $lval = buildNullLiteral(loc($start), $NULL_LITERAL.text); }
  | LPAREN e=expression RPAREN
    { $lval = $e.lval; }
  ;

// fragments to support the lexer rules

fragment Digit : [0-9];
fragment NonZeroDigit : [1-9];
fragment Digits : Digit Digit*;
fragment DecimalIntegerLiteral : ('0' | (NonZeroDigit Digits?));
fragment DecimalLiteral : (DecimalIntegerLiteral '.' Digits? ExponentPart?) |
                          ('.' Digits ExponentPart?) |
                          (DecimalIntegerLiteral ExponentPart?);

fragment HexDigit : [0-9a-fA-F];
fragment HexLiteral : ('0x' HexDigit* | '0X' HexDigit*);

fragment ExponentIndicator : ('e' | 'E');
fragment SignedInteger : (Digits | '+' Digits | '-' Digits);
fragment ExponentPart : ExponentIndicator SignedInteger;


fragment IdentifierCharacters : [a-zA-Z_$] [a-zA-Z0-9_$]*;

fragment SpaceTokens : SpaceChars | LineTerminator | EndOfLineComment;

fragment SpaceChars : ' ' | '\t' | '\f';

fragment EndOfLineComment : '//' ( ~[\n\r] )* (LineTerminator | EOF);

fragment LineTerminator : '\r' '\n' | '\r' | '\n';

fragment EscapeCharacter : ('\'' | '"' | '\\');
fragment SourceCharacters : [ -~ ] ; // all ascii printable characters
fragment SingleStringCharacter : ~['\\] | '\\' SourceCharacters;
fragment DoubleStringCharacter : ~["\\] | '\\' SourceCharacters;
fragment SingleStringCharacters : SingleStringCharacter SingleStringCharacter*;
fragment DoubleStringCharacters : DoubleStringCharacter DoubleStringCharacter*;

// lexer rules
//   keywords must appear before IDENTIFIER

// cannot have a leading 0 unless the literal is just 0
NUMERIC_LITERAL : ( DecimalLiteral | HexLiteral );

STRING_LITERAL : ('"' DoubleStringCharacters? '"') |
                 ('\'' SingleStringCharacters? '\'') ;

BOOLEAN_LITERAL : TRUE | FALSE ;

NULL_LITERAL : NULL ;

LPAREN : [(];
RPAREN : [)];
SEMICOLON : [;];
EQUAL : [=];
PLUS : [+];
MINUS : [-];
ASTERISK : [*];

// keywords start here
PRINT : 'console.log';
VAR : 'var';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';

IDENTIFIER : IdentifierCharacters;

// skip whitespace and comments

WhiteSpace : SpaceTokens+ -> skip;

