package kr.co.himedia.singleton02;

/*
 * createCar() 차를 만드는 기능을 넣어야 함.
 */
public class CarFactory {
	
	private CarFactory() {}
	private static CarFactory Instance = new CarFactory();
	
	public static CarFactory getCarFactory() {
		if (Instance == null)
			Instance = new CarFactory();
		return Instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}

}
