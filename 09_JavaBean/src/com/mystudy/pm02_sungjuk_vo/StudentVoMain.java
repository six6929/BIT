package com.mystudy.pm02_sungjuk_vo;

public class StudentVoMain {

	public static void main(String[] args) {
		StudentVO stu1 = new StudentVO("신원호",100,100,100);
		System.out.println(stu1);
		System.out.println(stu1.getEng());
		
		stu1.setEng(81);
		System.out.println(stu1.getEng());
		stu1.printData();
		System.out.println("-----");
		stu1.getData();
		System.out.println(">>");
		System.out.println(stu1.getData());
		System.out.println("------------------");
		
		StudentVO stu2 = new StudentVO("이순신", 99, 99, 99);
		stu1.printData();
		stu2.printData();
		
		StudentVO stu3 = new StudentVO("세종대왕", 0, 0, 0);
		stu3.printData();
		
		StudentVO[] stuArr = new StudentVO[3];
		stuArr[0] = stu1;
		stuArr[1] = stu2;
		stuArr[2] = stu3;
		
		//--------------
		
		System.out.println("-----배열에서 꺼내쓰기 ------");
		stuArr[0].printData();
		stuArr[1].printData();
		stuArr[2].printData();

	}

}
