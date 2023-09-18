package kr.co.himedia.decsionif;

import java.util.Scanner;

public class IfElseIfElseTest02 {
	public static void main(String[] args) {
		//IfElseIfElseTest 에서는 100점이 넘어가거나, 음수여도 점수가 나왔음.
		// 논리곱, else를 추가하여 점수의 범위를 정하고 잘못입력한 부분을 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
	
		int score = scan.nextInt();
		
		if(score >= 90 && score <=100) {
			System.out.println("점수가 90~100점 사입니다.");
			System.out.println("등급은 A 입니다.");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("점수가 80~89점 사입니다.");
			System.out.println("등급은 B 입니다.");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("점수가 70~79점 사입니다.");
			System.out.println("등급은 C 입니다.");
		}
		else if(score >= 60 && score <70) {
			System.out.println("점수가 60~69점 사입니다.");
			System.out.println("등급은 D 입니다.");
		}
		else if(score <= 59 && score > 0){
			System.out.println("점수가 59점 이하입니다.");
			System.out.println("등급은 F 입니다.");
		}
		else {
			System.out.println("점수를 잘못 입력했습니다.");
		}
		
		//다른 방법으로는 if 안에 if, else if 를 중첩하는 방법이 있음.
		// Validation : score 변수의 값에 따라서 조건문 분기가 일어나며, 
		//              정확한 범위를 사용하겠다는 것
		
		if (score >= 0 && score <=100) { //if에 범위를 정해놓고 그 안에 if,else if 중첩
			if (score >= 90) System.out.println("A");
			else if (score >= 80) System.out.println("B");
			else if (score >=70) System.out.println("C");
			else if (score >=60) System.out.println("D");
			else System.out.println("F");
		}
		else System.out.println("잘못 입력했습니다.");
		
		scan.close();
	}
}
