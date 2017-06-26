package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class MinusExpression extends BinaryExpression {

	public MinusExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	
	
	@Override
	public Object eval() throws EvaluationException {
		return Processor.sub(leftOperand.value(), rightOperand.value());
	}

	
}
