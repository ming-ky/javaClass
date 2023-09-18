package kr.co.himedia.array;

import java.util.Arrays;

public class CharArrayTest {

	public static void main(String[] args) {
		//알파벳 배열 (알파벳 26개)
		char[] charArr = new char[26];
		char ch='A';
		
		System.out.println(Arrays.toString(charArr));
		for(int i=0; i<charArr.length; i++) {
			charArr[i] = ch++;
		}
		System.out.println(Arrays.toString(charArr));
		
		//향상된 for문
		/*
		 * for(변수 : 배열){
		 * }
		 */
		for(char alpha : charArr) {
			System.out.println(alpha +","+(int)alpha);
		}
	}

}
