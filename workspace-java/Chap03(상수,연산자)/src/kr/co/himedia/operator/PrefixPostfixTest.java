package kr.co.himedia.operator;

public class PrefixPostfixTest {

	public static void main(String[] args) {
		//증감 연산자
		int num = 10;
		System.out.println(++num); //num 값 1 증가 후 출력
		System.out.println(num); //num 값이 1증가 되었음
		
		System.out.println();
		
		System.out.println(num++); // 증가한 11에서 변화가 없음. 기존 num값 출력 후에 값이 증가
		System.out.println(num); //num 값이 1증가되어 12가 되었음
		
		System.out.println();
		
		int x = 10;
		int y = 10;
		
		System.out.println("x = " + (x++));
		System.out.println("x = " + x);
		
		System.out.println("y = " + (++y));
		System.out.println("y = " + y);
	}

}
