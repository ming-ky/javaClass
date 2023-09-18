package kr.co.himedia.loop03;

public class ContinueTest02 {

	public static void main(String[] args) {
		// 1~10까지의 수 중의 3의 배수의 개수를 구하여 출력하시오
		
		int count = 0;
		
		for(int i=1; i<=10; i++) {
			if(i % 3 != 0) continue; 
				count++; 
		}
		System.out.println(count);
	}

}
