package kr.co.himedia.interface05;

//상속과 구현
//클래스는 extends 인터페이스는 implements
public class MyBookshelf extends Bookshelf implements Queue {

	@Override
	public void enQueue(String title) {
		bookshelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return bookshelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
