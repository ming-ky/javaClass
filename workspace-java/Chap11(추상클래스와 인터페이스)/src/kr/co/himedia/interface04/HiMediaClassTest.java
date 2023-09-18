package kr.co.himedia.interface04;

public class HiMediaClassTest {

	public static void main(String[] args) {
		HiMediaClass hClass = new HiMediaClass();
		hClass.x();
		hClass.y();
		hClass.myMethod();
		
		//upCasting x->hiMediaClass / y->hiMediaClass
		X xClass = hClass;
		xClass.x();
		
		Y yClass = hClass;
		yClass.y();
		
		//upCasting hiMediaInterface -> hiMediaClass
		HiMediaInterface hClazz = hClass;
		hClass.myMethod();
	}
}
