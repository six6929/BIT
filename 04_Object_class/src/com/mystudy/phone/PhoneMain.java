package com.mystudy.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		System.out.println("----Phone----");
		System.out.println("�𵨸� : " + phone1.name);
		System.out.println("Ÿ�� : " + phone1.type);
		System.out.println("����ũ�� : " + phone1.hsize);
		System.out.println("����ũ�� : " + phone1.vsize);
		System.out.println("LCD���� : " + phone1.hasLCD);
		
		System.out.println("=============================");
		phone1.name = "Galaxy";
		System.out.println("�𵨸� : " + phone1.name);
		phone1.hasLCD = true;
		System.out.println("LCD���� : " + phone1.hasLCD);
		
		
		System.out.println("----------- ��� �۵� -----------");
		phone1.call();
		phone1.receiveCall();
		
		Phone phone2 = new Phone("galaxy", "Note5",true);
		System.out.println("----Phone2----");
		System.out.println("�𵨸� : " + phone2.name);
		System.out.println("Ÿ�� : " + phone2.type);
		System.out.println("����ũ�� : " + phone2.hsize);
		System.out.println("����ũ�� : " + phone2.vsize);
		System.out.println("LCD���� : " + phone2.hasLCD);
		System.out.println("----------- ��� �۵� -----------");
		phone1.call();
		phone1.receiveCall();

	}

}
