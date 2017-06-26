package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.Processor;

public class LeExpression extends BinaryExpression {

	public LeExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public Object eval() throws EvaluationException {
		try {
			return Processor.logLe(leftOperand.value(), rightOperand.value());
		} catch (ProcessingException e) {
			throw new EvaluationException(this, e);
		}
	}

}
