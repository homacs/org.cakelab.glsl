package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.InstructionProcessor;

public class LogicalAndExpression extends BinaryExpression {

	public LogicalAndExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return InstructionProcessor.logAnd(leftOperand.eval().value(), rightOperand.eval().value());
	}

	
	
}
