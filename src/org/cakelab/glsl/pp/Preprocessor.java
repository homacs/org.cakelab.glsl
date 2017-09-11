package org.cakelab.glsl.pp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.impl.StandardFileManager;
import org.cakelab.glsl.lang.EvaluationException;
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
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.error.ExpressionError;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.error.SyntaxError;
import org.cakelab.glsl.pp.lexer.ILexer;
import org.cakelab.glsl.pp.lexer.PPLexer;
import org.cakelab.glsl.pp.lexer.TokenListLexer;
import org.cakelab.glsl.pp.output.PreprocessedOutputStream;
import org.cakelab.glsl.pp.parser.ErrorParser;
import org.cakelab.glsl.pp.parser.ExpressionParser;
import org.cakelab.glsl.pp.parser.ExtensionParser;
import org.cakelab.glsl.pp.parser.IncludeParser;
import org.cakelab.glsl.pp.parser.LineParser;
import org.cakelab.glsl.pp.parser.Parser;
import org.cakelab.glsl.pp.parser.PragmaParserSet;
import org.cakelab.glsl.pp.parser.VersionParser;
import org.cakelab.glsl.pp.parser.pragmas.GlslPragmasParser;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.StreamScanner;
import org.cakelab.glsl.pp.tokens.TCharacterConstant;
import org.cakelab.glsl.pp.tokens.TCrlf;
import org.cakelab.glsl.pp.tokens.TEof;
import org.cakelab.glsl.pp.tokens.THash;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TPunctuator;
import org.cakelab.glsl.pp.tokens.TStringLiteral;
import org.cakelab.glsl.pp.tokens.TUnknownToken;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class Preprocessor extends Parser implements MacroInterpreter {
	
	
	/** this is where only valid preprocessed output goes. */
	private PPOutputSink outputStream;



	// TODO [1] create preprocessor ast output
	private List<PPGroupScope> groups;
	private PPGroupScope globalScope;

	private ExpressionParser expressionParser;

	private IncludeParser includeParser;
	private VersionParser versionParser;
	private ErrorParser errorParser;
	private LineParser lineParser;
	private PragmaParserSet pragmaParser;


	private ExtensionParser extensionParser;


	/**
	 * This lexer is responsible to generate tokens of the 
	 * original source. It will never see for example included 
	 * sources!
	 * 
	 * This lexer is used to identify and forward tokens of the 
	 * original source to the TokenListener for text 
	 * highlighting purposes.
	 */
	private PPLexer originalSourceLexer;
	
	
	/**
	 * Construct a preprocessor for standalone preprocessing (without language parsing).
	 * @param sourceIdentifier
	 * @param in
	 * @param out
	 */
	public Preprocessor(Resource resource, OutputStream out) {
		this(resource, new PreprocessedOutputStream(out));
	}

	public Preprocessor(Resource resource, PPOutputSink out) {
		super(new PPState(resource));
		state.setInputResource(resource);
		originalSourceLexer = new PPLexer(new StreamScanner(resource), state);
		
		state.setErrorHandler(new StandardErrorHandler());
		state.setLexer(originalSourceLexer);
		state.setInsertLineDirectives(true);

		out.init(state);
		
		outputStream = out;
		state.setResourceManager(new StandardFileManager());
		globalScope = new PPGroupScope(null);
		pushScope(globalScope);
		
		includeParser = new IncludeParser(this);
		versionParser = new VersionParser(this);
		extensionParser = new ExtensionParser(this);
		errorParser = new ErrorParser(this);
		lineParser = new LineParser(this);
		
		pragmaParser = new PragmaParserSet(this);
		
		pragmaParser.appendPragma(new GlslPragmasParser(this));
		
		
		expressionParser = new ExpressionParser(this);
		
	}

	/** sets the resource manager, which is used to lookup resources
	 * referenced by #include directives.
	 * @param resourceManager
	 */
	public void setResourceManager(ResourceManager resourceManager) {
		state.setResourceManager(resourceManager);
		try {
			resourceManager.add(state.getInputResource());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void enableInclude(boolean enable) {
		state.setIncludeEnabled(enable);
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
		state.setInsertLineDirectives(enable);
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
		
		
		ILexer previousLexer = getLexer();
		try {
			state.setLexer(new PPLexer(scanner, state));
			
			define();
			// TODO: eof handler still necessary on this level?
			assert eof.occurred() && getLexer().eof();
			// TODO: maybe check for errors in predefinitions before proceeding
		} finally {
			state.setLexer(previousLexer);
		}
	}
	
	public void addDefine(Macro macro) {
		state.getMacros().put(macro.getName(), macro);
	}
	
	
	private void setScopeVisibility() {
		// TODO [3] scope visibility (skipping text lines), suspending output generation and location mapping is kind of redundant
		if (state.getGroupScope().visible()) state.setOutput(outputStream);
		else state.setOutput(PPOutputSink.DEV_NULL);
	}
	
	private void pushScope(PPGroupScope scope) {
		if (state.getGroupScope() != null) state.getGroupScope().add(scope);
		state.setGroupScope(scope);
		setScopeVisibility();
	}
	
	private void popScope() {
		PPGroupScope parent = state.getGroupScope().getParent();
		state.setGroupScope(parent);
		setScopeVisibility();
	}


	
	public boolean parse() {
		process();
		return groups != null && !groups.isEmpty();
	}
	
	public List<PPGroupScope> process() {
		// main parser loop
		try {
			while(!atEOF()) {
				if (!directive_line() && !text_line()) {
					syntaxError(getLexer().lookahead(1), "illegal token");
				}
			}
			// check if all scopes of conditional inclusion are complete
			if (state.getGroupScope() != globalScope) 
			{
				syntaxError(getLexer().previous(), "missing #endif");
			}
		} catch (Recovery escape) {
			// nothing to recover
		}
			
		return groups;
	}

	/**
	 * line of text to be macro expanded and forwarded to parser.
	 * @return whether successful or not
	 */
	private boolean text_line() {
		if (!has_directive_line_start()) {
			if (!state.getGroupScope().visible()) {
				skip_remaining_line();
				return true;
			}

			String output = text(true, true);
			if (output == null) {
				return false;
			} else {
				if (ENDL()) {
					if (token instanceof TCrlf) state.getOutput().print(token);
					// TODO: not sure if we should add CRLF at EOF generally or not
//					else out.print(new TCrlf(token.getInterval(), "\n"));
					else assert token instanceof TEof;
				} else if (!getLexer().eof()) {
					try {
						syntaxError(getLexer().lookahead(1), "invalid tokens");
					} catch (Recovery escape) {
						// just consume and keep going
						getLexer().consume(1);
					}
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
			
			if (WHITESPACE()) {
				t = token;
			} else if (IDENTIFIER()) {
				state.setSeenCodeLineBeforeVersion(true);
				TIdentifier id = (TIdentifier) token;
				Macro macro = state.getMacros().get(id.getText());
				if (macro != null) {
					if (macro_recursion_check(id.getStart(), id.getText())) {
						// macro cannot call itself, so its just a string
						t = id;
					} else {
						MacroReference reference = new MacroReference(id.getInterval(), macro);
						
						// presuming object like macro
						MacroInvocation invocation = reference;
						if (macro.isFunctionMacro()) {
							int i = nextNonWhiteLookahead(1, true);
							Token nonWhite = getLexer().lookahead(i);
							if (nonWhite instanceof TPunctuator && nonWhite.getText().equals("(")) {
								// arguments following -> consume white spaces
								// and thereby skip to '('
								if (i > 1) getLexer().consume(i-1);
								assert(getLexer().lookahead(1).getText().equals("("));
								TokenList[] args = macro_argument_list(reference);
								if (args != null) {
									// it is an invocation of a function like macro
									invocation = new MacroCallExpression(reference, args, getLexer().previous().getEnd());
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
				if (t != null) state.setSeenCodeLineBeforeVersion(true);

			}

			
			// store and forward output
			if (t != null) {
				result.add(t);
				if (print) state.getOutput().print(t);
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
			((PPLexer)getLexer()).prepend(prependingText);

		} catch (EvaluationException e) {
			try {
				syntaxError(e);
			} catch (Recovery escape) {
				// no recovery necessary
			}
		}
	}

	private boolean has_directive_line_start() {
		Token previous = getLexer().previous();
		if (previous == null || previous instanceof TCrlf) {
			int i = nextNonWhiteLookahead(1, false);
			Token la = getLexer().lookahead(i);
			if (la instanceof THash) return true;
		}
		
		return false;
	}


	private boolean directive_line() {
		boolean result = false;

		// shortcut
		if (!has_directive_line_start()) return result;
		
		while(WHITESPACE());
		if (PUNCTUATOR('#')) {
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
			} else if (!state.getGroupScope().visible()) {
				// if the current conditional scope is not visible
				// the following directives will be ignored.
				skip_remaining_line();
			} else if (
				  ENDL() // empty directive
				||includeParser.parse()
				||define()
				||undef()
				||lineParser.parse()
				||errorParser.parse()
				||pragmaParser.parse()
				||extensionParser.parse()
				||versionParser.parse()
				)
			{
				// directive line has been processed;
			} else {
				try {
					syntaxError(getLexer().lookahead(1), "unknown directive #" + read_remaining_line());
				} catch (SyntaxError | Recovery e) {
					// no recovery necessary
				}
			}
			state.setSeenCodeLineBeforeVersion(true);
		}
		return result;
	}


	

	private boolean define() {
		
		boolean result = false;
		if (IDENTIFIER("define")) {
			Location start = token.getStart();
			result = true;
			while(WHITESPACE());
			try {
				if (!IDENTIFIER()) {
					syntaxError(getLexer().lookahead(1), "no macro name given in #define directive");
				}
				start = token.getStart();
				Location end = token.getEnd();
				String macroName = token.getText();
				
				List<MacroParameter> params = null;
				if (PUNCTUATOR("(")) {
					params = new ArrayList<MacroParameter>();
					// macro parameters
					boolean firstIteration = true;
					do {
						while(WHITESPACE());
						if (DOTS()) {
							params.add(new MacroParameter(MacroParameter.__VA_ARGS__, this));
							break;
						} else if (IDENTIFIER()) {
							if (token.getText().equals(MacroParameter.__VA_ARGS__)) {
								syntaxWarning(token.getInterval(), "__VA_ARGS__ can only appear in the expansion of a variadic macro");
							}
							params.add(new MacroParameter(token.getText(), this));
						} else if (firstIteration) {
							// empty parameter list
							break;
						} else {
							syntaxError(getLexer().lookahead(1), "parameter name missing");
						}
						while(WHITESPACE());
						firstIteration = false;
					} while(PUNCTUATOR(','));
	
					mandatory(TPunctuator.class, ")");
					end = getLexer().previous().getEnd();
				}
				while(WHITESPACE());
			
				Macro macroDefinition = new Macro(macroName, params, new Interval(start, end));
				state.setCurrentMacroDefinition(macroDefinition);
				NodeList<Node> list = replacement_list();
				
				macroDefinition.setReplacementList(list);
				
				Macro previousDefinition = state.getMacros().get(macroName);
				if (previousDefinition != null && !previousDefinition.equals(macroDefinition)) {
					syntaxWarning(start, "\"" + macroName + "\" redefined");
				}
	
				state.getMacros().put(macroName, macroDefinition);
				state.setCurrentMacroDefinition(macroDefinition);
				
				mandatory_endl();
			} catch (Recovery escape) {
				recoverError();
				return result;
			}
		}
		return result;
	}

	private NodeList<Node> replacement_list() throws Recovery {
		NodeList<Node> result = new NodeList<Node>();
		Node node;
		do {
			node = concat_expression(result);
			if (node == null) node = replacement_list_whitespace_sequence();
			if (node == null) node = non_concat_expression();
			
			if (node != null) result.add(node);
		} while(null != node);
		
		result.trim(NodeList.Filter_WHITESPACE);
		return result;
	}

	private Token replacement_list_whitespace_sequence() {
		// replace sequence of whitespace with a single 
		// blank according to ISO standard
		if (WHITESPACE()) {
			Interval interval = new Interval(token.getStart(), token.getEnd());
			TWhitespace blank = new TWhitespace(interval, " ");
			while(WHITESPACE()) interval.setEnd(token.getEnd());
			return blank;
		} else {
			return null;
		}
	}

	private Node non_concat_expression() {
		Node expr;
		expr = single_hash_expression();
		if (expr == null && IDENTIFIER()) {
			TIdentifier ident = (TIdentifier) token;
			expr = macro_parameter_reference(ident);
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
	 * @throws Recovery 
	 *  
	 */
	private Node concat_expression(List<Node> replacement_list) throws Recovery {
		if (PUNCTUATOR("##")) {

			TPunctuator opTok = (TPunctuator) token;
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
				syntaxError(opTok, "'##' cannot appear at either end of a macro expansion");
				if (left == null) left = new ExpressionError(opTok.getInterval(), "missing left operand to concatenation in macro replacement list");
				if (right == null) right = new ExpressionError(opTok.getInterval(), "missing right operand to concatenation in macro replacement list");
			}
			if (left instanceof MacroParameterReference) ((MacroParameterReference)left).setRequireExpansion(false);
			if (right instanceof MacroParameterReference) ((MacroParameterReference)right).setRequireExpansion(false);
			return new PPConcatExpression(this, opTok.getInterval(), left, right);
		}
		return null;
	}


	private MacroParameterReference macro_parameter_reference(TIdentifier ident) {
		MacroParameter param = state.getCurrentMacroDefinition().getParameter(ident.getText());
		if (param != null) {
			return new MacroParameterReference(ident.getInterval(), param);
		} else {
			if (ident.getText().equals(MacroParameter.__VA_ARGS__)) syntaxWarning(ident.getInterval(), "__VA_ARGS__ can only appear in the expansion of a variadic macro");
		}
		return null;
	}

	private Node single_hash_expression() {
		if (PUNCTUATOR('#')) {
			Token hashTok = token;
			// Iff macro has parameters, # has to be followed by 
			// a macro parameter reference.
			// Otherwise, it is an ordinary pp-token
			if (state.getCurrentMacroDefinition().isFunctionMacro()) {
				// must be followed by a macro parameter
				MacroParameterReference paramRef = null;
				while (WHITESPACE());
				if (IDENTIFIER()) {
					paramRef = macro_parameter_reference((TIdentifier)token);
				}
				
				if (paramRef == null) {
					return expressionError(hashTok.getInterval(), "# is not followed by a macro parameter");
				}
				else 
				{
					paramRef.setRequireExpansion(false);
					return new PPStringifyExpression(new Interval(hashTok.getStart(), paramRef.getEnd()), paramRef);
				}
			} else {
				return hashTok;
			}
		}
		return null;
	}
	

	
	private TokenList[] macro_argument_list(MacroInvocation reference) {
		Macro macro = reference.getMacro();
		
		
		if (PUNCTUATOR('(')) {
			while(whitespace_crlf_sequence());
			List<TokenList> arguments = new ArrayList<TokenList>();

			try {
				int numParameters = macro.numParameters();
				boolean hasVarArgs = macro.hasVarArgs();
				Token la = getLexer().lookahead(1);
				if (!(la instanceof TPunctuator && la.getText().equals(")"))) {
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
					} while (PUNCTUATOR(','));
				}
				
				if (!PUNCTUATOR(')')) {
					syntaxError(getLexer().lookahead(1), "missing closing ')'");
				}
	
				if (macro.numParameters() != arguments.size()) {
					if (arguments.size() == 0 && macro.numParameters() == 1) {
						arguments.add(new TokenList()); // add an empty argument
					} else {
						syntaxError(reference.getStart(), "macro \"" + macro.getName() + "\" requires " + macro.numParameters() + " arguments, but only " + arguments.size() + " where given.");
						return null;
					}
				}
			} catch (Recovery escape) {
				// just pretend there have been no arguments
				return null;
			}
			return arguments.toArray(new TokenList[0]);
		} else {
			return null;
		}
	}

	private TokenList macro_arg() throws Recovery {
		// macro parameters can contain anything, even CRLF, but not ',' or ')' alone.
		// ',' can occur in parenthesised expressions though.
		TokenList arg = new TokenList();
		macro_arg_token_sequence(arg, ",)");
		arg.trim();
		return arg;
	}

	private void macro_variadic_arguments(TokenList varargs) throws Recovery {
		// same rules as for macro_arg, but ',' is no longer a delimiter.
		macro_arg_token_sequence(varargs, ")");
	}

	private boolean macro_arg_parenthesised(TokenList varargs) throws Recovery {
		if (PUNCTUATOR('(')) {
			
			varargs.add(token);
			macro_arg_token_sequence(varargs, ")");
			if (PUNCTUATOR(')')) {
				varargs.add(token);
			} else {
				syntaxError(getLexer().lookahead(1).getStart(), "missing closing ')' in parenthesised macro argument");
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
	 * @throws Recovery 
	 */
	private void macro_arg_token_sequence(TokenList varargs, String delimiters) throws Recovery {
		Token la = getLexer().lookahead(1);
		while (!(la instanceof TEof) && delimiters.indexOf(la.getText().charAt(0)) == -1) {
			if (whitespace_crlf_sequence()) {
				// replace sequence with single blank
				TWhitespace blank = new TWhitespace(token.getInterval(), " ");
				varargs.add(blank);
			} else if (macro_arg_parenthesised(varargs)) {
				// another pair of parenthesis
			} else if (optional(TStringLiteral.class)) {
				varargs.add(token);
			} else if (optional(TCharacterConstant.class)) {
				varargs.add(token);
			} else if (PUNCTUATOR(true)) {
				// FIXME: macro args actually cannot accept hashes
				varargs.add(token);
			} else if (NUMBER()) {
				varargs.add(token);
			} else {
				// FIXME: macro args cannot accept unknown tokens (I believe)
				varargs.add(getLexer().consume(1));
			}
			la = getLexer().lookahead(1);
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
			if (macro.getName().equals(identifier)) {
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
		ILexer previous = getLexer();
		try {
			if (tokens.size() == 0) return tokens;
			state.setLexer(new TokenListLexer(tokens, getState()));
			tokens = text_tokens(false, true);
			assert (!CRLF()) : "internal error: CRLF has to be replaced by ' ' during argument parsing";
			assert (getLexer().lookahead(1) instanceof TEof);
			return tokens;
		} finally {
			state.setLexer(previous);
		}
	}

	@Override
	public Token macro_join_tokens(Token left, Token right) {
		
		// join two tokens parse for a single new, legal preprocessing token
		ILexer previous = getLexer();
		try {
			String text = left.getText() + right.getText();
			IScanner rescanner = new StreamScanner("-- token join --", new ByteArrayInputStream(text.getBytes()));
			state.setLexer(new PPLexer(rescanner, getState()));
			Token joined = preprocessing_token(true);
			rescanner.consume();
			if (joined == null || !rescanner.eof()) {
				try {
					syntaxError(left.getStart(), "pasting \"" + left.getText() + "\" and \"" + right.getText() + "\" does not give a valid preprocessing token");
					joined = new TUnknownToken(new Interval(left.getStart(),right.getEnd()), text);
				} catch (Recovery escape) {
					// already recovered
				}
			} else {
				// joined token refers to the start of the left parameter and end of the right parameter in
				// the expansion list. 
				joined.getInterval().setStart(left.getStart());
				joined.getInterval().setEnd(right.getEnd());
			}
			return joined;
		} finally {
			state.setLexer(previous);
		}
	}
	

	
	
	
	private boolean undef() {
		boolean result = false;
		if (IDENTIFIER("undef")) {
			Location start = token.getStart();
			result = true;
			try {
				while(WHITESPACE());
				if(!IDENTIFIER()) {
					syntaxError(start, "missing identifier to #undef directive");
				}
				String macro = token.getText();
				while(WHITESPACE());
				if (mandatory_endl()) {
					state.getMacros().remove(macro);
					return result;
				} else {
					syntaxError(start, "unexpected tokens at end of undef directive");
				}
			} catch (Recovery escape) {
				return result;
			}
		}
		return result;
	}
	
	private boolean ifgroup() {
		PPIfScope ifscope = null;
		Node condition = null;
		Token ifTok = null; 
		if (IDENTIFIER("if")) {
			ifTok = token;
			ifscope = new PPIfScope(state.getGroupScope());
			while(WHITESPACE());
			condition = directive_condition();
			if (condition == null) {
				condition = expressionError(ifTok.getInterval(), "#if with no expression");
			}
		} else if (IDENTIFIER("ifdef")) {
			ifTok = token;
			ifscope = new PPIfdefScope(state.getGroupScope());
			while(WHITESPACE());
			condition = identifier();
			if (condition == null) {
				condition = expressionError(ifTok.getInterval(), "missing identifier");
			}
		} else if (IDENTIFIER("ifndef")) {
			ifTok = token;
			ifscope = new PPIfndefScope(state.getGroupScope());
			while(WHITESPACE());
			condition = identifier();
			if (condition == null) {
				condition = expressionError(ifTok.getInterval(), "missing identifier");
			}
		}
		
		if (ifscope != null) {
			try {
				ifscope.setCondition(condition);
			} catch (EvaluationException e) {
				try {
					syntaxError(e);
				} catch (Recovery e1) {
					// no recovery necessary
				}
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
		Token ifTok = null;
		if (IDENTIFIER("elif")) {
			ifTok = token;
			PPGroupScope predecessor = state.getGroupScope();
			if (predecessor == null || !(predecessor instanceof PPIfScope)) {
				try {
					syntaxError(ifTok, "#elif must follow #if* or #elif group");
				} catch (Recovery ignore) {
					// no recovery necessary
				}
			}
			while(WHITESPACE());
			Node expr = directive_condition();
			if (expr == null) {
				expr = expressionError(ifTok.getInterval(), "missing condition to elif directive");
			}

			popScope();
			elifscope = new PPElifScope(state.getGroupScope(), (PPIfScope)predecessor);
			try {
				elifscope.setCondition(expr);
			} catch (EvaluationException e) {
				try {
					syntaxError(e);
				} catch (Recovery ignore) {
					// already recovered above
				}
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
		Token elseTok = null;
		if (IDENTIFIER("else")) {
			elseTok = token;
			PPGroupScope predecessor = state.getGroupScope();
			if (predecessor == null || !(predecessor instanceof PPIfScope)) {
				try {
					syntaxError(elseTok.getStart(), "#else must follow #if* or #elif group");
				} catch (Recovery e) {
					// already recovered
				}
			}
			popScope();
			elsescope = new PPElseScope(state.getGroupScope(), (PPIfScope) predecessor);
			while(WHITESPACE());
			mandatory_endl();
			pushScope(elsescope);
		}
		return elsescope != null;
	}

	private boolean endif() {
		boolean result = false;
		if (IDENTIFIER("endif")) {
			Token endifTok = token;
			result = true;
			PPGroupScope predecessor = state.getGroupScope();
			if (predecessor == null) {
				try {
					syntaxError(endifTok, "#endif must follow #if*, #elif or #else group");
				} catch (Recovery e) {
					// already recovered
				}
			}
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
		tokens.trim();
		if (tokens.isEmpty()) {
			// missing expression
			return null;
		}
		// and parse that macro expanded text for the expression
		// FIXME condition parsing requires preprocessed output scanner
		expressionParser.setup(tokens);
		return expressionParser.expression();
	}
	
	private Node identifier() {
		if (IDENTIFIER()) {
			String id = token.getText();
			Macro macro = state.getMacros().get(id);
			if (macro == null) {
				return token;
			} else {
				return new MacroReference(token.getInterval(), state.getMacros().get(token.getText()));
			}
		}
		return null;
	}

	
	public void setErrorHandler(ErrorHandler errorHandler) {
		state.setErrorHandler(errorHandler);
	}

	/** This method is for testing purposes only! 
	 * <p>
	 * The default version
	 * in a glsl file without a <code>#version</code> directive is
	 * usually GLSL 1.10.
	 * </p>
	 * @param version
	 */
	public void setDefaultVersion(int version) {
		state.setGlslVersion(new GLSLVersion(null, version, null));
	}

	
}
