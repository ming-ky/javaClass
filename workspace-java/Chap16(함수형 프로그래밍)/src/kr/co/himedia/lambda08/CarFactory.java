package kr.co.himedia.lambda08;

@FunctionalInterface
public interface CarFactory {
	Car create(String type, int price);
}
