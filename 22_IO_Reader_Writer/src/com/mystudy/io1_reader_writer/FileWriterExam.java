package com.mystudy.io1_reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) {
		//FileWriter : ���Ͽ� ���ڴ��� ����
		File file = new File("file/test_char_out.txt");
		
		//FileWriter ���� ����
		FileWriter fw = null;
		
		try {
			//FileWriter ��ü ����
			fw = new FileWriter(file);
			
			fw.write('��'); //char -> int
			fw.write("��"); //String
			fw.write("�α�"); //String
			fw.write("Hello Java!!!");
			
			//buffer�� ä������ �ʾƵ� ������ output ó��
			fw.flush();
			
			} catch (IOException e) {
			e.printStackTrace();
			} finally {
//				try {
//					fw.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
			}

	}

}
