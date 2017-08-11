package org.cakelab.glsl.pp;

import java.util.Arrays;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.tokens.TAny;
import org.cakelab.glsl.pp.tokens.TEndl;
import org.cakelab.glsl.pp.tokens.Token;

public class LocationMap {

	public static class SimpleArrayList<T> {

		public interface Comparator<K, T> {
			int compare(K key, T obj);
		}

		private static final int CAPACITY_INCREASE = 512;
		int size = 0;
		Object[] entries = new Object[CAPACITY_INCREASE];
		
		public void add(T entry) {
			if (size >= entries.length) {
				entries = Arrays.copyOf(entries, entries.length + CAPACITY_INCREASE);
			}
			entries[size] = entry;
			size++;
		}

		@SuppressWarnings("unchecked")
		public T get(int index) {
			if (index >= size) throw new IndexOutOfBoundsException();
			return (T) entries[index];
		}

		
		public <K> int find(K key, Comparator<K,T> comparator) {
			return binarySearch(key, 0, size, comparator);
		}
		
		@SuppressWarnings("unchecked")
		private <K> int binarySearch(K key, int start, int end, Comparator<K, T> comparator) {
			int n = end - start;
			if (n > 1) {
				int pivot = ((n+1)/2) + start;
				if (0 <= comparator.compare(key, (T)entries[pivot])) {
					return binarySearch(key, pivot, end, comparator);
				} else {
					return binarySearch(key, start, pivot, comparator);
				}
			} else {
				return start;
			}
		}
		
		public void discardAll(int index) {
			size = index;
		}

		public int size() {
			return size;
		}
		
	}

	
	static class Range {
		public Range(Interval interval, int start) {
			in = interval;
			outStart = start;
		}
		Interval in;
		int outStart;
	}
	
	int outEnd = 0;
	SimpleArrayList<Range> ranges = new SimpleArrayList<Range>();
	Range previous = null;
	
	public void report(Token t, int end) {
		Interval interval = t.getInterval();
		assert (sameSource(interval.getStart(), interval.getEnd()));
		if (!sameLine(interval.getStart(), interval.getEnd())) {
			split(t, end);
			return;
		} else {
			if (previous == null || !adjacent(interval.getStart())) {
				appendNew(interval, end);
			} else {
				extendPrevious(interval, end);
			}
			
			if (t instanceof TEndl) {
				// cut at each newline
				previous = null;
			}
		}
	}

	private void split(Token t, int end) {
		String text = t.getText();
		String[] lines = text.split("\n");
		Location inStart = t.getStart();
		int outEnd = end - t.length();
		int last = lines.length-1;
		for (int i = 0; i <= last; i++) {
			String line = lines[i];
			if (i != last) line += "\n";
			if (line.length()>0) {
				Location inEnd = inStart.clone();
				locationAdd(inEnd, line.length());
				if ( i == last && lessthan(inEnd, t.getEnd())) inEnd = t.getEnd();
				outEnd += line.length();
				Interval interval = new Interval(inStart, inEnd);
				report(new TAny(interval, line), outEnd);
				inStart = inEnd;
				inStart.nextLine();
			}
		}
		assert (outEnd == end);
	}

	private boolean lessthan(Location l1, Location l2) {
		if (l1.getLine() < l2.getLine()) return true;
		if (l1.getColumn() < l2.getColumn()) return true;
		return false;
	}

	private void locationAdd(Location loc, int n) {
		loc.setColumn(loc.getColumn()+n);
	}

	private void extendPrevious(Interval interval, int end) {
		previous.in.setEnd(interval.getEnd());
		outEnd = end+1;
	}

	private void appendNew(Interval interval, int end) {
		previous = new Range(interval, outEnd);
		ranges.add(previous);
		outEnd = end+1;
	}

	private boolean sameLine(Location start, Location end) {
		return start.getLine() == end.getLine();
	}

	private boolean sameSource(Location start, Location end) {
		if (start.getClass() != end.getClass()) {
			return false;
		} else if (start instanceof MacroExpandedLocation) {
			return ((MacroExpandedLocation)start).getMacroInvocation() == ((MacroExpandedLocation)end).getMacroInvocation();
		} else {
			return start.getSourceIdentifier().equals(end.getSourceIdentifier());
		}
	}

	private boolean adjacent(Location start) {
		Location previousEnd = previous.in.getEnd();
		return (sameSource(previousEnd, start) && previousEnd.getPosition()+1 == start.getPosition());
	}
	
	
}
