package com.mystudy.io1_reader_writer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam {

	public static void main(String[] args) {
		//����(Character) ���� �Է� ó��
		//FileReader : ���Ϸκ��� ���ڴ����� ������ �б�
		//���� ���� : 1,A,$ - 1byte,    ��,�� - 2byte(�ѱ�,�߱���..)
		
		//FileReader�� �о� ���� ��� ���� ����
		File file = new File("file/test_char.txt");
		
		//FileReader Ÿ�� ���� ����
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			//FileReader : ���ڴ��� �б�
			int readChar = fr.read();
			System.out.println("ù��° ���� : " + readChar + ", char: " + (char)readChar);
			
			//FileInputStream : ����Ʈ ���� �б�
			FileInputStream fis = new FileInputStream(file);
			int readByte = fis.read();
			System.out.println("ù��° ���� : " + readByte + ", char: " + (char)readByte);
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
