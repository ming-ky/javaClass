package kr.co.himedia.operator02;

public class BitOperTest {

	public static void main(String[] args) {
		
		int num1 = 5;  //2진수 : 0000 0101
		int num2 = 10; //2진수 0000 1010
		
		// ~ : 비트의 반전
		System.out.println(~num1); /// 1111 1010 위에 0자리는 1로 1자리는 0으로 반전됨
		
		// & : 비트 단위 AND
		System.out.println(num1 & num2); // 0000 0101 x 0000 1010 = 0x0 이 있어서 전부 0으로 반환됨
		
		// | : 비트 단위 OR
		System.out.println(num1 | num2); // 0000 0101 x 0000 1010 = 0000 1111 앞에는 0이라 0반환, 뒤에는 1이 있어서 1 반환됨
		
		// ^ : 비트 단위 XOR
		System.out.println(num1 ^ num2); // 0000 1111 = 앞에는 0000으로 같아서 0반환, 뒤에는 0101 1010으로 달라서 1반환됨
		
		// << : 왼쪽 shift
		System.out.println(num1 << 2); // 기존 0000 0101 이었던 걸 0001 0100으로 왼쪽으로 이동됨
		System.out.println(num1); // num1의 값은 바뀌지 않았음
		//System.out.println(num1 <<= 2); // num1 값을 num1<<2 값으로 할당
		//System.out.println(num1); // num1 값이 바뀜
		
		// >> : 오른쪽 shift
		System.out.println(num1 >> 2); // 0000 0001로 바뀜
	}

}
