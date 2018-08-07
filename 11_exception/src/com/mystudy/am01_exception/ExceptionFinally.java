package com.mystudy.am01_exception;

public class ExceptionFinally {

	public static void main(String[] args) {
		//try ~ catch ~ finally 
		System.out.println("--- main() ���� ----");
		int num = 20;
		try {
			System.out.println(">> try�� ����");
			System.out.println(">> ����ó�� ����");
			num = 0;
			int result = 100 / num; //���ܹ߻� ��� : 0���� ����
			System.out.println(">> ����ó�� �Ϸ�");
			System.out.println(">> try�� ��");
		} catch (ArithmeticException e) {
			System.out.println(">>>> catch ����");
		} finally {
			System.out.println(">!!> finally : �׻� ����(������)");
		}
		
		System.out.println("-----------------------");
		System.out.println("test() : " + test());
		System.out.println("--- main() ���� ----");

	}
	static String test() {
		String result = "";
		int[] num = new int[3];
		
		try {
			num[3] = 100;
			result = "<�������>";
		} catch (Exception e) {
			result = "���ܹ߻�" + e.getMessage();
			e.printStackTrace();
		} finally {
			System.out.println("finally : ������ ����");
		}
		
		return result;
	}
}
