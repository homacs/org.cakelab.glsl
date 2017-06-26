package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class MulExpression extends BinaryExpression {

	public MulExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}
	
	@Override
	public Object eval() throws EvaluationException {
		return Processor.mul(leftOperand.value(), rightOperand.value());
	}

}
