package org.cakelab.glsl.pp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.*;
import org.cakelab.glsl.pp.ast.CharacterConstant;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.MacroParameter;
import org.cakelab.glsl.pp.ast.MacroParameterReference;
import org.cakelab.glsl.pp.ast.MacroReference;
import org.cakelab.glsl.pp.ast.PPConcatExpression;
import org.cakelab.glsl.pp.ast.PPDefinedExpression;
import org.cakelab.glsl.pp.ast.PPElifScope;
import org.cakelab.glsl.pp.ast.PPElseScope;
import org.cakelab.glsl.pp.ast.PPGroupScope;
import org.cakelab.glsl.pp.ast.PPIfScope;
import org.cakelab.glsl.pp.ast.PPIfdefScope;
import org.cakelab.glsl.pp.ast.PPIfndefScope;
import org.cakelab.glsl.pp.ast.PPStringifyExpression;
import org.cakelab.glsl.pp.ast.StringConstant;

public class Preprocessor extends ParserBase {
	
	
	
	private ResourceManager fileManager;
	/** this is where only valid preprocessed output goes. */
	private PrintStream outputStream;
	/** this is where valid and invalid preprocessed output goes. 
	 * It will refer to DEV_NULL when an error occurred (i.e. invalid output). */
	private PrintStream out;
	private MacroMap macros;
	private Macro currentMacroDefinition;

	private boolean insertLineDirectives;

	private PPGroupScope currentScope;
	
	public Preprocessor(String sourceIdentifier, InputStream in, OutputStream out) throws IOException {
		macros = new MacroMap();
		fileManager = new StandardFileManager();
		outputStream = new PrintStream(out);
		
		pushLexer(new Lexer(sourceIdentifier, in));
		pushScope(new PPGroupScope(null));
	}

	private void setScopeVisibility() {
		if (currentScope.visible()) this.out = outputStream;
		else this.out = DEV_NULL;
	}
	
	private void pushScope(PPGroupScope scope) {
		if (currentScope != null) currentScope.add(scope);
		currentScope = scope;
		setScopeVisibility();
	}
	
	private void popScope() {
		PPGroupScope parent = currentScope.getParentGroup();
		currentScope = parent;
		setScopeVisibility();
	}


	

	
	public void process() {
		group();
	}
	
	private void group() {
		while(!lexer.eof() && group_part());
	}

	public boolean group_part() {
		String output;
		
		if (directive()) {
			return true;
		}
		if (lexer.eof()) return false;
		
		if (null != (output = text(true))) {
			out.print(output);
			return true;
		} else {
			return false;
		}
	}


	/** 
	 * Consumes a sequence of preprocessing tokens (text), which does 
	 * not start with (WHITESPACE* #) and ends with CRLF or EOF. 
	 * <p>
	 * The result may be multiple lines, because of line continuations 
	 * and macro invocations (latter may contain CRLF in a parameter).
	 * </p>
	 * 
	 * 
	 */
	private String text(boolean consumeEndl) {
		if (!has_directive_line_start()) {
			
			if (!currentScope.visible()) {
				skip_remaining_line();
				return "";
			}

			
			StringBuffer result = new StringBuffer();
			String s;
			do {
				s = null;
				while(WHITESPACE()) {
					result.append(last.WHITESPACE());
				}
				Expression expr = macro_invocation_expression();
				if (expr != null) {
					s = expand(expr);
				} else {
					s = preprocessing_token();
				}
				
				if (s != null) {
					result.append(s);
				}
			} while (s != null);
			if (!consumeEndl) {
				return result.toString();
			} else if(!ENDL()) {
				syntaxError("unexpected tokens at end of text line");
				return null;
			} else {
				result.append(last.ENDL());
				return result.toString();
			}
		}
		return null;
	}

	private String expand(Expression expr) {
		String text;
		try {
			text = expr.value().getValue().toString();
		} catch (EvaluationException e) {
			syntaxError(e);
			return "";
		}
		
		pushLexer(new Lexer(lexer.location(), new ByteArrayInputStream(text.getBytes())));
		try {
			StringBuffer result = new StringBuffer();
			while(!lexer.eof()) {
				// Recursion:
				// If a macro expansion results in new macro invocations, 
				// then those will be expanded inside text().
				result.append(text(true)); 
			}
			return result.toString();
		} finally {
			popLexer();
		}
	}

