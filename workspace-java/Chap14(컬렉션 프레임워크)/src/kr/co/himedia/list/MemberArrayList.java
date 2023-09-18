package kr.co.himedia.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	//ArrayList 포함시키기 (선언)
	private ArrayList<Member> arrayList;
	
	//기본생성자 생성
	public MemberArrayList() {//객체생성
		arrayList = new ArrayList<>();
	}
	
	//addMember 생성
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//removeMember 생성 
	public boolean removeMember(int memberId) { //멤버 ID를 매개변수로 하고 삭제여부를 리턴하는 메서드
//		//해당 아이디를 가진 멤버를 ArrayList에서 삭제
//		for (int i=0; i<arrayList.size();i++) { // 해당 ID를 가진 멤버를 ArrayList에서 찾음 
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if (tempId == memberId) {
//				//해당 멤버 삭제
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {                // 해당 ID를 가진 멤버를 ArrayList에서 찾음 
				arrayList.remove(member);		//해당 멤버 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	//showAllMembers 생성
	public void showAllMembers() {
		for (Member member : arrayList)
			System.out.println(member);
		System.out.println();
	}

}
