package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;
/**
 * Base class of all expression classes.
 * <p>
 * Instances of Expression establish an expression tree which
 * represents the logical structure of the written expression.
 * Fore example expressions such as <code>a + b * c</code> will be
 * represented by the following tree:
 * </p>
 * <pre>
 *      +
 *     / \
 *    a   *
 *       / \
 *      b   c
 * </pre>
 * <p>
 * Every node in this example expression tree is an expression. 
 * Every operator is represented by a higher level expression
 * with a corresponding name (such as {@link PlusExpression} 
 * and {@link MulExpression}). Those higher level expressions
 * have a reference on their operands which may be a higher 
 * level expression as well, such as the multiplicative 
 * expression as second operand to the additive expression. 
 * But all leafs of the expression tree are primary expressions 
 * (here {@link VariableReference}).
 * </p>
 * <p>
 * Expressions can be evaluated by calling {@link #eval()} which returns
 * the result of that expression as a primary expression. 
 * Evaluating an expression causes the evaluation of the 
 * operands of an expression. Thus, evaluating the root of 
 * an expression causes the evaluation of the entire tree 
 * down to a single primary expression as the result.
 * </p>
 * @author homac
 *
 */
public abstract class Expression extends NodeImpl {
	
	public Expression(Interval interval) {
		super(interval);
	}


	public Expression(Location start, Location end) {
		super(start, end);
	}


	/**
	 * @return result of the expression represented as primary expression
	 * @throws EvaluationException
	 */
	public abstract PrimaryExpression eval() throws EvaluationException;

//	public Value value() throws EvaluationException {
//		// basically: evaluate yourself, and return a value
//		// expression if the result is a primary expression.
//		
//		PrimaryExpression result = eval();
//		// in case the expression returns it self on evaluation
//		// we have to be careful to not run into infinite recursion.
//		if (result == this) {
//			// PrimaryExpression is overriding this method 
//			// Thus, if we got here, then 'this' is not a 
//			// primary expression and definitely not a value.
//			throw new Error("not a value");
//		} else if (result instanceof Expression) {
//			// if evaluation of our expression resulted in a new expression
//			// we can call value() on that expression. This should return
//			// immediately (without further recursions).
//			return ((Expression)result).value();
//		} else {
//			throw new Error("internal error: unhandled expression result");
//		}
//	}
//
//	public LValue lvalue() throws EvaluationException {
//		// if not overridden by subclass, then not an lvalue
//		throw new EvaluationException(this, "not an lvalue");
//	}
//

}
