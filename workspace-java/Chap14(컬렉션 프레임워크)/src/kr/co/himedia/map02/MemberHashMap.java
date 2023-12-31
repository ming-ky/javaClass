package kr.co.himedia.map02;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(hashMap)) {
			hashMap.remove(hashMap);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMembers() {
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();

	}
}
