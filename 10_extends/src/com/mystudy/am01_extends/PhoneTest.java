package com.mystudy.am01_extends;


public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("=========== Phone =============");
		Phone phone1 = new Phone("010.3516.6929");
		phone1.view();
		phone1.call();
		phone1.receiveCall();
		
		Phone phone2 = new Phone("Galaxy", "010-6429-2173");
		phone2.view();
		phone2.call();
		phone2.receiveCall();

		System.out.println();
		System.out.println("=========== Mp3Phone =============");
		Mp3Phone mp = new Mp3Phone("1234");
		Mp3Phone mp1 = new Mp3Phone("롤리팝", "123456");
		
		mp.view();
		mp.call();
		mp.receiveCall();
		mp.playMusic();
		
		
		System.out.println();
		mp1.view();
		mp1.call();
		mp1.receiveCall();
		mp1.playMusic();
		System.out.println("전화기타입 : " + mp1.getType());
		System.out.println("전화번호 : " + mp1.getPhoneNo());
		
		System.out.println();
		System.out.println("========= WebPhone =============");
		WebPhone wp = new WebPhone("010.3516.6929");
		wp.view();
		wp.call();
		wp.receiveCall();
		wp.webSearch();
//		wp.playMusic() Mp3Phone 상속을 받으면 사용가능

	}

}
