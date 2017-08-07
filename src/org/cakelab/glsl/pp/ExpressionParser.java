package org.cakelab.glsl.pp;

import java.util.ArrayList;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.ParserErrorHandler;
import org.cakelab.glsl.lang.ast.AndExpression;
import org.cakelab.glsl.lang.ast.ConditionalExpression;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.lang.ast.DivExpression;
import org.cakelab.glsl.lang.ast.EqExpression;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.ExpressionList;
import org.cakelab.glsl.lang.ast.GeExpression;
import org.cakelab.glsl.lang.ast.GtExpression;
import org.cakelab.glsl.lang.ast.LeExpression;
import org.cakelab.glsl.lang.ast.LogicalAndExpression;
import org.cakelab.glsl.lang.ast.LogicalNotExpression;
import org.cakelab.glsl.lang.ast.LogicalOrExpression;
import org.cakelab.glsl.lang.ast.LogicalXorExpression;
import org.cakelab.glsl.lang.ast.LtExpression;
import org.cakelab.glsl.lang.ast.MinusExpression;
import org.cakelab.glsl.lang.ast.ModExpression;
import org.cakelab.glsl.lang.ast.MulExpression;
import org.cakelab.glsl.lang.ast.NeExpression;
import org.cakelab.glsl.lang.ast.NegExpression;
import org.cakelab.glsl.lang.ast.NotExpression;
import org.cakelab.glsl.lang.ast.OrExpression;
import org.cakelab.glsl.lang.ast.PPUndefinedIdentifier;
import org.cakelab.glsl.lang.ast.PlusExpression;
import org.cakelab.glsl.lang.ast.PosExpression;
import org.cakelab.glsl.lang.ast.ShiftLeftExpression;
import org.cakelab.glsl.lang.ast.ShiftRightExpression;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Type.Rank;
import org.cakelab.glsl.lang.ast.Value;
import org.cakelab.glsl.lang.ast.XorExpression;
import org.cakelab.glsl.pp.ast.PPDefinedExpression;
import org.cakelab.glsl.pp.ast.StringConstant;

public class ExpressionParser extends Parser {
	// TODO [1] managing macro expansion locations (especially with overlapping macro invocations through rescan)
	
	public ExpressionParser(Lexer lexer, ParserErrorHandler errorHandler) {
		this.lexer = lexer;
		super.setErrorHandler(errorHandler);
	}

	
	public void parse() {
		expression();
	}
	
	
	
	/**
	 * A single expression or a list of expressions separated by commas.
	 * Evaluation of the last expression in the list gives the result value.
	 */
	public Expression expression() {
		while(WHITESPACE());
		Expression expr = conditional_expression(null);
		if (expr == null) {
			// syntax error
		} else {
			while(WHITESPACE());
			if (optional(',')) {
				ArrayList<Expression> list = new ArrayList<Expression>();
				list.add(expr);
				do {
					Location commaLocation = lexer.location();
					while(WHITESPACE());
					Expression next = conditional_expression(null);
					if (next != null) {
						list.add(next);
					} else {
						list.add(expressionError(commaLocation, "missing expression after ,"));
					}
				} while(optional(','));
				expr = new ExpressionList(list);
			}
		}
		return expr;
	}

