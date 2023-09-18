package kr.co.himedia.lambda08;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory carfactory = Car::new;
		Car bmw = carfactory.create("BMW", 63900000);
		System.out.println(bmw.toString());
		
		// 익명 클래스 사용
		CarFactory carFactory2 = new CarFactory() {
			
			@Override
			public Car create(String type, int price) {
				return new Car(type, price);
			}
		};
		
		Car bmw2 = carFactory2.create("BMW2", 70000000);
		System.out.println(bmw2.toString());
		
		// 람다식
		CarFactory carFactory3 = (String type, int price) -> new Car(type, price);
		Car bmw3 = carFactory3.create("BMW3", 80000000);
		System.out.println(bmw3.toString());
	}
}
