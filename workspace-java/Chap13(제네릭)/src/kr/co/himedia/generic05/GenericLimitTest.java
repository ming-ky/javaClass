package kr.co.himedia.generic05;

public class GenericLimitTest {
	
	public static void main(String[] args) {
		
		Integer[] intArr = {1,2,3,4,5};
		Double[] doubleArr = {10.0, 20.0, 30.0, 40.0, 50.0};
		
		AverageCalc<Integer> integerCalc = new AverageCalc<>(intArr);
		double intgerAverage = integerCalc.calculateAverage();
		System.out.println(intgerAverage);
		
		AverageCalc<Double> doubleCalc = new AverageCalc<>(doubleArr);
		double doubleAverage = doubleCalc.calculateAverage();
		System.out.println(doubleAverage);
	}

}
