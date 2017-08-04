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
import org.cakelab.glsl.lang.ast.Type.Rank;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.MacroCallExpression;
import org.cakelab.glsl.pp.ast.MacroInvocation;
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
import org.cakelab.glsl.pp.ast.Text;
import org.cakelab.glsl.pp.ast.PPWhitespace;

public class Preprocessor extends ParserBase {
	// TODO [1] managing macro expansion locations (especially with overlapping macro invocations through rescan)
	
	
	
	private ResourceManager resourceManager;
	/** this is where only valid preprocessed output goes. */
	private PreprocessedOutputSink outputStream;
	/** this is where valid and invalid/hidden preprocessed output goes. 
	 * It will refer to DEV_NULL when an error occurred (i.e. invalid output). */
	private PreprocessedOutputSink out;
	private MacroMap macros;
	private Macro currentMacroDefinition;

	private boolean allowInclude = false;
	private boolean insertLineDirectives = false;

	private PPGroupScope currentScope;

	// TODO [1] create preprocessor ast output
	private List<PPGroupScope> groups;
	private PPGroupScope globalScope;
	
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
		globalScope = new PPGroupScope(null);
		pushScope(globalScope);
		swapLexer(new Lexer(sourceIdentifier, in));
	}

	/** sets the resource manager, which is used to lookup resources
	 * referenced by #include directives.
	 * @param resourceManager
	 */
	public void setResourceManager(ResourceManager resourceManager) {
		this.resourceManager = resourceManager;
	}

	
	public void enableInclude(boolean enable) {
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
	public void enableLineDirectiveInsertion(boolean enable) {
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
		
		// main parser loop
		while(LA1() != Lexer.EOF) {
			if (!directive_line() && !text_line()) {
				syntaxError("illegal token");
				break;
			}
			commit_scans();
		}
		
		// check if all scopes of conditional inclusion are complete
		if (currentScope != globalScope) 
		{
			syntaxError("missing #endif");
		}
		return groups;
	}

	private void commit_scans() {
		Lexer proceed = lexer.commit();
		if (proceed != lexer) swapLexer(proceed);
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

			String output = text(true, true);
			if (output == null) {
				return false;
			} else if(!ENDL()) {
				syntaxError("unexpected tokens at end of text line");
				return false;
			} else {
				out.println();
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
	private String text(boolean print, boolean acceptHashes) {
		StringBuffer result = new StringBuffer();
		String s;
		do {
			s = null;
			
			Location mark = lexer.location();
			if (WHITESPACE()) {
				s = last.WHITESPACE();
			} else if (IDENTIFIER()) {
				String id = last.IDENTIFIER();
				Macro macro = macros.get(id);
				if (macro != null) {
					if (macro_recursion_check(mark, id)) {
						// macro cannot call itself, so its just a string
						s = id;
					} else {
						MacroReference reference = new MacroReference(interval(mark), macro);
						
						// presuming object like macro
						MacroInvocation invocation = reference;
						if (macro.isFunctionMacro()) {
							int i = nextTokenLookahead(1, true);
							if (LA(i) == '(') {
								// arguments following -> consume white spaces
								// and thereby skip to '('
								lexer.consume(i-1);
								assert(LA1() == '(');
								List<Text> args = macro_argument_list(macro);
								if (args != null) {
									// it is an invocation of a function like macro
									invocation = new MacroCallExpression(reference, args.toArray(new Text[0]), lexer.location());
								} else {
									// no or improper arguments
									// error has been reported, just proceed to next token
									continue;
								}
							} else {
								// not a function macro invocation, just an identifier.
								invocation = null;
								s = id;
							}
						}
						
						if (invocation != null) {
							macro_expansion(invocation, print);
							// expanded text has been added to input -> proceed to next token
							continue;
						}
					}
				} else {
					s = id;
				}
			} else {
				s = preprocessing_token(acceptHashes);
			}

			
			// store and forward output
			if (s != null) {
				result.append(s);
				if (print) out.print(s);
			} else {
				break;
			}
			
		} while (true);
		
		return result.toString();
	}

	private void macro_expansion(MacroInvocation macroInvocation, boolean print) {
		String prependingText;
		try {
			// execute macro expansion
			prependingText = ((Expression)macroInvocation).eval().value().getValue().toString();
			
			if (print) out.reportMacroExpansion(prependingText, macroInvocation);
			
			// rescan for more macro expansions
			// rescan happens after removing '#' and '##'. Any remaining 
			// '#' and '##' will be treated as common pp-token.
			if (prependingText == null || prependingText.isEmpty()) return;
			swapLexer(lexer.createPrependLexer(macroInvocation, prependingText));

		} catch (EvaluationException e) {
			syntaxError(e);
		}
	}

	private boolean has_directive_line_start() {
		if (!lexer.atColumnStart()) return false;
		int i = 1;
		int c;
		do {
			c = lexer.lookahead(i);
			i++;
		} while (!isEndl(c) && isWhite(c));
		if (c == '#') return true;
		else return false;
	}


	private boolean directive_line() {
		boolean result = false;

		// shortcut
		if (!has_directive_line_start()) return result;
		
		while(WHITESPACE());
		if (optional('#')) {
			result = true;
			while (WHITESPACE());
			
			if (
				   ifgroup()
				|| elifgroup()
				|| elsegroup()
				|| endif()) 
			{
				// those directive lines which control conditional 
				// inclusion are always visible.
				// They cannot be ignored, because we need to match
				// #if and #endif directives properly
			} else if (!currentScope.visible()) {
				// if the current conditional scope is not visible
				// the following directives will be ignored.
				skip_remaining_line();
			} else if (
				  ENDL() // empty directive
				||include()
				||define()
				||undef()
				||line()
				||error()
				||pragma()
				||extension()
				||version()
				)
			{
				// directive line has been processed;
			} else {
				syntaxError("unknown directive #" + read_remaining_line());
			}
		}
		return result;
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
				s = preprocessing_token(true);
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
		
		boolean result = false;
		if (optionalIDENTIFIER("define")) {
			result = true;
			Location start = lexer.location();
			while(WHITESPACE());
			if (!IDENTIFIER()) {
				syntaxError(line_start(start), "no macro name given in #define directive");
				return result;
			}
			String macroName = last.IDENTIFIER();
			
			List<MacroParameter> params = null;
			if (optional('(')) {
				params = new ArrayList<MacroParameter>();
				// macro parameters
				boolean firstIteration = true;
				do {
					while(WHITESPACE());
					Location tokenStart = lexer.location();
					if (DOTS()) {
						params.add(new MacroParameter(MacroParameter.__VA_ARGS__, this));
						break;
					} else if (IDENTIFIER()) {
						if (last.IDENTIFIER().equals(MacroParameter.__VA_ARGS__)) {
							syntaxWarning(interval(tokenStart), "__VA_ARGS__ can only appear in the expansion of a variadic macro");
						}
						params.add(new MacroParameter(last.IDENTIFIER(), this));
					} else if (firstIteration) {
						// empty parameter list
						break;
					} else {
						syntaxError("parameter name missing");
						return result;
					}
					while(WHITESPACE());
					firstIteration = false;
				} while(optional(','));

				mandatory(')');
			}
			while(WHITESPACE());
			
			
			currentMacroDefinition = new Macro(macroName, params);
			List<Expression> tokens = replacement_list();
			
			currentMacroDefinition.setReplacementList(tokens);
			
			Macro previousDefinition = macros.get(macroName);
			if (previousDefinition != null && !previousDefinition.equals(currentMacroDefinition)) {
				syntaxWarning(line_start(start), "\"" + macroName + "\" redefined");
			}

			macros.put(macroName, currentMacroDefinition);
			currentMacroDefinition = null;
			
			mandatory_endl();
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

	private Text whitespace() {
		Location start = lexer.location();
		if (WHITESPACE()) {
			return new PPWhitespace(interval(start),last.WHITESPACE());
		} else {
			return null;
		}
	}

	private Expression non_concat_expression() {
		Expression expr;
		Location start = lexer.location();
		expr = single_hash_expression();
		if (expr == null && IDENTIFIER()) {
			String id = last.IDENTIFIER();
			expr = macro_parameter_reference(id);
			if (expr == null) {
				expr = new Text(interval(start), id);
			}
		}
		if (expr == null) {
			// TODO [6] can be optimised
			String s = preprocessing_token(false); // anything not CRLF
			if (s != null) {
				expr = new Text(new Interval(start, lexer.location()), s);
			}
		}
		return expr;
	}

	/**
	 *  anything ## anything
	 *  
	 */
	private Expression concat_expression(List<Expression> replacement_list) {
		Location operatorStart = lexer.location();
		if (optional("##")) {
			Location operatorEnd = lexer.location();
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
				if (left == null) left = new ExpressionError(new Interval(operatorStart, operatorStart), "", "missing left operand to concatenation in macro replacement list");
				if (right == null) right = new ExpressionError(new Interval(operatorEnd, operatorEnd), "", "missing right operand to concatenation in macro replacement list");
			}
			if (left instanceof MacroParameterReference) ((MacroParameterReference)left).expand(false);
			if (right instanceof MacroParameterReference) ((MacroParameterReference)right).expand(false);
			return new PPConcatExpression(new Interval(left.getStart(), right.getEnd()), left, right);
		}
		return null;
	}


	private MacroParameterReference macro_parameter_reference(String id) {
		Location mark = lexer.location();
		MacroParameter param = currentMacroDefinition.getParameter(id);
		if (param != null) {
			return new MacroParameterReference(interval(mark), param);
		} else {
			if (id.equals(MacroParameter.__VA_ARGS__)) syntaxWarning(mark, "__VA_ARGS__ can only appear in the expansion of a variadic macro");
		}
		return null;
	}

	private Expression single_hash_expression() {
		Location mark = lexer.location();
		if (optional('#')) {
			assert !LA_equals('#') : "reminder: scanning for ## has to appear before # scanning";
			
			
			// Iff macro has parameters, # has to be followed by 
			// a macro parameter reference.
			// Otherwise, it is an ordinary pp-token
			if (currentMacroDefinition.isFunctionMacro()) {
				// must be followed by a macro parameter
				MacroParameterReference param = null;
				while (WHITESPACE());
				if (IDENTIFIER()) {
					String id = last.IDENTIFIER();
					param = macro_parameter_reference(id);
				}
				
				if (param == null) {
					return expressionError(mark, "# is not followed by a macro parameter");
				}
				else 
				{
					param.expand(false);
					return new PPStringifyExpression(mark, param);
				}
			} else {
				return new Text(interval(mark), "#");
			}
		}
		return null;
	}
	

	
	private String preprocessing_token(boolean acceptHashes) {
		if (IDENTIFIER()) {
			return last.IDENTIFIER();
		} else {
			
			// strings and character constants are not parsed for macro invocations
			Value expr = string_literal();
			if (expr != null) {
				return lexer.getText(expr.getInterval());
			}
			
			expr = character_constant();
			if (expr != null) {
				return lexer.getText(expr.getInterval());
			}

			// TODO [3] improve performance by parsing numbers 

			if (!isWhite(LA1()) && !isEndl(LA1()) && !(LA_equals('#') && !acceptHashes)) {
				int c = lexer.consume();
				return String.valueOf((char)c);
			} else {
				return null;
			}
		}
	}


	private List<Text> macro_argument_list(Macro macro) {
		
		if (optional('(')) {
			while(whitespace_crlf_sequence());
			
			List<Text> arguments = new ArrayList<Text>();
			int numParameters = macro.numParameters();
			boolean hasVarArgs = macro.hasVarArgs();
			
			if (!LA_equals(')')) {
				do {
					while(whitespace_crlf_sequence());
					Location paramStart = lexer.location();
					if (hasVarArgs && arguments.size() == numParameters-1) {
						StringBuffer varargs = new StringBuffer();
						macro_variadic_arguments(varargs);
						arguments.add(new Text(interval(paramStart), varargs.toString()));
						break;
					}
					String param = macro_arg();
					if (param != null) arguments.add(new Text(interval(paramStart), param));
					else arguments.add(Text.EMPTY);
					while(whitespace_crlf_sequence());
				} while (optional(','));
			}
			
			if (!optional(')')) syntaxError("missing closing ')'");

			if (macro.numParameters() != arguments.size()) {
				if (arguments.size() == 0 && macro.numParameters() == 1) {
					arguments.add(Text.EMPTY);
				} else {
					syntaxError(line_start(lexer.location()), "macro \"" + macro.getName() + "\" requires " + macro.numParameters() + " arguments, but only " + arguments.size() + " where given.");
					return null;
				}
			}
			
			return arguments;
		} else {
			return null;
		}
	}

	private String macro_arg() {
		// macro parameters can contain anything, even CRLF, but not ',' or ')' alone.
		// ',' can occur in parenthesised expressions though.
		StringBuffer arg = new StringBuffer();
		macro_arg_token_sequence(arg, ",)");
		String result = arg.toString().trim();
		return result;
	}

	private void macro_variadic_arguments(StringBuffer varargs) {
		// same rules as for macro_arg, but ',' is no longer a delimiter.
		macro_arg_token_sequence(varargs, ")");
	}

	private boolean macro_arg_parenthesised(StringBuffer arg) {
		if (LA1() == '(') {
			arg.append((char)lexer.consume());
			macro_arg_token_sequence(arg, ")");
			int c = LA1();
			if (c == ')') {
				arg.append((char)c);
				lexer.consume();
			} else {
				syntaxError("missing closing ')' in parenthesised macro argument");
			}
			return true;
		}
		return false;
	}

	/**
	 * Method gathers all tokens for a macro argument until one of 
	 * the given delimiters (e.g. ',' and/or ')') is found.
	 * <p>
	 * If a macro has variadic parameters (i.e. last param: '...')
	 * then the remaining parameters to a macro invocation
	 * will be gathered in one single string parameter
	 * which is assigned to __VA_ARGS__.
	 * </p>
	 * <p>
	 * Delimiters occurring in strings, character constants 
	 * or comments will be ignored.
	 * </p>
	 * @param arg
	 */
	private void macro_arg_token_sequence(StringBuffer arg, String delimiters) {
		int c = LA1();
		while (delimiters.indexOf(c) == -1 && !lexer.eof()) {
			Value expr = null;
			if (whitespace_crlf_sequence()) {
				arg.append(' ');
			} else if (macro_arg_parenthesised(arg)) {
				// another pair of parenthesis
			} else if (null != (expr = string_literal())) {
				arg.append(lexer.getText(expr.getInterval()));
			} else if (null != (expr = character_constant())) {
				arg.append(lexer.getText(expr.getInterval()));
			} else {
				arg.append((char)lexer.consume());
			}
			c = LA1();
		}
	}


	/**
	 * Called during macro invocation to expand arguments on demand (if required).
	 * <p>
	 * Macro arguments cannot be expanded the usual way, because only the text 
	 * of the argument has to be expanded and rescanned without the following
	 * text of the file (this is the only difference).
	 * </p>
	 * @param origin Origin of the arguments text
	 * @param argument The arguments text to be expanded.
	 * @return Expanded argument.
	 */
	public String macro_expand_argument(Location origin, String argument) {
		// and parse that macro expanded text for the expression
		Lexer previous = swapLexer(Lexer.createPreprocessedOutputLexer(origin, argument));
		try {
			return text(false, true);
		} finally {
			if (previous != null) swapLexer(previous);
		}
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
	

	private boolean ifgroup() {
		PPIfScope ifscope = null;
		Expression condition = null;
		if (optionalIDENTIFIER("if")) {
			ifscope = new PPIfScope(currentScope);
			while(WHITESPACE());
			condition = directive_condition();
			if (condition == null) {
				condition = expressionError("#if with no expression");
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
			return true;
		} else {
			return false;
		}
	}


	private boolean elifgroup() {
		PPElifScope elifscope = null;
		if (optionalIDENTIFIER("elif")) {
			PPGroupScope predecessor = currentScope;
			if (predecessor == null || !(predecessor instanceof PPIfScope)) syntaxError("#elif must follow #if* or #elif group");
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
		}
		return elifscope != null;
	}

	private boolean elsegroup() {
		PPElseScope elsescope = null;
		if (optionalIDENTIFIER("else")) {
			PPGroupScope predecessor = currentScope;
			if (predecessor == null || !(predecessor instanceof PPIfScope)) syntaxError("#else must follow #if* or #elif group");
			popScope();
			elsescope = new PPElseScope(currentScope, (PPIfScope) predecessor);
			while(WHITESPACE());
			mandatory_endl();
			pushScope(elsescope);
		}
		return elsescope != null;
	}

	private boolean endif() {
		boolean result = false;
		if (optionalIDENTIFIER("endif")) {
			result = true;
			PPGroupScope predecessor = currentScope;
			if (predecessor == null) syntaxError("#endif must follow #if*, #elif or #else group");
			popScope();
			while(WHITESPACE());
			mandatory_endl();
		}
		return result;
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
		
		// retrieve macro expanded remainder of current line 
		String text = text(false, true);
		
		// and parse that macro expanded text for the expression
		Lexer previous = swapLexer(Lexer.createPreprocessedOutputLexer(textOrigin, text));
		try {
			return expression();
		} finally {
			if (previous != null) swapLexer(previous);
		}
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
		if (STRING_LITERAL('\'')) {
			String value = last.STRING_LITERAL();
			if (value.length() > 1) {
				return expressionError(mark, "character constant to long");
			}
			else if (value.length() == 0) {
				return expressionError(mark, "missing character");
			}
			return new ConstantValue<Character>(interval(mark), value.charAt(0));
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
		if (IDENTIFIER()) {
			String id = last.IDENTIFIER();
			Macro macro = macros.get(id);
			if (macro == null) {
				return new PPUndefinedIdentifier(interval(mark), last.IDENTIFIER());
			} else {
				return new MacroReference(interval(mark), macros.get(last.IDENTIFIER()));
			}
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
	
	

	/**
	 * Check if identifier lies in a macro expanded section of a macro with 
	 * the same name.
	 * <p>
	 * Recursive macro calls are basically not possible. Thus, inside of 
	 * a section expanded from a macro invocation, the same macro cannot 
	 * be called again. This method checks it and returns true if the given
	 * identifier would be a recursive call.
	 * </p>
	 * @param location
	 * @param identifier
	 * @return
	 */
	private boolean macro_recursion_check(Location location, String identifier) {
		if (location instanceof MacroExpandedLocation) {
			MacroExpandedLocation mloc = (MacroExpandedLocation)location;
			Macro macro = mloc.getMacroInvocation().getMacro();
			if (macro.getName().equals(last.IDENTIFIER())) {
				return true;
			} else {
				// we need to recursively check if this macro invocation was already in
				// a macro expanded section of another macro invocation.
				return macro_recursion_check(mloc.getMacroInvocation().getStart(), identifier);
			}
		} else {
			return false;
		}
	}


	
}
