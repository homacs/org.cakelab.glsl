package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class LogicalXorExpression extends BinaryExpression {

	public LogicalXorExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	
	@Override
	public Object eval() throws EvaluationException {
		return Processor.logXor(leftOperand.value(), rightOperand.value());
	}

}
