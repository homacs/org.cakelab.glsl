package org.cakelab.glsl.lang.ast.impl;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Node;

public class NodeImpl implements Node {

	protected Interval interval;

	public NodeImpl(Interval interval) {
		setInterval(interval);
	}
	
	public NodeImpl(Location start, Location end) {
		if (start == null) start = Location.NONE;
		if (end == null) end = Location.NONE;
		if (start == Location.NONE && end == Location.NONE) {
			this.interval = Interval.NONE;
		} else {
			this.interval = new Interval(start, end);
		}
	}
	
	public NodeImpl(NodeImpl that) {
		this.interval = that.interval;
	}

	
	protected NodeImpl() {
		this.interval = Interval.NONE;
	}
	
	@Override
	public Interval getInterval() {
		return interval;
	}

	public void setInterval(Interval interval) {
		if (interval == null) this.interval = Interval.NONE;
		else this.interval = interval;
	}
	
	
	@Override
	public Location getStart() {
		return interval.getStart();
	}

	@Override
	public Location getEnd() {
		return interval.getEnd();
	}


}
