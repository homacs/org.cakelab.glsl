package org.cakelab.glsl.pp.scanner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.MacroExpandedLocation;
import org.cakelab.glsl.pp.ast.MacroInvocation;
import org.cakelab.glsl.pp.tokens.Token;

public class ScannerManager extends IScanner {

	private Stack<IScanner> scanners = new Stack<IScanner>();
	private IScanner top;
	private IScanner lastConsumed;
	private boolean dismissed;
	
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
		return new StreamScanner(origin, in);
	}

	public static IScanner createPrependScanner(MacroInvocation macroInvocation, String prepend) {
		return new StreamScanner(new MacroExpandedLocation(macroInvocation), new ByteArrayInputStream(prepend.getBytes()));
	}

	@Override
	public int current() {
		return lastConsumed.current();
	}

	@Override
	public boolean eof() {
		return (scanners.isEmpty() || scanners.size() == 1 && top.eof());
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
		if (dismissed) return;
		assert (!eof());
		for (int remain = top.remaining(); remain < n && scanners.size() > 1; n -= remain, remain = top.remaining()) {
			top.consume(remain);
			top.consume(); // read to EOF
			assert (top.eof()) : "internal error: EOF hasn't been read";
			pop();
		}
		// should not happen, because parser checks lookahead before it reads
		assert (top != null) : "internal error: parser reading beyond EOF";
		if (top.eof()) pop();
		top.consume(n);
		lastConsumed = top;
	}

	@Override
	public int consume() {
		consume(1);
		return lastConsumed.current();
	}

	@Override
	public Location location() {
		if (lastConsumed != null) return lastConsumed.location();
		else if (top != null) return top.location();
		else throw new Error("internal error: input not initialised");
	}

	@Override
	public Location nextLocation() {
		if (top != null) {
			ListIterator<IScanner> iterator = scanners.listIterator(scanners.size()-1);
			IScanner s = top;
			while (s.remaining() == 0 && iterator.hasPrevious()) {
				s = iterator.previous();
			}
			return s.nextLocation();
		}
		else if (lastConsumed != null) return lastConsumed.nextLocation();
		else return null;
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
	public void dismiss() {
		// dismiss all
		for (IScanner scanner : scanners) {
			scanner.dismiss();
		}
		// remove all from stack
		scanners.clear();
		top = null;
		dismissed = true;
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
		return new StreamScanner(identifier, data);
	}

	public static IScanner createPreprocessedTokensScanner(List<Token> tokens) {
		return new PPTokenScanner(tokens);
	}

}
