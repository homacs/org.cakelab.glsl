package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.Processor;

public class LogicalNotExpression extends PrefixExpression {

	public LogicalNotExpression(Location start, Expression operand) {
		super(start, operand);
	}

	@Override
	public Object eval() throws EvaluationException {
		return Processor.logNot(operand.value());
	}


}
