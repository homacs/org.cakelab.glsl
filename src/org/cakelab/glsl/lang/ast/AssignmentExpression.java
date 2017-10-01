package org.cakelab.glsl.lang.ast;


import static org.cakelab.glsl.GLSLParser.*;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.ast.types.Type;
import org.cakelab.glsl.lang.InstructionProcessor;

public class AssignmentExpression extends BinaryExpression {

	private int operator;

	public AssignmentExpression(Expression leftOperand, int operator, Expression rightOperand) {
		super(leftOperand, rightOperand);
		this.operator = operator;
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		try {
			Value value;
			PrimaryExpression left = leftOperand.eval();
			switch(operator) {
			case EQUAL:
				value = rightOperand.eval().value();
			case MUL_ASSIGN:
				value = InstructionProcessor.mul(left.value(), rightOperand.eval().value());
				break;
			case DIV_ASSIGN:
				value = InstructionProcessor.div(left.value(), rightOperand.eval().value());
				break;
			case MOD_ASSIGN:
				value = InstructionProcessor.mod(left.value(), rightOperand.eval().value());
				break;
			case ADD_ASSIGN:
				value = InstructionProcessor.add(left.value(), rightOperand.eval().value());
				break;
			case SUB_ASSIGN:
				value = InstructionProcessor.sub(left.value(), rightOperand.eval().value());
				break;
			case LEFT_ASSIGN:
				value = InstructionProcessor.lshift(left.value(), rightOperand.eval().value());
				break;
			case RIGHT_ASSIGN:
				value = InstructionProcessor.rshift(left.value(), rightOperand.eval().value());
				break;
			case AND_ASSIGN:
				value = InstructionProcessor.and(left.value(), rightOperand.eval().value());
				break;
			case XOR_ASSIGN:
				value = InstructionProcessor.xor(left.value(), rightOperand.eval().value());
				break;
			case OR_ASSIGN:
				value = InstructionProcessor.or(left.value(), rightOperand.eval().value());
				break;
			default:
				throw new Error("internal error: unhandled case in assignment expression");
			}
			InstructionProcessor.store(left.lvalue(), value);
			return left;
		} catch (ProcessingException e) {
			throw new EvaluationException(this,e);
		}
	}

	@Override
	public Type evaluateType() throws EvaluationException {
		Type targetType = leftOperand.evaluateType();
		return targetType;
	}
	

}
