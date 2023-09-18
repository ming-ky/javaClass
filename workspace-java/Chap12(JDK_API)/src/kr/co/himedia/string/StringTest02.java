package kr.co.himedia.string;

public class StringTest02 {

	public static void main(String[] args) {
		String java = new String("java");
		String kotlin = new String("kotlin");
		System.out.println(System.identityHashCode(java)); //1130478920
		
		java = java.concat(kotlin); ////java에 kotlin이 연결됨
		System.out.println(java); //javakotlin
		System.out.println(System.identityHashCode(java)); //1982791261 java의 주소가 달라짐
		/*
		 * 한번 생성된 String은 불변(immutable)
           - String을 연결하면 기존의 String에 연결되는 것이 아니고 
           새로운 문자열이 생성됨 (메모리 낭비가 발생할수도 있음)
		 */


	}

}
