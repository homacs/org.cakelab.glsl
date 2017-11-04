package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.InstructionProcessor;
import org.cakelab.glsl.lang.ast.types.Type;

public class LogicalAndExpression extends BinaryExpression {

	public LogicalAndExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return InstructionProcessor.logAnd(leftOperand.eval().value(), rightOperand.eval().value());
	}


	@Override
	public Type evaluateType() throws EvaluationException {
		return Type._bool;
	}

	@Override
	protected String getOperatorText() {
		return "&&";
	}

	
}
