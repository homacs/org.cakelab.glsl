package org.cakelab.glsl.pp.lexer;

import java.util.Vector;

public class LookaheadList {
	
	Vector<Lookahead> entries = new Vector<Lookahead>();
	
	
	
	public LookaheadList() {
	}
	

	public Lookahead popFront() {
		Lookahead result = get(0);
		entries.remove(0);
		return result;
	}

	
	public Lookahead get(int index) {
		Lookahead l = entries.get(index);
		l.offset -= first().offset;
		return l;
	}


	private Lookahead first() {
		return entries.firstElement();
	}


	public Lookahead last() {
		return entries.lastElement();
	}


	public int size() {
		return entries.size();
	}


	public void add(Lookahead last) {
		entries.add(last);
	}
	
}
