package com.mystudy.io3_filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		//2���� ���� ���Ϻ��� �ӵ� ��
		//ù��° : byte ���� ����
		//�ι��� : ���۱�� ���
		
		File file = new File("file/��������.jpg");
		
		FileInputStream fis = null; //byte���� ó��
		FileOutputStream fos = null;
		
		//���ۻ���� ���� ���� ����
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream("file/��������_copy.jpg");
			
			//byte ���� ���� �۾�
			
			long startTime = System.currentTimeMillis();
			int readValue;
			readValue = fis.read();
			
			while (readValue != -1) {
				fos.write(readValue);
				readValue = fis.read();
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("byte ����ð� : " + (endTime - startTime));
			
			
			fos.close();
			fis.close();
			
			bis = new BufferedInputStream(new FileInputStream(file), 10);
			bos = new BufferedOutputStream(new FileOutputStream("file/��������_copy.jpg"), 10);
			startTime = System.currentTimeMillis();
			int readBis = bis.read();
			while (readBis != -1) {
				bos.write(readBis);
				readBis = bis.read();
			}
			endTime = System.currentTimeMillis();
			System.out.println("���ۻ�� ����ð� : " + (endTime - startTime));
			
			bos.close();
			//���۴���
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
