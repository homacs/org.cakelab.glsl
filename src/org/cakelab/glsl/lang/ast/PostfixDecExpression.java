package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.InstructionProcessor;

public class PostfixDecExpression extends PostfixExpression {

	public PostfixDecExpression(Expression operand, Location end) {
		super(operand, end);
	}


	@Override
	public PrimaryExpression eval() throws EvaluationException {
		PrimaryExpression result = operand.eval();
		Value val = InstructionProcessor.sub(result.value(), ConstantValue.ONE);
		Value tmp = result.value().copy();
		InstructionProcessor.store(result.lvalue(), val);
		return tmp;
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		return operand.evaluateType();
	}


}
