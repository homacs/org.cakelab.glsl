package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.InstructionProcessor;

public class PostfixIncExpression extends PostfixExpression {

	public PostfixIncExpression(Expression operand, Location end) {
		super(operand, end);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		PrimaryExpression result = operand.eval();
		Value val = InstructionProcessor.add(result.value(), ConstantValue.ONE);
		Value tmp = result.value().copy();
		InstructionProcessor.store(result.lvalue(), val);
		return tmp;
	}


}
