package com.mystudy.io1_reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam2 {

	public static void main(String[] args) {
		//�������� : file/test_char.txt
		//ó�� : ������ ��ü ������ �о ȭ�鿡 ���
		
		
		File file = new File("file/test_char.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			int intChar = -1; //���ú����� �ڵ� �ʱ�ȭ ���� ����.
			
			while((intChar = fr.read()) != -1) {
				System.out.println((char)intChar);				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
