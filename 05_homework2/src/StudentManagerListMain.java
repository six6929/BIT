public class StudentManagerListMain {

	public static void main(String[] args) {
		StudentManageList manager = new StudentManageList();
		manager.inputBasicData();
		manager.printSungjuk();
		
//		manager.updateData(new StudentVO("È«±æµ¿",90,80,70));
		
		manager.deleteData("±èÀ¯½Å");
		
	}
}
