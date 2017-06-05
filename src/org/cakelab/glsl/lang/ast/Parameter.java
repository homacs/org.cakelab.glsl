package org.cakelab.glsl.lang.ast;

public class Parameter extends Variable {

	public Parameter(Type type, String name, Qualifier ... qualifiers) {
		super(type, name, qualifiers);
	}

	public Parameter(Type type, String name) {
		super(type, name);
	}

	public Parameter(Type type) {
		super(type);
	}

}
