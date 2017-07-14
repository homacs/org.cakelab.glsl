package org.cakelab.glsl.pp.ast;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.PrefixExpression;
import org.cakelab.glsl.lang.ast.PrimaryExpression;

/** converts any character sequence (text) into a string.
 * Replaces " and \ with escape sequences.
 * @author homac
 *
 */
public class PPStringifyExpression extends PrefixExpression {

	public PPStringifyExpression(Location start, MacroParameterReference operand) {
		super(start, operand);
	}

	@Override
	public PrimaryExpression eval() throws EvaluationException {
		
		String text = ((MacroParameterReference)operand).getParameter().getValue();
		
		
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
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
