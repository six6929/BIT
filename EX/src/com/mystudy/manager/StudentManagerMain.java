package com.mystudy.manager;

public class StudentManagerMain {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		//StudentManager 클래스의 메소드 이용 CRUD 테스트
		
		StudentVO stu1 = new StudentVO("001","홍길동",100,90,80);
		StudentVO stu2 = new StudentVO("002","홍길신",100,100,100);
		StudentVO stu3 = new StudentVO("003","홍길원",66,70,55);
		StudentVO stu4 = new StudentVO("004","홍길호",99,90,95);
		StudentVO stu5 = new StudentVO("004","홍길순",99,90,95);
		
		manager.printSungjuk();
		
		//insert문
		manager.insert(stu1);
		manager.insert(stu2);
		manager.insert(stu3);
		manager.insert(stu4);
		//manager.insert(stu5); // ID 중복테스트
		System.out.println("-----------------------------------------------");
		//selectOne문
		manager.selectOne(stu1);
		manager.selectOne(stu2);
		manager.selectOne(stu3);
		manager.selectOne(stu4);
		System.out.println(manager.selectOne("001"));
		
		//selectAll문
		//manager.selectAll();
		System.out.println("-----------------------------------------------");
		
		//update문 
		manager.update(stu1);
		manager.selectOne(stu1);
		manager.update(stu4);
		manager.selectOne(stu4);
		manager.update(stu5);
		manager.selectOne(stu5);
		
		System.out.println("-----------------------------------------------");
		//delete문
		manager.delete("001");
		
	}

}
