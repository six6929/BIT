package com.mystudy.pm01_class;

//����Ŭ����(Inner Class) : Ŭ���� ���� ����� Ŭ������ ��Ī
//�ν��Ͻ�Ŭ���� : �ʵ庯���� ���� ����
public class InstanceClass {
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	void sum() {
		sum = a + b;
	}
	
	//Ŭ���� ���� ���� ���� ������ Ŭ������ ������
	class Inner {
		int in = 100;
		void printData() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
			System.out.println("����Ŭ���� �ʵ�in : " + in);
		}
	}
	
	public static void main(String[] args) {
		//�ܺ�Ŭ�������� ���� Ŭ���� ���
		InstanceClass out = new InstanceClass();
		
		//�ܺ�Ŭ������.����Ŭ������ : ����Ŭ������ Ÿ��
		//new InstanceClass().new Inner() : �ܺ�Ŭ������ü������ ����Ŭ���� ��ü ����
		InstanceClass.Inner inner = new InstanceClass().new Inner();
		inner.printData();
		System.out.println("Inner Ŭ������ �ʵ庯�� in : " + inner.in);
		
	}
}

//�Ϲ����� Ŭ����
class CommonClass {
	
}