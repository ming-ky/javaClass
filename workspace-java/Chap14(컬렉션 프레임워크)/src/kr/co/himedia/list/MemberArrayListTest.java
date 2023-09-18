package kr.co.himedia.list;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		//MemberArrayList 생성
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//Member 객체 추가
		Member memberL = new Member(2023, "이순신");
		Member memberW = new Member(2024, "원균");
		Member memberR = new Member(2025, "나대용");
		Member memberS = new Member(2026, "류성룡");
		
		//add 호출하면서 객체를 파라미터로 넘기기
		memberArrayList.addMember(memberL);
		memberArrayList.addMember(memberW);
		memberArrayList.addMember(memberR);
		memberArrayList.addMember(memberS);
		
		memberArrayList.showAllMembers();
		
		memberArrayList.removeMember(memberW.getMemberId());
		memberArrayList.showAllMembers();

	}

}
