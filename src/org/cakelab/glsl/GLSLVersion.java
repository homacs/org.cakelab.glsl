package org.cakelab.glsl;

import org.cakelab.glsl.lang.ast.impl.NodeImpl;

public class GLSLVersion extends NodeImpl {
	public static enum Profile {
		core,
		es,
		compatibility
	}
	

	public GLSLVersion(Interval interval, int number, Profile profile) {
		super(interval);
		this.number = number;
		this.profile = profile;
	}
	
	public int number;
	public Profile profile = Profile.core;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((profile == null) ? 0 : profile.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GLSLVersion other = (GLSLVersion) obj;
		if (number != other.number)
			return false;
		if (profile != other.profile)
			return false;
		return true;
	}

}
