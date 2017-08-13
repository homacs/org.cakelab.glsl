package org.cakelab.glsl;

import org.cakelab.glsl.lang.ast.impl.NodeImpl;

public class GLSLVersion extends NodeImpl {
	public static enum Profile {
		CORE,
		ES,
		COMPATIBILITY
	}
	

	public GLSLVersion(Interval interval, int number, Profile profile) {
		super(interval);
		this.number = number;
		this.profile = profile;
	}
	public int number;
	public Profile profile;

}
