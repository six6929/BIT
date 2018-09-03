package com.mystudy.io_isr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExam {

	public static void main(String[] args) {
		//byte 처리 계열 -> 문자처리 계열로 변환(InputStream -> Reader)
		//InputStreamReader : InputStream -> Reader
		//OutputStreamWriter : OutputStream -> Writer
		
		FileInputStream fis = null;
//		FileOutputStream fos = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		File file = new File("file/test_char.txt");
		
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			
			int readByte = fis.read();
			System.out.println((char)readByte);
			
			int input = isr.read();
			System.out.println((char)input);
			
			br = new BufferedReader(isr); //버퍼기능 + 문자로처리 + 파일에서 읽기
			String str = br.readLine();
			System.out.println(str);
			
			while (true) {
				str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
