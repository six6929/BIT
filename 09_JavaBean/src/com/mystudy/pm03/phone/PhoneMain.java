package com.mystudy.pm03.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Phone ph = new Phone();
		System.out.println(ph);
		
		ph.call();
		ph.receiveCall();
		ph.view();
		System.out.println(ph.toString());
		
		
		System.out.println();
		Phone ph1 = new Phone("01035166929");
		System.out.println(ph1);
		ph1.call();
		ph1.receiveCall();
		ph1.view();
		System.out.println(ph.toString());

		System.out.println();
		Phone ph2 = new Phone("¾ÆÀÌÆù", "01035166920");
		System.out.println(ph2);
		
		System.out.println(ph2.getPhoneNo());
		System.out.println(ph2.getType());
		ph2.call();
		ph2.receiveCall();
		ph2.view();
		System.out.println(ph.toString());
		
		
		System.out.println("=========== Phone =============");
		Phone phone1 = new Phone("010.3516.6929");
		phone1.view();
		phone1.call();
		phone1.receiveCall();
		
		Phone phone2 = new Phone("Galaxy", "010-6429-2173");
		phone2.view();
		phone2.call();
		phone2.receiveCall();

		
		System.out.println("=========== Phone =============");
		Mp3Phone mp = new Mp3Phone("1234");
		Mp3Phone mp1 = new Mp3Phone("Sharp", "123456");
		
		System.out.println(mp.toString());
		mp.view();
		mp.call();
		mp.receiveCall();
		mp.playMusic();
		
		
		System.out.println();
		System.out.println(mp1.toString());
		mp1.view();
		mp1.call();
		mp1.receiveCall();
		mp1.playMusic();
	}

}
