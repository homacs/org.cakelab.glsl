package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class PostfixDecExpression extends PostfixExpression {

	public PostfixDecExpression(Expression operand, Location end) {
		super(operand, end);
	}


	@Override
	public PrimaryExpression eval() throws EvaluationException {
		PrimaryExpression result = operand.eval();
		Value val = Processor.sub(result.value(), ConstantValue.ONE);
		Value tmp = result.value().copy();
		Processor.store(result.lvalue(), val);
		return tmp;
	}

}