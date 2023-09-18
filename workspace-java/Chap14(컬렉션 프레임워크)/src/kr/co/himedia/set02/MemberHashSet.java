package kr.co.himedia.set02;

import java.util.HashSet;
import java.util.Iterator;


public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) { 
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {                // 해당 ID를 가진 멤버를 ArrayList에서 찾음 
				hashSet.remove(member);		//해당 멤버 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMembers() {
		for (Member member : hashSet)
			System.out.println(member);
		System.out.println();
	}
}

