package org.cakelab.glsl.pp;

import java.io.IOException;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.pp.error.ErrorHandler;
import org.cakelab.glsl.pp.lexer.ILexer;
import org.cakelab.glsl.pp.lexer.PPGLSLRuleSet;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.lexer.rules.RHeaderPath;
import org.cakelab.glsl.pp.scanner.IScanner;
import org.cakelab.glsl.pp.tokens.TCharSequence;
import org.cakelab.glsl.pp.tokens.THeaderPath;
import org.cakelab.glsl.pp.tokens.TStringLiteral;
import org.cakelab.glsl.pp.tokens.Token;

public class IncludeParser extends Parser {




	private boolean enabled;
	private ResourceManager resourceManager;
	private Resource resource;
	private PPGLSLRuleSet extendedRules;
	private Interval interval;

	public IncludeParser(boolean enabled, ResourceManager resourceManager, ILexer lexer) {
		super();
		this.enabled = enabled;
		this.resourceManager = resourceManager;
		
		IScanner scanner = lexer.getInputReference();
		ErrorHandler handler = lexer.getErrorHandler();
		
		this.extendedRules = new PPGLSLRuleSet(scanner, handler);
		extendedRules.prependRule(new RHeaderPath(scanner, handler));
	}
	
	
	
	@Override
	public boolean parse() {

		boolean result = false;
		
		if (optionalIDENTIFIER("include")) {
			this.interval = new Interval(token.getInterval());
			LexerRuleSet originalRules = lexer.getRules();
			try {
				lexer.setRules(extendedRules);
				Token incTok = token;
				if (enabled) {
					result  = true;
				} else {
					syntaxError(incTok, "Directive #include is disabled.");
					result = false;
				}
				while(WHITESPACE());
				String path;
				Token tpath = null;
				if (HEADER_PATH()) {
					tpath = token;
					interval.setEnd(token.getEnd());
					path = ((THeaderPath)tpath).getPath();
				} else if (optional(TStringLiteral.class)){
					interval.setEnd(token.getEnd());
					tpath = token;
					path = decodeCharSequence((TCharSequence) token, '"', '"');
				} else {
					syntaxError(interval.getStart(), "missing include file path");
					return result;
				}
	
				resource = null;
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
			} finally {
				lexer.setRules(originalRules);
			}
		}
		return result;
	}
	
	public Resource getResource() {
		return resource;
	}



	public void setResouceManager(ResourceManager resourceManager2) {
		resourceManager = resourceManager2;
	}



	public void setEnabled(boolean enable) {
		this.enabled = enable;
	}



	public Interval getInterval() {
		return interval;
	}

	
}