	private boolean has_directive_line_start() {
		if (lexer.getColumn() != Location.COLUMN_START) return false;
		int i = 1;
		int c;
		do {
			c = lexer.lookahead(i);
			i++;
		} while (!isEndl(c) && isWhite(c));
		if (c == '#') return true;
		else return false;
	}


	private boolean directive() {
		if (!has_directive_line_start()) return false;
		LexerLocation reset = lexer.location();
		while(WHITESPACE());
		if (optional('#')) {
			while (WHITESPACE());
			if (LA_equals("elif")||LA_equals("else")||LA_equals("endif")) {
				// to be handled in conditional --> ignore here
				
				// We can't handle them here, because we would lose the context and
				// had to search for the matching #if .
				// But to avoid them to be considered as unknown directive (see below)
				// we need to catch them and leave the method here.
				lexer.rewind(reset);
				return false;
			} else if (!currentScope.visible()) {
				skip_remaining_line();
				return false;
			} else if (empty_line_end()) {
				return true;
			} else if (include()
				||conditional()
				||define()
				||undef()
				||line()
				||error()
				||pragma()
				||extension()
				||version()
				)
			{
				return true;
			} else {
				syntaxError("unknown directive #" + read_remaining_line());
				return true;
			}
		} else {
			return false;
		}
	}

	/** Skips all input characters including line continuation sequences 
	 * (\\\r) and stops after CRLF or EOF. 
	 * @return false if lexer is already at EOF.
	 * @see #read_remaining_line() 
	 */
	private boolean skip_remaining_line() {
		if (lexer.eof()) return false;
		while (!ENDL()) {
			if (!line_continuation()) {
				lexer.consume();
			}
		}
		return true;
	}

	/** 
	 * Reads all input characters including line continuation sequences 
	 * (\\\r) and stops after CRLF or EOF.
	 * The sequence of characters, including the terminating CRLF or EOF
	 * is returned as string.
	 */
	private String read_remaining_line() {
		if (lexer.eof()) return null;
		StringBuffer result = new StringBuffer();
		while(!ENDL()) {
			if (!line_continuation()) {
				result.append((char)lexer.consume());
			}
		}
		return result.toString();
	}

	/** Parses a sequence of white spaces (including line continuation) terminated by either CRLF or EOF. */
	private boolean empty_line_end() {
		LexerLocation reset = lexer.location();
		while(WHITESPACE());
		if (ENDL()) {
			return true;
		} else {
			lexer.rewind(reset);
			return false;
		}
	}

	private boolean version() {
		boolean result = false;
		if (optionalIDENTIFIER("version")) {
			result = true;
			while(WHITESPACE());
			if (!NUMBER_DEC()) {
				syntaxError("missing version number");
			} else {
				while(WHITESPACE());
				if (optionalIDENTIFIER("core")
					|| optionalIDENTIFIER("compatibility")
					|| optionalIDENTIFIER("es")
					) 
				{
					while(WHITESPACE());
					mandatory_endl();
				}
			}
		}
		return result;
	}

	private boolean extension() {
		boolean result = false;
		if (optionalIDENTIFIER("extension")) {
			result = true;
			while(WHITESPACE());
			if (!IDENTIFIER()) {
				syntaxError("missing extension name");
			} else {
				while(WHITESPACE());
				mandatory(':');
				while(WHITESPACE());
				if (optionalIDENTIFIER("require")
					|| optionalIDENTIFIER("enable")
					|| optionalIDENTIFIER("warn")
					|| optionalIDENTIFIER("disable")
					) {
					while(WHITESPACE());
					mandatory_endl();
				} else {
					syntaxError("missing extension behaviour (one of [require, enable, warn, disable])");
				}
			}
		}
		return result;
	}

	private boolean pragma() {
		if (optionalIDENTIFIER("pragma")) {
			String s;
			while(null != (s = preprocessing_token()));
			mandatory_endl();
			return true;
		} else {
			return false;
		}
	}

