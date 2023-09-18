package kr.co.himedia.stream05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 읽어들여서 복사해서 출력
public class FileCopyTest2 {
   
   public static void main(String[] args) {
      
      long millisecond = 0;
      
      
      try(BufferedInputStream bis =
            new BufferedInputStream(new FileInputStream("jdk-20.0.1_doc-all.zip"));
         BufferedOutputStream bos = 
            new BufferedOutputStream(new FileOutputStream("copyfile4.zip"))) {
         
         millisecond = System.currentTimeMillis();
         
         int i;
         while ( (i = bis.read()) != -1 ) {
            bos.write(i);
         }
         
         millisecond = System.currentTimeMillis() - millisecond;         
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      System.out.println(millisecond + "초 동안 복사가 완료되었습니다.");
      
   }
   
   

}