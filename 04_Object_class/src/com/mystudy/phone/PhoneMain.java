package com.mystudy.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		System.out.println("----Phone----");
		System.out.println("모델명 : " + phone1.name);
		System.out.println("타입 : " + phone1.type);
		System.out.println("가로크기 : " + phone1.hsize);
		System.out.println("세로크기 : " + phone1.vsize);
		System.out.println("LCD유무 : " + phone1.hasLCD);
		
		System.out.println("=============================");
		phone1.name = "Galaxy";
		System.out.println("모델명 : " + phone1.name);
		phone1.hasLCD = true;
		System.out.println("LCD유무 : " + phone1.hasLCD);
		
		
		System.out.println("----------- 기능 작동 -----------");
		phone1.call();
		phone1.receiveCall();
		
		Phone phone2 = new Phone("galaxy", "Note5",true);
		System.out.println("----Phone2----");
		System.out.println("모델명 : " + phone2.name);
		System.out.println("타입 : " + phone2.type);
		System.out.println("가로크기 : " + phone2.hsize);
		System.out.println("세로크기 : " + phone2.vsize);
		System.out.println("LCD유무 : " + phone2.hasLCD);
		System.out.println("----------- 기능 작동 -----------");
		phone1.call();
		phone1.receiveCall();

	}

}
