package org.cakelab.glsl.lang.ast;

public class FunctionReference extends PrimaryExpression implements Identifier {

	protected Function function;

	public FunctionReference(Function function) {
		this.function = function;
	}

	@Override
	public String getName() {
		return function.name;
	}

}
