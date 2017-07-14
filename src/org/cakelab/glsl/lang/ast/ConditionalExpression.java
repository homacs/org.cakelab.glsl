package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.impl.ExpressionImpl;

public class ConditionalExpression extends ExpressionImpl {

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
	public PrimaryExpression eval() throws EvaluationException {
		Boolean cond = new BooleanExpression(condition).booleanValue();
		return cond ? caseTrue.eval() : caseFalse.eval();
	}

}
