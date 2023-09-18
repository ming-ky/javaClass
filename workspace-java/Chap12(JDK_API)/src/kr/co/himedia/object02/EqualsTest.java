package kr.co.himedia.object02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		String str1 = new String("himedia");
		String str2 = new String("himedia");
		
		System.out.println(str1.equals(str2)); //true - 두 인스턴스에 대한 equals()의 반환값이 true 일 경우 
		System.out.println(str1.hashCode()); //920935299 - 동일한 hashcode() 값을 반환 할 경우
		System.out.println(str2.hashCode()); //920935299
											 //두 인스턴스가 같다.
		
		System.out.println();
		
		Integer i1 = 100; // Integer i1 = new Integer 100; 을 간략하게 쓸 수 있음.
		Integer i2 = 100;
		
		System.out.println(i1.equals(i2)); //true
		System.out.println(i1.hashCode()); //100
		System.out.println(i2.hashCode()); //100
		
		System.out.println();
		
		Student student1 = new Student(2023, "HiMedia");
		Student student2 = new Student(2023, "HiMedia");
		
		System.out.println(student1 == student2); //false
		System.out.println(student1.equals(student2)); //true
		System.out.println(student1.hashCode()); //2023
		System.out.println(student2.hashCode()); //2023
		                                      
		System.out.println(System.identityHashCode(student1));
		System.out.println(System.identityHashCode(student2));

		System.out.println(); //cloneable 테스트
		
		student1.setStudentName("이순신");
		Student student3 = (Student) student1.clone();
		
		System.out.println(student1 == student2); // false
		System.out.println(student1.equals(student3)); //true
		System.out.println(student1); //2023, 이순신
		System.out.println(student3); //2023, 이순신
	}
}
