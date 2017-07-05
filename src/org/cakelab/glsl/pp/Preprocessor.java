package org.cakelab.glsl.pp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.impl.StandardFileManager;
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
import org.cakelab.glsl.pp.ast.PPWhitespace;

public class Preprocessor extends ParserBase {
	
	private ResourceManager resourceManager;
	/** this is where only valid preprocessed output goes. */
	private PreprocessedOutputSink outputStream;
	/** this is where valid and invalid/hidden preprocessed output goes. 
	 * It will refer to DEV_NULL when an error occurred (i.e. invalid output). */
	private PreprocessedOutputSink out;
	private MacroMap macros;
	private Macro currentMacroDefinition;

	private boolean allowInclude;
	private boolean insertLineDirectives;

	private PPGroupScope currentScope;

	// TODO [1] create preprocessor ast output
	private List<PPGroupScope> groups;
	
	/**
	 * Construct a preprocessor for standalone preprocessing (without language parsing).
	 * @param sourceIdentifier
	 * @param in
	 * @param out
	 */
	public Preprocessor(String sourceIdentifier, InputStream in, OutputStream out) {
		this(sourceIdentifier, in, new PreprocessedOutput(out));
	}

	Preprocessor(String sourceIdentifier, InputStream in, PreprocessedOutputSink out) {
		allowInclude = true;
		insertLineDirectives = true;
		
		outputStream = out;
		resourceManager = new StandardFileManager();
		macros = new MacroMap();
		pushScope(new PPGroupScope(null));
		swapLexer(new Lexer(sourceIdentifier, in));
	}

	/** sets the resource manager, which is used to lookup resources
	 * referenced by #include directives.
	 * @param resourceManager
	 */
	public void setResourceManager(ResourceManager resourceManager) {
		this.resourceManager = resourceManager;
	}

	
	public void setAllowIncludeDirective(boolean enable) {
		this.allowInclude = enable;
	}
	
	/** 
	 * Enables/disables insertion of #line directives 
	 * before and after source code inserted through #include 
	 * directives.
	 * <p>
	 * Insertion of #line directives is useful for debugging 
	 * purposes when forwarding preprocessed source code to the
	 * graphics card driver. This way the compiler of the graphics card driver
	 * will point you to the included source string in
	 * error messages instead of the position in the 
	 * preprocessed source code. The source string identifier
	 * in error messages will be the one given to 
	 * {@link Resource#Resource(String, String, InputStream)}.
	 * </p>
	 * 
	 */
	public void setInsertLineDirectives(boolean enable) {
		this.insertLineDirectives = enable;
	}

	/**
	 * Adds a macro definition given string 'define'. 
	 * <p>
	 * This method is supposed to aid in adding predefined 
	 * macros such as builtin macros or defines given by the 
	 * user.
	 * </p>
	 * <p>
	 * The string define is supposed to contain the remaining 
	 * string after #define of a proper directive line until 
	 * the end of that line. The given define will be parsed
	 * by the preprocessor.
	 * </p>
	 * <h3>Examples:</h3>
	 * <pre>
	 * // a primitive definition to be used in #if directives
	 * preprocessor.addDefine("HAS_SHADOW");
	 * // or a define with a value
	 * preprocessor.addDefine("VERSION_MAJOR 1");
	 * // or even a define with parameters and special operators like ##
	 * preprocessor.addDefine("CONCATENATE(x,y) x ## y");
	 * </pre>
	 * 
	 * @param define
	 */
	public void addDefine(String define) {
		define = "#define " + define;
		ByteArrayInputStream in = new ByteArrayInputStream(define.getBytes());
		Lexer previous = swapLexer(new Lexer("-- predefined --", in));
		
		try {
			
			define();
		} finally {
			swapLexer(previous);
		}
	}
	
	public void addDefine(Macro macro) {
		macros.put(macro.getName(), macro);
	}
	
	
	protected Lexer swapLexer(Lexer lexer) {
		Lexer previous = this.lexer;
		this.lexer = lexer;
		out.reportLocationSwitch(lexer.location());
		return previous;
	}
	
