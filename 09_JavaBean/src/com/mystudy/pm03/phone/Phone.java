package com.mystudy.pm03.phone;

public class Phone {
	//��ȣ�� ���� ������ ǥ��
	//+ : public, # : protected, - :private, (default)
	
	//-type : String
	//-phoneNo : String
	
	private String type;
	private String phoneNo;

	//������(phoneNo) : type�� "Phone Ÿ��" �Է�ó��
	public Phone(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
		this.type = "Phone Ÿ��";
	}

	//������(type, phoneNo)
	
	public Phone(String type, String phoneNo) {
		super();
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
		System.out.println("��ȭ�ɱ�");
	}
	//receiveCall() : ">>��ȭ�ޱ�" ȭ�����
	
	public void receiveCall() {
		System.out.println(">>��ȭ�ޱ�");
	}
	
	//view() : toString() ȣ��

	public void view() {
		System.out.println("---��ȭ�� ����---");
		System.out.println("type : " + type);
		System.out.println("phoneNo : " + phoneNo);
	}
	
	//toString() : ��Ŭ�������� �ڵ�����
	
	@Override
	public String toString() {
		return "Phone [type=" + type + ", phoneNo=" + phoneNo + "]";
	}
	
}
