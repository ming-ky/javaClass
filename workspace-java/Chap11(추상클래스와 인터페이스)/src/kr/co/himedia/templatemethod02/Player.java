package kr.co.himedia.templatemethod02;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage(); //***초급자 레벨*** 이 부분이 출력됨.
	
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void setLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	


}
