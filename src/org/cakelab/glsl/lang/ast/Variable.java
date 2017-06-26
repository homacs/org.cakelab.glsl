package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public class Variable implements LValue {
	Type type;
	String name;
	Value value;
	
	public Variable(Type type, String name, Qualifier ... qualifiers) {
		this(Type._qualified(type, qualifiers), name);
	}

	public Variable(Type type, String name) {
		this(type);
		this.name = name;
		this.value = new Value(Interval.NONE, type, null);
	}

	protected Variable(Type type) {
		this.type = type;
	}

	public Value value() {
		return value;
	}

	public Type getType() {
		return type;
	}

	public void value(Value newValue) {
		value = newValue;
	}

}
