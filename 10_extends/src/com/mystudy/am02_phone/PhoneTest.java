package com.mystudy.am02_phone;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("======== Phone =========");
		Phone phone = new Phone("010-3516-6929");
		System.out.println(phone.getPhoneNo());
		System.out.println(phone.getType());
		System.out.println(phone.toString());
		phone.setType("Galaxy");
		phone.setPhoneNo("010-6429-2173");
		phone.call();
		phone.sendMsg();
		phone.receiveCall();
		phone.receiveMsg();
		phone.numInfoCheck();
		System.out.println(phone.toString());
	}

}
