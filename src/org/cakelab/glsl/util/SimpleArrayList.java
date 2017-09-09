package org.cakelab.glsl.util;

import java.util.Arrays;

public class SimpleArrayList<T> {

	public interface Comparator<K, T> {
		int compare(K key, T obj);
	}

	private static final int CAPACITY_INCREASE = 512;
	int size = 0;
	Object[] entries = new Object[CAPACITY_INCREASE];
	
	public void add(T entry) {
		if (size >= entries.length) {
			entries = Arrays.copyOf(entries, entries.length + CAPACITY_INCREASE);
		}
		entries[size] = entry;
		size++;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index >= size) throw new IndexOutOfBoundsException();
		return (T) entries[index];
	}

	
	public <K> int find(K key, Comparator<K,T> comparator) {
		return binarySearch(key, 0, size, comparator);
	}
	
	@SuppressWarnings("unchecked")
	private <K> int binarySearch(K key, int start, int end, Comparator<K, T> comparator) {
		int n = end - start;
		if (n > 1) {
			int pivot = ((n+1)/2) + start;
			if (0 <= comparator.compare(key, (T)entries[pivot])) {
				return binarySearch(key, pivot, end, comparator);
			} else {
				return binarySearch(key, start, pivot, comparator);
			}
		} else {
			return start;
		}
	}
	
	public void discardAll(int index) {
		size = index;
	}

	public int size() {
		return size;
	}
	
}