	private boolean error() {
		if (optionalIDENTIFIER("error")) {
			StringBuffer message = new StringBuffer("#error");
			while(WHITESPACE()) message.append(last.WHITESPACE());
			message.append(read_remaining_line());
			syntaxError(message.toString());
			return true;
		} else {
			return false;
		}
	}
	
	private boolean line() {
		boolean result = false;
		if (optionalIDENTIFIER("line")) {
			result = true;
			while(WHITESPACE());
			int line = -1;
			if (NUMBER_DEC()) {
				try {
					line = Integer.valueOf(last.NUMBER());
					if (line < 0) throw new NumberFormatException("signed integer");
				} catch (NumberFormatException e) {
					syntaxError("not a valid line number. Positive integer allowed only");
					return result;
				}
			} else {
				syntaxError("missing line number in line directive");
				return result;
			}
			while(WHITESPACE());
			int id = -1;
			if (NUMBER_DEC()) {
				try {
					id = Integer.valueOf(last.NUMBER());
					if (id < 0) throw new NumberFormatException("signed integer");
				} catch (NumberFormatException e) {
					syntaxError("not a valid source identifier. Positive integer allowed only");
					return result;
				}
			}
			while(WHITESPACE());
			if (mandatory_endl()) {
				if (id >= 0) {
					lexer.setVirtualLocation(Integer.toString(id), line);
				} else {
					lexer.setVirtualLocation(line);
				}
			}
		}
		return result;
	}
	

	private boolean define() {
		// TODO: report macro redefinitions
		// TODO: ignore identical macro redefinitions
		
		boolean result = false;
		if (optionalIDENTIFIER("define")) {
			result = true;
			while(WHITESPACE());
			if (!IDENTIFIER()) {
				syntaxError("missing identifier for macro");
				return result;
			}
			String macroName = last.IDENTIFIER();
			List<MacroParameter> params = null;
			if (optional('(')) {
				params = new ArrayList<MacroParameter>();
				// macro parameters
				if (DOTS()) {
					// TODO: DOTS argument
				}
				else if (IDENTIFIER()) 
				{
					params.add(new MacroParameter(last.IDENTIFIER()));
					while (WHITESPACE());
					while(optional(',')) {
						while (WHITESPACE());
						if (!IDENTIFIER()) {
							if (DOTS()) break;
							else {
								syntaxError("missing parameter name or '...' after ','");
								return result;
							}
						} else {
							params.add(new MacroParameter(last.IDENTIFIER()));
						}
						while (WHITESPACE());
					}
				}
				mandatory(')');
			}
			while(WHITESPACE());
			currentMacroDefinition = new Macro(macroName, params);
			List<Expression> tokens = replacement_list();
			if ( mandatory_endl()) {
				currentMacroDefinition.setReplacementList(tokens);
				macros.put(macroName, currentMacroDefinition);
				currentMacroDefinition = null;
				out.print(last.ENDL());
			}
		}
		return result;
	}

	private List<Expression> replacement_list() {
		List<Expression> result = new ArrayList<Expression>();
		Expression expr;
		do {
			expr = concat_expression();
			if (expr == null) expr = stringify_expression();
			if (expr == null) expr = macro_parameter_reference();
			if (expr == null) {
				// TODO: can be optimised
				LexerLocation start = lexer.location();
				String s = preprocessing_token(); // anything not CRLF
				if (s != null) {
					expr = new StringConstant(new Interval(start, lexer.location()), s);
				}
			}
			
			if (expr != null) result.add(expr);
		} while(null != expr);
		return result;
	}

	
	
	
	
	/**
	 *  anything ## anything
	 *  
	 */
	private Expression concat_expression() {
		LexerLocation mark = lexer.location();
		while (WHITESPACE());
		if (optional("##")) {
			while(WHITESPACE());
			return new PPConcatExpression(new Interval(mark, lexer.location()));
		} else {
			lexer.rewind(mark);
		}
		return null;
	}


	private MacroParameterReference macro_parameter_reference() {
		LexerLocation mark = lexer.location();
		if (IDENTIFIER()) {
			MacroParameter param = currentMacroDefinition.getParameter(last.IDENTIFIER());
			if (param != null) {
				return new MacroParameterReference(new Interval(mark, lexer.location()), param);
			} else {
				lexer.rewind(mark);
			}
		}
		return null;
	}

