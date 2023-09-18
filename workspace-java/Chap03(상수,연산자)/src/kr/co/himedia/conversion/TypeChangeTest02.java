package kr.co.himedia.conversion;

public class TypeChangeTest02 {

	public static void main(String[] args) {
		byte num1 = 1;
		byte num2 = 2;
		//byte num3 = num1 + num2; //같은 byte 타입인데 오류가 나옴. int로 자동 형변환이 발생한 케이스
		                           // 연산 시 int 보다 작은 정수형은 int 타입으로 형변환 발생함.
		byte result1 = (byte)(num1 + num2); //강제 형번환
		
		int num3 = 1;
		int num4 = 2;
		int result2 = num3 + num4; // 자동 형변환 - 같은 타입이라 오류가 나지 않음.
 
		long num5 = 1;
		long num6 = 2;
		//long result3 = num5 + num6; 
		long result3 = num3 + num4;  // 자동 형변환 - double이 더 커서 자동 형변환이 되어도 오류가 나지 않음. 
		
		float num7 = 1.0f;
		float num8 = 2.0f;
		float result4 = num7 + num8;
		double num9 = 1.0;
		double num10 = 2.0;
		double result5 = num7 + num8; //자동 형변환 - 더 작은 float에서 더 큰 double로 형변환 가능
		
	}

}
