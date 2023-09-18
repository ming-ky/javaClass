package kr.co.himedia.array03;

public class TwoDimensionTest {
//다차원 배열
	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3},{4, 5, 6, 7}
		}; //선언하면서 초기화 int[][]arr = new int[3][4];와 같은 방식
		
		int i,j;
		for (i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(",\t" + arr[i].length);
			System.out.println();
		}
	}

}
