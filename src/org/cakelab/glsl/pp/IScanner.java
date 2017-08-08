package org.cakelab.glsl.pp;

import org.cakelab.glsl.Location;

public interface IScanner {

	/**
	 * EofFuture is an EofHandler (see {@link IScanner#addOnEofHandler(Runnable)})
	 * which just stores, whether it was called or not. Method {@link #occurred()}
	 * indicates just that.
	 * @author homac
	 * @see IScanner#addOnEofHandler(Runnable)
	 * @see #occurred()
	 *
	 */
	public class EofFuture implements Runnable {
		boolean hasRun = false;
		
		@Override
		public void run() {
			hasRun = true;
		}
		
		/**
		 * @return whether this handlers {@link #run()} method was called or not.
		 */
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

	/**
	 * Set a different line as current location. The column 
	 * will be reset to COLUMN_START.
	 * @param id
	 * @param line
	 * @see Location
	 */
	public void setVirtualLocation(int line);

	/**
	 * Set a different input resource identifier and line
	 * as current location. The column will be reset to COLUMN_START.
	 * @param id
	 * @param line
	 * @see Location
	 */
	public void setVirtualLocation(String id, int line);
	
	public boolean atColumnStart();

	public Location nextLocation(Location location);

	public Location nextLocation();

	/**
	 * Called when an error occurred. 
	 * Scanner has to act, like it was read to EOF.
	 */
	public void dismiss();

	/**
	 * On EOF Handlers allow clients to be notified, when
	 * the content of a scanner has been fully read (including EOF).
	 * The scanner will call the {@link Runnable#run()} method
	 * on each registered eof handler when EOF was consumed.
	 * @param runnable
	 * @see EofFuture
	 */
	public void addOnEofHandler(Runnable runnable);

	/**
	 * Number of remaining bytes from current position.
	 * @return
	 */
	public int remaining();
}
