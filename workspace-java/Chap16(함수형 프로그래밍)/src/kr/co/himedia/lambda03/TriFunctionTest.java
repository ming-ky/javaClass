package kr.co.himedia.lambda03;

public class TriFunctionTest {
	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Integer> add = (a, b, c) -> a + b + c;
		int result = add.apply(100, 100, 100);
		System.out.println(result);
	}
}
