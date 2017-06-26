package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;

public abstract class PrimaryExpression extends Expression {

	public PrimaryExpression(Interval interval) {
		super(interval);
	}

	@Override
	public Object eval() throws EvaluationException {
		return this;
	}

}
