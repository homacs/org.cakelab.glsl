package org.cakelab.glsl.pp.ast;

import java.util.List;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.tokens.TStringLiteral;
import org.cakelab.glsl.pp.tokens.Token;

/** converts any character sequence (text) into a string.
 * Replaces " and \ with escape sequences.
 * @author homac
 *
 */
public class PPStringifyExpression extends PPExpression {

	private MacroParameterReference operand;

	public PPStringifyExpression(Interval interval, MacroParameterReference operand) {
		super(interval);
		this.operand = operand;
	}

	public void eval(List<Token> appendHere) throws EvaluationException {
		
		String text = toString(operand.getParameter().getValue());
		
		
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
			case '"':
				str.append("\\\"");
				break;
			default:
				str.append(c);
				break;
			}
		}
		appendHere.add(new TStringLiteral(this.interval, "\"" + str.toString() + "\""));
	}

	private String toString(List<Token> value) {
		StringBuffer string = new StringBuffer();
		for (Token t : value) {
			string.append(t.getText());
		}
		return string.toString();
	}

	public Node getOperand() {
		return operand;
	}

	public String toString() {
		return "#";
	}
}
