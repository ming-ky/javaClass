package kr.co.himedia.collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList); //[A, B, C]
		
		myList.add(1, "D"); // 배열 1번째멤버에 D를 추가함
		System.out.println(myList); //[A, D, B, C]
		
		myList.remove(); // 0번째 멤버부터 삭제됨
		System.out.println(myList); //[D, B, C]
		
		myList.remove(1); // 1번째 멤버가 삭제됨
		System.out.println(myList); // [D, C]
	}
}
