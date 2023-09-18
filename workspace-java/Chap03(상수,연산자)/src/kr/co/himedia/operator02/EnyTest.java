package kr.co.himedia.operator02;

public class EnyTest {

	public static void main(String[] args) {
		
		boolean power = false;
		System.out.println("power의 값 : " + power); // power의 값 false
		
		power = !power;
		System.out.println("power의 값 : " + power); // power의 값 false 부정
		
		power = !power;
		System.out.println("power의 값 : " + power); // power의 값 false 부정 한 것을 다시 부정
		
		if(!power) {
			System.out.println("if문 실행"); 
		}

	}

}
