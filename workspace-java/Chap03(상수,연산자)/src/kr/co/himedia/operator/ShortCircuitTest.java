package kr.co.himedia.operator;

public class ShortCircuitTest {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10); 
		// 논리곱 : 두 항이 모두 참이어야 함. 앞에 (num1 += 10) < 10 가 틀렸기 때문에 (i += 2) < 10는 연산을 하지 않음.
		
		System.out.println(value); 
		System.out.println(num1); 
		System.out.println(i); //연산을 하지 않아서 i 값이 바뀌지 않음
		
		System.out.println();
		
		value = ((num1 += 10) < 10)||((i += 2)< 10); 
		// 논리합 : 두 항 중 한가지 항이라도 참이면 true. 앞에 가 틀렸어도 뒤에 연산을 함.
		System.out.println(value); 
		System.out.println(num1); 
		System.out.println(i); //연산이 되어서 i 값이 바뀜

	}

}
