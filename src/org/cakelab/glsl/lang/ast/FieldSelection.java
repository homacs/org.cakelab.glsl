package org.cakelab.glsl.lang.ast;

public class FieldSelection extends PostfixExpression {

	protected String identifier;

	public FieldSelection(Expression operand, String identifier) {
		super(operand);
		this.identifier = identifier;
	}

}
