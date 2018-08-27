

public class StudentManagerMain {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		//StudentManager Ŭ������ �޼ҵ� �̿� CRUD �׽�Ʈ
		StudentVO stu1 = new StudentVO("001", "ȫ�浿", 100, 90, 80);
		StudentVO stu2 = new StudentVO("002", "ȫ���", 90, 90, 90);
		StudentVO stu3 = new StudentVO("003", "ȫ���", 80, 83, 92);
		StudentVO stu4 = new StudentVO("004", "ȫ��ȣ", 70, 73, 42);
		StudentVO stu5 = new StudentVO("004", "�ſ�ȣ", 70, 73, 42);
		
		manager.printSungjuk();
		//insert��
		System.out.println("-------- insert ---------");
		manager.insert(stu1);
		manager.insert(stu2);
		manager.insert(stu3);
		manager.insert(stu4);
//		manager.insert(stu5);
		
		
		//selectOne��
		System.out.println("-------- selectOne ---------");
		manager.selectOne("001");
		manager.selectOne(stu2);
		manager.selectOne(stu3);
		manager.selectOne(stu4);
//		manager.selectOne(stu5);
		
		
		//update��
		manager.update(stu1);
		manager.update(stu5);

		//delete��
		System.out.println("-------- delete ---------");
		manager.delete(stu1);
		manager.delete("002");
		
		//selectAll��
		System.out.println("-------- selectAll ---------");
		manager.selectAll();
		
		
		//displayOne��
		System.out.println("-------- displayOne ---------");
		manager.displayOne("003");
		manager.displayOne(stu4);
	}

}

