package org.cakelab.glsl.lang.ast;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;

public interface Node {
	public Interval getInterval();
	public Location getStart();
	public Location getEnd();
}
