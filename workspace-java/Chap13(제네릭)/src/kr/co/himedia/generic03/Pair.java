package kr.co.himedia.generic03;

public class Pair<K,V> {
	
	private K key; 
	private V value;
	
	
	public Pair(K key, V value) { //생성자추가
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value ;
	}
}
