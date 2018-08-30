package com.mystudy.io3_fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamOutputStreamExam {

	public static void main(String[] args) {
		//파일에서 읽어서 새로운 파일에 쓰기
		//FileInputStream + FileOutputStream
		
		//원본파일에서 (읽을파일 - read)
		File fileIn = new File("file/text01.txt");
		
		//타겟파일(쓰기 대상파일 - write)
		File fileOut = new File("file/text01_out.txt");
		
		//FileInputStream 변수선언(읽기용)
		FileInputStream fis = null;
		
		//FileOutputStream 변수선언(쓰기용)
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);
			
			
			//읽기
			int readValue = fis.read();
			while(true) {
				//파일에 내용이 더이상 없는 경우 반복 종료
				if(readValue == -1) break;
				
				//읽은 값이 있으면 쓰기
				fos.write(readValue);
			}

	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
