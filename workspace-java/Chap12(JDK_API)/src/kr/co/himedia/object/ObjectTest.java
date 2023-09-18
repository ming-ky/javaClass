package kr.co.himedia.object;

public class ObjectTest {

	public static void main(String[] args) {
		A a = new A();
		a.display();
		
		//UpCasting
		/*
		 * Object 타입으로 UpCasting 되면 => 반드시 DownCasting을 해야됨
		 */
		Object obj = new A();
		((A)obj).display();

	}

}
