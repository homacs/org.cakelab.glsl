package org.cakelab.glsl.pp.ast;

import java.util.ArrayList;

import org.cakelab.glsl.lang.ast.Node;
import org.cakelab.glsl.pp.tokens.TWhitespace;

@SuppressWarnings("serial")
public class NodeList<T extends Node> extends ArrayList<T> {
	

	public interface Filter<T extends Node> {
		boolean pass(T obj);
	}
	
	public static final Filter<Node> Filter_WHITESPACE = new Filter<Node>() {

		@Override
		public boolean pass(Node obj) {
			return !(obj instanceof TWhitespace);
		}
		
	};

	public NodeList() {}
	
	public NodeList(int size) {
		super(size);
	}

	/** Removes all tokens from the start and the end, which match the given set of tokens */
	public void trimStart(Filter<T> filter) {
		int remove = 0;
		for (remove = 0; remove < size() && (!filter.pass(get(remove))); remove++);
		super.removeRange(0, remove);
	}

	public void trimEnd(Filter<T> filter) {
		int remove = 0;
		for (remove = size()-1; remove >= 0 && (!filter.pass(get(remove))); remove--);
		super.removeRange(remove+1, size());
	}

	
	public void trim(Filter<T> filter) {
		trimStart(filter);
		trimEnd(filter);
	}

	@SuppressWarnings("unchecked")
	public void trim() {
		trimStart((Filter<T>) Filter_WHITESPACE);
		trimEnd((Filter<T>) Filter_WHITESPACE);
	}
}
