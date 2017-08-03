package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class PrefixDecExpression extends PrefixExpression {

	public PrefixDecExpression(Location start, Expression operand) {
		super(start, operand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		PrimaryExpression result = operand.eval();
		Value val = Processor.sub(result.value(), ConstantValue.ONE);
		Processor.store(result.lvalue(), val);
		return val;
	}

}