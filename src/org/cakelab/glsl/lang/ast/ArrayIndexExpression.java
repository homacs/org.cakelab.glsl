package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Type.Rank;

public class ArrayIndexExpression extends PostfixExpression {
	protected Expression index;

	public ArrayIndexExpression(Expression operand, Expression index) {
		super(operand, index.getEnd());
		this.index = index;
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		// FIXME parser is supposed to do syntax checks (we can provide a validation method here)
		
		Value indexValue = index.eval().value();
		Rank rank = Rank.of(indexValue.type);
		if (rank != Rank.INT && rank != Rank.UINT) {
			throw new Error("syntax: index must be integer");
		}
		
		int i = ((Long)indexValue.value).intValue();
		
		LValue lvalue = operand.eval().lvalue();
		if (lvalue.getType().kind != Type.ARRAY) {
			throw new Error("syntax: not an array");
		} else {
			// Turn VariableReference or ArrayReference into 
			// new ArrayReference on a child element
			return new ArrayElementReference(interval, lvalue.value(), i);
		}
	}

}
