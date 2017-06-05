package org.cakelab.glsl.lang.ast;

public class ConstantExpression extends Expression {

	Expression expr;

	public ConstantExpression(Expression expr) {
		this.expr = expr;
	}

}
