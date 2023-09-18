package kr.co.himedia.generic06;

public class Point<T, V>{ //멀티제네릭 타입

	private T x;
	private V y;
	
	public Point(T x, V y) { //객체생성
		this.x = x;  //초기화
		this.y = y; 
	}

	public T getX() { //getter 추가 
		return x;
	}

	public V getY() {
		return y;
	}
	
	
}
