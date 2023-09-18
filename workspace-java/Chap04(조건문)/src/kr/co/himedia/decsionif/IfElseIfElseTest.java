package kr.co.himedia.decsionif;

import java.util.Scanner;

public class IfElseIfElseTest {
	public static void main(String[] args) {
		//if,else if 조건문
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
	
		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("점수가 90~100점 사입니다.");
			System.out.println("등급은 A 입니다.");
		}
		else if(score >= 80) {
			System.out.println("점수가 80~89점 사입니다.");
			System.out.println("등급은 B 입니다.");
		}
		else if(score >= 70) {
			System.out.println("점수가 70~79점 사입니다.");
			System.out.println("등급은 C 입니다.");
		}
		else if(score >= 60) {
			System.out.println("점수가 60~69점 사입니다.");
			System.out.println("등급은 D 입니다.");
		}
		else {
			System.out.println("점수가 59점 이하입니다.");
			System.out.println("등급은 F 입니다.");
		}
		
		scan.close();
	}
}
