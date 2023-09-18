package kr.co.himedia.stream06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	
	String name;
	transient String job; //transient 넣으면 직렬화에서 제외됨. 값이 null 로 출력 
	public Person(String name, String job) {
		//super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
		
}

public class SerializationTest {
	
	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "대표이사");
		Person personShin = new Person("신사임당", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("Serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personShin);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("Serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
