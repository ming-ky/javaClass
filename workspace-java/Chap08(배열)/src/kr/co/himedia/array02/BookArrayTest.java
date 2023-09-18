package kr.co.himedia.array02;

import java.util.Arrays;

//객체배열
public class BookArrayTest {

	public static void main(String[] args) {
		//배열생성
		Book[] book = new Book[5];
		
		System.out.println(Arrays.toString(book)); //book이 있는 곳이 다른 곳이라 to.string 할때 Object로 선택해야함. 
		
		//객체배열 생성
		book[0] = new Book("혼자 공부하는 파이썬", "윤인성");
		book[1] = new Book("혼자 공부하는 파이썬2", "윤인성2");
		book[2] = new Book("혼자 공부하는 파이썬3", "윤인성3");
		book[3] = new Book("혼자 공부하는 파이썬4", "윤인성4");
		book[4] = new Book("혼자 공부하는 파이썬5", "윤인성5");
		
		System.out.println(Arrays.toString(book)); 
		
		//for문으로 만들기
		for(int i=0; i<book.length; i++) {
			//System.out.println(book[i]);
			//혹은 이렇게도 출력가능
			book[i].showInfo();
		}
		
	}
}
