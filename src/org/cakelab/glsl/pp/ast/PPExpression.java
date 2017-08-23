package org.cakelab.glsl.pp.ast;

import java.util.List;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;
import org.cakelab.glsl.pp.tokens.Token;

public abstract class PPExpression extends NodeImpl {

	public PPExpression(Interval interval) {
		super(interval);
	}

	public abstract void eval(List<Token> appendResultHere) throws EvaluationException;
	
}
