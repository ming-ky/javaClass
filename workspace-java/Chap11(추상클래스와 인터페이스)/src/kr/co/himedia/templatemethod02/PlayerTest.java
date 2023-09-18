package kr.co.himedia.templatemethod02;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		PlayerLevel pLevel1 = new IntermediateLevel();
		player.setLevel(pLevel1);
		player.play(2);
		
		PlayerLevel ppLevel1 = new AdvancedLevel();
		player.setLevel(ppLevel1);
		player.play(3);

	}

}
