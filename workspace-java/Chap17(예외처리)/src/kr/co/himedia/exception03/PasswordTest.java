package kr.co.himedia.exception03;

public class PasswordTest {

	private String passwd;

	public void setPasswd(String passwd) throws PasswordException{
		/* 비밀번호 입력 오류처리
		 * - 비밀번호는 null 일 수 없음
           - 비밀번호의 길이는 5자 이상임
           - 비밀번호는 문자로만 이루어져서는 안됨. (하나 이상의 숫자나 특수문자 포함해야함)
		 */
		
		if (passwd == null)
			throw new PasswordException("비밀번호는 null 일 수 없습니다.");
		else if (passwd.length()<5)
			throw new PasswordException("비밀번호의 길이는 5자 이상이어야 합니다.");
		else if (passwd.matches("[a-zA-Z]+")) 
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		
		this.passwd = passwd;
		}
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String password = null;
		
		try {
			test.setPasswd(password);
			System.out.println("오류 없음");
		} catch (PasswordException e) {
			//e.printStackTrace(); 이거 안가리면 오류 시 빨간 줄 나옴.
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		password = "hime"; 
		try {
			test.setPasswd(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		password = "abcde";
		try {
			test.setPasswd(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}
}
	
