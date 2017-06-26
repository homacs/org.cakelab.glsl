package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;

public abstract class PrefixExpression extends UnaryExpression {

	public PrefixExpression(Location start, Expression operand) {
		super(new Interval(start, operand.getEnd()), operand);
	}

}
