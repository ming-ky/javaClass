package kr.co.himedia.staticzone02;

public class MyUtil {
	
	/* Static
	 * static 멤버는 클래스를 사용하는 시점에서 자동으로 
       static-zone에 로딩됨
       - new를 이용해서 객체를 생성할 필요가 없음
	 */
	
	public static int hap(int a, int b) {
		int result = a + b;
		return result;
	}

}
