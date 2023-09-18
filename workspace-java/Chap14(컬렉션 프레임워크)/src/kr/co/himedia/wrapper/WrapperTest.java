package kr.co.himedia.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		int a = 10; //기본자료형
		Integer aa = 10; //Auto-Boxing //new Integer(10; 과 같은내용
		System.out.println(aa.intValue());  //Auto-Unboxing [Integer -> int]
		
		Integer bb = 20; // Auto-Boxing
		int b = bb; //Auto-Unboxing

	}

}
