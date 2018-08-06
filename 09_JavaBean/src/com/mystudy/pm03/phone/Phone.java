package com.mystudy.pm03.phone;

public class Phone extends Object {
	//��ȣ�� ���� ������ ǥ��
	//+ : public, # : protected, - :private, (default)
	
	//-type : String
	//-phoneNo : String
	
	private String type;
	private String phoneNo;

	public Phone() {
		
	}
	//������(phoneNo) : type�� "Phone Ÿ��" �Է�ó��
	public Phone(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
		type = "Phone Ÿ��";
	}

	//������(type, phoneNo)
	
	public Phone(String type, String phoneNo) {
		super(); //()�� ������ ȣ��;
		this.type = type;
		this.phoneNo = phoneNo;
	}

	//getType
	
	public String getType() {
		return type;
	}

	//getPhoneNo
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	//call() : "��ȭ�ɱ�" ȭ�����
	
	public void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}
	//receiveCall() : ">>��ȭ�ޱ�" ȭ�����
	
	public void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}
	
	//view() : toString() ȣ��

	public void view() {
		System.out.println(toString());
	}
	
	//toString() : ��Ŭ�������� �ڵ�����
	
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
}
