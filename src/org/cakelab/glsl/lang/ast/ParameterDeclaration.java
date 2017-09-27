package org.cakelab.glsl.lang.ast;

public class ParameterDeclaration extends Variable {

	public ParameterDeclaration(IScope scope, Type type, String name) {
		super(null, type, name);
	}

}
