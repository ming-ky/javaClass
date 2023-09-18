package kr.co.himedia.operator02;

import java.util.Scanner;

public class ConditionTest03 {

	public static void main(String[] args) {
		//scanner를 이용해서 입력받은 값 중 큰 값 출력
		
		/* 예제 : 입력 받은 두 수 중에서 큰 수를 출력하시오. 
		 * 입력 1:
		 * 입력 2:
		 * 입력1과 입력2 중에 큰 수 출력*/
		
		System.out.println("입력 받은 두 수 중에서 큰 수를 출력하시오");
		Scanner scan = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num = scan.nextInt();
		System.out.print("입력2 : ");
		int num2 = scan.nextInt();
		
		int max = (num > num2) ? num : num2 ; 
		System.out.println("입력1과 입력2 중에 큰 수는 : " + max); 
		
		scan.close();

	}

}
