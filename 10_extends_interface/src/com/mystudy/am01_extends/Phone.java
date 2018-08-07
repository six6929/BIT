package com.mystudy.am01_extends;

public class Phone {
	//�ʵ�(�Ӽ�)---------------
	private String type;
	private String phoneNo;
	
	//������-----------------------
//	public Phone() {}
	public Phone(String phoneNo) {
		type = "Phone Ÿ��";
		this.phoneNo = phoneNo;
	}

	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}

	//�޼ҵ�(���) -------------------------------
	public String getType() {
		return type;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}
	public void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}
	
	public void view() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
}
