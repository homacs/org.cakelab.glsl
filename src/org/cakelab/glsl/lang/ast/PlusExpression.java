package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.InstructionProcessor;
import org.cakelab.glsl.lang.ast.types.Type;

public class PlusExpression extends BinaryExpression {

	public PlusExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return InstructionProcessor.add(leftOperand.eval().value(), rightOperand.eval().value());
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		return leftOperand.evaluateType();
	}

}
