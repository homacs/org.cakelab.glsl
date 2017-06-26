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
	public Object eval() throws EvaluationException {
		try {
			Value value;
			switch(operator) {
			case EQUAL:
				value = rightOperand.value();
			case MUL_ASSIGN:
				value = Processor.mul(leftOperand.value(), rightOperand.value());
				break;
			case DIV_ASSIGN:
				value = Processor.div(leftOperand.value(), rightOperand.value());
				break;
			case MOD_ASSIGN:
				value = Processor.mod(leftOperand.value(), rightOperand.value());
				break;
			case ADD_ASSIGN:
				value = Processor.add(leftOperand.value(), rightOperand.value());
				break;
			case SUB_ASSIGN:
				value = Processor.sub(leftOperand.value(), rightOperand.value());
				break;
			case LEFT_ASSIGN:
				value = Processor.lshift(leftOperand.value(), rightOperand.value());
				break;
			case RIGHT_ASSIGN:
				value = Processor.rshift(leftOperand.value(), rightOperand.value());
				break;
			case AND_ASSIGN:
				value = Processor.and(leftOperand.value(), rightOperand.value());
				break;
			case XOR_ASSIGN:
				value = Processor.xor(leftOperand.value(), rightOperand.value());
				break;
			case OR_ASSIGN:
				value = Processor.or(leftOperand.value(), rightOperand.value());
				break;
			default:
				throw new Error("internal error: unhandled case in assignment expression");
			}
			Processor.store(leftOperand.lvalue(), value);
			return value;
		} catch (ProcessingException e) {
			throw new EvaluationException(this,e);
		}
	}
	

}
