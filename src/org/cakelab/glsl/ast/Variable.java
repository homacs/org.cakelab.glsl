package org.cakelab.glsl.ast;

public class Variable {
	Type type;
	String name;
	
	public Variable(Type type, String name, Qualifier ... qualifiers) {
		this.type = Type._qualified(type, qualifiers);
		this.name = name;
	}

	public Variable(Type type, String name) {
		this.type = type;
		this.name = name;
	}

	protected Variable(Type type) {
		this.type = type;
	}

}
