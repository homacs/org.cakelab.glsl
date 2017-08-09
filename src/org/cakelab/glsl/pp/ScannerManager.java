package org.cakelab.glsl.pp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Stack;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.ast.MacroInvocation;

public class ScannerManager implements IScanner {

	private Stack<IScanner> scanners = new Stack<IScanner>();
	private IScanner top;
	private IScanner lastConsumed;
	
	public ScannerManager(IScanner scanner) {
		push(scanner);
	}
	
	private void pop() {
		assert(!scanners.isEmpty());
		scanners.pop();
		if (!scanners.isEmpty()) top = scanners.peek();
		else top = null;
	}

	/**
	 * Insert another scanner on the current scanning position (LA1())
	 * @param scanner
	 */
	public void push(IScanner scanner) {
		scanners.push(scanner);
		top = scanner;
	}

	public static IScanner createPreprocessedOutputScanner(Location origin, String text) {
		origin = new Location(origin.getSourceIdentifier(), Location.POS_START, origin.getLine(), origin.getColumn());
		ByteArrayInputStream in = new ByteArrayInputStream(text.getBytes());
		return new Scanner(origin, in);
	}

	public static IScanner createPrependScanner(MacroInvocation macroInvocation, String prepend) {
		return new Scanner(new MacroExpandedLocation(macroInvocation), new ByteArrayInputStream(prepend.getBytes()));
	}

	@Override
	public int current() {
		return lastConsumed.current();
	}

	@Override
	public boolean eof() {
		return (scanners.isEmpty());
	}

	@Override
	public int lookahead(int n) {
		int i = scanners.size()-1;
		if (i<0) return IScanner.EOF;
		IScanner scanner = scanners.get(i);
		i--;
		for (int remain = scanner.remaining(); remain < n && i >= 0; n -= remain, i--, remain = scanner.remaining()) {
			scanner = scanners.get(i);
		}
		return scanner.lookahead(n);
	}

	@Override
	public void consume(int n) {
		assert (!eof());
		for (int remain = top.remaining(); remain < n && scanners.size() > 1; n -= remain, remain = top.remaining()) {
			top.consume(remain);
			top.consume(); // read to EOF
			assert (top.eof()) : "internal error: EOF hasn't been read";
			pop();
		}
		// should not happen, because parser checks lookahead before it reads
		assert (top != null) : "internal error: parser reading beyond EOF";
		
		lastConsumed = top;
		top.consume(n);
		while (top != null && (top.eof())) {
			pop();
			if (scanners.size() > 1 && top.remaining() == 0) top.consume();
		}
	}

	@Override
	public int consume() {
		consume(1);
		return lastConsumed.current();
	}

	@Override
	public Location location() {
		if (top != null) return top.location();
		else if (lastConsumed != null) return lastConsumed.location();
		else throw new Error("internal error: input not initialised");
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
		if (scanners.isEmpty()) return false;
		return top.atColumnStart();
	}

	@Override
	public Location nextLocation(Location location) {
		if (top != null) return top.nextLocation(location);
		else if (lastConsumed != null) return lastConsumed.nextLocation(location);
		else return null;
	}

	@Override
	public Location nextLocation() {
		if (top != null) return top.nextLocation();
		else if (lastConsumed != null) return lastConsumed.nextLocation();
		else return null;
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
	public void addOnEofHandler(Runnable runnable) {
		// not needed
		throw new Error("not implemented");
	}

	@Override
	public int remaining() {
		int remaining = 0;
		for (IScanner scanner : scanners) {
			remaining += scanner.remaining();
		}
		return remaining;
	}

	public static IScanner createScanner(String identifier, InputStream data) {
		return new Scanner(identifier, data);
	}

}
