package com.mystudy.am01_extends;

//Phone�� ��ӹ޾�(extends : Ȯ���ؼ�) Mp3Phone �����
public class Mp3Phone extends Phone {
	

	public Mp3Phone(String phoneNo) {
		super("Mp3Phone", phoneNo); // �θ�Ŭ����(Phone) ������ ȣ��
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
	}
	
	protected void playMusic() { //protected ��ӹ޾��� �� ������ �� �ִ� ??
		System.out.println(">> Mp3Phone - �����÷���");
	}
}
