package kr.co.himedia.staticzone03;

import java.util.Random;

/*
 * static 변수가
 * main 보다 먼저 실행되는지 알아보기 
 */
public class StaticBeforeMain {

	static int num; //스태틱 멤버 변수 (클래스변수)
	static { // static 초기화 블록 
		Random random = new Random();
		num = random.nextInt(100);   // num 값으로 0~99사이 임의의 숫자 반환 
	}
	
	public static void main (String[] args) {
		System.out.println(num); // static이 main보다 먼저 실행되어 num값이 출력됨
	}
	
}
