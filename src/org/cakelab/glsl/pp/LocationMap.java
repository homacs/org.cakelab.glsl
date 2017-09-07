package org.cakelab.glsl.pp;

import java.util.Arrays;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.tokens.Token;

public class LocationMap {
	// TODO: [1] remove location map and implement lexer for language parsing instead
	
	
	
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

	
	public Interval getInterval(int start, int end) {
		return new Interval(getLocation(start), getLocation(end));
	}
	
	public Location getLocation(int pos) {
		int index = ranges.find(pos, new SimpleArrayList.Comparator<Integer, Range>() {

			@Override
			public int compare(Integer key, Range r) {
				return key - r.outStart;
			}
			
		});
		
		Range r = ranges.get(index);
		Location loc = applyOffset(r, pos);
		return loc;
	}
	

	
	private Location applyOffset(Range r, int pos) {
		int diff = pos - r.outStart;
		assert (diff >= 0);
		if (diff == 0) {
			return r.in.getStart();
		} else {
			Location loc = r.in.getStart().clone();
			locationAdd(loc,diff);
			if (lessthan(loc, r.in.getEnd())) {
				return loc;
			} else {
				return r.in.getEnd();
			}
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
		appendNew(t.getInterval(), end);
	}

	private boolean lessthan(Location l1, Location l2) {
		if (l1.getLine() < l2.getLine()) return true;
		if (l1.getColumn() < l2.getColumn()) return true;
		return false;
	}

	private void locationAdd(Location loc, int n) {
		loc.setColumn(loc.getColumn()+n);
	}

	private void appendNew(Interval interval, int end) {
		previous = new Range(interval, outEnd);
		ranges.add(previous);
		outEnd = end+1;
	}

	
}
