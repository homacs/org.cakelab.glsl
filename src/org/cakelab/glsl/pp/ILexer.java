package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.ast.MacroInvocation;

public interface ILexer {

	public static final int EOF = -1;

	public Lexer createPreprocessedOutputLexer(Location origin, String text);
	
	public Lexer createPrependLexer(MacroInvocation expr, String prepend);
	
	public int current();
	
	public boolean eof();
	
	public int lookahead(int i);

	public void consume(int n);
	
	public int consume();

	public Location location();

	public void setVirtualLocation(int line);

	public void setVirtualLocation(String id, int line);

	public String getText(LexerLocation start, LexerLocation end);
	
	public boolean atColumnStart();

	public void next(LexerLocation location);

	public Location nextLocation(Location location);

	public String getText(Interval interval);

	public Location nextLocation();
}
