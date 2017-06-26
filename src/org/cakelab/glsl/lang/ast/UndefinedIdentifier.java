package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public class UndefinedIdentifier extends PrimaryExpression implements Identifier {

	protected String text;

	public UndefinedIdentifier(Interval interval, String text) {
		super(interval);
		this.text = text;
	}

	@Override
	public String getName() {
		return text;
	}
	
	public Value eval() {
		return ConstantValue.ZERO;
	}

}
