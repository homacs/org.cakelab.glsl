package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Array;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Value;

/** String constant: const int[] */
public class Text extends Value {
	public static final Text EMPTY = new Text(Interval.NONE, "");

	public Text(Interval interval, String value) {
		super(interval, new Array(Type._int, new ConstantValue<Long>(interval, (long) value.length(), true)), value);
	}

	
	public String toString() {
		return value.toString();
	}
}
