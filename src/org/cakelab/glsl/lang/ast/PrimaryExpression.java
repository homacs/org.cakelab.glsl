package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.impl.ExpressionImpl;

public abstract class PrimaryExpression extends ExpressionImpl {

	public PrimaryExpression(Interval interval) {
		super(interval);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return this;
	}

	public abstract Value value() throws EvaluationException;
	
	public LValue lvalue() throws EvaluationException {
		if (this instanceof LValue) return (LValue)this;
		else throw new EvaluationException(this, "not an lvalue");
	}

}
