package kr.co.himedia.set02;


public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet mHashSet = new MemberHashSet(); //기본생성자로 생성 
		
		Member memberL = new Member(2023, "이순신"); //멤버 객체 생성
		Member memberW = new Member(2024, "원균");
		Member memberR = new Member(2025, "나대용");
		Member memberS = new Member(2026, "류성룡");
		
		mHashSet.addMember(memberL); //멤버 객채를 mHashSet에 넣음
		mHashSet.addMember(memberW);
		mHashSet.addMember(memberR);
		mHashSet.addMember(memberS);
		mHashSet.showAllMembers();
		
		Member memberLe = new Member(2024, "이도"); //아이디 memberW랑 겹침
		mHashSet.addMember(memberLe); // new Member(2024, "이도");를 mHashSet에 넣음
		mHashSet.showAllMembers(); //아이디가 중복되는데 출력이 됨.

	}

}
