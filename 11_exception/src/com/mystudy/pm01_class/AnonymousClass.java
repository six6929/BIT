package com.mystudy.pm01_class;

interface TestInter {
	int DATA = 100;
	void printData();
	
}

class TestInterImp implements TestInter {
	@Override
	public void printData() {
		
	}
	
	public static void main(String[] args) {
		TestInterImp imp = new TestInterImp();
	}
}


//�͸�Ŭ���� : Ŭ������ �̸��� ���� Ŭ����
//�ѹ��� ����ϴ� �뵵�� ����� ����ϴ� Ŭ����

public class AnonymousClass {

	void test() {
		(new TestInter() {
			@Override
			public void printData() {
				System.out.println("DATA : " + DATA);
			}
		}).printData();
	}
	
	public static void main(String[] args) {
		
		AnonymousClass an = new AnonymousClass();
		an.test();
	}

}
