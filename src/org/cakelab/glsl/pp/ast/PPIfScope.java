package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.BooleanExpression;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Scope;

public class PPIfScope extends PPGroupScope {

	protected BooleanExpression condition;

	public PPIfScope(Scope parent) {
		super(parent);
	}

	public void setCondition(Expression condition) throws EvaluationException {
		this.condition = new BooleanExpression(condition);
		try {
			Boolean value = this.condition.booleanValue();
			if (value == null) {
				/* undecided: default false */
				visible = false;
			} else {
				visible = value.booleanValue();
			}
		} catch (EvaluationException e) {
			visible = false;
			throw e;
		}
	}

	public void setCondition(Interval interval, boolean condition) {
		this.condition = new BooleanExpression(interval, condition);
		this.visible = condition;
	}

}
