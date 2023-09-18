package kr.co.variable03;

public class CharTest {

	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println("ch = " + ch);
		
		int capitalA = 'A';
		System.out.println("capitalA = "+ capitalA);

		int capitalB = 'B' + 1;
		System.out.println("capitalB + 1 = " + (char)capitalB);
		
		System.out.println();
		
		// '가' 라는 한글 한 문자를 변수에 저장하고 출력하시오
		char txt = '가';
		System.out.println("txt = " + txt);
		
		int Gha = '가';
		System.out.println("Gha = " + Gha);
		
		int GahU = '\uac00';
		System.out.println("GahU =" + GahU);
		
		System.out.println();
		
		// 대문자 'A'를 문자 'a'로 변환하여 출력하시오.
		
		char upperA = 'A';
		char lowera = (char)(upperA+32); 
		//upperA+32를 하면 upperA는 char 32는 int라서 서로 형이 다르기 때문에 오류가 생김
		//앞에 (char)로 형변환을 시켜주면 됨
		System.out.println("lowera = " + lowera);
		//아스키코드에서 A를 나타내는 65에 +32가 되어 97이 됨. 97은 소문자 a
		
		char loweru = 'u';
		int upperU = loweru-32;
		System.out.println("upperU = " + (char)upperU);
		// loweru-32의 경우 둘다 int라서 오류는 안생기지만 출력할 때는 char를 입력해야 소문자 u로 출력됨.
		
		System.out.println();
		
		//'1' + '2' = 99 
		int data = '1' + '2'; //아스키 코드 1(49)과 2(50)를 더함
		System.out.println("'1' + '2' = " + data);
		
		// '0' = 48
		char i = '1'; // 49-48 *int로 치면 49 char는 1
		char j = '2'; // 50-48 
		int sum = (i-'0') + (j-'0');
		System.out.println("sum = "+ sum);
	
	}

}

