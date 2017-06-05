package org.cakelab.glsl.lang.ast;

public class ConditionalExpression extends Expression {

	protected Expression condition;
	protected Expression caseTrue;
	protected Expression caseFalse;

	public ConditionalExpression(Expression condition, Expression caseTrue, Expression caseFalse) {
		this.condition = condition;
		this.caseTrue = caseTrue;
		this.caseFalse = caseFalse;
	}

}
