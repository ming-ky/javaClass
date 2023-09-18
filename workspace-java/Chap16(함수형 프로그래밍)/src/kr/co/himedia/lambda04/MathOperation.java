package kr.co.himedia.lambda04;

@FunctionalInterface
public interface MathOperation {
	int operation(int x, int y);
//	int operation(double x, double y);	// 한 개만 정의 가능
}
