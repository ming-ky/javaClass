package kr.co.himedia.operator;

public class LogicalTest {

	public static void main(String[] args) {
		//논리연산자
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = (num1 > 1) && (num1 < 10); //논리곱을 할 경우 두 값이 모두 참이어야 'true' 하나라도 틀리면 'false'
		System.out.println("1 초과 10 미만인가요? " + result);
		
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0); //논리합은 두 값중 하나의 항만 참이면 'true'
		System.out.println("2 또는 3 배수인가요 ? " + result);
		
	}

}
