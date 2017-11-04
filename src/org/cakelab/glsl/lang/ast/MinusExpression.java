package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.InstructionProcessor;
import org.cakelab.glsl.lang.ast.types.Type;

public class MinusExpression extends BinaryExpression {

	public MinusExpression(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	
	
	@Override
	public PrimaryExpression eval() throws EvaluationException {
		return InstructionProcessor.sub(leftOperand.eval().value(), rightOperand.eval().value());
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		return leftOperand.evaluateType();
	}



	@Override
	protected String getOperatorText() {
		return "-";
	}


}
