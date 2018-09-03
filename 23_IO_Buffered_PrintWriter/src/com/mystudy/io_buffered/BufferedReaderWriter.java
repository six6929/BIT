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
		//����(buffer) ����� �����Ǿ� �ִ� Ŭ����
		//BufferedReader, BufferedWriter
		
		//���Ϸκ��� ���� ���� Ŭ����
		FileReader fr = null; //���Ϸκ��� �б� ���� Ŭ����
		FileWriter fw = null; //���Ϸκ��� ���� ���� Ŭ���� 
		
		BufferedReader bufferedReader = null; //���۱�� ����ؼ� �б�
		BufferedWriter bufferedWriter = null; //���۱�� ����ؼ� ����
		
		try {
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile); //���� �б� ��ü ����
			
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile); //���� ���� ��ü ����
			
			//���۱�� ��� ��ü ����
			bufferedReader = new BufferedReader(fr); //���ۻ��+�����б� ����
			bufferedWriter = new BufferedWriter(fw); //���ۻ��+���Ͼ��� ����
			
			//������ ����
			bufferedWriter.write("�ȳ��ϼ���. �ڹٰ������Դϴ�.");
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("Hello Java!!!\n");
			bufferedWriter.write("����ֳ���?");
			bufferedWriter.write("-------------------");
			bufferedWriter.newLine();
			
			bufferedWriter.flush();
			
			//���Ϸκ��� �а�, ����
			String str = bufferedReader.readLine();
			System.out.println(str);
			
			//���Ͽ� ����
			bufferedWriter.write(str);
			
			str = bufferedReader.readLine();
			System.out.println(str);
			bufferedWriter.write(str);
			bufferedWriter.newLine();
			
			//���� ������ ��� �а�, ����
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
