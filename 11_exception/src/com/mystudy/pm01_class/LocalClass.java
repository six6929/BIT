package com.mystudy.pm01_class;

//����Ŭ����(Local class) : �޼ҵ� �� �Ǵ� �ʱ�ȭ �� ���� ����
public class LocalClass {
	int a = 100;
	
	
	void innerTest(int k) {
		int b = 200; // ��������(local variable)
		final int c = k; // final�� ������ ���� ��ġ ����
		
		//�޼ҵ� ���� �ִ� Ŭ����(����Ŭ���� - local class)
		//����� �޼ҵ� ���ο����� ��� ����
		class Inner {
			void printData() {
				System.out.println("int a : " + a);
				System.out.println("int b : " + b);
				System.out.println("final int c : " + c);
			}
		}
		Inner in = new Inner();
		in.printData();
	}
	
	public static void main(String[] args) {
		LocalClass outer = new LocalClass();
		outer.innerTest(999);
	}
}
