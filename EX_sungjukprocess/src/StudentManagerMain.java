

public class StudentManagerMain {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		//StudentManager 클래스의 메소드 이용 CRUD 테스트
		StudentVO stu1 = new StudentVO("001", "홍길동", 100, 90, 80);
		StudentVO stu2 = new StudentVO("002", "홍길신", 90, 90, 90);
		StudentVO stu3 = new StudentVO("003", "홍길원", 80, 83, 92);
		StudentVO stu4 = new StudentVO("004", "홍길호", 70, 73, 42);
		StudentVO stu5 = new StudentVO("004", "신원호", 70, 73, 42);
		
		manager.printSungjuk();
		//insert문
		System.out.println("-------- insert ---------");
		manager.insert(stu1);
		manager.insert(stu2);
		manager.insert(stu3);
		manager.insert(stu4);
//		manager.insert(stu5);
		
		
		//selectOne문
		System.out.println("-------- selectOne ---------");
		manager.selectOne("001");
		manager.selectOne(stu2);
		manager.selectOne(stu3);
		manager.selectOne(stu4);
//		manager.selectOne(stu5);
		
		
		//update문
		manager.update(stu1);
		manager.update(stu5);

		//delete문
		System.out.println("-------- delete ---------");
		manager.delete(stu1);
		manager.delete("002");
		
		//selectAll문
		System.out.println("-------- selectAll ---------");
		manager.selectAll();
		
		
		//displayOne문
		System.out.println("-------- displayOne ---------");
		manager.displayOne("003");
		manager.displayOne(stu4);
	}

}

