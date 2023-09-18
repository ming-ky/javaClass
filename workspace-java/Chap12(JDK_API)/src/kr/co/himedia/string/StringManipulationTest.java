package kr.co.himedia.string;

public class StringManipulationTest {

	public static void main(String[] args) {
	
		String str = "HelloWorld";
		System.out.println(str.charAt(1)); //char at() n번째 문자를 출력함
		System.out.println(str.replaceAll("o", "x")); // 특정문자를 바꿈 o를 x로 바꿔서 HellxWxrld 가 출력
		System.out.println(str.length()); //문자의 숫자
		System.out.println(str.toUpperCase()); //대문자로 바꾸기
		System.out.println(str.toLowerCase()); //소문자로 바꾸기
		System.out.println(str.substring(5)); //추출해내기 5번째문자부터~
		System.out.println(str.substring(5,8)); // 5~8까지만 추출
		System.out.println(str.indexOf("W")); //특정 문자의 인덱스 값을 리턴해줌 W는 5번째 문자 이므로 5 출력
		System.out.println(str.indexOf("Wr")); //문자 인덱스값으로 연산 w=5 r=7 
		

	}

}
