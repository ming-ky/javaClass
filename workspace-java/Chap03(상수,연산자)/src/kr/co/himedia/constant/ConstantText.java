package kr.co.himedia.constant;

public class ConstantText {

	public static void main(String[] args) {
		final int MAX_NUM = 100; //선언과 동시에 초기화를 한 케이스 
		final int MIN_NUM;       //선언만 하기
		MIN_NUM = 60;            //나중에 초기화
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

		//MAX_NUM = 1000;  -> 오류. 상수는 변하지 않는 값이라 딱 한번만 초기화 가능
		
		int myScore = 50;
		if(myScore < MIN_NUM) { //상수를 사용하면 가독성이 좋아짐
			System.out.println("당신의 학점은 F입니다.");
		}
	}

}
