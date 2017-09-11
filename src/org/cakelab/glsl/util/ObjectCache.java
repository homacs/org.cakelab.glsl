package org.cakelab.glsl.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This is a simple cache implementation using a fixed 
 * capacity hash table. Hash collisions on insert 
 * will be resolved by removing the previous value.
 * Thus, it depends on the keys hashes how long an entry
 * will stay cached.
 * 
 * Key requires to have the following methods implemented:
 * <ul>
 * <li>hashCode()</li>
 * <li>boolean equals(Object)</li>
 * <ul>
 * 
 * 
 * @author homac
 *
 * @param <K> Key to refer to a cached value
 * @param <V> Cached value
 */
public class ObjectCache<K, V> implements Map<K, V>{

	private static class CacheEntry<K,V> implements Entry<K,V> {

		K key;
		V value;
		
		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue(V value) {
			V old = this.value;
			this.value = value;
			return old;
		}
		
	}

	private static final int DEFAULT_CAPACITY = 8;

	private CacheEntry<K,V>[] entries;
	private int capacity;

	private int size;
	
	
	public ObjectCache() {
		this(DEFAULT_CAPACITY);
	}
	
	
	@SuppressWarnings("unchecked")
	public ObjectCache(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		entries = new CacheEntry[capacity];
	}


	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean containsKey(Object key) {
		int i = index(key);
		CacheEntry<K, V> entry = entries[i];
		
		return entry != null && key.equals(entry.key);
	}

	private int index(Object key) {
		return key.hashCode() % capacity;
	}


	@Override
	/**
	 * Warning: This is a linear search!
	 */
	public boolean containsValue(Object value) {
		for (int i = 0; i < size; i++) {
			if (value.equals(entries[i].value)) return true;
		}
		return false;
	}

	@Override
	public V get(Object key) {
		int i = index(key);
		CacheEntry<K, V> entry = entries[i];
		return entry != null && key.equals(entry.key) ? entry.value : null;
	}

	@Override
	public V put(K key, V value) {
		//
		// remember: hash collisions are supposed to overwrite old cache entry
		//
		
		int i = index(key);
		if (entries[i] == null) {
			entries[i] = new CacheEntry<K,V>();
			size++;
		}
		V previous = entries[i].value;

		entries[i].key = key;
		entries[i].value = value;
		
		return previous;
	}

	@Override
	public V remove(Object key) {
		int i = index(key);
		CacheEntry<K, V> entry = entries[i];

		V previous = null;
		if (key.equals(entry.key)) {
			previous = entry.value;
			entries[i] = null;
			size--;
		}
		return previous;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		for (java.util.Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
			put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public void clear() {
		Arrays.setAll(entries, null);
		size = 0;
	}

	@Override
	public Set<K> keySet() {
		HashSet<K> set = new HashSet<K>();
		for (CacheEntry<K, V> e : entries) {
			if (e != null) {
				set.add(e.key);
			}
		}
		return set;
	}

	@Override
	public Collection<V> values() {
		ArrayList<V> values = new ArrayList<V>();
		for (CacheEntry<K, V> e : entries) {
			if (e != null) {
				values.add(e.value);
			}
		}
		return values;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		HashSet<java.util.Map.Entry<K, V>> set = new HashSet<java.util.Map.Entry<K, V>>();
		for (CacheEntry<K, V> e : entries) {
			if (e != null) {
				set.add(e);
			}
		}
		return set;
	}

}
