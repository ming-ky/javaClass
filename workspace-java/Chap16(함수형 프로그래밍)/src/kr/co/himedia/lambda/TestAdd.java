package kr.co.himedia.lambda;

public class TestAdd {
	public static void main(String[] args) {
//		Add addF = (int x, int y) -> { return x + y; };
		Add addF = (x, y) -> x + y;
		System.out.println(addF.add(10, 20));
	}
}