	private Expression stringify_expression() {
		LexerLocation mark = lexer.location();
		if (optional('#')) {
			if (!WHITESPACE()) {
				return expressionError(mark, "missing white space after #");
			}
			while (WHITESPACE());
			MacroParameterReference param = macro_parameter_reference();
			if (param == null) {
				return expressionError(mark, "missing or undefined macro parameter after #");
			}
			else 
			{
				return new PPStringifyExpression(mark, param);
			}
		}
		return null;
	}
	

	



	private String preprocessing_token() {
		if (IDENTIFIER()) {
			return last.IDENTIFIER();
		} else if (!isEndl(LA1())) {
			return Character.toString((char)lexer.consume());
		}
		return null;
	}

	private Expression macro_invocation_expression() {
		LexerLocation mark = lexer.location();
		if (MACRO_IDENTIFIER()) {
			Macro macro = macros.get(last.MACRO_IDENTIFIER());
			while(WHITESPACE());
			if (optional('(')) {
				List<StringConstant> params = new ArrayList<StringConstant>();
				LexerLocation paramStart = lexer.location();
				String param = macro_param();
				Interval interval = new Interval(paramStart, lexer.location());
				if (param != null) {
					
					params.add(new StringConstant(interval, param));
					while (optional(',')) {
						param = macro_param();
						if (param != null) {
							params.add(new StringConstant(interval, param));
						} else {
							return expressionError(mark, "expected another macro parameter after ','");
						} 
					}
				}
				if (!optional(')')) syntaxError("missing closing ')'");
				else {
					return new CallExpression(new MacroReference(new Interval(mark, lexer.location()), macro), params.toArray(new Expression[0]), lexer.location());
				}
			} else {
				return new MacroReference(interval(mark), macro);
			}
		}
		return null;
	}


	private Interval interval(LexerLocation start) {
		return new Interval(start, lexer.location());
	}

	private String macro_param() {
		// macro parameters can contain anything, even CRLF, but not ',' or ')' alone.
		// ',' can occur in parenthesised expressions though.
		StringBuffer param = new StringBuffer();
		int c = LA1();
		while (c != ',' && c != ')' && !lexer.eof()) {
			if (macro_param_parenthesised(param)) {
				// already added to string buffer
			} else {
				param.append((char)c);
				lexer.consume();
			}
			c = LA1();
		}
		return param.toString();
	}

	private boolean macro_param_parenthesised(StringBuffer param) {
		if (LA1() == '(') {
			param.append(lexer.consume());
			int c = LA1();
			while (c != ')' && !lexer.eof()) {
				if (macro_param_parenthesised(param)) {
					// another pair of parenthesis
				} else {
					param.append((char)c);
					lexer.consume();
				}
				c = LA1();
			}
			if (c == ')') {
				param.append((char)c);
				lexer.consume();
			} else {
				syntaxError("missing closing ')' in parenthesised macro parameter");
			}
			return true;
		}
		return false;
	}

	private boolean undef() {
		boolean result = false;
		if (optionalIDENTIFIER("undef")) {
			result = true;
			while(WHITESPACE());
			if(!IDENTIFIER()) {
				syntaxError("missing identifier to #undef directive");
				return result;
			}
			while(WHITESPACE());
			if (mandatory_endl()) {
				macros.remove(last.IDENTIFIER());
				out.print(last.ENDL());
				return result;
			} else {
				syntaxError("unexpected tokens at end of undef directive");
				return result;
			}
		}
		return result;
	}
	
	/**
	 * Sequence of:<br/>
	 * #if expr \n group* (#elif expr \n group*)* (#else \n group*)* #endif \n
	 */
	private boolean conditional() {
		boolean result = false;
		if (ifgroup()) {
			result = true;
			// when we get here, all text lines, which 
			// belong to the if group, have been consumed already.
			// next will be either #elif, #else or #endif.
			if (!optional_directive_line_start()) {
				syntaxError("missing #endif");
				return result;
			}
			while(elifgroup()) {
				if (!optional_directive_line_start()) {
					syntaxError("missing #endif");
					return result;
				}
			}
			if (elsegroup()) {
				if (!optional_directive_line_start()) {
					syntaxError("missing #endif");
					return result;
				}
			}
			if (!endif()) {
				syntaxError("missing #endif");
			}
		}
		return result;
	}

