package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.types.Type;

/**
 * <pre>
 * 	+ <em>primary</em>
 * </pre>
 * @author homac
 *
 */
public class PosExpression extends PrefixExpression {

	public PosExpression(Location start, Expression operand) {
		super(start, operand);
	}
	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return operand.eval();
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		return operand.evaluateType();
	}


}
