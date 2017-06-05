package org.cakelab.glsl.lang.ast;

public class CallExpression extends PostfixExpression {

	protected CallArguments arguments;

	public CallExpression(Expression operand, CallArguments arguments) {
		super(operand);
		this.arguments = arguments;
	}

}