	private boolean ifgroup() {
		PPIfScope ifscope = null;
		Expression condition = null;
		if (optionalIDENTIFIER("if")) {
			ifscope = new PPIfScope(currentScope);
			while(WHITESPACE());
			condition = constant_expression();
			if (condition == null) {
				condition = expressionError(lexer.location(), "missing condition to #if directive");
			}
		} else if (optionalIDENTIFIER("ifdef")) {
			ifscope = new PPIfdefScope(currentScope);
			while(WHITESPACE());
			condition = identifier();
			if (condition == null) {
				condition = expressionError(lexer.location(), "missing identifier");
			}
		} else if (optionalIDENTIFIER("ifndef")) {
			ifscope = new PPIfndefScope(currentScope);
			while(WHITESPACE());
			condition = identifier();
			if (condition == null) {
				condition = expressionError(lexer.location(), "missing identifier");
			}
		}
		
		if (ifscope != null) {
			try {
				ifscope.setCondition(condition);
			} catch (EvaluationException e) {
				syntaxError(e);
			}
			while(WHITESPACE());
			mandatory_endl();
			pushScope(ifscope);
			group();
			return true;
		} else {
			return false;
		}
	}


	private boolean elifgroup() {
		PPElifScope elifscope = null;
		if (optionalIDENTIFIER("elif")) {
			PPGroupScope predecessor = currentScope;
			popScope();
			
			elifscope = new PPElifScope(currentScope, (PPIfScope)predecessor);
			while(WHITESPACE());
			Expression expr = constant_expression();
			if (expr == null) {
				expr = expressionError(lexer.location(), "missing condition to elif directive");
			}

			try {
				elifscope.setCondition(expr);
			} catch (EvaluationException e) {
				syntaxError(e);
				elifscope.setCondition(expr.getInterval(), false);
			}
			
			while(WHITESPACE());
			mandatory_endl();
			pushScope(elifscope);
			group();
		}
		return elifscope != null;
	}

	private boolean elsegroup() {
		PPElseScope elsescope = null;
		if (optionalIDENTIFIER("else")) {
			PPGroupScope predecessor = currentScope;
			popScope();
			elsescope = new PPElseScope(currentScope, (PPIfScope) predecessor);
			while(WHITESPACE());
			mandatory_endl();
			pushScope(elsescope);
			group();
		}
		return elsescope != null;
	}

	private boolean endif() {
		boolean result = false;
		if (optionalIDENTIFIER("endif")) {
			result = true;
			popScope();
			while(WHITESPACE());
			mandatory_endl();
		}
		return result;
	}


	/** consumes WHITESPACE* # WHITESPACE* */
	private boolean optional_directive_line_start() {
		if (has_directive_line_start()) {
			while(WHITESPACE());
			assert (LA1() == '#');
			lexer.consume();
			while(WHITESPACE());
			return true;
		}
		return false;
	}


