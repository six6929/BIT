package com.mystudy.phone;

public class Phone {
	//�ʵ� ����
	String name = "iPhone";
	String type = "8 �÷���";
	int hsize = 200; 
	int vsize = 500;
	boolean hasLCD;
	
	//������
	Phone () {
	
	}
	
	Phone (String n, String t) {
		name = n;
		type = t;
	}
	
	Phone (String n, String t, boolean h) {
		name = n;
		type = t;
		hasLCD = h; //true �Ǵ� false���� �޾Ƽ� �Է�
	}
	
	//�޼ҵ�
	void call() {
		System.out.println("��ȭ�ɱ�");
	}
	
	void receiveCall() {
		System.out.println("��ȭ�ޱ�");
	}

	
//	void sendSms() {
//	}
//	
//	String receiveSms() {
//		
//	}
	
}
