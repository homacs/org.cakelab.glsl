package org.cakelab.glsl.lang.ast;

public class UnaryExpression extends Expression {
	protected Expression operand;

	public UnaryExpression(Expression operand) {
		this.operand = operand;
		
	}
}
