package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.Processor;

public class XorExpression extends BinaryExpression {

	public XorExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}


	@Override
	public PrimaryExpression eval() throws EvaluationException {
		try {
			return Processor.xor(leftOperand.eval().value(), rightOperand.eval().value());
		} catch (ProcessingException e) {
			throw new EvaluationException(this, e);
		}
	}
	
}
