package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.Processor;

public class ModExpression extends BinaryExpression {

	public ModExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public Object eval() throws EvaluationException {
		try {
			return Processor.mod(leftOperand.value(), rightOperand.value());
		} catch (ProcessingException e) {
			throw new EvaluationException(this, e);
		}
	}

}
