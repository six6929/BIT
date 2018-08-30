package com.mystudy.am03_file;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		//File Ŭ����
		String separator = File.separator;
		//������ǥ��
		System.out.println("File.separator : " + separator);

		char separatorChar = File.separatorChar;
		System.out.println("File.separatorChar : " + separatorChar);
		
		String pathSeparator = File.pathSeparator; //���(path) ������
		System.out.println("File.pathSeparator : " + pathSeparator);
		
		char pathSeparatorChar = File.pathSeparatorChar;
		System.out.println("File.pathSeparatorChar : " + pathSeparatorChar);
		
		File[] listRoots = File.listRoots();
		for(int i=0; i< listRoots.length; i++) {
			System.out.println(listRoots[i]);
		}
		
		
	}

}
