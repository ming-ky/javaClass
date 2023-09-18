package kr.co.himedia.loop;

public class ForTest02 {

	public static void main(String[] args) {
		/* Quiz. 1~100까지의 합 중 누적 합계가 2000 이상 일 때 i값과 그때의 누적값을 출력하시오
		 *       예) 2000이상 일 때 i의 값 : 63 
		 *                       누적값 : 2016  
		 */

		int sum = 0;
		int temp = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			if(sum>=2000) {
				temp = i;
				break;  //2000이상일 때 멈출 수 있게 break 넣어줌.
			}
		}
		System.out.println("2000이상일 때 i값 : "+ temp);
		System.out.println("2000이상일 때 i값 : "+ sum);
		}
	}

