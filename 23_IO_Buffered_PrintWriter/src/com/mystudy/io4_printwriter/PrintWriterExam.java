package com.mystudy.io4_printwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExam {

	public static void main(String[] args) {
		//File -> FileWriter -> BufferedWriter -> PrintWriter
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(new File("file/pw_out.txt"));
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
//			pw = new PrintWriter(new BufferedWriter(pw));
			pw.write("�ȳ��ϼ���~~");
			pw.write("�ݰ����ϴ�~~");
			pw.print("���� �ڹٰ������Դϴ�.");
			pw.println("������ �ǰ��ϴ�~~~");
			pw.println("���� ���� ����ʹ�.");
		
			pw.printf("%10s %10s %10s\n", "������", "2�ð�", "���Ҵ�~~");
			pw.printf("%50s", "������ �ָ��̴�~~~ !!!");
			
			
			System.out.printf("%10s %10s %10s\n", "������", "2�ð�", "���Ҵ�~~");
			System.out.printf("%50s", "������ �ָ��̴�~~~ !!!");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		

	}

}
