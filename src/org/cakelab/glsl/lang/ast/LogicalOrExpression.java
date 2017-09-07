package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.InstructionProcessor;

public class LogicalOrExpression extends BinaryExpression {

	public LogicalOrExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}
	
	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return InstructionProcessor.logOr(leftOperand.eval().value(), rightOperand.eval().value());
	}



}
