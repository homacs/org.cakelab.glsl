package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public abstract class UnaryExpression extends Expression {
	protected Expression operand;

	public UnaryExpression(Interval interval, Expression operand) {
		super(interval);
		this.operand = operand;
		
	}

}
