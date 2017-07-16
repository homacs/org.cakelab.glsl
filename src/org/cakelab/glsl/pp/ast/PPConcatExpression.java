package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.BinaryExpression;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.PrimaryExpression;
import org.cakelab.glsl.lang.ast.Value;

public class PPConcatExpression extends BinaryExpression {

	public PPConcatExpression(Interval interval, Expression left, Expression right) {
		super(interval, left, right);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return new Text(this.interval, leftOperand.eval().value().getValue().toString() + rightOperand.eval().value().getValue().toString());
	}

	public Value value() throws EvaluationException {
		return eval().value();
	}
	
}
