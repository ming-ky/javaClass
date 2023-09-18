package kr.co.himedia.staticzone03;

class cat{
	static int global = 5; // static 변수 
	int num = 3; // 멤버(instance) 변수
	
	public void printValue(int num) { //멤버메서드
		//멤버메서드에서 스태틱 변수를 호출 할 수 있는지? 그냥은 안되고 static 멤버 접근 방법을 써야함. (클래스이름.호출메서드)
		this.num = num;
		System.out.println("num : "+ num);
		System.out.println("global : "+cat.global); //static 멤버 접근 방법
	} 
}

public class GlovalVariableTest {
	
	public static void main(String[] args) {
		cat.global = 10; //static 변수에 직접 접근
		cat cat1 = new cat(); // 지역변수(참조변수) => 스택영역에 생성
		cat1.printValue(20);
		cat1.num = 1; // 인스턴스 멤버 접근 
	}

}
