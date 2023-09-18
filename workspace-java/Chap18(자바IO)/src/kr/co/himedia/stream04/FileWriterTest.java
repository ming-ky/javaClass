package kr.co.himedia.stream04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("wirte.txt")){
			
			fw.write('A'); // 문자 하나 출력
			
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'}; //문자 배열 생성 
			fw.write(buf); // 문자 배열 출력
			
			fw.write("안녕하세요. 좋은 하루 되세요."); //String 출력
			fw.write(buf, 1, 2); // 문자열에서 일부만 출력 - 배열에서 1번째부터 2개 출력 'C,D' 
			fw.write("65"); //숫자를 그대로 출력
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력을 완료 했습니다.");

	}

}
