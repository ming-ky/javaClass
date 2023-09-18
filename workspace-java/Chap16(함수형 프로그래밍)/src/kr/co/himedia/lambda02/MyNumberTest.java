package kr.co.himedia.lambda02;

public class MyNumberTest {
	public static void main(String[] args) {
		// 람다식을 함수형 인터페이스 타입 max 변수에 대입
		MyNumber myNumber = (x, y) -> (x > y) ? x : y;
		
		// 함수형 인터페이스 타입 변수로 호출
		System.out.println(myNumber.getMax(30, 20));
	}
}
