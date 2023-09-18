package kr.co.himedia.stream04.model;
/*
 * 여행 상품이 있습니다.
 * 여행 비용: 15세 이상(100만원), 15세 미만(50만원)
 * 고객 세명이 여행을 간다면 비용 계산과 검색에 대한 연산 스트림을 활용해 구현하기
 */
public class Consumer {
	private String name;
	private int age;
	private int price;
	
	public Consumer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return "Consumer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
}
