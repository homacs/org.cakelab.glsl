package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class PostfixIncExpression extends PostfixExpression {

	public PostfixIncExpression(Expression operand, Location end) {
		super(operand, end);
	}

	@Override
	public Object eval() throws EvaluationException {
		Expression result = (Expression) operand.eval();
		Value val = Processor.add(result.value(), ConstantValue.ONE);
		Value tmp = result.value();
		Processor.store(result.lvalue(), val);
		return tmp;
	}


}
