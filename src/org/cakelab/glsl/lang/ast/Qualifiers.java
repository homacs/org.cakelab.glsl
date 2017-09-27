package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Qualifiers extends ArrayList<Qualifier> {
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
	
	public boolean hasQualifier(Qualifier query) {
		return this.contains(query);
	}

	public boolean equals(Qualifiers qualifiers) {
		if (qualifiers == null) return false;
		if (qualifiers.size() != size()) return false;
		for (Qualifier q : this) {
			if (qualifiers.hasQualifier(q)) return false;
		}
		return true;
	}
	
	public Qualifiers getAll(Class<? extends Qualifier> qualifierType) {
		Qualifiers result = null;
		for (Qualifier q : this) {
			if (qualifierType.isInstance(q)) {
				if (result == null) {
					result = new Qualifiers();
				}
				result.add(q);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public <T extends Qualifier> T get(Class<T> qualifierType) {
		T result = null;
		for (Qualifier q : this) {
			if (qualifierType.isInstance(q)) {
				result = (T) q;
			}
		}
		return result;
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
