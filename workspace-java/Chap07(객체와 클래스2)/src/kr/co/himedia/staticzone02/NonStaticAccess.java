package kr.co.himedia.staticzone02;

public class NonStaticAccess {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//non-static 멤버접근 방법 : 객체를 생성해서 접근해야함
		YourUtil your = new YourUtil(); //객체생성
		int result = your.hap(a, b);
		System.out.println(result);

	}

}
