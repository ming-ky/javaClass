package kr.co.himedia.lambda03;

import java.util.function.Function;

public class AdderTest {
	public static void main(String[] args) {
		Function<Integer, Integer> myAdder = new Adder();
		System.out.println(myAdder.apply(100));
	}
}
