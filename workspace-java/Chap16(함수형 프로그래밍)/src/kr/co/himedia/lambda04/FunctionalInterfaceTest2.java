package kr.co.himedia.lambda04;

public class FunctionalInterfaceTest2 {
	public static void main(String[] args) {
		MathOperationImpl moi = new MathOperationImpl();
		int result = moi.operation(100, 200);
		
		System.out.println(result);
	}
}
