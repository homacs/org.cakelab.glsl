package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;

public interface IScanner {

	public class EofFuture implements Runnable {
		boolean hasRun = false;
		
		@Override
		public void run() {
			hasRun = true;
		}
		
		public boolean occurred() {
			return hasRun;
		}
	}

	public static final int EOF = -1;

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

	/**
	 * Number of remaining bytes from current position.
	 * @return
	 */
	public int remaining();
}
