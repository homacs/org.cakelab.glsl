package org.cakelab.glsl.pp.parser;

import java.io.IOException;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.pp.PPState;
import org.cakelab.glsl.pp.lexer.PPGLSLRuleSet;
import org.cakelab.glsl.pp.lexer.rules.LexerRuleSet;
import org.cakelab.glsl.pp.lexer.rules.RHeaderPath;
import org.cakelab.glsl.pp.tokens.TCharSequence;
import org.cakelab.glsl.pp.tokens.THeaderPath;
import org.cakelab.glsl.pp.tokens.TStringLiteral;
import org.cakelab.glsl.pp.tokens.Token;

public class IncludeParser extends Parser {




	private boolean enabled;
	private Resource resource;
	private PPGLSLRuleSet extendedRules;
	private Interval interval;
	private boolean result;
	
	
	
	public IncludeParser(boolean enabled, PPState state) {
		super(state);
		this.enabled = enabled;
		
		this.extendedRules = new PPGLSLRuleSet(state);
		extendedRules.prependRule(new RHeaderPath(state));
	}
	
	
	
	@Override
	public boolean parse() {
		
		
		result = false;
		
		if (optionalIDENTIFIER("include")) {
			this.interval = new Interval(token.getInterval());
			LexerRuleSet originalRules = getLexer().getRules();
			try {
				getLexer().setRules(extendedRules);
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
					resource = state.getResourceManager().resolve(path);
				} catch (IOException e) {
					syntaxWarning(tpath.getStart(), e.getMessage());
					return result;
				}
				
				while(WHITESPACE());
				if (!mandatory_endl()) {
					return result;
				}
			} finally {
				getLexer().setRules(originalRules);
			}
		}
		return result;
	}
	
	public Resource getResource() {
		return resource;
	}


	public void setEnabled(boolean enable) {
		this.enabled = enable;
	}



	public Interval getInterval() {
		return interval;
	}



	@Override
	public void dismiss() {
		result = false;
		getLexer().dismiss();
	}

	
}
