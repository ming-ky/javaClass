package kr.co.himedia.collection;

import java.util.ArrayList;

public class ListLab {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("banana"); //list는 각각의 메모리 주소를 할당 받기 때문에 중복을 허용함
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(0); //리스트 요소 삭제 (0)<-리스트 요소 번호
		list.set(1, "orange"); //리스트 요소 수정 (0, "")<- 바꿀 요소 번호와 내용
		
		System.out.println();
		
		for(String str : list)
			System.out.println(str); 
		// 0번째 apple가 삭제되어 1번째였던 banana가 0번째가 됨. 기존 2번째였던 cherry가 1번째가 되면서 내용이 orange로 바뀜
		
	}

}
