package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.lang.ast.types.Array;
import org.cakelab.glsl.lang.ast.types.Type;

/** String constant: const char[] */
public class StringConstant extends ConstantValue<String> {
	public static final StringConstant EMPTY = new StringConstant(Interval.NONE, "", "\"\"");
	private String text;

	public StringConstant(Interval interval, String value, String text) {
		super(interval, new Array(Interval.NONE, Type._char, new ConstantValue<Long>(interval, (long) value.length(), false)), value);
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
