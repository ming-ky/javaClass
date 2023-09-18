package kr.co.himedia.loop;

public class ForLoopTest {

	public static void main(String[] args) {
		// for문 
		
		System.out.println("1~10까지 출력");
		for(int i=1; i<=10; i++) {
			System.out.print(i + " "); //가로정렬 하기위해 print 사용
		}
		
		System.out.println();
		
		System.out.println("아스키코드값을 이용한 출력 / A~Z까지 출력");
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch + ":" + (int)ch+" ");} //알파벳 + ":" + 알파벳의 아스키코드 숫자를 출력 
			                                          // 마지막 " "은 공백을 위한 거

		System.out.println();
		System.out.println("아스키코드값을 이용한 출력 / a~z까지 출력");
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch + ":" + (int)ch+" ");}
		
		System.out.println();
		System.out.println("foreach문");
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<numbers.length;i++) //number.length = number의 크기 = 10개 
		{ System.out.print(numbers[i]+" ");}
		
		System.out.println();
		System.out.println("foreach문 작성");
		{for(int su : numbers) {System.out.print(su + " ");}
	 }
	}
}
