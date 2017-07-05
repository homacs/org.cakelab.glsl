package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Interval;

/** 
 * Represents a sequence of whitespace characters in macro replacement lists.
 * <p>
 * Whitespace is any sequence of:
 * </p>
 * <ul>
 * <li>white space: ' '</li>
 * <li>tab: <code>\t</code></li>
 * <li>line continuation: <code>\\n</code></li>
 * <li>single line comment: <code>// comment</code></li>
 * <li>multi-line comment: <code>/* comment &star;/</code></li>
 * </ul>
 * <p>
 * but not a regular CRLF like '\n'.
 * </p>
 */
public class PPWhitespace extends StringConstant {

	public PPWhitespace(Interval interval, String value) {
		super(interval, value);
	}

}
