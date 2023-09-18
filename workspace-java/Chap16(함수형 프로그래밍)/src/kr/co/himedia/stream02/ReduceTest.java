package kr.co.himedia.stream02;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceTest {
	public static void main(String[] args) {
		String[] chunho = {"현대백화점 천호점!!!", "E-mart", "Hi HiMedia", "청년주상복합건물"};
		
		// 스트림 생성 후 중간 연산(reduce)
		System.out.println(Arrays.stream(chunho).reduce("", (s1, s2) -> { 
				if(s1.getBytes().length >= s2.getBytes().length) {
					return s1;
				} else {
					return s2;
				}
			}
		));
		
		String str = Arrays.stream(chunho).reduce(new CompareString()).get();
		System.out.println(str);
	}
}

class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String t, String u) {
		if (t.getBytes().length >= u.getBytes().length) {
			return t;
		} else {
			return null;
		}
	}
}
