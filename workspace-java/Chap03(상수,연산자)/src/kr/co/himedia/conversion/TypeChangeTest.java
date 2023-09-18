package kr.co.himedia.conversion;

public class TypeChangeTest {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		int iNum1 = 20;
		float fNum = iNum1;
		
		int iNum2 = 10;
		byte bNum1 = (byte)iNum2; //큰 값에서 작은값으로 바꾸면 값의 손실이 있음.
		
		double dNum = 3.14;
		int iNum3 = (int)dNum; // 위와 마찬가지로 정밀한 값에서 덜 정밀한 값으로 바꿔도 손실이 있음. 

	}

}
