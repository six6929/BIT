package com.mystudy.am01_exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("--- main() ���� ----");
		int num = 100;
		int num1 = 0;
		int num2 = 30;
		int result = 0;
		System.out.println(">> �������");

//		result = num / num1;
//		System.out.println("result : " + result);
/*		
		//if������ ���� ó��
		if (num1 == 0) { // ���ܰ� �߻��� �ǵ��� if������ ó������ ����..
			System.out.println("[���� �߻�] 0���� �������� �߽��ϴ�.");
		} else {
			result = num / num1;
			System.out.println("������ : " + result);
		}
*/
		//try ~ catch������ ���� ó��
		try {
			num1 = 0;
			result = num / num1; // 0���� ���� �� ���� �߻�
			System.out.println("������ : " + result);
		} catch(ArithmeticException e) {
			System.out.println("[���ܹ߻� - �޽���]" + e.getMessage());
			e.printStackTrace(); // ����ǰ� �ִ� ��ɹ����� ����� ���
		} catch (RuntimeException e) {
			System.out.println("[���ܹ߻� - Runtime]" + e.getMessage());
		} catch (Exception e){
			System.out.println("[���ܹ߻�] 0���� �������� �߽��ϴ�.");
		}
		System.out.println("--- main() ���� ----");
		
	}

}
