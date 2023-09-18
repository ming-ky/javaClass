package kr.co.himedia.nongeneric;
/* Generic
 * 1) 자바 제네릭(Generic)은 데이터 타입을 일반화하는 방법임
   2) 제네릭을 사용하면 컬렉션, 메서드, 클래스 등에서 사용하는 
      데이터 타입을 런타임 시에 결정할 수 있음
 */
public class GenericThreeDPrinter<T> {

	private T material; // T 자료형으로 선언한 (참조) 변수

	public T getMaterial() {  //T 자료형을 반환하는 제네릭 메서드
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
}
