package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;

public abstract class BinaryExpression extends Expression {

	protected Expression leftOperand;
	protected Expression rightOperand;

	public BinaryExpression(Expression leftOperand, Expression rightOperand) {
		super(new Interval(leftOperand.getStart(), rightOperand.getEnd()));
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	@Override
	public abstract Object eval() throws EvaluationException;

}
