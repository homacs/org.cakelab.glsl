package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;


public class CallExpression extends PostfixExpression {
	public static final Value[] EMPTY_ARGUMENT_LIST = new Value[0];

	
	
	// TODO [3] should be abstract base of constructor, function, method and macro call
	protected Expression[] arguments;

	public CallExpression(Expression operand, Expression[] arguments, Location end) {
		super(operand, end);
		this.arguments = arguments;
	}
	
	
	protected Value[] evaluateArgs() throws EvaluationException {
		Value[] args = new Value[arguments.length];
		for (int i = 0; i < arguments.length; i++) {
			args[i] = arguments[i].eval().value();
		}
		return args;
	}
	

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		// evaluate arguments to values and execute call
		
		PrimaryExpression addressed = operand.eval();
		Value[] args = evaluateArgs();
		
		// TODO functions, method, macros and constructors have to consider number and type of arguments
		if (addressed instanceof TypeReference) {
			return ((TypeReference)addressed).call(args);
		} else if (addressed instanceof FunctionReference) {
			return ((FunctionReference)addressed).getFunction(args).call(args);
		} else if (addressed instanceof MemberReference) {
			return ((MemberReference)addressed).getMethod(args).call(((MemberReference)addressed).getCompound(), args);
		} else {
			throw new Error("neither a function, method nor constructor call.");
		}
	}

}
