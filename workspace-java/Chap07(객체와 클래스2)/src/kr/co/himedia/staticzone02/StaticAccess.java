package kr.co.himedia.staticzone02;

public class StaticAccess {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//static 멤버접근 방법 - int result =클래스이름.호출메서드
		int result = MyUtil.hap(a, b);
		System.out.println(result);
	}
}
