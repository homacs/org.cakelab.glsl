package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.tokens.TokenList;

public interface MacroInvocation extends Node {

	Macro getMacro();

	public TokenList eval() throws EvaluationException;
}
