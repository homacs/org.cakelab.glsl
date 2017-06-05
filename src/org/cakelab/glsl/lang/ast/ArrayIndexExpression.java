package org.cakelab.glsl.lang.ast;

public class ArrayIndexExpression extends PostfixExpression {

	protected Expression index;

	public ArrayIndexExpression(Expression operand, Expression index) {
		super(operand);
		this.index = index;
	}

}
