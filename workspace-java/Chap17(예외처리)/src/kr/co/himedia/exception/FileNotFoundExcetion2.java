package kr.co.himedia.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundExcetion2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("himedai.txt");
			
			try {
				fis.close();
				System.out.println("here");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally 블럭은 항상 수행");
		}
		
		System.out.println("end");

	}

}
