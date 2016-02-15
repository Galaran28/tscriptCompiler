
package ts.tree.visit;

import ts.tree.*;
import ts.tree.type.*;

import java.io.PrintWriter;
import java.util.List;

/**
 * Dump an AST to a stream. Uses prefix order with indentation.
 * <p>
 * Using Object for the type parameter but there is really no return type.
 * <p>
 * The "visit" method is overloaded for each tree node type.
 */
public final class Dump extends TreeVisitorBase<Object>
{
  // where to write the dump to
  private PrintWriter writer;

  // current indentation amount
  private int indentation;

  // how much to increment the indentation by at each level
  // using an increment of zero would mean no indentation
  private int increment;

  /** Initiate the dump even to the left margin and set the increment
   *  indentation amount to two spaces.
   *
   *  @param writer where to write the dump to.
   */
  public Dump(final PrintWriter writer)
  {
    this(writer, 0, 2);
  }

  /** Initiate the dump at a specific distance from the left margin and
   *  set the increment indentation amount to a specific value.
   *
   *  @param writer      where to write the dump to.
   *  @param indentation initial indentation amount.
   *  @param increment   increment indentation amount.
   */
  public Dump(final PrintWriter writer, final int indentation,
    final int increment)
  {
    this.writer = writer;
    this.indentation = indentation;
    this.increment = increment;
  }

  // generate a string of spaces for current indentation level
  private void indent()
  {
    for (int i = 0; i < indentation; i++)
    {
      writer.print(" ");
    }
  }

  /** Visit a list of ASTs and dump them in order. Uses a wildcard for
   *  generality: list of Statements, list of Expressions, etc.
   */
  @Override public List<Object> visitEach(final Iterable<?> nodes)
  {
    for (final Object node : nodes)
    {
      visitNode((Tree) node);
    }
    return null;
  }

  /** Dump a unary operator. */
  @Override public Object visit(final UnaryOperator unaryOperator)
  {
    indent();
    writer.println(unaryOperator.getOpString() + " (" +
      unaryOperator.getType() + ") ");
    indentation += increment;
    visitNode(unaryOperator.getExp());
    indentation -= increment;
    return null;
  }

  /** Dump a binary operator. */
  @Override public Object visit(final BinaryOperator binaryOperator)
  {
    indent();
    writer.println(binaryOperator.getOpString() + " (" +
      binaryOperator.getType() + ") ");
    indentation += increment;
    visitNode(binaryOperator.getLeft());
    visitNode(binaryOperator.getRight());
    indentation -= increment;
    return null;
  }

  /** Dump an expression statement. */
  @Override public Object visit(final ExpressionStatement expressionStatement)
  {
    indent();
    writer.println("ExpressionStatement");
    indentation += increment;
    visitNode(expressionStatement.getExp());
    indentation -= increment;
    return null;
  }

  /** Dump an identifier. */
  @Override public Object visit(final Identifier identifier)
  {
    // get the Type from the declaration tree node (if not null)
    VarStatement node = identifier.getVarNode();
    String typeString = null;
    if (node == null)
    {
      typeString = "<var is null>";
    }
    else
    {
      Type type = node.getType();
      if (type == null)
      {
        typeString = "<type is null>";
      }
      else
      {
        typeString = type.toString();
      }
    }

    // is it a lval or a rval?
    String valKind = null;
    if (identifier.isLval())
    {
      valKind = "lval";
    }
    else
    {
      valKind = "rval";
    }

    // also a "local" type in the identifier node itself
    String locTypeString = null;
    Type locType = identifier.getType();
    if (locType == null)
    {
      locTypeString = "<null>";
    }
    else
    {
      locTypeString = locType.toString();
    }

    indent();
    writer.println("Identifier (" + typeString + " " + valKind + ") " +
      identifier.getName() + " " + locTypeString);
    return null;
  }

  /** Dump a numeric literal. */
  @Override public Object visit(final NumericLiteral numericLiteral)
  {
    indent();
    writer.println("NumericLiteral (" + numericLiteral.getType() + ") " +
       numericLiteral.getValue());
    return null;
  }

  /** Dump a boolean literal. */
  @Override public Object visit(final BooleanLiteral booleanLiteral)
  {
    indent();
    writer.println("BooleanLiteral (" + booleanLiteral.getType() + ") " +
       booleanLiteral.getValue());
    return null;
  }

  /** Dump a null literal. */
  @Override public Object visit(final NullLiteral nullLiteral)
  {
    indent();
    writer.println("NullLiteral (" + nullLiteral.getType() + ") " +
       nullLiteral.getValue());
    return null;
  }

  /** Dump a print statement. */
  @Override public Object visit(final PrintStatement printStatement)
  {
    indent();
    writer.println("PrintStatement");
    indentation += increment;
    visitNode(printStatement.getExp());
    indentation -= increment;
    return null;
  }

  /** Dump a program. */
  @Override public Object visit(final Program program)
  {
    indent();
    writer.println("Program");
    indentation += increment;
    visitEach(program.getList());
    indentation -= increment;
    return null;
  }

  /** Dump a string literal. */
  @Override public Object visit(final StringLiteral stringLiteral)
  {
    indent();
    writer.println("StringLiteral (" + stringLiteral.getType() + ") " +
       stringLiteral.getValue());
    return null;
  }

  /** Dump a var statement. */
  @Override public Object visit(final VarStatement varStatement)
  {
    Type type = varStatement.getType();
    String typeStr = null;
    if (type == null)
    {
      typeStr = "<null>";
    }
    else
    {
      typeStr = type.toString();
    }
    String capturedStr = null;
    if (varStatement.isCaptured())
    {
      capturedStr = "captured";
    }
    else
    {
      capturedStr = "not-captured";
    }
    String redundantStr = null;
    if (varStatement.isCaptured())
    {
      redundantStr = "redundant";
    }
    else
    {
      redundantStr = "not-redundant";
    }
    indent();
    writer.println("Var (" +
      typeStr + " " +
      varStatement.getFunctionDepth() + " " +
      varStatement.getTempName() + " " +
      capturedStr + " " +
      redundantStr + ") " +
      varStatement.getName());
    return null;
  }

}

