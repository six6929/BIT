package com.mystudy.car;

public class Car {
	//�ʵ庯��(�Ӽ�)
	String name = "����ī"; //������
	String model; //�𵨸�
	String color; //������
	
	//final ������  : ������ ���� �Ҵ�Ǹ� ���̻� ���� �Ұ�
	//���ȭ�� ���� ����Ģ : ��ü �빮�ڷ� �ۼ�, �ǹ̰� �޶����� '_' ���
	final int CAR_LENGTH = 350; //��������
	final int CAR_WIDTH = 200; //������(�ʺ�)
	
	//���ȭ�� ���� �ѹ��� �ٲ��ָ� �� �̸��� �� �������� �ϰ������� �� �ٲ� �� �ִ� ������ ����.
	
	
	boolean existAirbag; //����� ���� ����
	
	//������ : returnŸ�� ����
	//Ŭ������() {} - �⺻������(default constructor)
	//Ŭ������(�Ű�����, ...) {}
	
	Car() {
//		name = "����ī";
		model = "�帲ī";
		color = "��������";
	}
	
	Car(String n, String m, String c) {
		name = n;
		model = m;
		color = c;
		existAirbag = true; //����� ����
	}
	
	//�޼ҵ�(�⺻, �Լ�)
	void run() {
		System.out.println(">> ������ �̵�");
	}
	
	void stop() {
		System.out.println(">> ����");
	}
	
	void back() {
		System.out.println(">> �ڷ� �̵�");
	}
	//�޼ҵ�� ��Ӱ��迡 �־�� �������̵� �� �� ����.

//	@Override // �ּ�  - Object�� �ִ� 
//	public String toString() {
//		return "Car [name=" + name + ", model=" + model + ", color=" + color + ", CAR_LENGTH=" + CAR_LENGTH
//				+ ", CAR_WIDTH=" + CAR_WIDTH + ", existAirbag=" + existAirbag + "]";
//	}
	
	public void dispData() {
		System.out.println("======================");
		System.out.println("�ڵ����̸�: " + name);
		System.out.println("�𵨸� : " + model);
		System.out.println("���� : " + color);
		System.out.println("�������� : " + CAR_LENGTH);
		System.out.println("�����ʺ� : " + CAR_WIDTH);
		System.out.println("����� : " + existAirbag);
		System.out.println("====================");
	}

}
