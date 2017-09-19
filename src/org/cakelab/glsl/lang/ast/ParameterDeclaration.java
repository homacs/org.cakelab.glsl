package org.cakelab.glsl.lang.ast;

public class ParameterDeclaration extends Variable {

	public ParameterDeclaration(Type type, String name, Qualifiers qualifiers) {
		super(type, name, qualifiers);
	}

	public ParameterDeclaration(Type type, String name) {
		super(type, name);
	}

	public ParameterDeclaration(Type type) {
		super(type);
	}

}
