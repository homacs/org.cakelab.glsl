package org.cakelab.glsl.pp;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.pp.tokens.Token;
import org.cakelab.glsl.util.SimpleArrayList;
import org.cakelab.glsl.util.SimpleArrayList.Comparator;

public class LocationMap {
	private static Comparator<Integer, Range> comparator = new SimpleArrayList.Comparator<Integer, Range>() {

		@Override
		public int compare(Integer key, Range r) {
			return key - r.outStart;
		}
		
	};
	
	public Interval getInterval(int start, int end) {
		return new Interval(getLocation(start), getLocation(end));
	}
	
	public Location getLocation(int pos) {
		int index = ranges.find(pos, comparator);
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
