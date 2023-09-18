package kr.co.himedia.lambda04;

public class FunctionalInterfaceTest3 {
	public static void main(String[] args) {
		MathOperation mo = (x, y) -> x + y;
		// 선언부 매개변수 2개로 괄호 생략 불가
		// 타입 추론 가능해서 타입 생략 가능
		// 한 문장인데 식이면 return과 중괄호 생략 가능
		
		int result = mo.operation(100, 200);
		System.out.println("FunctionalInterFaceTest3 = " + result);
	}
}
