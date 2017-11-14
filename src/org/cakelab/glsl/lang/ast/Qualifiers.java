package org.cakelab.glsl.lang.ast;

import java.util.ArrayList;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;

@SuppressWarnings("serial")
public class Qualifiers extends ArrayList<Qualifier> implements Node {
	private Interval interval;
	private int lastUpdate;

	public Qualifiers(Qualifiers qualifiers) {
		this();
		add(qualifiers);
	}

	public Qualifiers() {
		lastUpdate = super.modCount;
		this.interval = new Interval(Interval.NONE);
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

	@Override
	public Interval getInterval() {
		if (super.modCount != lastUpdate) {
			if (isEmpty()) {
				interval.setStart(Location.NONE);
				interval.setEnd(Location.NONE);
			} else {
				interval.setStart(get(0).getStart());
				interval.setEnd(get(size()-1).getEnd());
			}
			lastUpdate = super.modCount;
		}
		return interval;
	}

	@Override
	public Qualifier set(int index, Qualifier element) {
		int before = super.modCount;
		Qualifier previously =  super.set(index, element);
		if (before == super.modCount) super.modCount++;
		return previously;
	}


	@Override
	public Location getStart() {
		return getInterval().getStart();
	}

	@Override
	public Location getEnd() {
		return getInterval().getEnd();
	}


}
