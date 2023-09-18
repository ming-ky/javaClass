package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		//Map은 Key-value 형태의 데이터를 관리
		Map<String, Integer> scoreMap = new HashMap<>(); //Map 객체생성
		
		//데이터 추가
		scoreMap.put("이순신", 98);
		scoreMap.put("이방원", 90);
		scoreMap.put("신사임당", 92);
		scoreMap.put("류성룡", 80);
		
		System.out.println("이순신의 점수 : " + scoreMap.get("이순신")); // get에 key값을 넣으면 그 key의 value값이 출력됨
		System.out.println("이방원의 점수 : " + scoreMap.get("이방원")); // key : 이방원이 가진 Value : 90 출력
		
		//데이터 수정
		scoreMap.put("신사임당", 100);
		System.out.println("신사임당의 점수 : "+ scoreMap.get("신사임당")); // 수정된 신사임당 value 값 100이 출력됨
		
		//데이터 삭제
		scoreMap.remove("이방원");
		System.out.println("이방원의 점수 : "+ scoreMap.get("이방원")); //이방원이 삭제되어 null로 나옴
		
		System.out.println();
		
		//전체 데이터 출력 
		for(Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
			System.out.println(entry.getKey() + "의 점수는 " + entry.getValue());
		}

	}

}
