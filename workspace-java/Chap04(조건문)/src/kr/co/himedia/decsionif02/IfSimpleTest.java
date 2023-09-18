package kr.co.himedia.decsionif02;

import java.util.Scanner;

public class IfSimpleTest {

	public static void main(String[] args) {
		// 단순 if 문 
		
		int x = 5;
		
		if(x > 0) {
			System.out.println("양수입니다.");
		}
		
		System.out.println("---------Quiz1 : 8의 배수인지 구분 ---------");
		
		//Quiz1. 정수 1개를 입력받아 입력된 수가 8의 배수인지를 출력하시오. (입력받아야할 경우 scanner 사용해야함.)
		// 예시 ) 16은 8의 배수입니다.  
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오");
		int num = scan.nextInt();
		
		//8의 배수일 경우 8로 나눴을 때 나머지가 0이니까 나머지 연산자 사용
		if(num % 8 == 0) {System.out.println(num + "은 8의 배수입니다.");} 
		
		//추가 응용해본 것 - 아닐 경우 아니라고 나타내기
		else {System.out.println(num + "은 8의 배수가 아닙니다.");}
		System.out.println("프로그램 종료"); // 조건문과 상관없이 출력됨.
		
		//Quiz2. 나이를 입력 받아 18세 이상이면 "성인입니다."를 출력하시오.
		System.out.println("---------Quiz2 : 18살 이상은 성인 ---------");
		System.out.print("나이를 입력하시오");
		int age = scan.nextInt();
		if(age >= 18) {System.out.println(age + "살은 성인입니다.");}
		//추가 응용
		else {System.out.println(age + ("살은 성인이 아닙니다."));}
		System.out.println("프로그램 종료");
		scan.close();
	}

	
}
