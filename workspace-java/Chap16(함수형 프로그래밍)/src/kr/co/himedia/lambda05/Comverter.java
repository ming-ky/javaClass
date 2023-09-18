package kr.co.himedia.lambda05;

@FunctionalInterface
public interface Comverter<F, T> {
	T comvert(F from);
}
