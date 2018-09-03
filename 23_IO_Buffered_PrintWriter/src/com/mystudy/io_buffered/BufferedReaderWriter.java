package com.mystudy.io_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {

	public static void main(String[] args) {
		//버퍼(buffer) 기능이 구현되어 있는 클래스
		//BufferedReader, BufferedWriter
		
		//파일로부터 읽이 위한 클래스
		FileReader fr = null; //파일로부터 읽기 위한 클래스
		FileWriter fw = null; //파일로부터 쓰기 위한 클래스 
		
		BufferedReader bufferedReader = null; //버퍼기능 사용해서 읽기
		BufferedWriter bufferedWriter = null; //버퍼기능 사용해서 쓰기
		
		try {
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile); //파일 읽기 객체 생성
			
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile); //파일 쓰기 객체 생성
			
			//버퍼기능 사용 객체 생성
			bufferedReader = new BufferedReader(fr); //버퍼사용+파일읽기 가능
			bufferedWriter = new BufferedWriter(fw); //버퍼사용+파일쓰기 가능
			
			//간단히 쓰기
			bufferedWriter.write("안녕하세요. 자바공부중입니다.");
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("Hello Java!!!\n");
			bufferedWriter.write("재미있나요?");
			bufferedWriter.write("-------------------");
			bufferedWriter.newLine();
			
			bufferedWriter.flush();
			
			//파일로부터 읽고, 쓰기
			String str = bufferedReader.readLine();
			System.out.println(str);
			
			//파일에 쓰기
			bufferedWriter.write(str);
			
			str = bufferedReader.readLine();
			System.out.println(str);
			bufferedWriter.write(str);
			bufferedWriter.newLine();
			
			//남은 데이터 모두 읽고, 쓰기
			str = bufferedReader.readLine();
			while(str != null) {
				bufferedWriter.write(str);
				str = bufferedReader.readLine();
				bufferedWriter.newLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			bufferedWriter.close();
			bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		

	}

}
