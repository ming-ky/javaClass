package kr.co.himedia.stream04.travle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import kr.co.himedia.stream04.model.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		// 고객 3명 생성
		Consumer consumerL = new Consumer("이순신", 40, 100);
		Consumer consumerN = new Consumer("나대용", 20, 100);
		Consumer consumerG = new Consumer("권율", 13, 50);
		
		// 고객 목록을 저장
		List<Consumer> consumerList = new ArrayList<Consumer>();
		consumerList.add(consumerL);
		consumerList.add(consumerN);
		consumerList.add(consumerG);
		
		// 1. 고객 출력
		consumerList.stream()
			.map(consumer -> consumer.getName())
			.forEach(name -> System.out.println("고객 이름 = " + name));
		System.out.println();
		
		// 2. 여행 총 비용 출력
		int totalPrice = consumerList.stream()
							.map(consumer -> consumer.getPrice())
							.reduce(0, Integer::sum);
		
//		int totalPrice = consumerList.stream()
//							.mapToInt(consumer -> consumer.getPrice())
//							.sum();
		System.out.println("여행 총 비용 = " + totalPrice + "만원");
		System.out.println();
		
		// 3. 20세 이상인 고객만 출력
//		Predicate<Consumer> p = age -> age.getAge() >= 20;
		consumerList.stream()
			.filter(c -> c.getAge() >= 20)
			.map(c -> c.getName())
			.sorted()
			.forEach(s -> System.out.println(s));
	}
}
