package kr.co.himedia.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest03 {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,2,4,6,7,1,3};
		
		Set<Integer> set = new HashSet<>();
		for(int number : nums) { //number의 값을 num이라고 정의 number = {1,2,3,4,5,2,4,6,7,1,3};
			set.add(number); // set의 멤버로 number를 추가 set = {1,2,3,4,5,2,4,6,7,1,3};
		}
		for(int number : set) { // number는 set  number = {1,2,3,4,5,2,4,6,7,1,3};
			System.out.println(number); //중복된 숫자를 빼고 출력함 
		}
	}

}
