package com.mystudy.manager;

public class StudentManagerMain {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		//StudentManager 클래스의 메소드 이용 CRUD 테스트
		
		StudentVO stu = new StudentVO("001", "홍길동", 100, 90, 80);
		manager.insert(stu);


		
		StudentVO stu1 = new StudentVO("002", "홍길순", 95, 90, 85);
		manager.insert(stu1);
		manager.printSungjuk();
		

	}

}
