package kr.co.himedia.string;

//StringBuilder 사용하기
public class StringTest03 {

	public static void main(String[] args) {
		String java = new String("java");
		String kotlin = new String("kotlin");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(System.identityHashCode(builder)); //1130478920
		
		builder.append(kotlin);
		System.out.println(builder); //javakotlin
		System.out.println(System.identityHashCode(builder)); //1130478920
		// StringBuilder를 사용하면 새로운 문자열이 생성되지 않고 기존 메모리에 연결됨.


	}

}
