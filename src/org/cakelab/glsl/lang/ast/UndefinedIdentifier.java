package org.cakelab.glsl.lang.ast;

public class UndefinedIdentifier extends PrimaryExpression implements Identifier {

	protected String text;

	public UndefinedIdentifier(String text) {
		this.text = text;
	}

	@Override
	public String getName() {
		return text;
	}

}
