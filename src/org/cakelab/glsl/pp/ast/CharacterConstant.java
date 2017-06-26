package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Value;

/**
 * A single character: const int
 * 
 * 
 * @author homac
 *
 */
public class CharacterConstant extends Value {

	public static final Type TYPE = Type._int;

	public CharacterConstant(Interval interval, Character value) {
		super(interval, Type._int, value);
	}

}
