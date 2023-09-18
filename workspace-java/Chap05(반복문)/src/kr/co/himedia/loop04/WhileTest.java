package kr.co.himedia.loop04;

public class WhileTest {

	public static void main(String[] args) {
		// While문 1~100까지의 합
		
		int sum=0;
		int num=1; //while문은 초기화하는 부분이 따로 없음 때문에 밖에 초기화를 시켜줘야함.
		
		while(num<=100) { //while문 옆에는 조건식만 들어감
		  sum += num; 
		  num++;
		}
		System.out.println("1 ~ 100까지의 합 : " + sum);
		
		//while 문의 무한루프 
		//while문은 무한루프용으로 많이 사용함.
		// - if, break와 함께 사용하여 무한루프를 벗어날 코드를 작성해줘야함
		int i =1;
		while(true) {
			System.out.println(i); //이렇게 입력하면 1이 무한으로 입력됨
			if (i>=100) break; //조건과 break를 걸어주면 그 부분에서 끝남
			i++;
		}
	}

}
