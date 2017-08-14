package HW170809;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import HW170809.Dictionary.Pair;

public class Dictionary<K,V> implements Iterable<Pair<K,V>> {

	private static final int MAX = 3;
	private int occupiedBuckets = 0;

	List<Pair<K,V>>[] data = new List[MAX];


	public static class Pair<K,V> {
		K key;
		V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return key.toString() + " : " + value.toString();
		}
	}

	private void put(K key, V value, List<Pair<K,V>>[] data) {
		occupiedBuckets++;
		if(((float) occupiedBuckets / (float) this.data.length) > 0.75){
			resize();
			put(key, value, this.data);
			return;
		}
		int index = hash(key);
		if (data[index] == null) {

			data[index] = new ArrayList<>();
		}

		Pair<K,V> pair = getPair(key, index, data);
		if (pair == null) {
			data[index].add(new Pair<>(key, value));
			return;
		}

		pair.value = value;
		occupiedBuckets--;
	}
	public void put(K key, V value){
		put(key, value, this.data);
	}

	private int hash(K key) {
		return (key.hashCode() & 0x7FFFFFFF) % data.length;
	}

	public V get(K key) {
		Pair<K, V> pair = getPair(key, hash(key), this.data);
		return pair == null ? null : pair.value;
	}

	private Pair<K,V> getPair(K key, int hash, List<Pair<K,V>>[] data ) {
		List<Pair<K,V>> list = data[hash];
		if (list == null) { // guard condition
			return null;
		}
		for (Pair<K,V> pair : list) {
			if (pair.key.equals(key)) {
				return pair;
			}
		}

		return null;
	}

	private void resize(){
		occupiedBuckets = 0;
		List<Pair<K,V>>[] newData = new List[data.length * 2];
		for(Pair p : this){
			put((K) p.key, (V) p.value, newData);
		}
		this.data = newData;

	}


	@Override
	public Iterator<Pair<K,V>> iterator() {
		return new Iterator<Dictionary.Pair<K,V>>() {
			int currentElement = -1;
			Iterator<Pair<K,V>> listIterator = null;

			@Override
			public boolean hasNext() {

				if (listIterator != null && listIterator.hasNext()) {
					return true;
				}

				listIterator = null;

				for (++currentElement; listIterator == null
						&& currentElement < data.length; currentElement++) {
					List<Pair<K,V>> list = data[currentElement];
					if (list == null) {
						continue;
					}
					listIterator = list.iterator();
					if (!listIterator.hasNext()) {
						continue;
					}
					return listIterator.hasNext();
				}

				return false;
			}

			@Override
			public Pair<K,V> next() {
				if (!hasNext()) {
					throw new IllegalArgumentException();
				}
				return listIterator.next();
			}
		};
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Pair p : this){
			sb.append(p.toString()).append("\n");
		}
		return sb.toString();
	}
}
