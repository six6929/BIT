package com.mystudy.manager;

public class StudentManagerMain {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		//StudentManager Ŭ������ �޼ҵ� �̿� CRUD �׽�Ʈ
		
		StudentVO stu = new StudentVO("001", "ȫ�浿", 100, 90, 80);
		manager.insert(stu);


		
		StudentVO stu1 = new StudentVO("002", "ȫ���", 95, 90, 85);
		manager.insert(stu1);
		manager.printSungjuk();
		

	}

}
