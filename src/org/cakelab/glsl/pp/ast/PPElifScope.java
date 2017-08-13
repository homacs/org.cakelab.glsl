package org.cakelab.glsl.pp.ast;

public class PPElifScope extends PPIfScope {
	private PPIfScope previous;

	public PPElifScope(PPGroupScope parent, PPIfScope previous) {
		super(parent);
		this.previous = previous;
		
	}

	@Override
	public boolean visible() {
		return super.visible() && !previous.visible;
	}

	
}
