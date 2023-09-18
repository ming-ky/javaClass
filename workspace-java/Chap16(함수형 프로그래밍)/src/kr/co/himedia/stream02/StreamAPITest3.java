package kr.co.himedia.stream02;

import java.util.Arrays;
import java.util.List;

public class StreamAPITest3 {
	public static void main(String[] args) {
		// 짝수의 합 구하기
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int sumOfNumber = numbers.stream()
							.filter(StreamAPITest3::isEven)
							.sorted()
							.map(n -> n * n)
							.reduce(0, Integer::sum);
		System.out.println("1 ~ 10 사이 중 짝수의 제곱의 합 = " + sumOfNumber);
		
		
	}
	
	private static boolean isEven(int numbers) {
		if (numbers % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
