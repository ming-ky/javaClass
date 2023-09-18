package kr.co.himedia.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
//		배열		
		// 1. 객체에 도트(.) 연산자로 바로 출력
		Arrays.stream(array).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		// 2. 객체를 참조 변수에 저장
		// 2.1 출력
		IntStream is = Arrays.stream(array);
		is.forEach(n -> System.out.print(n + "\t"));	
		System.out.println();
//		is.forEach(n -> System.out.println(n + "\t")); // java.lang.IllegalStateException 예외 발생
		
		// 2.2 sum()
		IntStream isSum = Arrays.stream(array);
		int sum = isSum.sum();
		System.out.println("sum : " + sum);
		
		// 2.2 count()
		IntStream isCount = Arrays.stream(array);
		int count = (int) isCount.count();
		System.out.println("count : " + count);
		
//		ArrayList
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();	// stream() = 스트림 생성, mapToIn() = 중간 연산, sum() 최종 연산
		System.out.println(sum2);
	}
}
