package kr.co.himedia.loop02;

public class XTest {

	public static void main(String[] args) {
		/*
		 * * * 1/5 * * 2/4 * 3 * * 2/4 * * 1/5 *표로 x만들기
		 */

		int x = 1;
		int y = 5;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == x || j == y) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
			x++;
			y--;
		}
	}
}
