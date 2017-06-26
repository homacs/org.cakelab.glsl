package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class PrefixIncExpression extends PrefixExpression {

	public PrefixIncExpression(Location start, Expression operand) {
		super(start, operand);
	}

	@Override
	public Object eval() throws EvaluationException {
		Expression result = (Expression) operand.eval();
		Value val = Processor.add(result.value(), ConstantValue.ONE);
		Processor.store(result.lvalue(), val);
		return val;
	}

}
