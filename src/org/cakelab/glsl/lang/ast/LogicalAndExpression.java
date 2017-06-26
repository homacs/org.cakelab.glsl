package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class LogicalAndExpression extends BinaryExpression {

	public LogicalAndExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object eval() throws EvaluationException {
		return Processor.logAnd(leftOperand.value(), rightOperand.value());
	}

	
	
}
