package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;

public abstract class PostfixExpression extends UnaryExpression {

	public PostfixExpression(Expression operand, Location end) {
		super(new Interval(operand.getStart(), end), operand);
	}


}
