package kr.co.himedia.string;

import java.util.Scanner;

public class StringSplitTest {

	public static void main(String[] args) {
		//String str = "Hello,World,Java";
		//String str = "Hello World Java";
		//String[] strArray = str.split("\\s"); //공백을 기준으로 문자를 잘라서 출력함 
		// Hello World Java 가 공백을 기준으로 띄워져서 출력됨.
		//Hello
		//World
		//Java
		
		//for (String s : strArray)
			//System.out.println(s);

		/*
		 * 응용
		 * 문자열을 입력하세요 : 우리 나라 만 세
		 * 우리 
		 * 나라
		 * 만
		 * 세
		 * 이렇게 출력되도록 하기
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 :");
		String str = scan.nextLine();
		String[] strArray = str.split("\\s");
		
		for (String s : strArray)
			System.out.println(s);
		
		scan.close();
	}

}
