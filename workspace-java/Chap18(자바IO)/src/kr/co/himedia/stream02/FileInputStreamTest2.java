package kr.co.himedia.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일의 끝까지 한 바이트씩 자료 읽기
public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			try {
				fis = new FileInputStream("input.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				int i = 1;
				while ((i = fis.read()) != -1) {
		            System.out.print((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			if (fis !=null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

			System.out.println("end");
		}

		}
	}
