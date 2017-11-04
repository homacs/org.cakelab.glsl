package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.InstructionProcessor;

public class NotExpression extends PrefixExpression {

	public NotExpression(Location start, Expression operand) {
		super(start, operand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		try {
			return InstructionProcessor.not(operand.eval().value());
		} catch (ProcessingException e) {
			throw new EvaluationException(this, e);
		}
	}
	@Override
	public Type evaluateType() throws EvaluationException {
		return Type._int;
	}

	@Override
	protected String getPrefixText() {
		return "~";
	}


	

}
