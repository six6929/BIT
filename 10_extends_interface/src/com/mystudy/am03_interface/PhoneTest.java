package com.mystudy.am03_interface;

public class PhoneTest {

	public static void main(String[] args) {
		Phone ph = new Phone("Phone", "010-0000-0000");
		ph.sendMsg(); //메세지 보내기
		ph.receiveMsg(); // 메세지 받기
		
	}

}
