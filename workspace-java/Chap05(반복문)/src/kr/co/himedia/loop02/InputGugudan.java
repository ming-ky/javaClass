package kr.co.himedia.loop02;

import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args) {
		/* 구구단을 출력합니다.
		 * 몇 단 부터 출력할까요?: (입력)
		 * 끝 단은 얼마인가요? (입력)
		 * 
		 * ===3단===
		 * 3*1=3
		 * 3*2=6
		 * ...
		 * 3*9=27
		 * ===4단===
		 * ...
		 * ===5단===
		 * ...
		 * 5*9=45
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단을 출력합니다.");
		System.out.print("몇 단 부터 출력할까요? :");
		int start = scan.nextInt();
		System.out.print("끝 단은 얼마인가요? :");
		int end = scan.nextInt();
		
		for(; start<=end; start++) {
			System.out.println("====="+start+"단"+"=====");
			for(int j=1; j<10; j++) {
				System.out.println(start +"*"+ j + "="+(start*j));
			}
		
			scan.close();
		}
	}

}
