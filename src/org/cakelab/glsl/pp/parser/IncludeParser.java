package org.cakelab.glsl.pp.parser;

import java.io.IOException;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.pp.Preprocessor;
import org.cakelab.glsl.pp.error.Recovery;
import org.cakelab.glsl.pp.error.TokenFormatException;
import org.cakelab.glsl.pp.lexer.ILexer;
import org.cakelab.glsl.pp.lexer.PPGLSLRuleSet;
import org.cakelab.glsl.pp.lexer.PPLexer;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.lexer.rules.RHeaderPath;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.scanner.StreamScanner;
import org.cakelab.glsl.pp.tokens.TCrlf;
import org.cakelab.glsl.pp.tokens.THash;
import org.cakelab.glsl.pp.tokens.THeaderPath;
import org.cakelab.glsl.pp.tokens.TIdentifier;
import org.cakelab.glsl.pp.tokens.TNumber;
import org.cakelab.glsl.pp.tokens.TStringLiteral;
import org.cakelab.glsl.pp.tokens.TWhitespace;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.pp.tokens.TokenList;

public class IncludeParser extends Parser {

	private Resource resource;
	private PPGLSLRuleSet extendedRules;
	private Interval interval;
	private Preprocessor preprocessor;
	
	
	
	public IncludeParser(Preprocessor preprocessor) {
		super(preprocessor.getState());
		this.preprocessor = preprocessor;
		extendedRules = new PPGLSLRuleSet(state);
		extendedRules.prependRule(new RHeaderPath(state));
	}
	
	
	
	@Override
	public boolean parse() {
		
		boolean result = false;
		
		if (IDENTIFIER("include")) {
			this.interval = new Interval(token.getInterval());
			LexerRuleSet originalRules = getLexer().getRules();
			try {
				getLexer().setRules(extendedRules);
				Token incTok = token;
				if (state.isIncludeEnabled()) {
					result  = true;
				} else {
					syntaxError(incTok, "Directive #include is disabled.");
					result = false;
				}
				while(WHITESPACE());
				String path;
				Token tpath = null;
				if (HEADER_PATH()) {
					interval.setEnd(token.getEnd());
					tpath = token;
					path = ((THeaderPath)tpath).getPath();
				} else if (optional(TStringLiteral.class)){
					interval.setEnd(token.getEnd());
					tpath = token;
					try {
						path = ((TStringLiteral)tpath).decode();
					} catch (TokenFormatException e) {
						path = null;
						syntaxError(e.getToken(), e.getMessage());
					}
				} else {
					syntaxError(interval.getEnd(), "missing include file path");
					return result;
				}
	
				resource = null;
				try {
					resource = state.getResourceManager().resolve(path);
				} catch (IOException e) {
					syntaxWarning(tpath.getStart(), e.getMessage());
					return result;
				}
				
				while(WHITESPACE());
				if (!mandatory_endl()) {
					return result;
				}
			} catch (Recovery escape) {
				recoverError();
				return result;
			} finally {
				getLexer().setRules(originalRules);
			}
			
			exec();
		}
		return result;
	}
	
	private void exec() {
		if (resource == null) return;
		
		// exec include
		ILexer previous = getLexer();
		try {

			Token next = getLexer().lookahead(1);
			
			IScanner includeScanner = new StreamScanner(resource);
			PPLexer includeLexer = new PPLexer(includeScanner, getState());

			Location locationReference = line_start(getInterval().getStart());
			if (state.isInsertLineDirectives()) {
				state.getOutput().print(createLineTokens(locationReference, 1, resource.getIdentifier()));
			}
			
			
			state.setLexer(includeLexer);
			preprocessor.process();
			
			
			// insert CRLF if necessary
			if (!(getLexer().previous() instanceof TCrlf)) {
				state.getOutput().print(new TCrlf(getLexer().lookahead(1).getInterval(), "\n"));
			}
			if (state.isInsertLineDirectives()) {
				state.getOutput().print(createLineTokens(locationReference, next.getStart().getLine(), next.getStart().getSourceIdentifier()));
			}
		
		} finally {
			state.setLexer(previous);
		}

	}



	private TokenList createLineTokens(Location ref, int line, String identifier) {
		TokenList tokens = new TokenList();
		int col = ref.getColumn();
		Location start = ref.clone();
		Location end = ref.clone();
		tokens.add(new THash(new Interval(start, end), "#"));
		ref.setColumn(col += 1);
		
		start = ref.clone();
		ref.setColumn(col += 3);
		end = ref.clone();
		tokens.add(new TIdentifier(new Interval(start, end), "line"));
		ref.setColumn(col += 1);
		

		start = ref.clone();
		ref.setColumn(col += 0);
		end = ref.clone();
		tokens.add(new TWhitespace(new Interval(start, end), " "));
		ref.setColumn(col += 1);

		String text = Integer.toString(line);
		start = ref.clone();
		ref.setColumn(col += text.length()-1);
		end = ref.clone();
		tokens.add(new TNumber(new Interval(start, end), text));
		ref.setColumn(col += 1);

		start = ref.clone();
		ref.setColumn(col += 0);
		end = ref.clone();
		tokens.add(new TWhitespace(new Interval(start, end), " "));
		ref.setColumn(col += 1);

		text = identifier;
		start = ref.clone();
		ref.setColumn(col += text.length()-1);
		end = ref.clone();
		tokens.add(new TNumber(new Interval(start, end), text));
		ref.setColumn(col += 1);

		start = ref.clone();
		ref.setColumn(col += 0);
		end = ref.clone();
		tokens.add(new TCrlf(new Interval(start, end), "\n"));
		ref.setColumn(col += 1);

		return tokens;
	}

	public Resource getResource() {
		return resource;
	}


	public Interval getInterval() {
		return interval;
	}

	
}
