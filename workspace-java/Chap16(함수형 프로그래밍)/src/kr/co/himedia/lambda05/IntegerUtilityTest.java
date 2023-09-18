package kr.co.himedia.lambda05;

public class IntegerUtilityTest {
	public static void main(String[] args) {
		// 정적 메서드 참조
		Comverter<String, Integer> comverter = IntegerUtility::stringToInt;
		int result = comverter.comvert("123");
		System.out.println(result);
	}
}
