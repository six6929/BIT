package com.mystudy.pm04_abstract_class;

//�߻�Ŭ���� : abstract class
//�����޼ҵ�� �߻�޼ҵ带 �Բ� ������ �ִ� Ŭ����
//�߻�޼ҵ尡 �ֱ� ������ ��ü�� ������ �� ����

public abstract class Animal {
	
	String name; // �̸�, ��Ī
	int legCnt; // �ٸ�����
	
	void eat() {
		System.out.println(">> �Դ´�");
	}
	
	void sleep() {
		System.out.println(">> ���� �ܴ�");
	}
	abstract void sound(); // ������({�߰�ȣ})�� ����. �߻�޼ҵ�
	
}