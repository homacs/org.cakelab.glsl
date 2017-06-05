package org.cakelab.glsl.lang.ast;

public class AssignmentExpression extends BinaryExpression {

	public AssignmentExpression(Expression leftOperand, int operator, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

}
