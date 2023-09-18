package kr.co.himedia.stream04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("reader.txt")){
			//FileInputStream 으로 읽으면 'ìëíì¸ì ë°ê°ìµëë¤. abc' 출력됨 한글은 출력 불가
			int i;
			
			while( (i = fr.read()) != -1) {
				System.out.print((char)i); 
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
