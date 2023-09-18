package kr.co.himedia.decsionif;

public class IfTest {

	public static void main(String[] args) {
		// if 조건문
		
		int num = 100;
		
		if(num > 50) {
			System.out.println("num 변수의 값이 50보다 큽니다.");
		}
		
		// 한 줄만 실행하면 중괄호 생략 가능
		if (num > 60) 
			System.out.println("num 변수의 값이 60보다 큽니다.");
		
		// 같은 줄에 작성 가능
		if (num > 70) System.out.println("num 변수의 값이 70보다 큽니다.");

		if (num > 50) 
			System.out.println(num);
		System.out.println("num 변수의 값이 50보다 작습니다.");
	}

}
