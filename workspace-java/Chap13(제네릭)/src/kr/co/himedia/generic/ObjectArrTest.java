package kr.co.himedia.generic;

public class ObjectArrTest {

	public static void main(String[] args) {
		ObjectArr<String> array = new ObjectArr<>(5); //<> 안을 비워도 컴파일러가 추론가능
		array.set(0, "Hello");
		array.set(1, "Cheonho");
		array.set(2, "Java");
		array.set(3, "Spring");
		
		for (int i=0; i<array.size(); i++)
			System.out.println(array.get(i));
	}
	

}
