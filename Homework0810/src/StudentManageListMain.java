public class StudentManageListMain {

	public static void main(String[] args) {
		StudentManageList manager = new StudentManageList();
		StudentVO vo = new StudentVO();
		
		manager.inputBasicData();
		manager.printSungjuk();
		
		System.out.println("--------------");
//		manager.updateData(new StudentVO("ȫ�浿",90,80,70));
		manager.printDataAll();
		//		manager.deleteData("ȫ�浿");
		System.out.println("---------------");
		manager.deleteData("ȫ�浿");
		manager.printDataAll();
		manager.getData(90);
		manager.getData("������");
		
		
	}
}
