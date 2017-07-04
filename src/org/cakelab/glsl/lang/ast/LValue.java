package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.lang.EvaluationException;

/**
 * Storage location actually.
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
