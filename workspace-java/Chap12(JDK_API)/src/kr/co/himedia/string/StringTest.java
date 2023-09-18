package kr.co.himedia.string;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("himedia");
		String str2 = new String("himedia");

		System.out.println(str1 == str2); //false
		System.out.println(str1.equals(str2)); //true
		
		String str3 = "himedia1";
		String str4 = "himedia1";
		
		System.out.println(str3 == str4); //true
		System.out.println(str3.equals(str4)); //true
		
		System.out.println();
		
		String str5 = "apple";
		String str6 = "banana";
		int result = str5.compareTo(str6); //같으면 0이 나옴
		if(result == 0 )
			System.out.println("str5==str6");
		else if(result < 0);
		    System.out.println("str5 < str6");

	
	}
}
