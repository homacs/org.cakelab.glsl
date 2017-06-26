package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.PrefixExpression;

/** converts any character sequence (text) into a string.
 * Replaces " and \ with escape sequences.
 * @author homac
 *
 */
public class PPStringifyExpression extends PrefixExpression {

	public PPStringifyExpression(Location start, Expression operand) {
		super(start, operand);
	}

	@Override
	public Object eval() throws EvaluationException {
		String text = operand.value().getValue().toString().trim();
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char c = text.charAt(i);
			switch(c) {
			case '\\': 
				if (text.charAt(i+1) == 'u') {
					// leave universal character names as is
					str.append(c);
				} else {
					str.append("\\\\");
				}
				break;
			case '\"':
				str.append("\\\"");
				break;
			default:
				str.append(c);
				break;
			}
		}
		return new StringConstant(this.interval, "\"" + str.toString() + "\"");
	}

}
