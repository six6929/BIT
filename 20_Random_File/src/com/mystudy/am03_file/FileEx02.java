package com.mystudy.am03_file;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) throws IOException {
		
		//���ϸ� : temp.txt(���ϸ�.Ȯ����(��))
		File file1 = new File("temp.txt");
		//File ��ü������ ������ ���翩�ο� ������� ���� ����
		System.out.println(file1);

		//������ : root ���丮�� ���� ��ü ��θ� ǥ���ؼ� ����
		//        c:\temp\aaa\a1
		//����� : ������ġ�κ��� ã�ư����� �ϴ� ��ġ�� ǥ���ؼ� ����
		//        ..\..\aaa\a1
		
		File file2 = new File("C:\\temp\\aaa\\a1\\temp.txt");
		
		//����η� ��ġ ǥ��(. ������ġ)
		File file3 = new File("file/temp.txt");
		
		System.out.println("--- file getAbsolutePath() ---");
		System.out.println("������ġ : " + file1.getAbsolutePath());
		System.out.println("������ġ : " + file2.getAbsolutePath());
		System.out.println("������ġ : " + file3.getAbsolutePath());

		//������ ���翩�� Ȯ��
		System.out.println("--- File exists() ---"); 
		System.out.println("����(file1) : " + file1.exists());
		System.out.println("����(file2) : " + file2.exists());
		System.out.println("����(file3) : " + file3.exists());
		
		
		System.out.println("--- File �Ӽ� ���� ---");
		System.out.println("file1.length() : " + file1.length());
		System.out.println("file1.canRead() : " + file1.canRead());
		System.out.println("file1.canWrite() : " + file1.canWrite());
		System.out.println("file1.canExecute() : " + file1.canExecute());
		
		System.out.println("--- File ��� ���� ---");
		System.out.println("file1.getParent() : " + file1.getParent());
		System.out.println("file2.getParent() : " + file2.getParent());
		System.out.println("file3.getParent() : " + file3.getParent());
		
		System.out.println("--- File getPath() ---");
		System.out.println("file1.getPath() : " + file1.getPath());
		System.out.println("file2.getPath() : " + file2.getPath());
		System.out.println("file3.getPath() : " + file3.getPath());
		
		System.out.println("--- File getName() ---");
		System.out.println("file1.getName() : " + file1.getName());
		System.out.println("file2.getName() : " + file2.getName());
		System.out.println("file3.getName() : " + file3.getName());
		
		System.out.println("--- ���丮 isDirectory(), ���� isFile() ---");
		System.out.println("file1.isDirectory() : " + file1.isDirectory());
		System.out.println("file1.isFile() : " + file1.isFile());
		
		//���� ����, ���� ����
		File file4 = new File("file/temp4.txt");
		try {
			file4.createNewFile(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		file4.delete();
		
		new File("file/temp5.txt").createNewFile();
	}

}
