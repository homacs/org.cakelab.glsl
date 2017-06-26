package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.Processor;

public class LtExpression extends BinaryExpression {

	public LtExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public Object eval() throws EvaluationException {
		try {
			return Processor.logLt(leftOperand.value(), rightOperand.value());
		} catch (ProcessingException e) {
			throw new EvaluationException(this, e);
		}
	}

}
