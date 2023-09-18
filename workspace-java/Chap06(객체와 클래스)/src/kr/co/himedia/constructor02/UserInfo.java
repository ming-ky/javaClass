package kr.co.himedia.constructor02;

public class UserInfo {

	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;

	//기본생성자 생성
	public UserInfo() {};
	
	//생성자 초기화 3개만 해보기
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName+ "입니다.";
	}
	
	
}