	/** consumes remainder of line.
	 * 
	 * Does macro expansions first then interprets 
	 * it as constant expression.
	 * @return
	 */
	public Expression constant_expression() {
		// macro expanded remainder of current line
		LexerLocation origin = lexer.location();
		String text = text(false);
		pushLexer(new Lexer(origin, new ByteArrayInputStream(text.getBytes())));
		try {
			Expression condition = expression();
			
			if (condition == null) {
				return null;
			} else {
				return new ConstantExpression(condition);
			}
		} finally {
			popLexer();
		}
	}
	
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
					while(WHITESPACE());
					Expression next = conditional_expression(null);
					if (next != null) {
						list.add(next);
					} else {
						list.add(expressionError(lexer.location(), "missing expression after ,"));
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
					return or_expression(new XorExpression(operand1, operand2));
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
					return equality_expression(new LeExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator ==");
				}
			} else if (optional("!=")) {
				while(WHITESPACE());
				Expression operand2 = relational_expression(null);
				if (operand2 != null) {
					return equality_expression(new GeExpression(operand1, operand2));
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
					shift_expression(new ShiftLeftExpression(operand1, operand2));
				} else {
					return expressionError("missing second operand to operator <<");
				}
			} else if (optional(">>")) {
				while(WHITESPACE());
				Expression operand2 = additive_expression(null);
				if (operand2 != null) {
					shift_expression(new ShiftRightExpression(operand1, operand2));
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
				while(WHITESPACE());
				Expression operand2 = multiplicative_expression(null);
				Expression add = null;
				if (operand2 != null) {
					switch(last.TOKEN()) {
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
				while(WHITESPACE());
				Expression operand2 = unary_expression();
				if (operand2 != null) {
					Expression mul = null;
					switch(last.TOKEN()) {
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
		LexerLocation mark = lexer.location();
		if (LA_equals("!=")) {
			return null;
		} else if (TOKEN("+-!~")) {
			if (null == (primary = unary_expression())) {
				return expressionError("missing expression after unary operator '" + (char)last.TOKEN() + "'");
			}
			switch(last.TOKEN()) {
			case '+': return primary;
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
		LexerLocation mark = lexer.location();
		if (STRING_LITERAL('\'')) {
			String value = last.STRING_LITERAL();
			if (value.length() > 1) {
				return expressionError(mark, "character constant to long");
			}
			else if (value.length() == 0) {
				return expressionError(mark, "missing character");
			}
			return new CharacterConstant(interval(mark), value.charAt(0));
		}
		return null;
	}

	public Value string_literal() {
		LexerLocation mark = lexer.location();
		if (STRING_LITERAL('"')) {
			return new StringConstant(interval(mark), last.STRING_LITERAL());
		}
		return null;
	}

	private Expression identifier() {
		LexerLocation mark = lexer.location();
		if (MACRO_IDENTIFIER()) {
			return new MacroReference(interval(mark), macros.get(last.MACRO_IDENTIFIER()));
		} else if (IDENTIFIER()) {
			return new UndefinedIdentifier(interval(mark), last.IDENTIFIER());
		}
		return null;
	}

	public Expression number() {
		LexerLocation mark = lexer.location();
		
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
			
			try {
				if (isReal) {
					Double value;
					if (digits == HEX_DIGITS) {
						String[] part = num.toString().toLowerCase().split("[pP]");
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

	private boolean include()  {
		boolean result = false;
		if (optionalIDENTIFIER("include")) {
			result = true;
			while(WHITESPACE());
			String path;
			if (STRING_LITERAL('<','>')) {
				path = last.STRING_LITERAL();
			} else if (STRING_LITERAL('"')){
				path = last.STRING_LITERAL();
			} else {
				syntaxError("missing include file path");
				return result;
			}

			
			Resource resource = fileManager.resolve(path);
			if (resource == null) {
				syntaxWarning("resource " + path + " not found");
				return result;
			}
			
			while(WHITESPACE());
			if (!mandatory_endl()) {
				return result;
			} else {
				out.print(last.ENDL());
			}

			// exec include
			
			LexerLocation mark = lexer.location(); // <-- points to start of next line in current input (or EOF)
			if (insertLineDirectives) {
				out.println("#line 1 " + resource.getIdentifier());
			}
			pushLexer(new Lexer(resource.getIdentifier(), resource.getData()));
			process();
			// insert CRLF if necessary
			if (lexer.current() != '\n') out.println();
			popLexer();
			if (insertLineDirectives) {
				out.println("#line " + mark.getLine() + ' ' + mark.getSourceIdentifier());
			}
		}
		
		return result;
	}
	
	


	private boolean MACRO_IDENTIFIER() {
		LexerLocation reset = lexer.location();
		if (IDENTIFIER()) {
			if (macros.containsKey(last.IDENTIFIER())) {
				last.MACRO_IDENTIFIER(last.IDENTIFIER());
				return true;
			} else {
				lexer.rewind(reset);
			}
		}
		return false;
	}



	private boolean mandatory_endl() {
		if (!ENDL()) {
			syntaxError("missing mandatory CRLF or end of file");
			// still here, then skip to next line end to recover from error
			while (!ENDL()) lexer.consume();
			return false;
		}
		return true;
	}

	
}
