package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.Processor;

public class ShiftLeftExpression extends BinaryExpression {

	public ShiftLeftExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}
	
	@Override
	public PrimaryExpression eval() throws EvaluationException {
		try {
			return Processor.lshift(leftOperand.eval().value(), rightOperand.eval().value());
		} catch (ProcessingException e) {
			throw new EvaluationException(this, e);
		}
	}
	

}