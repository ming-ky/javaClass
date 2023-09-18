package kr.co.himedia.array;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		//길이가 3인 int형 1차원 배열 생성
		int[] arr1 = new int[3];
		//arr1 배열 요소에 접근하기
		arr1[0] = 100; //첫번째 요소
		arr1[1] = 90;  //두번째 요소
		arr1[2] = 2;   //세번째 요소
		System.out.println(Arrays.toString(arr1)); //값이 잘 들어갔는지 확인
		
		//배열요소에 연산 넣기
		int sum = arr1[0] + arr1[1] + arr1[2];
		System.out.println("총점 : "+ sum);
		//배열의 요소가 많아지면 연산처리를 할 때 힘듦
		//때문에 for문을 사용함
		
		int[] arr2 = new int[10];
		int total = 0;
		// 첫번째 배열은 1이고 요소 1번째 증가될 때마다 1씩 증가함 
		for (int i=0, num=1; i<arr2.length; i++, num++) {
			arr2[i] = num;
		}
		System.out.println(Arrays.toString(arr2));
		
		for(int i=0; i<arr2.length;i++) {
			//arr2 배열 요소의 총 값
			total += arr2[i]; 
		}
		System.out.println(total);
		
	}

}
