package kr.co.himedia.list;

public class Member {

	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) { //생성자 오버로딩 Source - Generate constructor using Fields
		//super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	  public int getMemberId() {
	      return memberId;
	   }

	   public void setMemberId(int memberId) {
	      this.memberId = memberId;
	   }

	   public String getMemberName() {
	      return memberName;
	   }

	   public void setMemberName(String memberName) {
	      this.memberName = memberName;
	   }


	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는" +memberId+"입니다.";
	}

	
	
	
}
