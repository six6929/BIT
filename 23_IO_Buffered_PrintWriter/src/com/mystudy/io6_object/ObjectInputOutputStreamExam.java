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
		//Object 타입의 데이터를 사용 입출력(I/O)
		//Object 타입의 데이터를 파일에 저장(쓰기, Output)
		//Object 타입의 데이터가 저장되어 있는 파일로 부터 읽기(Input)
		//StudentVO 타입의 데이터 사용
		File file = new File("file/object_io.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//파일에 저장할 데이터 준비
		System.out.println(">>> 저장할 데이터 준비");
		StudentVO stu1 = new StudentVO("18001", "홍길동", 100, 90, 80);
		StudentVO stu2 = new StudentVO("18002", "김유신", 95, 85, 75);
		System.out.println("stu1 : " + stu1);
		System.out.println("stu2 : " + stu2);
		System.out.println("===============================");
		
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			System.out.println(">>> 파일에 쓰기 (ObjectOutputStream)");
			oos.writeObject(stu1); //StudentVO 타입의 데이터를 파일에 쓰기
			oos.writeObject(stu2); 
			
			oos.close();

			System.out.println("---파일에 쓰기 완료 ---");
			
			//////////////////////////////////////////
			//파일로 부터 읽어 오기
			System.out.println("============================");
			System.out.println(">> 파일로부터 읽어오기(Object)");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//파일에서 읽기
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
