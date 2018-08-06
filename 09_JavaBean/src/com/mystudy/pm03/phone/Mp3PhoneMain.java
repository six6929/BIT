package com.mystudy.pm03.phone;

public class Mp3PhoneMain {

	public static void main(String[] args) {
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
