
package ts.tree.visit;

import ts.tree.*;

/**
 * All visitor classes for ASTs will implement this interface, which
 *   is parameterized by return type.
 *
 */
public interface TreeVisitor<T>
{
  T visit(BinaryOperator binaryOperator);

  T visit(UnaryOperator unaryOperator);

  T visit(ExpressionStatement expressionStatement);

  T visit(Identifier identifier);

  T visit(NumericLiteral numericLiteral);

  T visit(PrintStatement printStatement);

  T visit(Program programStatement);

  T visit(Block blockStatement);

  T visit(EmptyStatement emptyStatement);

  T visit(IfStatement ifStatement);

  T visit(WhileStatement whileStatement);

  T visit(ControlStatement controlStatement);

  T visit(ObjectLiteral object);

  T visit(PropAccess accessor);

  T visit(PropAssignment assignment);

  T visit(NewExpression newExp);

  T visit(StringLiteral stringLiteral);

  T visit(BooleanLiteral booleanLiteral);

  T visit(NullLiteral nullLiteral);

  T visit(VarStatement varStatement);
}

