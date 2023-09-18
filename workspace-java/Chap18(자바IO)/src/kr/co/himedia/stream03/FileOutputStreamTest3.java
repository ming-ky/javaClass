package kr.co.himedia.stream03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//FileOutputStream fos = new FileOutputStream("output2.txt"); //이렇게하면 한줄 출력되고 그 후 출력은 덮어쓰기 됨. (A~Z 한 번)
		FileOutputStream fos = new FileOutputStream("output3.txt"); // 이거는 이어서 새로 출력됨. (A~Z 두 번)
		
		try(fos) {
			byte[] bs = new byte[26];
			byte data = 65; // 'A'의 아스키 코드 값 
			for(int i=0; i<bs.length; i++)
				bs[i] = data++;
			
				fos.write(bs, 2, 10); //배열의 2번째부터 10번째까지 출력하기 (0번부터 시작하니까 0A,1B / 2번인 C부터 시작)
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("출력이 완료되었습니다.");
	}

}