	public Expression conditional_expression(Expression operand1) {
		if(operand1 == null) operand1 = logical_or_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());
			if (optional('?')) {
				while(WHITESPACE());
				Expression operand2 = expression();
				if (operand2 != null) {
					while(WHITESPACE());
					if (mandatory(':')) {
						Expression operand3 = expression();
						if (operand3 != null) {
							return conditional_expression(new ConditionalExpression(operand1, operand2, operand3));
						} else {
							return expressionError("missing third operand to conditional expression after :");
						}
					}
				} else {
					return expressionError("missing second operand to contional operator ? ");
				}
			} else {
				return operand1;
			}
			
		}
		return null;
	}

	
	public Expression logical_or_expression(Expression operand1) {
		if(operand1 == null) operand1 = logical_xor_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());
			String operator = "||";
			if (optional(operator)) {
				while(WHITESPACE());
				Expression operand2 = logical_xor_expression(null);
				if (operand2 != null) {
					return logical_or_expression(new LogicalOrExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator " + operator);
				}
			} else {
				return operand1;
			}
			
		}
		return null;

	}

	public Expression logical_xor_expression(Expression operand1) {
		if(operand1 == null) operand1 = logical_and_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());
			String operator = "^^";
			if (optional(operator)) {
				while(WHITESPACE());
				Expression operand2 = logical_and_expression(null);
				if (operand2 != null) {
					return logical_xor_expression(new LogicalXorExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator " + operator);
				}
			} else {
				return operand1;
			}
			
		}
		return null;

	}

	public Expression logical_and_expression(Expression operand1) {
		if(operand1 == null) operand1 = or_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());

			if (optional("&&")) {
				while(WHITESPACE());
				Expression operand2 = or_expression(null);
				if (operand2 != null) {
					return logical_and_expression(new LogicalAndExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator &&");
				}
			} else {
				return operand1;
			}
			
		}
		return null;

	}
	
	public Expression or_expression(Expression operand1) {
		if(operand1 == null) operand1 = xor_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());
			if (LA_equals("||")) {
				return operand1;
			} else if (optional('|')) {
				while(WHITESPACE());
				Expression operand2 = xor_expression(null);
				if (operand2 != null) {
					return or_expression(new OrExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator |");
				}
			} else {
				return operand1;
			}
			
		}
		return null;

	}
	
	public Expression xor_expression(Expression operand1) {
		if(operand1 == null) operand1 = and_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());

			if (LA_equals("^^")) {
				return operand1;
			} else if (optional('^')) {
				while(WHITESPACE());
				Expression operand2 = and_expression(null);
				if (operand2 != null) {
					return xor_expression(new XorExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator ^");
				}
			} else {
				return operand1;
			}
			
		}
		return null;

	}
	
	
	public Expression and_expression(Expression operand1) {
		if(operand1 == null) operand1 = equality_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());
			if (LA_equals("&&")) {
				return operand1;
			} else if (optional('&')) {
				while(WHITESPACE());
				Expression operand2 = equality_expression(null);
				if (operand2 != null) {
					return and_expression(new AndExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator &");
				}
			} else {
				return operand1;
			}
			
		}
		return null;
	}
	
	
	public Expression equality_expression(Expression operand1) {
		if(operand1 == null) operand1 = relational_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());

			if (optional("==")) {
				while(WHITESPACE());
				Expression operand2 = relational_expression(null);
				if (operand2 != null) {
					return equality_expression(new EqExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator ==");
				}
			} else if (optional("!=")) {
				while(WHITESPACE());
				Expression operand2 = relational_expression(null);
				if (operand2 != null) {
					return equality_expression(new NeExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator !=");
				}
			} else {
				return operand1;
			}
			
		}
		return null;
		
	}
	
	
	public Expression relational_expression(Expression operand1) {
		if(operand1 == null) operand1 = shift_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());
			if (optional("<=")) {
				while(WHITESPACE());
				Expression operand2 = shift_expression(null);
				if (operand2 != null) {
					return relational_expression(new LeExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator <=");
				}
			} else if (optional(">=")) {
				while(WHITESPACE());
				Expression operand2 = shift_expression(null);
				if (operand2 != null) {
					return relational_expression(new GeExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator >=");
				}
			} else if (optional("<")) {
				while(WHITESPACE());
				Expression operand2 = shift_expression(null);
				if (operand2 != null) {
					return relational_expression(new LtExpression(operand1, operand2));
				} else {
					syntaxError("missing second operand to operator <");
				}
			} else if (optional(">")) {
				while(WHITESPACE());
				Expression operand2 = shift_expression(null);
				if (operand2 != null) {
					return relational_expression(new GtExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator >");
				}
			} else {
				return operand1;
			}
		}
		return null;
		
	}
	
	
	public Expression shift_expression(Expression operand1) {
		if(operand1 == null) operand1 = additive_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());
			if (optional("<<")) {
				while(WHITESPACE());
				Expression operand2 = additive_expression(null);
				if (operand2 != null) {
					return shift_expression(new ShiftLeftExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator <<");
				}
			} else if (optional(">>")) {
				while(WHITESPACE());
				Expression operand2 = additive_expression(null);
				if (operand2 != null) {
					return shift_expression(new ShiftRightExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator >>");
				}
			} else {
				return operand1;
			}
		}
		return null;
	}	

	public Expression additive_expression(Expression operand1) {
		if (operand1 == null) operand1 = multiplicative_expression(null);
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());
			if (TOKEN("+-")) {
				int op = last.TOKEN();
				while(WHITESPACE());
				Expression operand2 = multiplicative_expression(null);
				Expression add = null;
				if (operand2 != null) {
					switch(op) {
					case '+': add = new PlusExpression(operand1, operand2); break;
					case '-': add = new MinusExpression(operand1, operand2); break;
					default: throw new Error("internal error: unhandled multiplicative operator " + (char)last.TOKEN());
					}
					return additive_expression(add);
				} else {
					return expressionError("missing second operand to operator " + (char)last.TOKEN());
				}
			} else {
				return operand1;
			}
		}
		return null;
	}
	
	public Expression multiplicative_expression(Expression operand1) {
		if (operand1 == null) operand1 = unary_expression();
		if (operand1 == null) {
			// syntax error already reported
		} else {
			while(WHITESPACE());
			if (TOKEN("*/%")) {
				int operator = last.TOKEN();
				while(WHITESPACE());
				Expression operand2 = unary_expression();
				if (operand2 != null) {
					Expression mul = null;
					switch(operator) {
					case '*': mul = new MulExpression(operand1, operand2); break;
					case '/': mul =  new DivExpression(operand1, operand2); break;
					case '%': mul =  new ModExpression(operand1, operand2); break;
					default: throw new Error("internal error: unhandled multiplicative operator " + (char)last.TOKEN());
					}
					return multiplicative_expression(mul);
				} else {
					return expressionError("missing second operand to operand " + (char)last.TOKEN());
				}
			} else {
				return operand1;
			}
		}
		return null;
	}	
	
	public Expression unary_expression() {
		Expression primary;
		while(WHITESPACE());
		Location mark = lexer.location();
		if (LA_equals("!=")) {
			return null;
		} else if (TOKEN("+-!~")) {
			int op = last.TOKEN();
			if (null == (primary = unary_expression())) {
				return expressionError("missing expression after unary operator '" + (char)last.TOKEN() + "'");
			}
			switch(op) {
			case '+': return new PosExpression(mark, primary);
			case '-': return new NegExpression(mark, primary);
			case '!': return new LogicalNotExpression(mark, primary);
			case '~': return new NotExpression(mark, primary);
			default: throw new Error("internal error: unhandled unary operator " + (char)last.TOKEN());
			}
		} else if(optional("defined")) {
			if (null != (primary = unary_expression())) {
				return new PPDefinedExpression(mark, primary);
			} else {
				return expressionError("missing expression after unary operator 'defined'");
			}
		} else {
			return primary_expression();
		}
	}
	
	
	public Expression primary_expression() {
		while(WHITESPACE());
		Expression expr = number();
		if (expr != null) {
			Value v = (Value)expr;
			Rank rank = Type.Rank.of(v.getType());
			switch(rank) {
			case BOOL:
			case INT:
			case UINT:
				break;
			default:
				syntaxError(v.getType().getName() + " in preprocessor expression");
				break;
			}
			return expr;
		}

		expr = constant_boolean();
		if (expr != null) return expr;
		
		expr = identifier();
		if (expr != null) return expr;
		
		expr = character_constant();
		if (expr != null) return expr;

		if (optional('(')) {
			expr = expression();
			while(WHITESPACE());
			if (mandatory(')')) {
				return expr;
			}
		}
		return null;
	}

	public Value character_constant() {
		// Note: simple C character constants only - no prefixed character constants
		Location mark = lexer.location();
		if (CHAR_SEQUENCE('\'')) {
			String text = last.CHAR_SEQUENCE();
			String value = decodeCharSequence(text, '\'', '\'');
			if (value.length() > 1) 
			{
				return expressionError(mark, "character constant contains more than one character");
			}
			else if (value.length() == 0) 
			{
				return expressionError(mark, "missing character");
			}
			return new ConstantValue<Character>(interval(mark), value.charAt(0));
		}
		return null;
	}

	public Value string_literal() {
		Location mark = lexer.location();
		if (CHAR_SEQUENCE('"')) {
			String text = last.CHAR_SEQUENCE();
			String value = decodeCharSequence(text, '"', '"');
			return new StringConstant(interval(mark), value, text);
		}
		return null;
	}

	private Expression identifier() {
		Location mark = lexer.location();
		if (IDENTIFIER()) {
			return new PPUndefinedIdentifier(interval(mark), last.IDENTIFIER());
		}
		return null;
	}

	public Expression constant_boolean() {
		if (optionalIDENTIFIER("true")) {
			return ConstantValue.TRUE;
		} else if (optionalIDENTIFIER("false")) {
			return ConstantValue.FALSE;
		} else {
			return null;
		}
	}
	
	public Expression number() {
		Location mark = lexer.location();
		
		final String DEC_DIGITS = "0123456789";
		final String HEX_DIGITS = "0123456789abcdefABCDEF";
		final String DEC_EXPONENT = "eE";
		final String HEX_EXPONENT = "pP";
		String exponentPrefixes = DEC_EXPONENT;
		boolean isReal = false;
		String digits = DEC_DIGITS;
		StringBuffer num = new StringBuffer();
		
		if (optional("0x")|| optional("0X")) {
			num.append("0x");
			digits = HEX_DIGITS;
			exponentPrefixes = HEX_EXPONENT;
		}

		if (ANYTHING_IN(digits)) {
			num.append(last.ANYTHING());
			if (optional('.')) {
				isReal = true;
				num.append('.');
				if (ANYTHING_IN(digits)) num.append(last.ANYTHING());
			}
		} else if (optional('.')) {
			isReal = true;
			num.append('.');
			if (ANYTHING_IN(digits)) num.append(last.ANYTHING());
			else {
				return expressionError("number format error: missing digits after '.'");
			}
		} else if (digits == HEX_DIGITS) {
			return expressionError(mark, "missing number after hex prefix");
		} else {
			// not a number
			return null;
		}

		if (num.length() > 0) {
			if (TOKEN(exponentPrefixes)) {
				isReal = true;
				num.append(last.TOKEN());
				if (TOKEN("+-")) num.append(last.TOKEN());
				// exponent always decimal digits
				if (!NUMBER_DEC()) {
					return expressionError(mark, "missing value of exponent");
				}
				num.append(last.NUMBER());
			}
			
			// postfixes
			if (isReal) {
				if (TOKEN("fF")) {
					// float
				} else if (TOKEN("lL")) {
					// double
				}
			} else {
				if (TOKEN("fF")) {
					isReal = true;
					// float again
				} else {
					TOKEN("uU"); // unsigned
					TOKEN("lL"); // long
				}
			}
			
			
			//
			// Decode value
			//
			try {
				if (isReal) {
					Double value;
					if (digits == HEX_DIGITS) {
						String[] part = num.toString().toLowerCase().split("p");
						double exp;
						if (part.length == 2) exp = Double.valueOf(part[1]);
						else exp = 0;

						String base = part[0];
						part = base.split("\\.");
						if (base.startsWith("0x.")) {
							value = 0.0;
						} else {
							value = (double)Long.decode(part[0]); // intpart
						}
						if (part.length == 2) {
							String fract = part[1];
							double pow = 1.0/16;
							for (int i = 0; i < fract.length(); i++) {
								value += HEX_DIGITS.indexOf(fract.charAt(i)) * pow;
								pow /= 16;
							}
						}
						
						value *= Math.pow(2.0, exp);
					} else {
						value = Double.parseDouble(num.toString());
					}
					return new ConstantValue<Double>(interval(mark), value);
				} else {
					return new ConstantValue<Long>(interval(mark), Long.decode(num.toString()), false);
				}
			} catch (NumberFormatException e) {
				return expressionError("not a valid number '" + num.toString() + "'");
			}
		}

		
		return null;
	}


	
}
