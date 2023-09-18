package kr.co.himedia.operator02;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//조건연산자-삼항연산자
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		//조건식 => ? 결과1 : 결과2
		char grade = (score >= 90) ? 'A' : 'B' ; // 90이상 A, 아니면 B
		System.out.println("당신의 등급 : " + grade); 
		
		//삼항연산자 중첩
		grade = (score >= 90) ? 'A' : ((score >= 80)? 'B' : 'C');
		System.out.println("당신의 등급 : " + grade); 

		scan.close();
	}

}
