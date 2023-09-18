package kr.co.himedia.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");
		
		System.out.println(set.size()); //중복된 값은 안나와서 3개라고 표시됨.
		
		System.out.println(set.toString()); // 중복된 Apple가 빠져서 [Apple, Cherry, Banana] 라고 나옴
		
		for (String element : set) {
			System.out.println(element); // Set 구성멤버들이 나열됨 
		}
		
		set.remove("Banana"); // Banana 삭제
		System.out.println(set);  // [Apple, Cherry]
		
		boolean contains = set.contains("Cherry");
		System.out.println(contains); 
		
		set.clear(); //전체삭제
		
		boolean empty = set.isEmpty();
		System.out.println(empty); //다 비어있어서 True
		System.out.println(set); //[] 다 비어있다고 출력됨

	}
}
