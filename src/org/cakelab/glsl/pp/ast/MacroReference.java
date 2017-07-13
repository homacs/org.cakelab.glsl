package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Identifier;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.lang.ast.Value;

public class MacroReference extends PrimaryExpression implements Identifier, MacroInvocation {

	Macro macro;

	public MacroReference(Interval interval, Macro macro) {
		super(interval);
		this.macro = macro;
	}

	@Override
	public String getName() {
		return macro.name;
	}

	@Override
	public PrimaryExpression eval() {
		return this;
	}

	@Override
	public Value value() throws EvaluationException {
		Value result = macro.call(new Value[0]).value();
		result.setInterval(this.interval);
		return result;
	}

	public Macro getMacro() {
		return macro;
	}

	
}
