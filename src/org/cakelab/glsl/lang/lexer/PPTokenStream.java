package org.cakelab.glsl.lang.lexer;

import java.util.ArrayList;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.cakelab.glsl.GLSLParser;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.lang.lexer.tokens.PPOutputToken;
import org.cakelab.glsl.pp.tokens.TEof;

public class PPTokenStream implements TokenStream {

	
	public class EOFToken extends PPOutputToken {

		public EOFToken(int index, PPTokenSource source, int end, TEof eof) {
			super(index, source, end, end, GLSLParser.EOF, eof);
		}
		
		public String getText() {
			return "<EOF>";
		}

	}

	private ArrayList<PPOutputToken> tokens;
	private int p;
	private EOFToken eofToken;
	private PPTokenSource[] sources;
	private boolean fetchedEOF;

	@SuppressWarnings("unchecked")
	public PPTokenStream(PPOutputTokenSink_GLSL_ANTLR tokens) {
		this.sources = tokens.getSources();
		PPTokenSource inputSource = tokens.getInputSource();
		this.tokens = (ArrayList<PPOutputToken>) tokens.getTokens().clone();
		this.p = 0;
		
		// FIXME: eof token should be added by the class which generates/filters tokens, not here
		if (this.tokens.size() > 0) {
			PPOutputToken last = this.tokens.get(this.tokens.size()-1);
			Location end = last.getPPToken().getEnd();
			end.setColumn(end.getColumn()+1);
			org.cakelab.glsl.Interval interval = new org.cakelab.glsl.Interval(end, end);
			TEof teof = new TEof(interval);
			this.eofToken = new EOFToken(this.tokens.size(), inputSource, last.getStopIndex()+1, teof);
		} else {
			Resource resource = tokens.getState().getInputResource();
			Location end = new Location(resource.getIdentifier());
			org.cakelab.glsl.Interval interval = new org.cakelab.glsl.Interval(end, end);
			TEof teof = new TEof(interval);
			this.eofToken = new EOFToken(this.tokens.size(), inputSource, 0, teof);
		}
		this.tokens.add(eofToken);
		
		for (PPTokenSource source : sources) {
			source.setStreamReference(this);
		}
	}
	
	
	@Override
	public void consume() {
		boolean skipEofCheck;
		if (p >= 0) {
			if (fetchedEOF) {
				// the last token in tokens is EOF. skip check if p indexes any
				// fetched token except the last.
				skipEofCheck = p < tokens.size() - 1;
			}
			else {
				// no EOF token in tokens. skip check if p indexes a fetched token.
				skipEofCheck = p < tokens.size();
			}
		}
		else {
			// not yet initialized
			skipEofCheck = false;
		}

		if (!skipEofCheck && LA(1) == EOF) {
			throw new IllegalStateException("cannot consume EOF");
		}

		p++;
	}

	@Override
	public int LA(int i) {
		return LT(i).getType();
	}
	
	@Override
	public Token LT(int k) {
        if ( k==0 ) return null;
        if ( k < 0 ) {
        	int j = -k;
            if ( (p-j)<0 ) return null;
            else return tokens.get(p-j);
        }

		int i = p + k - 1;

        if (i >= tokens.size()) { 
        	// return EOF token
            return tokens.get(tokens.size()-1);
        }
        return tokens.get(i);
	}

	@Override
	public int mark() {
		return -1;
	}

	@Override
	public void release(int marker) {
	}

	@Override
	public int index() {
		return p;
	}

	@Override
	public void seek(int index) {
		this.p = index;
	}

	@Override
	public int size() {
		return tokens.size();
	}

	@Override
	public String getSourceName() {
		return UNKNOWN_SOURCE_NAME;
	}

	@Override
	public Token get(int i) {
        if ( i < 0 || i >= tokens.size() ) {
            throw new IndexOutOfBoundsException("token index "+i+" out of range 0.."+(tokens.size()-1));
        }
        return tokens.get(i);
	}

	@Override
	public TokenSource getTokenSource() {
		//
		// Tokens are actually from different streams when supporting 
		// #include.
		// This method is used by the parser to retreive the TokenFactory
		// and generate a new token for a missing token.
		//
		// Since the missing token would be at the place of the next token,
		// we return here the source of the next token in the stream.
		//
		TokenSource source = LT(1).getTokenSource();
		if (source == null) {
			return null;
		} else {
			return source;
		}
	}

	@Override
	public String getText(Interval interval) {
		StringBuffer text = new StringBuffer();
		for (int i = interval.a; i <= interval.b; i++) {
			PPOutputToken token = (PPOutputToken) get(i);
			if (token != null) {
				text.append(token.getText());
				if (i< interval.b) text.append(' ');
			}
		}
		return text.toString();
	}

	@Override
	public String getText() {
		return getText(new Interval(0, tokens.size()-1));
	}

	@Override
	public String getText(RuleContext ctx) {
		return getText(ctx.getSourceInterval());
	}

	@Override
	public String getText(Token start, Token stop) {
		return getText(new Interval(start.getTokenIndex(), stop.getTokenIndex()));
	}


}
