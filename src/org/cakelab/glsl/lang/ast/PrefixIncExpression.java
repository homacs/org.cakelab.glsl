package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.InstructionProcessor;
import org.cakelab.glsl.lang.ast.types.Type;

public class PrefixIncExpression extends PrefixExpression {

	public PrefixIncExpression(Location start, Expression operand) {
		super(start, operand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		PrimaryExpression result = operand.eval();
		Value val = InstructionProcessor.add(result.value(), ConstantValue.ONE);
		InstructionProcessor.store(result.lvalue(), val);
		return val;
	}
	@Override
	public Type evaluateType() throws EvaluationException {
		return operand.evaluateType();
	}

	@Override
	protected String getPrefixText() {
		return "++";
	}


}
