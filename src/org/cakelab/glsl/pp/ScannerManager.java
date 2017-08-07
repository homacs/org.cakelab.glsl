package org.cakelab.glsl.pp;

import java.util.Stack;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.ast.MacroInvocation;

public class ScannerManager implements IScanner {

	public class EofHandler implements Runnable {

		private IScanner scanner;

		public EofHandler(IScanner scanner) {
			this.scanner = scanner;
		}
		
		@Override
		public void run() {
			ScannerManager.this.onEof(scanner);
		}

	}

	private Stack<IScanner> scanners = new Stack<IScanner>();
	private IScanner top;
	private int lastConsumed;
	
	public ScannerManager() {
	}
	
	private void onEof(IScanner scanner) {
		assert (scanner == scanners.peek());
		scanners.pop();
		if (!scanners.isEmpty()) top = scanners.peek();
		else top = null;
	}

	/**
	 * Insert another scanner on the current scanning position (LA1())
	 * @param scanner
	 */
	public void push(IScanner scanner) {
		// TODO we might not need a handler for this, since we are 
		// observing EOFs in consume(n).
		scanner.addOnEofHandler(new EofHandler(scanner));
		scanners.push(scanner);
	}

	@Override
	public IScanner createPreprocessedOutputScanner(Location origin, String text) {
		// TODO This will be a new scanner, which gets the output of the 
		// preprocessor and considers original locations from preprocessing
		// when reporting errors.
		return top.createPreprocessedOutputScanner(origin, text);
	}

	@Override
	public IScanner createPrependScanner(MacroInvocation expr, String prepend) {
		// TODO this will be a common scanner with a MacroExpandedLocation just
		return top.createPrependScanner(expr, prepend);
	}

	@Override
	public int current() {
		return lastConsumed;
	}

	@Override
	public boolean eof() {
		return (scanners.isEmpty());
	}

	@Override
	public int lookahead(int i) {
		int c = top.lookahead(i);
		return c;
	}

	@Override
	public void consume(int n) {
		lastConsumed = lookahead(n);
		top.consume(n);
	}

	@Override
	public int consume() {
		lastConsumed = lookahead(1);
		return top.consume();
	}

	@Override
	public Location location() {
		return top.location();
	}

	@Override
	public void setVirtualLocation(int line) {
		top.setVirtualLocation(line);
	}

	@Override
	public void setVirtualLocation(String id, int line) {
		top.setVirtualLocation(id, line);
	}

	@Override
	public boolean atColumnStart() {
		return top.atColumnStart();
	}

	@Override
	public Location nextLocation(Location location) {
		return top.nextLocation(location);
	}

	@Override
	public Location nextLocation() {
		return top.nextLocation();
	}

	@Override
	public void dismiss() {
		// dismiss all
		for (IScanner scanner : scanners) {
			scanner.dismiss();
		}
		// remove all from stack
		scanners.clear();
		top = null;
	}

	@Override
	public IScanner commit() {
		// TODO [1] remove
		return top.commit();
	}

	@Override
	public void addOnEofHandler(Runnable runnable) {
		// not needed
		throw new Error("not implemented");
	}

}
