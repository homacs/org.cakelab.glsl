package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.ast.types.Type.Rank;

public class ArrayIndexExpression extends PostfixExpression {
	protected Expression index;

	public ArrayIndexExpression(Expression operand, Expression index) {
		super(operand, index.getEnd());
		this.index = index;
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		
		Value indexValue = index.eval().value();
		Rank rank = Rank.of(indexValue.type);
		if (rank != Rank.INT && rank != Rank.UINT) {
			throw new EvaluationException(index, "index must evaluate to an integer value");
		}
		
		int i = ((Long)indexValue.value).intValue();
		
		LValue lvalue = operand.eval().lvalue();
		if (lvalue.getType().getKind() != Type.KIND_ARRAY) {
			throw new Error("syntax: not an array");
		} else {
			// Turn VariableReference or ArrayReference into 
			// new ArrayReference on a child element
			return new ArrayElementReference(interval, lvalue.value(), i);
		}
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		return Type._int;
	}

}
