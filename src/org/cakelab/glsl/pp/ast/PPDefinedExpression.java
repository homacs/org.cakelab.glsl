package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.PrefixExpression;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.lang.ast.types.Type;

public class PPDefinedExpression extends PrefixExpression {

	public PPDefinedExpression(Location start, Expression operand) {
		super(start, operand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		PrimaryExpression result = operand.eval();
		return result;
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		throw new Error("not supported");
	}


	
}
