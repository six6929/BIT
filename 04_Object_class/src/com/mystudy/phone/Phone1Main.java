package com.mystudy.phone;

class Phone1Main {

	public static void main(String[] args) {
		Phone1 phone1 = new Phone1();
		phone1.view();
		
		Phone1 phone2 = new Phone1("������8", "����Ʈ��");
		phone2.hsize = 10;
		phone2.vsize = 20;
		phone2.hasLCD = true;
		phone2.view();
		
		Phone1 phone3 = new Phone1("������", "����Ʈ��", true);
		phone3.view();
		phone3.call();
		phone3.receiveCall();
		phone3.sendSms("�ȳ��ϼ���~~");
		String msg = phone3.receiveSms("�ݰ����ϴ�.");
		System.out.println("�����޽���: " + msg);
	}

}
