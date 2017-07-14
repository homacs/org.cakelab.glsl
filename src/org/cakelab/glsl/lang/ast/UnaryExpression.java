package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.impl.ExpressionImpl;

public abstract class UnaryExpression extends ExpressionImpl {
	protected Expression operand;

	public UnaryExpression(Interval interval, Expression operand) {
		super(interval);
		this.operand = operand;
	}
	
	public Expression getOperand() {
		return operand;
	}

}