	private void setScopeVisibility() {
		// TODO [3] scope visibility (skipping text lines), suspending output generation and location mapping is kind of redundant
		if (currentScope.visible()) this.out = outputStream;
		else this.out = PreprocessedOutputSink.DEV_NULL;
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


	
	public List<PPGroupScope> process() {
		group();
		if (LA1() != Lexer.EOF) syntaxError("illegal tokens"); 
		return groups;
	}

	private void group() {
		while(!lexer.eof() && group_part());
	}

	public boolean group_part() {
		if (LA1() == Lexer.EOF) return false;
		
		if (directive()) {
			return true;
		}
		
		return text_line();
	}


	/**
	 * line of text to be macro expanded and forwarded to parser.
	 * @return whether successful or not
	 */
	private boolean text_line() {
		if (!has_directive_line_start()) {
			if (!currentScope.visible()) {
				skip_remaining_line();
				return true;
			}

			String output = text(true);
			if (output == null) {
				return false;
			} else if(!ENDL()) {
				syntaxError("unexpected tokens at end of text line");
				return false;
			} else {
				out.print('\n');
				return true;
			}
		}
		return false;
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
	private String text(boolean print) {
		StringBuffer result = new StringBuffer();
		String s;
		do {
			s = null;
			while(WHITESPACE()) {
				result.append(last.WHITESPACE());
				if (print) out.print(last.WHITESPACE());
			}
			Expression expr = macro_invocation_expression();
			if (expr == null) {
				s = preprocessing_token();
				if (print && s != null) out.print(s);
			} else {
				s = macro_expansion(expr, print);
			}
			
			if (s != null) {
				result.append(s);
			}
		} while (s != null);
		
		return result.toString();
	}

	private String macro_expansion(Expression expr, boolean print) {
		String text;
		try {
			// FIXME parameter expansion, foreign macro calls and output generation here
			text = expr.eval().value().getValue().toString();
			// rescan for more macro expansions
			text = macro_rescan_and_expand(expr.getStart(), text);
		} catch (EvaluationException e) {
			syntaxError(e);
			return "";
		}
		int startOutputPos = -1;
		if (print) startOutputPos = out.reportMacroExpansionStart();
		try {
			if (print) out.print(text);
			return text;
		} finally {
			if (print) {
				out.reportMacroExpansionEnd(startOutputPos, expr);
				out.reportLocationSwitch(lexer.location());
			}
		}
	}

	private String macro_rescan_and_expand(Location textOrigin, String text) {
		// rescan happens after removing '#' and '##'. Any remaining 
		// '#' and '##' will be treated as common pp-token.
		Lexer previous = null;
		try {
			previous = swapLexer(new Lexer(textOrigin, new ByteArrayInputStream(text.getBytes())));
			String s = null;
			StringBuffer result = new StringBuffer();
			do {
				s = text(false); // scans simple text, whitespace, comments, line continuation and macro invocations but no '#' or '##'
				
				if (s == null || s.length() == 0) {
					// no result can mean, that there are ## or #
					s = null;
					if (optional("##")) {
						s = "##";
					} else if (optional("#")) {
						s = "#";
					}
				}
				if (s != null) result.append(s);
			} while (s != null);
			
			return result.toString();
		} finally {
			if (previous != null) swapLexer(previous);
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
		
		Location reset = lexer.location();
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
		// TODO [1] implement pragma
		if (optionalIDENTIFIER("pragma")) {
			String s;
			// all preprocessing tokens except whitespace
			ArrayList<String> tokens = new ArrayList<String>();
			do {
				s = preprocessing_token();
				if (s != null) tokens.add(s);
			} while(s != null || WHITESPACE());
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
		// TODO [1] report macro redefinitions
		// TODO [1] ignore identical macro redefinitions
		
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
					// TODO [1] DOTS argument in macros
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
			}
		}
		return result;
	}

	private List<Expression> replacement_list() {
		List<Expression> result = new ArrayList<Expression>();
		Expression expr;
		do {
			expr = concat_expression(result);
			if (expr == null) expr = whitespace();
			if (expr == null) expr = non_concat_expression();
			if (expr != null) result.add(expr);
		} while(null != expr);
		return result;
	}

	
	
	
	
	private StringConstant whitespace() {
		Location start = lexer.location();
		if (WHITESPACE()) {
			return new PPWhitespace(interval(start),last.WHITESPACE());
		} else {
			return null;
		}
	}

	private Expression non_concat_expression() {
		Expression expr;
		expr = single_hash_expression();
		if (expr == null) expr = macro_parameter_reference();
		if (expr == null) {
			// TODO can be optimised
			Location start = lexer.location();
			String s = preprocessing_token(); // anything not CRLF
			if (s != null) {
				expr = new StringConstant(new Interval(start, lexer.location()), s);
			}
		}
		return expr;
	}

	/**
	 *  anything ## anything
	 *  
	 */
	private Expression concat_expression(List<Expression> replacement_list) {
		Location mark = lexer.location();
		while (WHITESPACE());
		if (optional("##")) {
			//
			// find last non whitespace token sequence
			//
			Expression left = null;
			for (int i = replacement_list.size()-1; i >= 0; i--) {
				Expression token = replacement_list.remove(i);
				if (token instanceof PPWhitespace) {
					// just whitespace or comment -> ignore
					continue;
				} else {
					left = token;
					break;
				}
			}
			
			while(WHITESPACE());
			
			Expression right = non_concat_expression();
			
			if (left == null || right == null) {
				syntaxError("'##' cannot appear at either end of a macro expansion");
			}
			
			return new PPConcatExpression(new Interval(mark, lexer.location()), left, right);
		} else {
			lexer.rewind(mark);
		}
		return null;
	}


	private MacroParameterReference macro_parameter_reference() {
		Location mark = lexer.location();
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

	private Expression single_hash_expression() {
		Location mark = lexer.location();
		if (optional('#')) {
			assert !LA_equals('#') : "reminder: parsing of ## has to appear before # parsing";
			
			
			// Iff macro has parameters, # has to be followed by 
			// a macro parameter reference.
			// Otherwise, it is an ordinary pp-token
			if (currentMacroDefinition.hasParameters()) {
				while (WHITESPACE());
				MacroParameterReference param = macro_parameter_reference();
				if (param == null) {
					lexer.rewind(mark);
					return expressionError(mark, "# is not followed by a macro parameter");
				}
				else 
				{
					return new PPStringifyExpression(mark, param);
				}
			} else {
				return new StringConstant(interval(mark), "#");
			}
		}
		return null;
	}
	

	



	private String preprocessing_token() {
		if (IDENTIFIER()) {
			return last.IDENTIFIER();
		} else {
			// TODO improve performance by parsing numbers 
			if (!isWhite(LA1()) && !LA_equals('#') && !isEndl(LA1())) {
				int c = lexer.consume();
				return String.valueOf((char)c);
			} else {
				return null;
			}
		}
	}

	private Expression macro_invocation_expression() {
		Location macroCallStart = lexer.location();
		if (macro_identifier()) {
			Macro macro = macros.get(last.IDENTIFIER());
			Location skippedWhitespace = lexer.location();
			while(WHITESPACE());
			if (optional('(')) {
				List<StringConstant> params = new ArrayList<StringConstant>();
				while(WHITESPACE());
				if (!LA_equals(')')) do {
					while(WHITESPACE());
					Location paramStart = lexer.location();
					String param = macro_param();
					Interval interval = new Interval(paramStart, lexer.location());
					
					if (param != null) params.add(new StringConstant(interval, param));
					else params.add(StringConstant.EMPTY);
					while(WHITESPACE());
				} while (optional(','));
				
				if (!optional(')')) syntaxError("missing closing ')'");

				if (macro.numParameters() != params.size()) {
					if (params.size() == 0 && macro.numParameters() == 1) {
						params.add(StringConstant.EMPTY);
					} else {
						return expressionError(macroCallStart, "expected " + macro.numParameters() + " parameters but " + params.size() + " where given.");
					}
				}
				
				return new CallExpression(new MacroReference(new Interval(macroCallStart, lexer.location()), macro), params.toArray(new Expression[0]), lexer.location());
			} else {
				// rewind to location before WHITESPACE
				lexer.rewind(skippedWhitespace);
				return new MacroReference(interval(macroCallStart), macro);
			}
		}
		return null;
	}


	private Interval interval(Location start) {
		return new Interval(start, lexer.location());
	}

	private String macro_param() {
		// macro parameters can contain anything, even CRLF, but not ',' or ')' alone.
		// ',' can occur in parenthesised expressions though.
		StringBuffer param = new StringBuffer();
		int c = LA1();
		while (c != ',' && c != ')' && !lexer.eof()) {
			Expression expr = macro_invocation_expression();
			if (expr != null) {
				String expanded = macro_expansion(expr, false);
				param.append(expanded);
			} else if (macro_param_parenthesised(param)) {
				// already added to string buffer
			} else {
				param.append((char)c);
				lexer.consume();
			}
			c = LA1();
		}
		String result = param.toString().trim();
		if (result.length() == 0) result = null;
		return result;
	}

	private boolean macro_param_parenthesised(StringBuffer param) {
		if (LA1() == '(') {
			param.append(lexer.consume());
			int c = LA1();
			while (c != ')' && !lexer.eof()) {
				Expression expr = macro_invocation_expression();
				if (expr != null) {
					String expanded = macro_expansion(expr, false);
					param.append(expanded);
				} else if (macro_param_parenthesised(param)) {
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
			String macro = last.IDENTIFIER();
			while(WHITESPACE());
			if (mandatory_endl()) {
				macros.remove(macro);
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
			condition = directive_condition();
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
			Expression expr = directive_condition();
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


	/** 
	 * Expression of a condition in a directive line
	 * such as <code>#if</code>.
	 * 
	 * Does macro expansions first then interprets 
	 * it as expression.
	 * 
	 * Output generation and location reports are suspended.
	 * 
	 * @return resulting expression node
	 */
	public Expression directive_condition() {

		// get *macro expanded* remainder of current line
		Location textOrigin = lexer.location();
		
		String text = text(false);
		
		// parse that macro expanded text
		Lexer previous = swapLexer(new Lexer(textOrigin, new ByteArrayInputStream(text.getBytes())));
		try {
			return expression();
		} finally {
			if (previous != null) swapLexer(previous);
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
		Location mark = lexer.location();
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
		Location mark = lexer.location();
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
		Location mark = lexer.location();
		if (STRING_LITERAL('"')) {
			return new StringConstant(interval(mark), last.STRING_LITERAL());
		}
		return null;
	}

	private Expression identifier() {
		Location mark = lexer.location();
		if (macro_identifier()) {
			return new MacroReference(interval(mark), macros.get(last.IDENTIFIER()));
		} else if (IDENTIFIER()) {
			return new PPUndefinedIdentifier(interval(mark), last.IDENTIFIER());
		}
		return null;
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
			if (allowInclude) {
				result = true;
			} else {
				syntaxError("Directive #include is disabled.");
				result = false;
			}
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

			
			Resource resource = resourceManager.resolve(path);
			if (resource == null) {
				syntaxWarning("resource '" + path + "' not found");
				return result;
			}
			
			while(WHITESPACE());
			if (!mandatory_endl()) {
				return result;
			}

			// exec include
			
			Location mark = lexer.location(); // <-- points to start of next line in current input (or EOF)
			Lexer previous = swapLexer(new Lexer(resource.getIdentifier(), resource.getData()));
			try {
				if (insertLineDirectives) {
					out.println("#line 1 " + resource.getIdentifier());
				}
				process();
				// insert CRLF if necessary
				if (lexer.current() != '\n') out.println();
				if (insertLineDirectives) {
					out.println("#line " + mark.getLine() + ' ' + mark.getSourceIdentifier());
				}
			} finally {
				if (previous != null) {
					swapLexer(previous);
				}
			}
		}
		
		return result;
	}
	
	


	private boolean macro_identifier() {
		Location reset = lexer.location();
		if (IDENTIFIER()) {
			if (macros.containsKey(last.IDENTIFIER())) {
				return true;
			} else {
				lexer.rewind(reset);
			}
		}
		return false;
	}


	
}
