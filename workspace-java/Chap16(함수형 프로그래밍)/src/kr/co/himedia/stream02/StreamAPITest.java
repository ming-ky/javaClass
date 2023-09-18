package kr.co.himedia.stream02;

import java.util.Arrays;
//import java.util.stream.IntStream;

public class StreamAPITest {
	public static void main(String[] args) {
		// 2의 배수를 더한 값 출력 - 기존 방법
		int[] numbers = {1, 2, 3, 4 ,5};
		int even = 0;
		
		for (int num : numbers) {
			if (num % 2 == 0) {
				even += num;
			}
		}
		
		System.out.print("even = " + even);
		System.out.println();
		
//		IntStream stream = Arrays.stream(numbers);	// 참조 변수에 저장
		
		// 2의 배수를 더한 값 출력 - 스트림
		int sumOfEven = Arrays.stream(numbers)
			.filter(n -> n % 2 == 0)
			.sum();
		
		System.out.println("sumOfEven = " + sumOfEven);
		System.out.println();
		
		// 2의 배수만 출력
		Arrays.stream(numbers)
			.filter(n -> n % 2 == 0)
			.forEach(n -> System.out.println("even = " + n));
		
		// 2의 배수 배열에 저장 후 for문 출력
		int[] evenNumbers = Arrays.stream(numbers)
			.filter(n -> n % 2 == 0)
			.toArray();
		
		for (int item : evenNumbers) {
			System.out.println("even = " + item);
		}
	}
}
