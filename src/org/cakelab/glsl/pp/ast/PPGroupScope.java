package org.cakelab.glsl.pp.ast;

import java.util.ArrayList;

public class PPGroupScope {
	protected boolean visible = true;
	protected PPGroupScope parentGroup;
	protected ArrayList<PPGroupScope> children = new ArrayList<PPGroupScope>();
	
	
	public PPGroupScope(PPGroupScope parent) {
		parentGroup = parent;
	}

	/**
	 * Whether this scope (and all text lines in it)
	 * are visible to the language parser 
	 * (will be forwarded to him). Applies to #if #else etc.
	 * @return
	 */
	public boolean visible() {
		if (parentGroup != null) {
			return parentGroup.visible() && visible;
		} else {
			return visible;
		}
	}

	public PPGroupScope getParent() {
		return parentGroup;
	}

	public void add(PPGroupScope scope) {
		children.add(scope);
	}
	
}
