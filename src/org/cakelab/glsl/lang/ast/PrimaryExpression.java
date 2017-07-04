package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;

public abstract class PrimaryExpression extends Expression {

	public PrimaryExpression(Interval interval) {
		super(interval);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return this;
	}

	public abstract Value value() throws EvaluationException;
	
	public LValue lvalue() throws EvaluationException {
		throw new EvaluationException(this, "not an lvalue");
	}

}
