package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;

/**
 * Storage location actually.
 * <p>
 * This is an interface implemented by all primary expressions 
 * which support assignment of a value.
 * </p>
 * @author homac
 *
 */
public interface LValue {

	Value value();

	Type getType();

	void value(Value value) throws EvaluationException;
	void setValue(Object value) throws EvaluationException;
	
	LValue lvalue() throws EvaluationException;

}
