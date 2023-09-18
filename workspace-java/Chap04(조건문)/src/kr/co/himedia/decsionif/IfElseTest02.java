package kr.co.himedia.decsionif;

import java.util.Scanner;

public class IfElseTest02 {
	
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "1128";

	public static void main(String[] args) {
		// if, else 조건문 2

		Scanner scan = new Scanner(System.in);
		
	 System.out.println("ID : ");
	 String id = scan.nextLine(); //아이디 - 문자열 - next
	 
	 System.out.println("PW : ");
	 String pw = scan.nextLine(); //패스워드 - 문자열 - next
	 
	 //아이디와 패스워드가 모두 만족해야 하니까 AND인 메소드 사용
	 //equls = 동일한지 //&& 논리곱 //
	 if(id.equals(ADMIN_ID)&& pw.equals(ADMIN_PASSWORD)) // 조건이 두 개이고, 논리곱이라 두 개가 참이어야 됨.
	 {
		 System.out.println("관리자 로그인 성공!");
	 } else {
		 System.out.println("로그인 실패");
	 }
	 scan.close();
	}

}
