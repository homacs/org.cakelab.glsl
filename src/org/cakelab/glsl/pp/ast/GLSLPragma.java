package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.pp.tokens.TokenList;

public class GLSLPragma extends Pragma {

	public GLSLPragma(Interval interval, TokenList tokens) {
		super(interval, tokens);
	}

}
