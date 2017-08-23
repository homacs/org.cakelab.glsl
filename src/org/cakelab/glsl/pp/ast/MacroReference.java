package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Identifier;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;
import org.cakelab.glsl.pp.tokens.TokenList;

public class MacroReference extends NodeImpl implements Identifier, MacroInvocation {

	Macro macro;

	public MacroReference(Interval interval, Macro macro) {
		super(interval);
		this.macro = macro;
	}

	@Override
	public String getName() {
		return macro.name;
	}

	public Macro getMacro() {
		return macro;
	}

	@Override
	public TokenList eval() throws EvaluationException {
		return macro.call(this, null);
	}

	
}
