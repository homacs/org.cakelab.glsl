package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public class VariableReference extends PrimaryExpression implements Identifier {
	// TODO lvalue but not an identifier and it should inherit Value?
	protected Variable variable;

	public VariableReference(Interval interval, Variable variable) {
		super(interval);
		this.variable = variable;
	}

	@Override
	public String getName() {
		return variable.name;
	}

	@Override
	public Value value() {
		return variable.value();
	}

	@Override
	public LValue lvalue() {
		return variable;
	}

	
}
