package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Qualifiers extends ArrayList<Qualifier>{
	public Qualifiers(Qualifiers qualifiers) {
		add(qualifiers);
	}

	public Qualifiers() {
	}

	public Qualifiers clone() {
		return new Qualifiers(this);
	}

	public int compareTo(Qualifiers qualifiers) {
		throw new Error("not implemented");
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < size(); i++) {
			Qualifier q = get(i);
			result.append(q.toString());
			if (i+1 < size()) {
				result.append(' ');
			}
		}
		return result.toString();
	}

	public void add(Qualifier[] qualifiers) {
		for (Qualifier q : qualifiers) {
			this.add(q);
		}
	}

	public void add(Qualifiers qualifiers) {
		addAll(qualifiers);
	}
}
