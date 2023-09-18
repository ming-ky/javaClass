package kr.co.himedia.interface05;
//책꽂이
//클래스 상속과 인터페이스 구현 함께 쓰기

import java.util.ArrayList;

public class Bookshelf {

	protected ArrayList<String> bookshelf;
	
	public Bookshelf() {
		bookshelf = new ArrayList<>(); 
	}
	
	public ArrayList<String> getBookshlf(){
		return bookshelf;
	}
	
	public int getCount() {
		return bookshelf.size();
	}
}
