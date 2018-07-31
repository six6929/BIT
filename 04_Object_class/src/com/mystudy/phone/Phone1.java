package com.mystudy.phone;

//���� ������ : public, protected, (default), private
//package�� ����ϰ� �Ǹ� ���� ��Ű�� �ȿ����� ����� �� �ִ�.
//Ŭ���� : public, (default)
//�ʵ�, �޼��� : 4������ ����[public, protected(��Ӱ��谡 �ִ� ��, �ٸ� ��Ű���� ������ ����� �޾����� ����� �� �ִ�), (default), private]�� �� ����� �� �ִ�.
//������ : Ŭ������ ���� ������ ������ ���

class Phone1 {
	//�ʵ弱��
	String name; // String�� ������ : null �ʱ�ȭ
	String type;
	int hsize; // int : 0 �ʱ�ȭ
	int vsize;
	boolean hasLCD;
	
	
	//������ ����
	//������ ������ �Ǿ� ���� ������ �ƹ� �Ķ���͸� ���� �ʴ� �⺻���� ������.
	
	//�����ڿ� �Ű������� ������ Main�� ��ü�����Ҷ� �Ķ���Ͱ��� �־�����Ѵ�.
	Phone1() {
		super();//�⺻������ �ȿ� super();�� �����Ǿ� �ִٰ� ������.
		//�θ�Ŭ������ �⺻ ������ ȣ��
		//super : �θ�Ŭ����, �θ�Ŭ������ �⺻ ������
	} //�⺻�����ڸ� �������� ���θ޼��忡�� �Ķ���Ͱ��� ���� �ʴ� ��ü������ ����
	
	Phone1(String name, String type) {
		this.name = name; // this : ���� ��ü(instance)
		this.type = type;
	} //����������� ������������ ���� ��, �������� �տ� this. �� �ٿ��� ��������
	// static �տ��� this.�� ���� �� ����
	// this - ���� ��ü�� �ǹ�
	
	
	Phone1(String name, String type, boolean hasLCD) {
		this.name = name; // this : ���� ��ü(instance)
		this.type = type;
		this.hasLCD = hasLCD;
	}
	//�޼ҵ� ����
	void view() {
		System.out.println("---��ȭ�� ����---");
		System.out.println("�𵨸� : " + name);
		System.out.println("Ÿ�� : " + type);
		System.out.println("����ũ�� : " + hsize);
		System.out.println("����ũ�� : " + vsize);
		System.out.println("LCD���� : " + hasLCD);
	}
	
	void call() {
		System.out.println(">>> ��ȭ�ɱ�");
	}
	
	void receiveCall() {
		System.out.println(">>> ��ȭ�ޱ�");
	}
	
	void sendSms(String msg) {
		System.out.println("[�޽�������]" + msg);
	}
	
	String receiveSms(String msg) {
		System.out.println("[�޽�������]" + msg);
		return msg;
	}

}
