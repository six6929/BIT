package com.mystudy.car;

public class CarMain {
	
	public static void main(String[] args) {
		//Car Ŭ������ �̿��Ͽ� ��ü����
		Car car1 = new Car();
		System.out.println("===== car1 =====");
		System.out.println("�ڵ����̸�: " + car1.name);
		System.out.println("�𵨸� : " + car1.model);
		System.out.println("���� : " + car1.color);
		System.out.println("�������� : " + car1.CAR_LENGTH);
		System.out.println("�����ʺ� : " + car1.CAR_WIDTH);
		System.out.println("����� : " + car1.existAirbag);
		
		System.out.println("============================");
		car1.name = "ó�������� ��";
		System.out.println("�ڵ����̸� : " + car1.name);
		car1.existAirbag = true;
		System.out.println("����� : " + car1.existAirbag);
		
		System.out.println("----------- ��� �۵� -----------");
		car1.run();
		car1.stop();
		car1.back();
		
		System.out.println("===== car2 =====");
		
		Car car2 = new Car("�йи�ī", "�ҳ�Ÿ", "����");
		System.out.println("�ڵ����̸�: " + car2.name);
		System.out.println("�𵨸� : " + car2.model);
		System.out.println("���� : " + car2.color);
		System.out.println("�������� : " + car2.CAR_LENGTH);
		System.out.println("�����ʺ� : " + car2.CAR_WIDTH);
		System.out.println("����� : " + car2.existAirbag);
		System.out.println("----------- ��� �۵� -----------");
		car2.run();
		car2.stop();
		car2.back();
		
		//final ������ ���� �õ�
		//The final field Car.CAR_LENGTH cannot be assigned
//		car2.CAR_LENGTH = 400; // ���ó���Ǳ� ������ ���� �Ұ�
		
		System.out.println(car2);
		System.out.println("=================");
		car2.dispData();
		
	}

}
