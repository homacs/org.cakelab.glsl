package org.cakelab.glsl;

public class Interval {
	public static final Interval NONE = new Interval(Location.NONE, Location.NONE);
	Location start;
	Location end;

	public Interval(Location start, Location end) {
		this.start = start;
		this.end = end;
	}

	public Interval(Interval interval) {
		this(interval.start, interval.end);
	}

	public Location getEnd() {
		return end;
	}
	public Location getStart() {
		return start;
	}

	public void setEnd(Location end) {
		this.end = end;
	}

	public void setStart(Location start) {
		this.start = start;
	}

	public Interval clone() {
		return new Interval(start, end);
	}
	
	

}
