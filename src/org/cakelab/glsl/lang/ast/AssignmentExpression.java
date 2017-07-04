package org.cakelab.glsl.lang.ast;


import static org.cakelab.glsl.GLSLParser.*;

import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ProcessingException;
import org.cakelab.glsl.lang.Processor;

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
				value = Processor.mul(left.value(), rightOperand.eval().value());
				break;
			case DIV_ASSIGN:
				value = Processor.div(left.value(), rightOperand.eval().value());
				break;
			case MOD_ASSIGN:
				value = Processor.mod(left.value(), rightOperand.eval().value());
				break;
			case ADD_ASSIGN:
				value = Processor.add(left.value(), rightOperand.eval().value());
				break;
			case SUB_ASSIGN:
				value = Processor.sub(left.value(), rightOperand.eval().value());
				break;
			case LEFT_ASSIGN:
				value = Processor.lshift(left.value(), rightOperand.eval().value());
				break;
			case RIGHT_ASSIGN:
				value = Processor.rshift(left.value(), rightOperand.eval().value());
				break;
			case AND_ASSIGN:
				value = Processor.and(left.value(), rightOperand.eval().value());
				break;
			case XOR_ASSIGN:
				value = Processor.xor(left.value(), rightOperand.eval().value());
				break;
			case OR_ASSIGN:
				value = Processor.or(left.value(), rightOperand.eval().value());
				break;
			default:
				throw new Error("internal error: unhandled case in assignment expression");
			}
			Processor.store(left.lvalue(), value);
			return left;
		} catch (ProcessingException e) {
			throw new EvaluationException(this,e);
		}
	}
	

}
