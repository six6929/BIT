package com.mystudy.am03_interface;

//class Mp3Phone implements I_Phone, I_Mp3Phone {
class Mp3Phone extends Phone implements I_Mp3Phone {

	public Mp3Phone(String phoneNo) {
		super(phoneNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playMusic() {
		System.out.println(">> �����÷���");
	}
}
