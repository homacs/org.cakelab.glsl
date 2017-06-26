package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;

public class PosExpression extends PrefixExpression {

	public PosExpression(Location start, Expression operand) {
		super(start, operand);
	}
	@Override
	public Object eval() throws EvaluationException {
		return operand.value();
	}


}
