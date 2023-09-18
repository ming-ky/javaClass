package kr.co.himedia.operator;

public class PlusMinusSignTest {

	public static void main(String[] args) {
		//부호연산자
		short num = 5;
		System.out.println(+num); //부호유지
		System.out.println(-num); //부호를 바꿔서 얻은 결과 출력
		System.out.println(num);  //num 값은 변하지 않음
	}

}
