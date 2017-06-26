package org.cakelab.glsl.lang.ast;


/**
 * Storage location actually.
 * @author homac
 *
 */
public interface LValue {

	Value value();

	Type getType();

	void value(Value value);

}
