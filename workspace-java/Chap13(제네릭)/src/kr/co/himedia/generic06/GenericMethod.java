package kr.co.himedia.generic06;

public class GenericMethod { 
	//제네릭 메서드 추가해보기
				 //리턴타입
	public static <T, V> double makeRectangle(Point<T, V> point1, Point<T, V> point2) {
		double left = ((Number)point1.getX()).doubleValue(); //number 타입으로 업캐스팅
		double right = ((Number)point2.getX()).doubleValue();
		
		double top = ((Number)point1.getY()).doubleValue();
		double bottom = ((Number)point2.getY()).doubleValue();
		
		double width = right - left; //밑변 계산
		double height = bottom - top; //높이 계산
		
		return width * height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> point1 = new Point<>(0, 0.0); //point1 객체 생성
		Point<Integer, Double> point2 = new Point<>(10, 10.0); //point2 객체 생성
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(point1, point2); //메소드 호출
		System.out.println("두 점으로 만들어진 사각형 넓이는 " + rect + "입니다.");
	}
}
