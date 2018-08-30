package com.mystudy.io1_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex2 {

	public static void main(String[] args) {
		File file = new File("file/text01.txt");
		
		FileInputStream fis = null;
		
		try {
			//1. ����� ��ü ����
			fis = new FileInputStream(file);
			
			//2. ��ü ���
		
			int readValue = -1;
			/*
			//file.read() -> readValue != -1
			readValue = fis.read();
			while((readValue = fis.read()) != -1) {
				System.out.print("int�� : " + readValue);
				System.out.println(", char : " + (char)readValue);
				
				readValue = fis.read();
			}
			*/
			
			while((readValue = fis.read()) != -1) {
				System.out.print("int�� : " + readValue);
				System.out.println(", char : " + (char)readValue);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. ��ü close
			try {
				if(fis != null) {
				fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
