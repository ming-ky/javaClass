package kr.co.himedia.operator;

public class ArithmeticTest {

	public static void main(String[] args) {
		//산술 연산자
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1+num2 = " + (num1+num2)); //더하기
		System.out.println("num1-num2 = " + (num1-num2)); //빼기
		System.out.println("num1*num2 = " + (num1*num2)); //곱하기
		System.out.println("num1/num2 = " + (num1/num2)); //나누기
		System.out.println("num1%num2 = " + (num1%num2)); //나머지

		int result;
		//result = 10 / 0; //0으로 나눌 경우 입력 시는 오류가 없지만 실행 시 오류가 발생함 (런타임에러) 밑에 꺼 까지 나오지 않음	
		System.out.println("--------");
		
		//예외 처리 코드
		try {
			result = 10 / 0;
		} 
		catch(ArithmeticException e) {
			System.out.println("예외 발생 함 : " + e);
		}
		System.out.println("--------");
		
	}

}
