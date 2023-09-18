package kr.co.himedia.review;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		/* 다음과 같은 결과가 나오게 구현하시오. (Scanner 사용)
		 * -예시 
		 *     제목 : (자바자바) <=입력
		 *     title = 자바자바  
		 *     가격 : (20000) <=입력
		 *     price = 20000
		 *     출판사 : (하이미디어) <=입력
		 *     company = 하이미디어
		 *     저자 : (이순신) <=입력
		 *     author = 이순신
		 *     페이지 수  : (300) <=입력
		 *     page = 300 
		 *     ISBN : (0101234) <=입력
		 *     isbn : 0101234
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("제목을 입력 :");
		String title = scan.next();
		System.out.println("title : " + title);
		
		System.out.print("가격을 입력 :");
		int price = scan.nextInt();
		System.out.println("price : " + price);
		
		scan.nextLine();
		
		System.out.print("출판사 입력 :");
		String company = scan.next();
		System.out.println("company : " + company);
		
		System.out.print("저자 입력 :");
		String author = scan.next();
		System.out.println("author : " + author);
		
		System.out.print("페이지 수를 입력 :");
		int page = scan.nextInt();
		System.out.println("page : " + page);
		
		scan.nextLine();
		
		System.out.print("ISBN :");
		int isbn = scan.nextInt();
		System.out.println("isbn : " + isbn);
		
		
		scan.close();
	}

}
