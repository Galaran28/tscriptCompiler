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
  : b=block
    { $lval = $b.lval; }
  | v=varStatement
    { $lval = $v.lval; }
  | em=emptyStatement
    { $lval = $em.lval; }
  | e=expressionStatement
    { $lval = $e.lval; }
  | ifs=ifStatement
    { $lval = $ifs.lval; }
  | i=iterationStatement
    { $lval = $i.lval; }
  | c=controlStatement
    { $lval = $c.lval; }
  | p=printStatement
    { $lval = $p.lval; }
  ;

block
  returns [ Statement lval ]
  : LBRACK sl=statementList RBRACK
    { $lval = buildBlock(loc($start), $sl.lval); }
  ;

emptyStatement
  returns [ Statement lval ]
  : SEMICOLON
    { $lval = buildEmptyStatement(loc($start)); }
  ;

ifStatement
  returns [ Statement lval ]
  : IF LPAREN e=expression RPAREN s1=statement ELSE  s2=statement
    { $lval = buildIfStatement(loc($start), $e.lval, $s1.lval, $s2.lval); }
  | IF LPAREN e=expression RPAREN s=statement
    { $lval = buildIfStatement(loc($start), $e.lval, $s.lval, $s.lval); }
  ;

iterationStatement
  returns [ Statement lval ]
  : WHILE LPAREN e=expression RPAREN s=statement
    { $lval = buildWhileStatement(loc($start), $e.lval, $s.lval); }
  ;

controlStatement
  returns [ Statement lval ]
  : CONTINUE SEMICOLON
    { $lval = buildControlStatement(loc($start), $CONTINUE.text); }
  | BREAK SEMICOLON
    { $lval = buildControlStatement(loc($start), $BREAK.text); }
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
  : r=equalityExpression
    { $lval = $r.lval; }
  | l=leftHandSideExpression EQUAL r=equalityExpression
    { checkAssignmentDestination(loc($start), $l.lval);
      $lval = buildBinaryOperator(loc($start), Binop.ASSIGN,
        $l.lval, $r.lval); }
  ;


equalityExpression
  returns [ Expression lval ]
  : a=relationalExpression
    {$lval = $a.lval; }
  | l=equalityExpression EQUAL EQUAL r=relationalExpression
    {$lval = buildBinaryOperator(loc($start), Binop.EQUALS,
        $l.lval, $r.lval); }
  ;

relationalExpression
  returns [ Expression lval ]
  : a=additiveExpression
    {$lval = $a.lval; }
  | l=relationalExpression LCARET r=additiveExpression
    {$lval = buildBinaryOperator(loc($start), Binop.LESSTHAN,
        $l.lval, $r.lval); }
  | l=relationalExpression RCARET r=additiveExpression
    {$lval = buildBinaryOperator(loc($start), Binop.GREATERTHAN,
        $l.lval, $r.lval); }
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
  : p=unaryExpression
    { $lval = $p.lval; }
  | l=multiplicativeExpression ASTERISK r=unaryExpression
    { $lval = buildBinaryOperator(loc($start), Binop.MULTIPLY,
        $l.lval, $r.lval); }
  | l=multiplicativeExpression RSLASH r=unaryExpression
    { $lval = buildBinaryOperator(loc($start), Binop.DIVIDE,
        $l.lval, $r.lval); }
  ;

unaryExpression
  returns [ Expression lval ]
  : l=leftHandSideExpression
    { $lval = $l.lval; }
  | MINUS e=unaryExpression
    { $lval = buildUnaryOperator(loc($start), Unop.SUB, $e.lval); }
  | EXCLAMATIONPOINT e=unaryExpression
    { $lval = buildUnaryOperator(loc($start), Unop.LNOT, $e.lval); }
  ;

leftHandSideExpression
  returns [ Expression lval ]
  : p=primaryExpression
    { $lval = $p.lval; }
  | l=leftHandSideExpression LSTAPLE e=expression RSTAPLE
    { $lval = buildPropAccess(loc($start), $l.lval, $e.lval); }
  | l=leftHandSideExpression DOT IDENTIFIER
    { $lval = buildPropAccess(loc($start), $l.lval, 
      buildIdentifier(loc($start), $IDENTIFIER.text)); }
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
  | o=objectLiteral
    { $lval = $o.lval; }
  | LPAREN e=expression RPAREN
    { $lval = $e.lval; }
  ;

objectLiteral
  returns [ Expression lval ]
  : LBRACK pl=propertyList RBRACK
    { $lval = buildObjectLiteral(loc($start), $pl.lval); }
  | LBRACK RBRACK
    { $lval = buildObjectLiteral(loc($start), new ArrayList<Expression>()); }
  ;

propertyList
  returns [ List<Expression> lval ]
  : prop=propertyAssignment
    { List<Expression> list = new ArrayList<Expression>();
      list.add($prop.lval);
      $lval = list; }
  | pl=propertyList COMMA p=propertyAssignment
    { $pl.lval.add($p.lval);
      $lval = $pl.lval; }
  ;

propertyAssignment
  returns [ Expression lval ]
  : p=propertyName COLON a=assignmentExpression
    { $lval = buildPropAssignment(loc($start), $p.lval, $a.lval); }
  ;

propertyName
  returns [ Expression lval ]
  : IDENTIFIER
    { $lval = buildIdentifier(loc($start), $IDENTIFIER.text); }
  | STRING_LITERAL
    { $lval = buildStringLiteral(loc($start), $STRING_LITERAL.text); }
  | NUMERIC_LITERAL
    { $lval = buildNumericLiteral(loc($start), $NUMERIC_LITERAL.text); }
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

LPAREN :            [(];
RPAREN :            [)];
LCARET :            [<];
RCARET :            [>];
LBRACK :            [{];
RBRACK :            [}];
LSTAPLE :           '[';
RSTAPLE :           ']';
EXCLAMATIONPOINT :  [!];
SEMICOLON :         [;];
COLON :             [:];
COMMA :             [,];
DOT :               [.];
EQUAL :             [=];
PLUS :              [+];
MINUS :             [-];
ASTERISK :          [*];
RSLASH :            [/];

// keywords start here
PRINT :     'console.log';
VAR :       'var';
TRUE:       'true';
FALSE:      'false';
NULL:       'null';
WHILE:      'while';
IF:         'if';
ELSE:       'else';
CONTINUE:   'continue';
BREAK:      'break';

IDENTIFIER : IdentifierCharacters;

// skip whitespace and comments

WhiteSpace : SpaceTokens+ -> skip;

