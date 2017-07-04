package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class LogicalAndExpression extends BinaryExpression {

	public LogicalAndExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return Processor.logAnd(leftOperand.eval().value(), rightOperand.eval().value());
	}

	
	
}
