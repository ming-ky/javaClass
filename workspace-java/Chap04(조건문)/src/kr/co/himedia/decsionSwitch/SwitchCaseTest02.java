package kr.co.himedia.decsionSwitch;

public class SwitchCaseTest02 {

	public static void main(String[] args) {
		//switch 문 string 형식 출력하기
		
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
		    System.out.println("금메달 입니다.");
		    break;
		
		case "Silver":
			System.out.println("은메달 입니다.");
			break;
		
		case "Bronze":
			System.out.println("동메달 입니다.");
			break;
			
		default:
			System.out.println("메달이 없습니다.");
		}

	}

}
