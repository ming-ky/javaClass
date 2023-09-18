package kr.co.himedia.lambda06;

import kr.co.himedia.lambda05.Comverter;

public class StringUtilityTest {
	public static void main(String[] args) {
		StringUtility stringUtility = new StringUtility();
		Comverter<String, String> comverter = stringUtility::reverse;
		String result = comverter.comvert("HiMedia");
		System.out.println(result);
	}
}
