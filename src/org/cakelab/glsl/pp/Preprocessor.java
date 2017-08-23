package org.cakelab.glsl.pp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.cakelab.glsl.GLSLExtension;
import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.impl.StandardFileManager;
import org.cakelab.glsl.lang.EvaluationException;
import org.cakelab.glsl.lang.ast.ConstantValue;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.ast.Macro;
import org.cakelab.glsl.pp.ast.MacroCallExpression;
import org.cakelab.glsl.pp.ast.MacroInvocation;
import org.cakelab.glsl.pp.ast.MacroParameter;
import org.cakelab.glsl.pp.ast.MacroParameterReference;
import org.cakelab.glsl.pp.ast.MacroReference;
import org.cakelab.glsl.pp.ast.NodeList;
import org.cakelab.glsl.pp.ast.PPConcatExpression;
import org.cakelab.glsl.pp.ast.PPElifScope;
import org.cakelab.glsl.pp.ast.PPElseScope;
import org.cakelab.glsl.pp.ast.PPGroupScope;
import org.cakelab.glsl.pp.ast.PPIfScope;
import org.cakelab.glsl.pp.ast.PPIfdefScope;
import org.cakelab.glsl.pp.ast.PPIfndefScope;
import org.cakelab.glsl.pp.ast.PPStringifyExpression;
import org.cakelab.glsl.pp.error.ExpressionError;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.IScanner.EofFuture;
import org.cakelab.glsl.pp.scanner.PPTokenScanner;
import org.cakelab.glsl.pp.scanner.ScannerManager;
import org.cakelab.glsl.pp.scanner.StreamScanner;
import org.cakelab.glsl.pp.tokens.TAny;
import org.cakelab.glsl.pp.tokens.TAtom;
import org.cakelab.glsl.pp.tokens.THeaderPath;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class Preprocessor extends Parser implements MacroInterpreter {
	
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

	private GLSLVersion glslVersion;

	private ArrayList<GLSLExtension> extensions;

	private boolean seenCodeLine;
	
	
	
	/**
	 * Construct a preprocessor for standalone preprocessing (without language parsing).
	 * @param sourceIdentifier
	 * @param in
	 * @param out
	 */
	public Preprocessor(String sourceIdentifier, InputStream in, OutputStream out) {
		this(sourceIdentifier, in, new PreprocessedOutput(out));
	}

	public Preprocessor(String sourceIdentifier, InputStream in, PreprocessedOutputSink out) {
		allowInclude = true;
		insertLineDirectives = true;
		
		outputStream = out;
		resourceManager = new StandardFileManager();
		macros = new MacroMap();
		globalScope = new PPGroupScope(null);
		pushScope(globalScope);
		super.in = new ScannerManager(new StreamScanner(sourceIdentifier, in));
		
		extensions = new ArrayList<GLSLExtension>();
		
		seenCodeLine = false;
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
		StreamScanner scanner = new StreamScanner("-- predefined --", in);
		IScanner.EofFuture eof = new IScanner.EofFuture();
		scanner.addOnEofHandler(eof);
		pushScanner(scanner);
		
		define();
		assert eof.occurred();
		// TODO: maybe check for errors in predefinitions before proceeding
	}
	
	public void addDefine(Macro macro) {
		macros.put(macro.getName(), macro);
	}
	
	
	protected void pushScanner(IScanner scanner) {
		((ScannerManager)in).push(scanner);
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
		PPGroupScope parent = currentScope.getParent();
		currentScope = parent;
		setScopeVisibility();
	}


	
	public void parse() {
		process();
	}
	
	public List<PPGroupScope> process() {
		
		// main parser loop
		while(LA1() != StreamScanner.EOF) {
			if (!directive_line() && !text_line()) {
				syntaxError("illegal token");
				break;
			}
		}
		if (!in.eof()) in.consume(); // consume EOF
		// check if all scopes of conditional inclusion are complete
		if (currentScope != globalScope) 
		{
			syntaxError("missing #endif");
		}
		return groups;
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
			} else {
				Location mark = in.nextLocation();
				if (CRLF()) out.println(interval(mark));
				else if (LA1() != IScanner.EOF) {
					syntaxError("invalid tokens");
				}
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
	private TokenList text_tokens(boolean print, boolean acceptHashes) {
		TokenList result = new TokenList();
		Token t;
		do {
			t = null;
			
			Location mark = in.nextLocation();
			if (WHITESPACE()) {
				t = token;
			} else if (IDENTIFIER()) {
				seenCodeLine = true;
				TIdentifier id = (TIdentifier) token;
				Macro macro = macros.get(id.getText());
				if (macro != null) {
					if (macro_recursion_check(mark, id.getText())) {
						// macro cannot call itself, so its just a string
						t = id;
					} else {
						MacroReference reference = new MacroReference(interval(mark), macro);
						
						// presuming object like macro
						MacroInvocation invocation = reference;
						if (macro.isFunctionMacro()) {
							int i = nextTokenLookahead(1, true);
							if (LA(i) == '(') {
								// arguments following -> consume white spaces
								// and thereby skip to '('
								in.consume(i-1);
								assert(LA1() == '(');
								TokenList[] args = macro_argument_list(macro);
								if (args != null) {
									// it is an invocation of a function like macro
									invocation = new MacroCallExpression(reference, args, in.location());
								} else {
									// no or improper arguments
									// error has been reported, just proceed to next token
									continue;
								}
							} else {
								// not a function macro invocation, just an identifier.
								invocation = null;
								t = id;
							}
						}
						
						if (invocation != null) {
							macro_expansion(invocation, print);
							// expanded text has been added to input -> proceed to next token
							continue;
						}
					}
				} else {
					t = id;
				}
			} else {
				t = preprocessing_token(acceptHashes);
				if (t != null) seenCodeLine = true;
			}

			
			// store and forward output
			if (t != null) {
				result.add(t);
				if (print) out.print(t);
			} else {
				break;
			}
			
		} while (true);
		
		return result;
	}

	
	private String text(boolean print, boolean acceptHashes) {
		StringBuffer result = new StringBuffer();
		TokenList tokens = text_tokens(print,acceptHashes);
		for (Token t : tokens) {
			result.append(t.getText());
		}
		return result.toString();
	}

	private void macro_expansion(MacroInvocation macroInvocation, boolean print) {
		TokenList prependingText;
		try {
			// execute macro expansion
			prependingText = macroInvocation.eval();

			// rescan for more macro expansions
			// rescan happens after removing '#' and '##'. Any remaining 
			// '#' and '##' will be treated as common pp-token.
			if (prependingText == null || prependingText.isEmpty()) return;
			pushScanner(new PPTokenScanner(prependingText));

		} catch (EvaluationException e) {
			syntaxError(e);
		}
	}

	private boolean has_directive_line_start() {
		if (!in.atColumnStart()) return false;
		int i = 1;
		int c;
		do {
			c = in.lookahead(i);
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
			seenCodeLine = true;
		}
		return result;
	}


	private boolean version() {
		boolean result = false;
		if (optionalIDENTIFIER("version")) {
			Location start = token.getStart();
			result = true;
			while(WHITESPACE());
			if (!NUMBER_DEC()) {
				syntaxError("missing version number");
			} else {
				Expression decoded = decodeNumber((TNumber) token);
				int number = -1;
				if (decoded instanceof ConstantValue) {
					@SuppressWarnings("unchecked")
					ConstantValue<Long> intVal = ((ConstantValue<Long>)decoded);
					number = ((Long) intVal.value().getNativeValue()).intValue();
				}
				while(WHITESPACE());
				GLSLVersion.Profile profile = null;
				if (optionalIDENTIFIER("core")) {
					profile = GLSLVersion.Profile.CORE;
				} else if (optionalIDENTIFIER("compatibility")) {
					profile = GLSLVersion.Profile.COMPATIBILITY;
				} else if (optionalIDENTIFIER("es")) {
					profile = GLSLVersion.Profile.ES;
				} else {
					while(WHITESPACE());
					String s = text(false, true);
					if (s.length() > 0) syntaxError(decoded.getEnd(), "invalid profile identifier '" + s + "'");
				}
				while(WHITESPACE());
				mandatory_endl();

				
				if (glslVersion == null) {
					if (seenCodeLine) syntaxWarning(start, "#version directive can not be preceeded by code lines");
					if (number > 0) glslVersion = new GLSLVersion(interval(start), number, profile);
				} else {
					syntaxWarning(start, "version redefined");
				}
			}
		}
		return result;
	}

	private boolean extension() {
		boolean result = false;
		if (optionalIDENTIFIER("extension")) {
			Location start = token.getStart();
			result = true;
			while(WHITESPACE());
			if (!IDENTIFIER()) {
				syntaxError("missing extension name");
			} else {
				TIdentifier identifier = (TIdentifier)token;
				while(WHITESPACE());
				mandatory(':');
				while(WHITESPACE());
				
				GLSLExtension.Behaviour behaviour = null;
				if (optionalIDENTIFIER("require")) {
					behaviour = GLSLExtension.Behaviour.REQUIRE;
				} else if (optionalIDENTIFIER("enable")) {
					behaviour = GLSLExtension.Behaviour.ENABLE;
				} else if (optionalIDENTIFIER("warn")) {
					behaviour = GLSLExtension.Behaviour.WARN;
				} else if (optionalIDENTIFIER("disable")) {
					behaviour = GLSLExtension.Behaviour.DISABLE;
				} else {
					syntaxError("missing extension behaviour (one of [require, enable, warn, disable])");
				}
				while(WHITESPACE());
				mandatory_endl();
				
				if (identifier != null && behaviour != null) {
					extensions.add(new GLSLExtension(interval(start), identifier.getText(), behaviour));
				}
				
			}
		}
		return result;
	}

	private boolean pragma() {
		// TODO [1] implement pragma
		if (optionalIDENTIFIER("pragma")) {
			// all preprocessing tokens except whitespace
			Token t;
			TokenList tokens = new TokenList();
			do {
				t = preprocessing_token(true);
				if (t != null) tokens.add(t);
			} while(t != null || WHITESPACE());
			mandatory_endl();
			return true;
		} else {
			return false;
		}
	}

	private boolean error() {
		if (optionalIDENTIFIER("error")) {
			StringBuffer message = new StringBuffer("#error");
			while(WHITESPACE()) message.append(token.getText());
			Location loc = in.location();
			message.append(read_remaining_line());
			syntaxError(line_start(loc), message.toString());
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
					line = Integer.valueOf(token.getText());
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
					id = Integer.valueOf(token.getText());
					if (id < 0) throw new NumberFormatException("signed integer");
				} catch (NumberFormatException e) {
					syntaxError("not a valid source identifier. Positive integer allowed only");
					return result;
				}
			}
			while(WHITESPACE());
			if (mandatory_endl()) {
				if (id >= 0) {
					in.setVirtualLocation(Integer.toString(id), line);
				} else {
					in.setVirtualLocation(line);
				}
			}
		}
		return result;
	}
	

	private boolean define() {
		
		boolean result = false;
		if (optionalIDENTIFIER("define")) {
			result = true;
			while(WHITESPACE());
			Location start = in.nextLocation();
			if (!IDENTIFIER()) {
				syntaxError(start, "no macro name given in #define directive");
				return result;
			}
			String macroName = token.getText();
			
			List<MacroParameter> params = null;
			if (optional('(')) {
				params = new ArrayList<MacroParameter>();
				// macro parameters
				boolean firstIteration = true;
				do {
					while(WHITESPACE());
					Location tokenStart = in.nextLocation();
					if (DOTS()) {
						params.add(new MacroParameter(MacroParameter.__VA_ARGS__, this));
						break;
					} else if (IDENTIFIER()) {
						if (token.getText().equals(MacroParameter.__VA_ARGS__)) {
							syntaxWarning(interval(tokenStart), "__VA_ARGS__ can only appear in the expansion of a variadic macro");
						}
						params.add(new MacroParameter(token.getText(), this));
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
			
			
			currentMacroDefinition = new Macro(macroName, params, interval(start));
			NodeList<Node> list = replacement_list();
			
			currentMacroDefinition.setReplacementList(list);
			
			Macro previousDefinition = macros.get(macroName);
			if (previousDefinition != null && !previousDefinition.equals(currentMacroDefinition)) {
				syntaxWarning(start, "\"" + macroName + "\" redefined");
			}

			macros.put(macroName, currentMacroDefinition);
			currentMacroDefinition = null;
			
			mandatory_endl();
		}
		return result;
	}

	private NodeList<Node> replacement_list() {
		NodeList<Node> result = new NodeList<Node>();
		Node expr;
		do {
			expr = concat_expression(result);
			if (expr == null) expr = whitespace();
			if (expr == null) expr = non_concat_expression();
			if (expr != null) result.add(expr);
		} while(null != expr);
		
		result.trim(NodeList.Filter_WHITESPACE);
		return result;
	}

	private Token whitespace() {
		if (WHITESPACE()) {
			return token;
		} else {
			return null;
		}
	}

	private Node non_concat_expression() {
		Node expr;
		expr = single_hash_expression();
		if (expr == null && IDENTIFIER()) {
			Token ident = token;
			String id = ident.getText();
			expr = macro_parameter_reference(id);
			if (expr == null) {
				// just an identifier
				expr = ident;
			}
		}
		if (expr == null) {
			expr = preprocessing_token(false); // anything not CRLF
		}
		return expr;
	}

	/**
	 *  anything ## anything
	 *  
	 */
	private Node concat_expression(List<Node> replacement_list) {
		Location operatorStart = in.nextLocation();
		if (optional("##")) {
			Location operatorEnd = in.location();
			//
			// rewind to last non whitespace token in replacement list
			//
			Node left = null;
			for (int i = replacement_list.size()-1; i >= 0; i--) {
				Node token = replacement_list.remove(i);
				if (token instanceof TWhitespace) {
					// just whitespace or comment -> ignore
					continue;
				} else {
					left = token;
					break;
				}
			}
			
			// remove all following whitespace
			while(WHITESPACE());
			
			Node right = non_concat_expression();
			
			if (left == null || right == null) {
				syntaxError("'##' cannot appear at either end of a macro expansion");
				if (left == null) left = new ExpressionError(new Interval(operatorStart, operatorStart), "missing left operand to concatenation in macro replacement list");
				if (right == null) right = new ExpressionError(new Interval(operatorEnd, operatorEnd), "missing right operand to concatenation in macro replacement list");
			}
			if (left instanceof MacroParameterReference) ((MacroParameterReference)left).setRequireExpansion(false);
			if (right instanceof MacroParameterReference) ((MacroParameterReference)right).setRequireExpansion(false);
			return new PPConcatExpression(this, new Interval(operatorStart, operatorEnd), left, right);
		}
		return null;
	}


	private MacroParameterReference macro_parameter_reference(String id) {
		Location mark = in.nextLocation();
		MacroParameter param = currentMacroDefinition.getParameter(id);
		if (param != null) {
			return new MacroParameterReference(interval(mark), param);
		} else {
			if (id.equals(MacroParameter.__VA_ARGS__)) syntaxWarning(mark, "__VA_ARGS__ can only appear in the expansion of a variadic macro");
		}
		return null;
	}

	private Node single_hash_expression() {
		Location mark = in.nextLocation();
		if (optional('#')) {
			assert !LA_equals('#') : "reminder: scanning for ## has to appear before # scanning";
			
			
			// Iff macro has parameters, # has to be followed by 
			// a macro parameter reference.
			// Otherwise, it is an ordinary pp-token
			if (currentMacroDefinition.isFunctionMacro()) {
				// must be followed by a macro parameter
				MacroParameterReference paramRef = null;
				while (WHITESPACE());
				if (IDENTIFIER()) {
					String id = token.getText();
					paramRef = macro_parameter_reference(id);
				}
				
				if (paramRef == null) {
					return expressionError(mark, "# is not followed by a macro parameter");
				}
				else 
				{
					paramRef.setRequireExpansion(false);
					return new PPStringifyExpression(interval(mark), paramRef);
				}
			} else {
				return new TPunctuator(interval(mark), "#");
			}
		}
		return null;
	}
	

	
	private Token preprocessing_token(boolean acceptHashes) {
		if (IDENTIFIER()) {
			return token;
		} else if (CHAR_SEQUENCE('"') || CHAR_SEQUENCE('\'')) {
			// strings and character constants are not parsed for macro invocations
			return token;
		} else if (PUNCTUATOR(acceptHashes)) {
			return token;
		} else if (NUMBER()) {
			return token;
		} else if (!isWhite(LA1()) && !isEndl(LA1()) && !(LA_equals('#') && !acceptHashes)) {
			Location start = in.nextLocation();
			int c = in.consume();
			return new TAtom(interval(start), String.valueOf((char)c));
		} else {
			return null;
		}
	}

	private TokenList[] macro_argument_list(Macro macro) {
		
		
		
		if (optional('(')) {
			while(whitespace_crlf_sequence());
			
			List<TokenList> arguments = new ArrayList<TokenList>();
			int numParameters = macro.numParameters();
			boolean hasVarArgs = macro.hasVarArgs();
			
			if (!LA_equals(')')) {
				do {
					while(whitespace_crlf_sequence());
					if (hasVarArgs && arguments.size() == numParameters-1) {
						TokenList varargs = new TokenList();
						macro_variadic_arguments(varargs);
						arguments.add(varargs);
						break;
					}
					TokenList param = macro_arg();
					arguments.add(param);
					while(whitespace_crlf_sequence());
				} while (optional(','));
			}
			
			if (!optional(')')) syntaxError("missing closing ')'");

			if (macro.numParameters() != arguments.size()) {
				if (arguments.size() == 0 && macro.numParameters() == 1) {
					arguments.add(new TokenList()); // add an empty argument
				} else {
					syntaxError(line_start(in.location()), "macro \"" + macro.getName() + "\" requires " + macro.numParameters() + " arguments, but only " + arguments.size() + " where given.");
					return null;
				}
			}
			
			return arguments.toArray(new TokenList[0]);
		} else {
			return null;
		}
	}

	private TokenList macro_arg() {
		// macro parameters can contain anything, even CRLF, but not ',' or ')' alone.
		// ',' can occur in parenthesised expressions though.
		TokenList arg = new TokenList();
		macro_arg_token_sequence(arg, ",)");
		arg.trim();
		return arg;
	}

	private void macro_variadic_arguments(TokenList varargs) {
		// same rules as for macro_arg, but ',' is no longer a delimiter.
		macro_arg_token_sequence(varargs, ")");
	}

	private boolean macro_arg_parenthesised(TokenList varargs) {
		Location start = in.nextLocation();
		if (optional('(')) {
			
			varargs.add(new TPunctuator(interval(start), "("));
			macro_arg_token_sequence(varargs, ")");
			start = in.nextLocation();
			if (optional(')')) {
				varargs.add(new TPunctuator(interval(start), ")"));
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
	 * @param varargs
	 */
	private void macro_arg_token_sequence(TokenList varargs, String delimiters) {
		int c = LA1();
		while (delimiters.indexOf(c) == -1 && !in.eof()) {
			if (whitespace_crlf_sequence()) {
				TWhitespace blank = new TWhitespace(token.getInterval(), " ");
				varargs.add(blank);
			} else if (macro_arg_parenthesised(varargs)) {
				// another pair of parenthesis
			} else if (CHAR_SEQUENCE('"')) {
				varargs.add(token);
			} else if (CHAR_SEQUENCE('\'')) {
				varargs.add(token);
			} else if (PUNCTUATOR(true)) {
				varargs.add(token);
			} else if (NUMBER()) {
				varargs.add(token);
			} else {
				Location start = in.nextLocation();
				varargs.add(new TAtom(interval(start), (char)in.consume()));
			}
			c = LA1();
		}
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
			if (macro.getName().equals(token.getText())) {
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
	@Override
	public TokenList macro_expand_argument(TokenList tokens) {
		// and parse that macro expanded text for the expression
		// TODO: macro arg expansion requires isolated scanner (+ parser?) (input is not preprocessed)
		IScanner previous = in;
		try {
			if (tokens.size() == 0) return tokens;
			
			IScanner scanner = new PPTokenScanner(tokens);
			IScanner.EofFuture eof = new IScanner.EofFuture();
			scanner.addOnEofHandler(eof);
			in = new ScannerManager(scanner);
			tokens = text_tokens(false, true);
			scanner.consume();
			assert (!CRLF()) : "internal error: CRLF has to be replaced by ' ' during argument parsing";
			assert (eof.occurred());
			return tokens;
		} finally {
			in = previous;
		}
	}

	@Override
	public Token macro_join_tokens(Token left, Token right) {
		// join two tokens parse for a single new, legal preprocessing token
		IScanner previous = in;
		try {
			TokenList tokens = new TokenList();
			tokens.add(left);
			tokens.add(right);
			IScanner scanner = new PPTokenScanner(tokens);
			IScanner.EofFuture eof = new IScanner.EofFuture();
			scanner.addOnEofHandler(eof);
			in = new ScannerManager(scanner);
			Token token = preprocessing_token(true);
			scanner.consume();
			if (token == null || !eof.occurred()) {
				syntaxError("pasting \"" + left.getText() + "\" and \"" + right.getText() + "\" does not give a valid preprocessing token");
			}
			return token;
		} finally {
			in = previous;
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
			String macro = token.getText();
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
		Node condition = null;
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
				condition = expressionError(in.location(), "missing identifier");
			}
		} else if (optionalIDENTIFIER("ifndef")) {
			ifscope = new PPIfndefScope(currentScope);
			while(WHITESPACE());
			condition = identifier();
			if (condition == null) {
				condition = expressionError(in.location(), "missing identifier");
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
			Node expr = directive_condition();
			if (expr == null) {
				expr = expressionError(in.location(), "missing condition to elif directive");
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

		// retrieve macro expanded remainder of current line 
		TokenList tokens = text_tokens(false, true);
		
		// and parse that macro expanded text for the expression
		// FIXME condition parsing requires preprocessed output scanner
		ExpressionParser parser = new ExpressionParser(ScannerManager.createPreprocessedTokensScanner(tokens), errorHandler);
		return parser.expression();
	}
	
	private Node identifier() {
		if (IDENTIFIER()) {
			String id = token.getText();
			Macro macro = macros.get(id);
			if (macro == null) {
				return token;
			} else {
				return new MacroReference(token.getInterval(), macros.get(token.getText()));
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
				syntaxError(token.getStart(), "Directive #include is disabled.");
				result = false;
			}
			while(WHITESPACE());
			String path;
			Token tpath = null;
			if (HEADER_PATH()) {
				tpath = token;
				path = ((THeaderPath)tpath).getPath();
			} else if (CHAR_SEQUENCE('"')){
				tpath = token;
				path = decodeCharSequence(tpath.getText(), '"', '"');
			} else {
				syntaxError("missing include file path");
				return result;
			}

			Resource resource;
			try {
				resource = resourceManager.resolve(path);
			} catch (IOException e) {
				syntaxWarning(tpath.getStart(), e.getMessage());
				return result;
			}
			
			while(WHITESPACE());
			if (!mandatory_endl()) {
				return result;
			}

			// exec include
			
			Location mark = in.nextLocation(); // <-- points to start of next line in current input (or EOF)
			IScanner includeScanner = ScannerManager.createScanner(resource.getIdentifier(), resource.getData());
			pushScanner(includeScanner);
			EofFuture eof = null;
			if (insertLineDirectives) {
				out.println(new TAny(interval(mark), "#line 1 " + resource.getIdentifier()));
				eof = new IScanner.EofFuture() {
					@Override
					public void run() {
						// insert CRLF if necessary
						if (includeScanner.current() != '\n') {
							out.println(new Interval(in.location(), in.location()));
						}
						// add another #line directive iff we will resume parsing
						if (!in.eof()) {
							out.println(new TAny(interval(mark), "#line " + mark.getLine() + ' ' + mark.getSourceIdentifier()));
						}
						super.run();
					}
					
				};
				includeScanner.addOnEofHandler(eof);
			}
			// FIXME we don't need to call process for include, because parsing will proceed at next line anyway
			// and newline will be added automatically by the eofHandler above.
			process();
			
			assert (eof == null || eof.occurred());
		}
		
		return result;
	}

	

	
}
