package kr.co.himedia.templatemethod02;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage(); //레벨에 따라 할 수 있는 기능 안내
	
	final public void go(int count) {
			run();
			for (int i=0; i<count; i++)
				jump();
			turn();
	}
}
