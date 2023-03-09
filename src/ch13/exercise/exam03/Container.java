package ch13.exercise.exam03;

public class Container<K, V> {
	private K key;
	private V value;
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getvalue() {
		return this.value;
	}
}
