package org.cakelab.glsl.pp.parser;

import java.util.ArrayList;

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
import org.cakelab.glsl.lang.ast.PlusExpression;
import org.cakelab.glsl.lang.ast.PosExpression;
import org.cakelab.glsl.lang.ast.ShiftLeftExpression;
import org.cakelab.glsl.lang.ast.ShiftRightExpression;
import org.cakelab.glsl.lang.ast.Type;
import org.cakelab.glsl.lang.ast.Type.Rank;
import org.cakelab.glsl.lang.ast.Value;
import org.cakelab.glsl.lang.ast.XorExpression;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.ast.NodeList;
import org.cakelab.glsl.pp.ast.PPDefinedExpression;
import org.cakelab.glsl.pp.ast.StringConstant;
import org.cakelab.glsl.pp.lexer.FilteringLexer;
import org.cakelab.glsl.pp.lexer.ILexer;
import org.cakelab.glsl.pp.lexer.PPLexer;
import org.cakelab.glsl.pp.lexer.TokenListLexer;
import org.cakelab.glsl.pp.tokens.TCharacterConstant;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.TStringLiteral;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class ExpressionParser extends Parser {
	
	
	private FilteringLexer myLexer;


	public ExpressionParser(PPState state) {
		super(state);
		myLexer = new FilteringLexer(state, NodeList.Filter_WHITESPACE);
	}

	
	public ExpressionParser(PPLexer pplexer) {
		super(pplexer.getState());
		// FIXME: remove next line
		state.setErrorRecoveryHandler(this);
		myLexer = new FilteringLexer(pplexer, state, NodeList.Filter_WHITESPACE);
	}


	public ILexer getLexer() {
		return myLexer;
	}


	public void setup(TokenList tokens) {
		TokenListLexer tokenRelexer = new TokenListLexer(tokens, state);
		myLexer.setRootLexer(tokenRelexer);
	}
	
	public boolean parse() {
		
		Expression expr = expression();
		return expr != null;
	}
	
	
	
	
	
	/**
	 * A single expression or a list of expressions separated by commas.
	 * Evaluation of the last expression in the list gives the result value.
	 */
	public Expression expression() {
		
		Expression expr = conditional_expression(null);
		if (expr == null) {
			// syntax error
		} else {
			if (PUNCTUATOR(',')) {
				Token comma = token;
				ArrayList<Expression> list = new ArrayList<Expression>();
				list.add(expr);
				do {
					Expression next = conditional_expression(null);
					if (next != null) {
						list.add(next);
					} else {
						list.add(expressionError(comma.getInterval(), "missing expression after ,"));
					}
				} while(PUNCTUATOR(','));
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
			if (PUNCTUATOR('?')) {
				Token questionMark = token;
				Expression operand2 = expression();
				if (operand2 != null) {
					if (PUNCTUATOR(':')) {
						Token colon = token;
						Expression operand3 = expression();
						if (operand3 != null) {
							return conditional_expression(new ConditionalExpression(operand1, operand2, operand3));
						} else {
							return expressionError(colon.getInterval(), "missing third operand to conditional expression after :");
						}
					} else {
						return expressionError(operand2.getInterval(), "missing ':' in conditional expression");
					}
				} else {
					return expressionError(questionMark.getInterval(), "missing second operand to contional operator ? ");
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
			String operator = "||";
			if (PUNCTUATOR(operator)) {
				Token opTok = token;
				Expression operand2 = logical_xor_expression(null);
				if (operand2 != null) {
					return logical_or_expression(new LogicalOrExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator " + operator);
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
			String operator = "^^";
			if (PUNCTUATOR(operator)) {
				Token opTok = token;
				Expression operand2 = logical_and_expression(null);
				if (operand2 != null) {
					return logical_xor_expression(new LogicalXorExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator " + operator);
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

			if (PUNCTUATOR("&&")) {
				Token opTok = token;
				Expression operand2 = or_expression(null);
				if (operand2 != null) {
					return logical_and_expression(new LogicalAndExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator &&");
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
			if (PUNCTUATOR('|')) {
				Token opTok = token;
				Expression operand2 = xor_expression(null);
				if (operand2 != null) {
					return or_expression(new OrExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator |");
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
			if (PUNCTUATOR('^')) {
				Token opTok = token;
				Expression operand2 = and_expression(null);
				if (operand2 != null) {
					return xor_expression(new XorExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator ^");
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
			if (PUNCTUATOR('&')) {
				Token opTok = token;
				Expression operand2 = equality_expression(null);
				if (operand2 != null) {
					return and_expression(new AndExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator &");
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
			if (PUNCTUATOR("==")) {
				Token opTok = token;
				Expression operand2 = relational_expression(null);
				if (operand2 != null) {
					return equality_expression(new EqExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator ==");
				}
			} else if (PUNCTUATOR("!=")) {
				Token opTok = token;
				Expression operand2 = relational_expression(null);
				if (operand2 != null) {
					return equality_expression(new NeExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator !=");
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
			if (PUNCTUATOR("<=")) {
				Token opTok = token;
				Expression operand2 = shift_expression(null);
				if (operand2 != null) {
					return relational_expression(new LeExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator <=");
				}
			} else if (PUNCTUATOR(">=")) {
				Token opTok = token;
				Expression operand2 = shift_expression(null);
				if (operand2 != null) {
					return relational_expression(new GeExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator >=");
				}
			} else if (PUNCTUATOR("<")) {
				Token opTok = token;
				Expression operand2 = shift_expression(null);
				if (operand2 != null) {
					return relational_expression(new LtExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator <");
				}
			} else if (PUNCTUATOR(">")) {
				Token opTok = token;
				Expression operand2 = shift_expression(null);
				if (operand2 != null) {
					return relational_expression(new GtExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator >");
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
			if (PUNCTUATOR("<<")) {
				Token opTok = token;
				Expression operand2 = additive_expression(null);
				if (operand2 != null) {
					return shift_expression(new ShiftLeftExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator <<");
				}
			} else if (PUNCTUATOR(">>")) {
				Token opTok = token;
				Expression operand2 = additive_expression(null);
				if (operand2 != null) {
					return shift_expression(new ShiftRightExpression(operand1, operand2));
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator >>");
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
			if (PUNCTUATOR_OUTOF("+-")) {
				Token opTok = token;
				char op = opTok.getText().charAt(0);

				Expression operand2 = multiplicative_expression(null);
				Expression add = null;
				if (operand2 != null) {
					switch(op) {
					case '+': add = new PlusExpression(operand1, operand2); break;
					case '-': add = new MinusExpression(operand1, operand2); break;
					default: throw new Error("internal error: unhandled multiplicative operator " + op);
					}
					return additive_expression(add);
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operator " + op);
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
			if (PUNCTUATOR_OUTOF("*/%")) {
				Token opTok = token;
				char operator = token.getText().charAt(0);
				Expression operand2 = unary_expression();
				if (operand2 != null) {
					Expression mul = null;
					switch(operator) {
					case '*': mul = new MulExpression(operand1, operand2); break;
					case '/': mul =  new DivExpression(operand1, operand2); break;
					case '%': mul =  new ModExpression(operand1, operand2); break;
					default: throw new Error("internal error: unhandled multiplicative operator " + operator);
					}
					return multiplicative_expression(mul);
				} else {
					return expressionError(opTok.getInterval(), "missing second operand to operand " + operator);
				}
			} else {
				return operand1;
			}
		}
		return null;
	}	
	
	public Expression unary_expression() {
		
		Expression primary;
		if (PUNCTUATOR_OUTOF("+-!~")) {
			Token opTok = token;
			char op = token.getText().charAt(0);
			if (null == (primary = unary_expression())) {
				return expressionError(opTok.getInterval(), "missing expression after unary operator '" + op + "'");
			}
			switch(op) {
			case '+': return new PosExpression(opTok.getStart(), primary);
			case '-': return new NegExpression(opTok.getStart(), primary);
			case '!': return new LogicalNotExpression(opTok.getStart(), primary);
			case '~': return new NotExpression(opTok.getStart(), primary);
			default: throw new Error("internal error: unhandled unary operator " + op);
			}
		} else if(optionalIDENTIFIER("defined")) {
			Token opTok = token;
			if (null != (primary = unary_expression())) {
				return new PPDefinedExpression(opTok.getStart(), primary);
			} else {
				return expressionError(opTok.getInterval(), "missing expression after unary operator 'defined'");
			}
		} else {
			return primary_expression();
		}
	}
	
	
	private boolean PUNCTUATOR_OUTOF(String set) {
		
		Token t = myLexer.lookahead(1);
		if (t instanceof TPunctuator) {
			if (t.getText().length() != 1) return false;
			
			char c = t.getText().charAt(0);
			if (set.indexOf(c) != -1) {
				token = myLexer.consume(1);
				return true;
			}
		}
		return false;
	}


	public Expression primary_expression() {
		
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
				return expressionError(v.getInterval(), v.getType().getName() + " in preprocessor expression");
			}
			return expr;
		}

		expr = constant_boolean();
		if (expr != null) return expr;
		
		expr = identifier();
		if (expr != null) return expr;
		
		expr = character_constant();
		if (expr != null) return expr;

		if (PUNCTUATOR('(')) {
			Token bracket = token;
			expr = expression();
			if (PUNCTUATOR(')')) {
				return expr;
			} else {
				return expressionError(bracket.getInterval(), "missing closing bracket ')'");
			}
		}
		return null;
	}

	public Value character_constant() {
		
		// Note: simple C character constants only - no prefixed character constants
		if (optional(TCharacterConstant.class)) {
			TCharacterConstant tCharConst = (TCharacterConstant) token;
			String value = decodeCharSequence(tCharConst, '\'', '\'');
			if (value.length() > 1) 
			{
				return expressionError(token.getInterval(), "character constant contains more than one character");
			}
			else if (value.length() == 0) 
			{
				return expressionError(token.getInterval(), "missing character");
			}
			return new ConstantValue<Character>(token.getInterval(), value.charAt(0));
		}
		return null;
	}

	public Value string_literal() {
		
		if (optional(TStringLiteral.class)) {
			TStringLiteral tStringLit = (TStringLiteral) token;
			String value = decodeCharSequence(tStringLit, '"', '"');
			return new StringConstant(tStringLit.getInterval(), value, tStringLit.getText());
		}
		return null;
	}

	private Expression identifier() {
		if (IDENTIFIER()) {
			// undefined identifiers (i.e. not a macro name)
			// are replaced by 0 integer constant in
			// preprocessor conditional expressions
			return ConstantValue.ZERO;
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
		
		if (NUMBER()) {
			return decodeNumber((TNumber)token);
		} else {
			return null;
		}
	}


	@Override
	public void dismiss() {
	}

	
}
