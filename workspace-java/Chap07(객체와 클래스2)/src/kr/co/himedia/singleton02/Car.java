package kr.co.himedia.singleton02;

/*
 * serialNum
 * static 변수를 이용한 차 고유번호를 만드는 기능
 */
public class Car {

	private static int seriaNum = 1000;
	private int carNum;
	
	public Car() {
		Car.seriaNum++;
		carNum = seriaNum;
	}

	public int getCarNum() {
		return carNum;
	}
	
	
}
