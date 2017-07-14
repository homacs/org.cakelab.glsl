package org.cakelab.glsl.lang.ast.impl;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.LValue;
import org.cakelab.glsl.lang.ast.MulExpression;
import org.cakelab.glsl.lang.ast.PlusExpression;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.lang.ast.VariableReference;

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
 * down to a single {@link PrimaryExpression} as the result.
 * The primary expression then provides methods to access 
 * aspects like its value or storage location (see {@link LValue}).
 * </p>
 * 
 * @author homac
 *
 */
public abstract class ExpressionImpl extends NodeImpl implements Expression {
	
	public ExpressionImpl(Interval interval) {
		super(interval);
	}


	public ExpressionImpl(Location start, Location end) {
		super(start, end);
	}


}
