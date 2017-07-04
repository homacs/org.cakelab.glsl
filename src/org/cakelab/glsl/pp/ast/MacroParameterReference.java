package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.lang.ast.Value;

public class MacroParameterReference extends PrimaryExpression {
	private MacroParameter param;

	public MacroParameterReference(Interval interval, MacroParameter param) {
		super(interval);
		this.param = param;
	}

	@Override
	public Object eval() {
		return this;
	}

	@Override
	public Value value() {
		// TODO lvalue
		return new StringConstant(this.interval, param.getValue());
	}

	public MacroParameter getParameter() {
		return param;
	}
	
	
	
}
