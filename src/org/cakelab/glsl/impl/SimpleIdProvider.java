package org.cakelab.glsl.impl;

import org.cakelab.glsl.ResourceManager.ResourceIdProvider;

public class SimpleIdProvider implements ResourceIdProvider {

	private static final int INITIAL_ID = 0;
	private int nextId;
	
	public SimpleIdProvider() {
		reset();
	}
	
	@Override
	public String getNextId() {
		return Integer.toString(nextId++);
	}

	@Override
	public void reset() {
		nextId = INITIAL_ID;
	}

	@Override
	public boolean isUsed() {
		return nextId != INITIAL_ID;
	}

}
