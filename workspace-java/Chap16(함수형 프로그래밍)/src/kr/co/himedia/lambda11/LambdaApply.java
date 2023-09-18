package kr.co.himedia.lambda11;

public class LambdaApply {
	public static void main(String[] args) {
		// 람다식으로 모든 문자를 대문자로 변환하는 StringOperation 인터페이스 구현
		String str = "HiMdIa";
		StringOperation toUpper = result -> str.toUpperCase();
		String upper = toUpper.apply(str);
		System.out.println(upper);
		
		StringOperation toLower = result -> str.toLowerCase();
		String lower = toLower.apply(str);
		System.out.println(lower);
		
		String input = "Lambda Expression";
		System.out.println(operationString(input, toUpper));
		System.out.println(operationString(input, result -> str.toUpperCase()));
		System.out.println(operationString(input, toLower));
		
		PrintString reStr = returnString();
		reStr.showString("Hello ");
	}
	
	// 람다식을 인자로 사용하는 메서드
	public static String operationString(String input, StringOperation operation) {
		return operation.apply(input);
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "hi"); //
	}
}
