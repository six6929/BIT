package com.mystudy.io6_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExam {

	public static void main(String[] args) {
		//Object Ÿ���� �����͸� ��� �����(I/O)
		//Object Ÿ���� �����͸� ���Ͽ� ����(����, Output)
		//Object Ÿ���� �����Ͱ� ����Ǿ� �ִ� ���Ϸ� ���� �б�(Input)
		//StudentVO Ÿ���� ������ ���
		File file = new File("file/object_io.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//���Ͽ� ������ ������ �غ�
		System.out.println(">>> ������ ������ �غ�");
		StudentVO stu1 = new StudentVO("18001", "ȫ�浿", 100, 90, 80);
		StudentVO stu2 = new StudentVO("18002", "������", 95, 85, 75);
		System.out.println("stu1 : " + stu1);
		System.out.println("stu2 : " + stu2);
		System.out.println("===============================");
		
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			System.out.println(">>> ���Ͽ� ���� (ObjectOutputStream)");
			oos.writeObject(stu1); //StudentVO Ÿ���� �����͸� ���Ͽ� ����
			oos.writeObject(stu2); 
			
			oos.close();

			System.out.println("---���Ͽ� ���� �Ϸ� ---");
			
			//////////////////////////////////////////
			//���Ϸ� ���� �о� ����
			System.out.println("============================");
			System.out.println(">> ���Ϸκ��� �о����(Object)");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//���Ͽ��� �б�
			StudentVO stuIn1 = (StudentVO) ois.readObject();
			StudentVO stuIn2 = (StudentVO) ois.readObject();
			System.out.println("stuIn1 : " + stuIn1);
			System.out.println("stuIn2 : " + stuIn2);
			
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}

}
