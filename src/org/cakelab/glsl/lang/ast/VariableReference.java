package org.cakelab.glsl.lang.ast;

public class VariableReference extends PrimaryExpression implements Identifier {

	private Variable variable;

	public VariableReference(Variable variable) {
		this.variable = variable;
	}

	@Override
	public String getName() {
		return variable.name;
	}

}
