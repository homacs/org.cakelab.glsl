package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.SymbolTable;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Struct.Constructor;
import org.cakelab.glsl.lang.ast.Struct.Method;
import org.cakelab.glsl.pp.error.ExpressionError;


public class CallExpression extends PostfixExpression {
	public static final Value[] EMPTY_ARGUMENT_LIST = new Value[0];
	
	
	// TODO [3] should be abstract base of constructor, function, method and macro call
	protected Expression[] arguments;
	protected Type[] argumentTypes;
	protected Function function;

	public CallExpression(Expression operand, Expression[] arguments, Location end) {
		super(operand, end);
		this.arguments = arguments;
	}
	
	
	public Function resolve(SymbolTable symbolTable) throws EvaluationException {
		try {
			this.argumentTypes = new Type[arguments.length];
			for (int i = 0; i < arguments.length; i++) {
				argumentTypes[i] = arguments[i].evaluateType();
			}
			PrimaryExpression addressed = operand.eval();
			// TODO functions, method, macros and constructors have to consider number and type of arguments
			if (addressed instanceof TypeReference) {
				function = ((TypeReference)addressed).getType().getConstructor(argumentTypes);
			} else if (addressed instanceof FunctionReference) {
				function = symbolTable.getFunction(((FunctionReference)addressed).getName(), argumentTypes);
			} else if (addressed instanceof MemberReference) {
				MemberReference ref = (MemberReference)addressed;
				function = ref.getMember().getType().getMethod(argumentTypes);
			} else {
				throw new Error("neither a function, method nor constructor call.");
			}

		} catch (EvaluationException e) {
			this.argumentTypes = null;
			throw e;
		}
		return function;
			
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
		
		if (function == null) {
			return new ExpressionError(interval, "cannot resolve referenced function, method or constructor");
		}
		
		// evaluate operand down to primary expression
		
		Value[] args = evaluateArgs();
		
		if (function instanceof Method) {
			Method method = (Method)function;
			// get this pointer
			PrimaryExpression addressed = operand.eval();
			Value _this = ((MemberReference)addressed).getCompound();
			return method.call(_this, args);
		} else if (function instanceof Constructor) {
			return function.call(args);
		} else if (function instanceof Function) {
			return function.call(args);
		} else {
			throw new Error("internal error: unhandled reference type " + function.getClass().getSimpleName());
		}
	}


	@Override
	public Type evaluateType() throws EvaluationException {
		return function.type;
	}
	
	
}
