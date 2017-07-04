package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.BinaryExpression;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Value;

public class PPConcatExpression extends BinaryExpression {

	public PPConcatExpression(Interval interval, Expression left, Expression right) {
		super(interval, left, right);
	}

	@Override
	public Object eval() {
		return this;
	}

	public Value value() throws EvaluationException {
		return new StringConstant(this.interval, leftOperand.value().getValue().toString() + rightOperand.value().getValue().toString());
	}
	
}
