package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;

public class FunctionReference extends PrimaryExpression implements Identifier {


	private String name;

	public FunctionReference(Interval interval, String name) {
		super(interval);
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Value value() {
		// TODO implement value of function. Is it a function?
		return null;
	}

	public Function getFunction(Value[] args) {
		throw new Error("not yet implemented");
	}


}
