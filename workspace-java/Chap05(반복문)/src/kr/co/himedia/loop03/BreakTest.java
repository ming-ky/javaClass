package kr.co.himedia.loop03;

public class BreakTest {

	public static void main(String[] args) {
		// 1부터 숫자를 더해 100이 넘는 순간 그 숫자와 합을 출력하시오

		int sum = 0;
		int num;
		for(num=1; ; num++) {
			sum += num;
			if(sum>=100) break;
		}
		System.out.println("100이 넘는 순간의 합 :" + sum);
		System.out.println("100이 넘는 순간의 num :"+ num);
	}

}
