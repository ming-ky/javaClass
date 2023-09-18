package kr.co.himedia.lambda03;

@FunctionalInterface
public interface TriFunction<T, U, A, R> {
	R apply(T t, U u, A a);
}
