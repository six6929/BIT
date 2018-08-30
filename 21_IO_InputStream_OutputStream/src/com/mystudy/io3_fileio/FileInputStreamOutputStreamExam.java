package com.mystudy.io3_fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamOutputStreamExam {

	public static void main(String[] args) {
		//���Ͽ��� �о ���ο� ���Ͽ� ����
		//FileInputStream + FileOutputStream
		
		//�������Ͽ��� (�������� - read)
		File fileIn = new File("file/text01.txt");
		
		//Ÿ������(���� ������� - write)
		File fileOut = new File("file/text01_out.txt");
		
		//FileInputStream ��������(�б��)
		FileInputStream fis = null;
		
		//FileOutputStream ��������(�����)
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);
			
			
			//�б�
			int readValue = fis.read();
			while(true) {
				//���Ͽ� ������ ���̻� ���� ��� �ݺ� ����
				if(readValue == -1) break;
				
				//���� ���� ������ ����
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
