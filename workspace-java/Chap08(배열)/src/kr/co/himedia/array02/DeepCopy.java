package kr.co.himedia.array02;

public class DeepCopy {
//객체배열 복사하기 - 깊은 복사
	public static void main(String[] args) {
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("혼자 공부하는 파이썬", "윤인성");
		book[1] = new Book("혼자 공부하는 파이썬2", "윤인성2");
		book[2] = new Book("혼자 공부하는 파이썬3", "윤인성3");
		book[3] = new Book("혼자 공부하는 파이썬4", "윤인성4");
		book[4] = new Book("혼자 공부하는 파이썬5", "윤인성5");
		
		copyBook[0] = new Book();
		copyBook[1] = new Book();
		copyBook[2] = new Book();
		copyBook[3] = new Book();
		copyBook[4] = new Book();
	
		for(int i=0; i<book.length; i++) {
			copyBook[i].setTitle(book[i].getTitle());
			copyBook[i].setAuthor(book[i].getAuthor());
		}
		
		System.out.println("------원본------");
		for(Book booki : book ) {
			booki.showInfo();
		}
		System.out.println("------복사본------");
		for(Book booki : copyBook ) {
			booki.showInfo();
		}
		//객체배열 원본 - 배열 요소 하나만 바꾸기 
				//(깊은복사의 경우 각각의 객체를 생성하여 그 객체의 값을 복사하여 한 쪽 배열요소를 수정해도 같이 수정되지 않음)
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
