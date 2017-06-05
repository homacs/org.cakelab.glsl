package org.cakelab.glsl.lang.ast;

public class Value extends PrimaryExpression {
	Type type;
	Object value;
	public Value(Type type, Object value) {
		this.type = type;
	}
}
