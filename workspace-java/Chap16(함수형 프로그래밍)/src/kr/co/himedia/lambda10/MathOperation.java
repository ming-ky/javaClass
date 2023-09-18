package kr.co.himedia.lambda10;

@FunctionalInterface				// 함수형 인터페이스임을 나타내는 애노테이션
public interface MathOperation {
	int operation(int x, int y, int z);	// 추상 메서드, public abstract 생략된 상태
}
