package com.mystudy.pm02_list_studentvo;

public class StudentManagerListMain {

	public static void main(String[] args) {
		StudentManageList manager = new StudentManageList();
		manager.inputBasicData();
		manager.printSungjuk();
		
		manager.updateData(new StudentVO("±èÀ¯½Å",90,80,70));
		
		
	}
}

