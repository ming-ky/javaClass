package kr.co.himedia.set03;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>(); //treeSet 객체생성
		treeSet.add("이순신"); // 객체 멤버 추가
		treeSet.add("류성룡");
		treeSet.add("신사임당");
		treeSet.add("신사임당"); // 중복 멤버 추가
		
		for (String str : treeSet) // str에 treeSet 정의
			System.out.println(str); // 류성룡 신사임당 이순신 출력됨 (중복된 신사임당은 출력되지 않음)
		
	}

}
