package com.mystudy.phone;

class Phone1Main {

	public static void main(String[] args) {
		Phone1 phone1 = new Phone1();
		phone1.view();
		
		Phone1 phone2 = new Phone1("갤럭시8", "스마트폰");
		phone2.hsize = 10;
		phone2.vsize = 20;
		phone2.hasLCD = true;
		phone2.view();
		
		Phone1 phone3 = new Phone1("아이폰", "스마트폰", true);
		phone3.view();
		phone3.call();
		phone3.receiveCall();
		phone3.sendSms("안녕하세요~~");
		String msg = phone3.receiveSms("반갑습니다.");
		System.out.println("받은메시지: " + msg);
	}

}
