package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public class FunctionReference extends PrimaryExpression implements Identifier {

	protected Function function;

	public FunctionReference(Interval interval, Function function) {
		super(interval);
		this.function = function;
	}

	@Override
	public String getName() {
		return function.name;
	}

	public Function getFunction() {
		return function;
	}


}
