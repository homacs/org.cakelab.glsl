package org.cakelab.glsl.lang.ast.impl;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Node;

public class NodeImpl implements Node {

	protected Interval interval;

	public NodeImpl(Interval interval) {
		this.interval = interval;
	}
	
	public NodeImpl(Location start, Location end) {
		this.interval = new Interval(start, end);
	}
	
	public NodeImpl(NodeImpl that) {
		this.interval = that.interval;
	}

	@Override
	public Interval getInterval() {
		return interval;
	}

	public void setInterval(Interval interval) {
		this.interval = interval;
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
