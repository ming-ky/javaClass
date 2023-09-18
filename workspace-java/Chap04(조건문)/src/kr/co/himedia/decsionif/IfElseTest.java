package kr.co.himedia.decsionif;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		//if,else 조건문
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자(정수)를 입력하세요 : ");
		int age = scan.nextInt();
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		scan.close();

	}

}
