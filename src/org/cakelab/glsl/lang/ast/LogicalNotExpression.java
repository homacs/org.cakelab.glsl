package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.InstructionProcessor;
import org.cakelab.glsl.lang.ast.types.Type;

public class LogicalNotExpression extends PrefixExpression {

	public LogicalNotExpression(Location start, Expression operand) {
		super(start, operand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return InstructionProcessor.logNot(operand.eval().value());
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		return Type._bool;
	}

	@Override
	protected String getPrefixText() {
		return "!";
	}


}
