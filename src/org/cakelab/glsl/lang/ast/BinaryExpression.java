package org.cakelab.glsl.lang.ast;

public class BinaryExpression extends Expression {

	protected Expression leftOperand;
	protected Expression rightOperand;

	public BinaryExpression(Expression leftOperand, Expression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

}
