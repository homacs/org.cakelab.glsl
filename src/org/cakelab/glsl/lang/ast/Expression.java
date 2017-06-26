package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.impl.NodeImpl;

public abstract class Expression extends NodeImpl {
	
	public Expression(Interval interval) {
		super(interval);
	}


	public Expression(Location start, Location end) {
		super(start, end);
	}


	public abstract Object eval() throws EvaluationException;

	public Value value() throws EvaluationException {
		// basically: evaluate yourself, and return a value
		// expression if the result is a primary expression.
		
		Object result = eval();
		// in case the expression returns it self on evaluation
		// we have to be careful to not run into infinite recursion.
		if (result == this) {
			// PrimaryExpression is overriding this method 
			// Thus, if we got here, then 'this' is not a 
			// primary expression and definitely not a value.
			throw new Error("not a value");
		} else if (result instanceof Expression) {
			// if evaluation of our expression resulted in a new expression
			// we can call value() on that expression. This should return
			// immediately (without further recursions).
			return ((Expression)result).value();
		} else {
			throw new Error("internal error: unhandled expression result");
		}
	}

	public LValue lvalue() throws EvaluationException {
		// if not overridden by subclass, then not an lvalue
		throw new EvaluationException(this, "not an lvalue");
	}


}
