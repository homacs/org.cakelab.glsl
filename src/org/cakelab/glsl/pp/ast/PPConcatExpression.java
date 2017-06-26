package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.PrimaryExpression;

public class PPConcatExpression extends PrimaryExpression {

	public PPConcatExpression(Interval interval) {
		super(interval);
	}

	@Override
	public Object eval() {
		return StringConstant.EMPTY;
	}

}
