package ch13.exercise.exam04;

public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getkey() {return key;}
	public V getvalue() {return value;}
}