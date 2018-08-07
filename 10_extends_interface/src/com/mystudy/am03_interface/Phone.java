package com.mystudy.am03_interface;

//�������̽��� ����(implements)
//I_Phone �������̽��� ����ؼ� Phone Ŭ������ ����

class Phone implements I_Phone{
	
	//�ʵ弱��-------------------------------------
	
	private String type;
	private String phoneNo;

	//������ ����-----------------------------------
		
//	public Phone() {}
		
	public Phone(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
	}
	
	public Phone(String type, String phoneNo) {
		this.type = type;
		this.phoneNo = phoneNo;
	}
		
	
	//get, set��--------------------------------
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}

		public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
		
	//�������̽� ���� �޼��� ����----------------------------------
	
	@Override
	public void view() {
		System.out.println(super.toString());
	}

	@Override
	public void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}

	@Override
	public void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}

	@Override
	public void sendMsg() {
		System.out.println(">> �޼���������");
	}

	@Override
	public void receiveMsg() {
		System.out.println(">> �޼��� �ޱ�");
	}
	
	//toString() ȣ��------------------------------------
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}

}
