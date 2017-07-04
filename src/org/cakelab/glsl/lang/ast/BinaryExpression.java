package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public abstract class BinaryExpression extends Expression {

	protected Expression leftOperand;
	protected Expression rightOperand;

	public BinaryExpression(Interval interval, Expression leftOperand, Expression rightOperand) {
		super(interval);
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	public BinaryExpression(Expression leftOperand, Expression rightOperand) {
		this(new Interval(leftOperand.getStart(), rightOperand.getEnd()), leftOperand, rightOperand);
	}


}
