package com.mystudy.io1_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//����Ʈ(byte) ���� ó��
//������ �Է�(�б�) : InputStream - �߻�Ŭ����
//FileInputStream : InputStream�� ��ӹ޾�(extends) ���� Ŭ����
//����(file)�� ���� �����͸� �Է�(�о�) ó���ϱ� ���� Ŭ����

public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		File file = new File("temp.txt");
		if(!file.exists()) { //������ �������� ������(������)
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("[���ܹ߻�] : " + e.getMessage());
			}
		}

		//FileInputStream ��ü ����
		try {
			//���޹��� ����(file)�� �̿��ؼ� ���Ͽ� �ִ� �����͸� �о ó��
			//1. ����� ��ü ����
			FileInputStream fis = new FileInputStream(file);
			
			//2. ��ü ���
			int readValue = fis.read();
			System.out.println("read() ��(int) : " + readValue);
			System.out.println("read() char : " + (char)readValue);
			
			System.out.println("--- ��ü ������ �о���� ---");
			while(true) {
				readValue = fis.read();
				//EOF(End of File) ������ -1����
				if(readValue == -1) break;
				System.out.print("read() ��(int) : " + readValue);
				System.out.println(" - read() char : " + (char)readValue);
			}
			//3. ��ü ȯ�� : ����ڿ� ����ġ(���� close)
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
