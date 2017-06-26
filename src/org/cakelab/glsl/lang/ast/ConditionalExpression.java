package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;

public class ConditionalExpression extends Expression {

	protected Expression condition;
	protected Expression caseTrue;
	protected Expression caseFalse;

	public ConditionalExpression(Expression condition, Expression caseTrue, Expression caseFalse) {
		super(new Interval(condition.getStart(), caseFalse.getEnd()));
		this.condition = condition;
		this.caseTrue = caseTrue;
		this.caseFalse = caseFalse;
	}

	@Override
	public Object eval() throws EvaluationException {
		Boolean cond = new BooleanExpression(condition).booleanValue();
		return cond ? caseTrue.eval() : caseFalse.eval();
	}

}
