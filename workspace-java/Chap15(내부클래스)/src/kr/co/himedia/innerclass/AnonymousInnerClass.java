package kr.co.himedia.innerclass;

class Outter{ //익명내부 클래스
	Runnable getRunnable(int i) {
	
		int num = 100; 
		
		return new Runnable(){ //class MyRunnable implements Runnable 기존 이름에서 class 이름이 없어짐 (익명클래스)
			int localNum = 10;
			
		@Override
		public void run() {
			System.out.println("i = " + i);
			System.out.println("num = " + num);
			System.out.println("localNum = " + localNum);
			}
			
		};
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
			
		}
	};
	
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}

}
