package kr.co.himedia.array;

import java.util.Arrays;

class Box{}
public class ArrayTest {

	public static void main(String[] args) {
		// 길이가 5인 int형 1차원 배열 생성 
		//(방법1)
		int[] arr1 = new int[5]; //배열 객체생성 - 배열은 클래스가 아니라 new 다음에 타입인 int[]가 그대로 오는데 [] 안에 길이를 적어주어야함.
		
		//(방법2)배열생성 및 초기화
		int[] arr2 = new int[] {1,2,3,4,5,6}; // 값을 초기화를 시켜주기때문에 int[]안에 길이를 쓰지 않아도 됨.
		
		//(방법3) new int[] 생략가능
		int[] arr3 = {1,2,3,4,5}; // new int[] 없이 초기화 한 값만 입력해도 됨.
		
		//(방법4) 배열 선언 후 배열을 생성
		int[] arr4;
		arr4 = new int[] {1,2,3,4,5,6,7};
		
		//길이가 7인 double형 1차원 배열 생성하시오.
		double[] arr5 = new double[7];
		
		//(방법4)를 사용해서 길이가 9인 float형 1차원 배열 생성하시오.
		float[] arr6;
		arr6 = new float[9];
		
		//객체 대상 1차원 배열 //class Box{} 사용
		Box[] arr7 = new Box[5];
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println("배열 arr1 길이 : "+ arr1.length);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		System.out.println(Arrays.toString(arr7));

	}

}
