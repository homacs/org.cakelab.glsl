package org.cakelab.glsl.antlr.lexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;
import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.pp.tokens.TUnknownToken;

/**
 * This class was introduced only to provide a TokenFactory in case
 * of a missing token error. 
 * 
 * This class implements both: TokenSource and TokenFactory.
 * 
 * 
 * @author homac
 *
 */
public class PPTokenSource implements TokenSource, TokenFactory<PPOutputToken> {

	private String name;
	private PPTokenStream ppTokenStream;

	public PPTokenSource(Resource resource) {
		this.name = resource.getPath();
	}


	public PPTokenSource(String name) {
		this.name = name;
	}


	@Override
	public Token nextToken() {
		throw new Error("not supported");
	}

	@Override
	public int getLine() {
		throw new Error("not supported");
	}

	@Override
	public int getCharPositionInLine() {
		throw new Error("not supported");
	}

	@Override
	public CharStream getInputStream() {
		return null;
	}

	@Override
	public String getSourceName() {
		return name;
	}

	@Override
	public void setTokenFactory(TokenFactory<?> factory) {
		throw new Error("not supported");
	}

	@Override
	public TokenFactory<?> getTokenFactory() {
		return this;
	}


	@Override
	public PPOutputToken create(Pair<TokenSource, CharStream> source, int type, String text, int channel, int start,
			int stop, int line, int charPositionInLine) {
		//
		// This is used only if a missing token error occurs.
		// The parser inserts a new token for
		// a missing token only, to document an error and thus, the token 
		// can be a generic token with the given 'type' code.
		//
		PPTokenSource ppTokenSource = (PPTokenSource)source.a;
		PPOutputToken lt = (PPOutputToken) ppTokenStream.LT(1);
		start = lt.getStartIndex();
		stop = lt.getStartIndex() + text.length();
		Location lStart = lt.getPPToken().getInterval().getStart();
		Location lEnd = lStart.clone();
		lEnd.setColumn(lEnd.getColumn()+text.length());
		Interval interval = new Interval(lStart,lEnd);
		return new PPOutputToken(lt.getTokenIndex(), ppTokenSource, start, stop, type, new TUnknownToken(interval, text));
	}


	@Override
	public PPOutputToken create(int type, String text) {
		throw new Error("not supported");
	}


	public void setTokenStream(PPTokenStream ppTokenStream) {
		this.ppTokenStream = ppTokenStream;
	}


}
