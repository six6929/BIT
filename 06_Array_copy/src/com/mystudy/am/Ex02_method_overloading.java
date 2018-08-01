package com.mystudy.am;

public class Ex02_method_overloading {

	public static void main(String[] args) {
		// �޼��� �����ε� (method overloading)
		// ���� : ������ �޼ҵ���� ����ؼ� ���� �ٸ� ����� ����
		// 1. �ϳ��� Ŭ���� ������ ������ �޼ҵ������ ����
		// 2. �Ķ����(parameter)�� Ÿ��, ����, ������ �޸��ؼ� �ۼ�
		//   ~ �޼ҵ��� ����Ÿ���� ����
		//�޼ҵ� �����ε��� Ŭ���� ������ �޼ҵ带 �ߺ�����
		String name = "ȫ�浿";
//		int kor = 100, eng = 90, math = 80;
		int kor = 100;
		int eng = 90;
		int math = 81;
		int tot = kor + eng + math;
		double avg = (tot * 100) / 3 / 100.0;
//		avg = (int)((tot * 100) / 3.0 )/ 100.0
		System.out.println(avg);
		
		System.out.println("--- �޼ҵ� ȣ��(����) ---");
		displayData(name, avg, tot); // String, double, int
		displayData(name,tot,avg); // String, int, double
		
		//��ü ����
		Ex02_method_overloading mo = new Ex02_method_overloading();
		mo.displayData(name, avg);
		
		mo.displayData(name);
		mo.displayData(avg);
		mo.displayData(tot);
		mo.displayData(kor,eng,math);
		mo.displayData(eng,math,kor); //Ÿ�԰� ������ ������ ����
		

	}
	
	static void displayData(String name, double avg, int tot) {
		System.out.println("�̸� : " + name);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + tot);
	}
	
	//���� ���̶� ������ �Ķ������ ������ �޶����� ������ ������ ���� �ʴ´�.
	static void displayData(String name, int tot, double avg) {
		System.out.println("�̸� : " + name);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + tot);
	}
	
	void displayData(String name, double avg) {
		System.out.println("3. �̸� : " + name + ", ��� : " + avg);
	}
	
	//��հ��� �޾Ƽ� ���
	void displayData(double avg) {
		System.out.println("��� : " + avg);
	}
	
	//�̸��� �޾Ƽ� ���
	void displayData(String name) {
		System.out.println("�̸� : " + name);
	}
	
	//������ �޾Ƽ� ���
	void displayData(int tot) {
		System.out.println("���� : " + tot);
	}
	
	//����, ����, ���� ������ �޾Ƽ� ���
	void displayData(int kor, int eng, int math) { 
		System.out.println("���� : " + kor + ", ���� : " + eng + ", ���� : " + math);
	}
}
