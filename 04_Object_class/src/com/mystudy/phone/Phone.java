package com.mystudy.phone;

public class Phone {
	//필드 변수
	String name = "iPhone";
	String type = "8 플러스";
	int hsize = 200; 
	int vsize = 500;
	boolean hasLCD;
	
	//생성자
	Phone () {
	
	}
	
	Phone (String n, String t) {
		name = n;
		type = t;
	}
	
	Phone (String n, String t, boolean h) {
		name = n;
		type = t;
		hasLCD = h; //true 또는 false값을 받아서 입력
	}
	
	//메소드
	void call() {
		System.out.println("전화걸기");
	}
	
	void receiveCall() {
		System.out.println("전화받기");
	}

	
//	void sendSms() {
//	}
//	
//	String receiveSms() {
//		
//	}
	
}
