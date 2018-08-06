package com.mystudy.am01_extends;

//Phone을 상속받아(extends : 확장해서) Mp3Phone 만들기
public class Mp3Phone extends Phone {
	

	public Mp3Phone(String phoneNo) {
		super("Mp3Phone", phoneNo); // 부모클래스(Phone) 생성자 호출
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
	}
	
	protected void playMusic() { //protected 상속받았을 때 접근할 수 있는 ??
		System.out.println(">> Mp3Phone - 음악플레이");
	}
}
