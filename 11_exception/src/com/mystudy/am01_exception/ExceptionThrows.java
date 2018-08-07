package com.mystudy.am01_exception;

public class ExceptionThrows {

	public static void main(String[] args) {
		// ����ó�� : throws - ���ܸ� ���� �� (����, ����) ���
		// ���ܰ� �߻��� ������ ó������ ���ܸ� ������ �ٸ� ������ ó���ϵ��� ��
		// ȣ��� ������ ó���ϵ��� ���ܸ� ����
		System.out.println("--- main() ���� ---");
		int num1 = 100;
		int num2 = 20;
		int result = 0;
		
		System.out.println(">> ����ó��");
//		num2 = 0;
		div(num1,num2);
		System.out.println(">> div() ����ó��");
		
		num2 = 0;
		try {
			divThrows(num1,num2);
		} catch (ArithmeticException e) {
			System.out.println("[����ó�� main - throws��]" + e.getMessage());
		}
		
		System.out.println(">> divThrows() ����ó��");
		System.out.println(">> ����ó�� �Ϸ�");
		
		System.out.println("--- main() ���� ---");

	}

	static int div(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("[div ���ܹ߻�]" + e.getMessage());
		}
		return result;
	}
	
	static int divThrows(int num1, int num2) throws ArithmeticException {
		int result = 0;
		result = num1 / num2;
		return result;
	}
}
