package kr.co.himedia.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("이순신 장군");
		sList.add("나대용 구선 제작자");
		sList.add("권율");
		
		Stream<String> stream = sList.stream(); // 스트림 생성, 최총 연산
		stream.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.print(s + "\t")); // 스트림 생성, 중간 연산 ,최종 연산
		System.out.println();
		
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		sList.stream().filter(s -> s.length() >= 7).forEach(s -> System.out.print(s + "\t"));
		
	}	
}
