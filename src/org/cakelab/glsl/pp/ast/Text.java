package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.Array;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Value;

/** Source code text. 
 * Type: <code>char[]</code> */
public class Text extends Value {
	public static final Text EMPTY = new Text(Interval.NONE, "");

	public Text(Interval interval, String value) {
		super(interval, new Array(Type._char, new ConstantValue<Long>(interval, (long) value.length(), true)), value);
	}

	
	public String toString() {
		return value.toString();
	}
}
