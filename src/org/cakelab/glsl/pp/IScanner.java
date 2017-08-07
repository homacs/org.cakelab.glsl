package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.ast.MacroInvocation;

public interface IScanner {

	public static final int EOF = -1;

	public IScanner createPreprocessedOutputScanner(Location origin, String text);
	
	public IScanner createPrependScanner(MacroInvocation expr, String prepend);
	
	public int current();
	
	public boolean eof();
	
	public int lookahead(int i);

	public void consume(int n);
	
	public int consume();

	public Location location();

	public void setVirtualLocation(int line);

	public void setVirtualLocation(String id, int line);
	
	public boolean atColumnStart();

	public Location nextLocation(Location location);

	public Location nextLocation();

	public void dismiss();

	public IScanner commit();

	public void addOnEofHandler(Runnable runnable);
}
