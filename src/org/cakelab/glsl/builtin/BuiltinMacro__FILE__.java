package org.cakelab.glsl.builtin;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.MacroInvocation;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.TokenList;


public class BuiltinMacro__FILE__ extends Macro {
	public BuiltinMacro__FILE__() {
		super("__FILE__", Interval.NONE);
	}

	@Override
	public TokenList call(MacroInvocation invocation, TokenList[] args) throws EvaluationException {
		TokenList result = new TokenList();
		// TODO: when supporting GL_ARB_shading_language_include properly __FILE__ needs change:
		//      return Source Identifier for all source strings
		//      return Path for all #included sources
		result.add(new TNumber(invocation.getInterval(), invocation.getStart().getSourceIdentifier()));
		return result;
	}

}
