package kr.co.himedia.innerclass;

class OutClass{ 
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass(); // 내부 클래스 생성 
	}
	
	class InClass{ //내부 클래스
		int inNum = 100;
		//static int sInNum = 200; // 위에 클래스에 static이 없으므로 오류남
		void inTest() {
			System.out.println("OutClass num = "+ num+ "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " +sNum+ "(외부 클래스의 클래스 변수)");
			System.out.println("InClass inNum = " +inNum+ "(내부 클래스의 인스턴스 변수)");
		}	
	}
	
	public void usingInClass() { 
		inClass.inTest(); //내부 클래스 (참조)변수를 사용하여 메서드 호출하기  
	}
	
	static class InStaticClass{ //정적 내부 클래스
		int inNum = 100;
		static int sInNum = 200; // 정적(스태틱)변수 - 위에 클래스에 static이 있어서 오류안남

		//정적 내부클래스의 일반 메서드
		void inTest() {
			//num = num + 10; //외부 클래스의 인스턴스 변수는 사용불가
			System.out.println("ISstaticClass inNum = " +inNum+ "(정적 내부클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass inNum = " +sInNum+ "(정적 내부클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " +sNum+ "(외부클래스의 스태틱 변수 사용)");
		}
		
		
		//정적 내부클래스의 정적 메서드
		static void sTest() {
		    //num += 10; // 외부 클래스의 인스턴스 변수 사용 불가
			//inNum += 10; // 내부 클래스의 인스턴스 변수 사용 불가 (스태틱 변수만 사용가능)
			
			System.out.println("OutClass sNum = " + sNum +"(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InstaticClass sInNum = " +sInNum + "(내부클래스에 스태틱 변수 사용)");
			
		}
	
	}
	
}

public class InnerClassTest {
	public static void main(String[] args) {
		// 1. 인스턴스 내부 클래스 
		OutClass outClass = new OutClass(); //OutClass 객체생성
		outClass.usingInClass(); //외부 클래스를 이용하여 내부 클래스의 메서드를 호출하는 상황 
		
		System.out.println();
	
		//(이미 만들어진) 외부클래스 객체를 이용하여 내부클래스의 메서드를 호출
		OutClass.InClass inClass = outClass.new InClass(); // 외부클래스.내부클래스 생성자 호출
		inClass.inTest();
		
		System.out.println();
		
		//2. 정적(Static) 내부 클래스
		// 외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest(); //정적 내부 클래스의 일반 메서드 호출
		System.out.println();
		sInClass.sTest(); // 정적 내부 클래스의 정적 메서드 호출
		
	}
}
