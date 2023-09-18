package kr.co.himedia.loop04;

import java.util.Scanner;

public class WhileTest03 {
/*
 *  ================
 *  1.증속 2.감속 3.중지
 *  ================
 *  입력 : 4
 *  (잘못된 입력 값 받았을 경우)
 *  잘못된 입력 값입니다. 출력 후 반복
 *  
 *  (바른 입력값 입력했을 경우)
 *  ================
 *  1.증속 2.감속 3.중지
 *  ================
 *  입력 : 1
 *  현재 속도 : 1 출력 후 반복
 *  
 *  ================
 *  1.증속 2.감속 3.중지
 *  ================
 *  입력 : 1
 *  현재 속도 : 2 출력 후 반복
 *  
 *  ================
 *  1.증속 2.감속 3.중지
 *  ================
 *  입력 : 2
 *  현재 속도 : 1 출력 후 반복 
 *  
 *  ================
 *  1.증속 2.감속 3.중지
 *  ================
 *  입력 : 3 
 *  프로그램을 종료합니다. 
 */
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println();
			System.out.println("================");
			System.out.println("1.증속 2.감속 3.중지");
			System.out.println("================");
			System.out.print("입력 : ");
			int choice = Scan.nextInt();
			if(choice == 1) {
				speed++;
				System.out.println("현재 속도 : "+ speed);
			}else if(choice == 2) {
				speed--;
				System.out.println("현재 속도 : "+ speed);
			}else if(choice ==3) {
				run = false;
			}
			else {System.out.println("잘못된 입력 값입니다.");}
		}
		System.out.println("프로그램을 종료합니다.");
		
		Scan.close();
		}

}

