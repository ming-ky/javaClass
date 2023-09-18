package kr.co.himedia.interface03;

public interface Sell {

	void sell();
	
	/* 
	 * 디폴트 메서드 (java8 이후에 추가됨)
      - 기본 구현을 가지는 메서드 
      - 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드 
      - default 키워드 사용 
      - default void 메서드명() {}
	 */
	default void order() {
		System.out.println("판매 주문");
	}
}
