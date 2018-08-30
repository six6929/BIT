package com.mystudy.io1_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_3 {

	public static void main(String[] args) {
		File file = new File("file/text01.txt");
		
		FileInputStream fis = null;
		try {
			//���� �б����� ��ü ����(File Ÿ�� ��ü �Է¹���)
			fis = new FileInputStream(file);
			byte[] bytes = new byte[10];
			
			//read(byte[] b) : byte[] �迭ũ�⸸ŭ �о� b������ �����
			int byteCnt = 0;
			
			//���� ������ ���� ������ �ݺ�ó��~~~
			while((byteCnt = fis.read(bytes)) != -1) {
//				byteCnt = fis.read(bytes);
//				if(byteCnt == -1) break;
				
				System.out.println("�о�� ���� : " + byteCnt);
				System.out.println("�о�� �� : " + Arrays.toString(bytes));
				for(int i=0; i < byteCnt; i++) {
					System.out.println("int �� : " + bytes[i] + ", char : " + (char)bytes[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
