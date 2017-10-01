package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.ast.types.Type;

public class ParameterDeclaration extends Variable {

	public static final ParameterDeclaration[] VOID_PARAM_LIST = new ParameterDeclaration[0];

	public ParameterDeclaration(IScope scope, Type type, String name) {
		super(null, type, name);
	}

}
