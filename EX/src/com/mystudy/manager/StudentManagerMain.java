package com.mystudy.manager;

public class StudentManagerMain {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		//StudentManager Ŭ������ �޼ҵ� �̿� CRUD �׽�Ʈ
		
		StudentVO stu1 = new StudentVO("001","ȫ�浿",100,90,80);
		StudentVO stu2 = new StudentVO("002","ȫ���",100,100,100);
		StudentVO stu3 = new StudentVO("003","ȫ���",66,70,55);
		StudentVO stu4 = new StudentVO("004","ȫ��ȣ",99,90,95);
		StudentVO stu5 = new StudentVO("004","ȫ���",99,90,95);
		
		manager.printSungjuk();
		
		//insert��
		manager.insert(stu1);
		manager.insert(stu2);
		manager.insert(stu3);
		manager.insert(stu4);
		//manager.insert(stu5); // ID �ߺ��׽�Ʈ
		System.out.println("-----------------------------------------------");
		//selectOne��
		manager.selectOne(stu1);
		manager.selectOne(stu2);
		manager.selectOne(stu3);
		manager.selectOne(stu4);
		System.out.println(manager.selectOne("001"));
		
		//selectAll��
		//manager.selectAll();
		System.out.println("-----------------------------------------------");
		
		//update�� 
		manager.update(stu1);
		manager.selectOne(stu1);
		manager.update(stu4);
		manager.selectOne(stu4);
		manager.update(stu5);
		manager.selectOne(stu5);
		
		System.out.println("-----------------------------------------------");
		//delete��
		manager.delete("001");
		
	}

}
