package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.InstructionProcessor;

public class ShiftLeftExpression extends BinaryExpression {

	public ShiftLeftExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}
	
	@Override
	public PrimaryExpression eval() throws EvaluationException {
		try {
			return InstructionProcessor.lshift(leftOperand.eval().value(), rightOperand.eval().value());
		} catch (ProcessingException e) {
			throw new EvaluationException(this, e);
		}
	}
	
	@Override
	public Type evaluateType() throws EvaluationException {
		return Type._int;
	}

	@Override
	protected String getOperatorText() {
		return "<<";
	}


}
