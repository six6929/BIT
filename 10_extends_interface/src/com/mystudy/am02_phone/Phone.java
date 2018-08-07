package com.mystudy.am02_phone;

///////////////////////////////
//��� ����(�޼ҵ���� ���� �˾Ƽ�)
//��ȭ�� �Ӽ� : Ÿ��(type), ��ȭ��ȣ(phoneNo)
//0. ��ȭ���� Ȯ��
//1. ��ȭ�ɱ�
//2. ��ȭ�ޱ�
//3. �޽��� ������
//4. �޽��� �ޱ�

public class Phone {
	
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
	
	//�޼ҵ� ����-----------------------------------
	//00. ��ȭ���� Ȯ��
	public void numInfoCheck() {
		System.out.println(">> ��ȭ���� Ȯ��");
	}
	
	//01. ��ȭ�ɱ�
	public void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}
	
	//02. ��ȭ�ޱ�
	public void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}
	
	//03. �޼��������� 
	public void sendMsg() {
		System.out.println(">> �޼���������");
	}
	
	//04. �޼����ޱ�
	public void receiveMsg() {
		System.out.println(">> �޼��� �ޱ�");
		
	}

	//toString() ȣ��
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}

}
