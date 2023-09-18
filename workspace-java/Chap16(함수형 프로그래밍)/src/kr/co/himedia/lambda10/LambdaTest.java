package kr.co.himedia.lambda10;

public class LambdaTest {
	public static void main(String[] args) {
		// 익명 클래스
		MathOperation add = new MathOperation() {
			@Override
			public int operation(int x, int y, int z) {
				return x + y + z;
			}
		};
		
		int result = add.operation(100, 200, 200);
		System.out.println(result);
		
		// 람다
		MathOperation subtract =  (int a, int b, int c) -> { return a + b + c; };
//		MathOperation subtract = (a, b, c) -> a + b + c;
		result = subtract.operation(1000, 1000, 1000);
		System.out.println("람다식으로 더한 결과 = " + result);
		
		MathOperation mul = (a, b, c) -> a * b * c;
		result = mul.operation(10, 10, 10);
		System.out.println("람다식으로 곱한 결과 = " + result);
	}
}
