package org.cakelab.glsl.pp.scanner;

import org.cakelab.glsl.Location;
import org.cakelab.glsl.Resource;


/**
 * Used for arrays of source strings.
 * @author homac
 *
 */
public class SourceStringArrayScanner extends IScanner {


	private StreamScanner[] scanners;
	private int index;
	private StreamScanner current;
	private int last;

	public SourceStringArrayScanner(Resource[] sources) {
		assert (sources != null && sources.length != 0);
		scanners = new StreamScanner[sources.length];
		for (int i = 0; i < scanners.length; i++) {
			scanners[i] = new StreamScanner(sources[i].getSourceIdentifier(), sources[i].openInputStream());
		}
		this.index = 0;
		this.last = scanners.length -1;
		this.current = scanners[index];
	}

	@Override
	public int current() {
		return current.current();
	}

	@Override
	public boolean eof() {
		return index == last && current.eof();
	}

	@Override
	public int lookahead(int n) {
		StreamScanner s = current;
		int i = index;
		while (s.remaining() < n) {
			if (i == last) {
				return EOF;
			} else {
				n -= s.remaining();
				i++;
				s = scanners[i];
			}
		}
		return s.lookahead(n);
	}

	@Override
	public void consume(int n) {
		while (current.remaining() < n && index < last) {
			n -= current.remaining();
			current.consume(n);
			index++;
			current = scanners[index];
		}
		
		current.consume(n);
		
		if (current.remaining() == 0 && index < last) {
			index++;
			current = scanners[index];
		}
	}

	@Override
	public int consume() {
		if (current.remaining() < 1 && index != last) {
			index++;
			current = scanners[index];
		}
		
		int result = current.consume();
		
		if (current.remaining() == 0 && index < last) {
			index++;
			current = scanners[index];
		}
		return result;
	}

	@Override
	public Location location() {
		return current.location();
	}

	@Override
	public void setVirtualLocation(int line) {
		current.setVirtualLocation(line);
	}

	@Override
	public void setVirtualLocation(String id, int line) {
		current.setVirtualLocation(id, line);
	}

	@Override
	public boolean atLineStart() {
		return current.atLineStart();
	}

	@Override
	public Location nextLocation() {
		return current.nextLocation();
	}

	@Override
	public void dismiss() {
		while (index < last) {
			scanners[index].dismiss();
			index++;
		}
		scanners[index].dismiss();
	}

	@Override
	public int remaining() {
		// this is called quite rarely from the outside, so we go with a simple algorithm
		int remaining = 0;
		for (int i = index; i <= last; i++) {
			remaining += scanners[i].remaining();
		}
		return remaining;
	}

}
