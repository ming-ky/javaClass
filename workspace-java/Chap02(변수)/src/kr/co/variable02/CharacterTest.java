package kr.co.variable02;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); //숫자로 변환해서 출력하면 아스키 코드에 있는 숫자로 변환됨
		
		char ch2 = 66;
		System.out.println(ch2); // 숫자를 입력했지만 char로 형변환이 된 경우
		
		char ch3 = 67;
		System.out.println(ch3);
		
//		char ch4 = -66;  음수는 대입할 수 없음
		

		char ch5 = '한';
		char ch6 = '\uD55C'; //유니코드 입력
		
		System.out.println(ch5);
		System.out.println(ch6);

	}

}
