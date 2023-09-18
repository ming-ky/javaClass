package kr.co.himedia.lambda09;

public class StringConcatTest {
	public static void main(String[] args) {
		System.out.println("--- 객체 생성 ---");
		String str1 = "Hi";
		String str2 = "Media";
		StringConcatImpl concatImpl = new StringConcatImpl();
		concatImpl.makeString(str1, str2);
		
		System.out.println("--- 익명 함수 ---");
		str1 = "Hello";
		str2 = "World!";
		StringConcat concat = new StringConcat() {
			@Override
			public void makeString(String str1, String str2) {
				System.out.println(str1 + ", " + str2);
			}
		};
		
		concat.makeString(str1, str2);
		
		System.out.println("--- 람다식 ---");
		str1 = "Good";
		str2 = "Bye";
		StringConcat concat2 = (String s1, String s2) -> { System.out.println(s1 + ", " + s2); };
		concat2.makeString(str1, str2);
	}
}
