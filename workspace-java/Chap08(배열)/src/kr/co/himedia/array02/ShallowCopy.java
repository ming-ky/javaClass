package kr.co.himedia.array02;

public class ShallowCopy {
//객체배열 복사하기 - 얕은 복사
	public static void main(String[] args) {
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("혼자 공부하는 파이썬", "윤인성");
		book[1] = new Book("혼자 공부하는 파이썬2", "윤인성2");
		book[2] = new Book("혼자 공부하는 파이썬3", "윤인성3");
		book[3] = new Book("혼자 공부하는 파이썬4", "윤인성4");
		book[4] = new Book("혼자 공부하는 파이썬5", "윤인성5");

		System.arraycopy(book, 0, copyBook, 0, 5);
		
		System.out.println("------원본------");
		for(Book booki : book ) {
			booki.showInfo();
		}
		System.out.println("------복사본------");
		for(Book booki : copyBook ) {
			booki.showInfo();
		}
		
		System.out.println();
		System.out.println("객체배열 원본 - 배열 요소 하나만 바꾸기");
		//객체배열 원본 - 배열 요소 하나만 바꾸기 
		//(얕은복사의 경우 객체 주소만 복사되어 한 쪽 배열요소를 수정하면 같이 수정됨)
		book[0].setTitle("한글");
		book[0].setAuthor("세종대왕");
		
		System.out.println("------원본------");
		for(Book booki : book ) {
			booki.showInfo();
		}
		System.out.println("------복사본------");
		for(Book booki : copyBook ) {
			booki.showInfo();
		}
		
	}

}
