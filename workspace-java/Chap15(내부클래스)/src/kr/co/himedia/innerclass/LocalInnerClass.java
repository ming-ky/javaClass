package kr.co.himedia.innerclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { //쓰레드의 상위급
		
		int num = 100; // 지역변수는 반드시 초기화 해야함.
		
		class MyRunnable implements Runnable{
			int localNum = 10;
			
		@Override
		public void run() { //지역변수 내 메서드 추가 //이 run() 메서드는 나중에 또 호출될 수 있음
			//i = 100; // 매개변수는 상수(final)로 바뀜
			//num = 200; //지역변수는 상수(final)로 바뀜
			System.out.println("i = " + i);
			System.out.println("num = " + num);
			System.out.println("localNum = " + localNum);
			System.out.println("outNum = " + outNum + "(외부 클래스의 인스턴스 변수)");
			System.out.println("sNum = " + sNum + "(외부 클래스의 정적 변수)");
			System.out.println("Outer.sNum = " +Outer.sNum+ "(외부 클래스의 정적변수)");
			
			}
			
		}
		
		return new MyRunnable();
		
	}
}

public class LocalInnerClass {
	
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner =  out.getRunnable(10);
		runner.run();
	}

}
