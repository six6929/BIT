package com.mystudy.string;

public class Ex03_StringExam {

	public static void main(String[] args) {
		/* ���ڿ� �ֹι�ȣ ó��
		String str = "900108-1234567"; // �ֹι�ȣ
		����1. ��Ȯ�� �Է��� �� ���������� Ȯ�� 
			(��ü�ڸ��� 14, '-' ��ġ : 7��°)
			
		����2. ������� ���
		����3. ����Ȯ���ϰ� ���(1,3 : ����, 2,4 : ����)
		����4. ������ �� ����
			  (�� : 1~12, �� : 1~31)
		���� : int num = Integer.parseInt("12"); // "12" -> 12
		*/
		
		String str = "900108-1234567";
		//����1. ��Ȯ�� �Է��� �� ���������� Ȯ��
		System.out.println("--- ����1 ---");
		System.out.println(str.length());
		System.out.println(str.indexOf("-")+1);
		
		System.out.println("==================");
		if(str.length() == 14) {
			System.out.println(str.length() + "�ڸ� �����Դϴ�.");
		} else {
			System.out.println("�ֹι�ȣ�� ��� �Էµ��� �ʾҽ��ϴ�.");
		}
		
		if(str.indexOf("-") == 7) {
			System.out.println(str.indexOf("-"));
		} else {
			System.out.println("��Ȯ�ϰ� �Էµ��� �ʾҽ��ϴ�.");
			System.out.println(str.indexOf("-")+1);
		}
		
		System.out.println();
		
		//����2. ������� ���
		System.out.println("--- ����2 ---");
		
		//2-1. ���Ⱚ ����
		System.out.println("���� : " + str.substring(0,2));
		String year = str.substring(0,2);
		//2-2. ������ ����
		System.out.println("���� : " + str.substring(2,4));
		String month = str.substring(2,4);
		//2-3. ���ϰ� ����
		System.out.println("���� : " + str.substring(4,6));
		String day = str.substring(4,6);
		//2-4 ������� ���(00�� 00�� 00�� ���)
		System.out.println(year + "�� " + month + "�� " + day + "�� ���");
		System.out.println(year.concat(month).concat(day));
		
		
		//����3. ����Ȯ���ϰ� ���(1,3 : ����, 2,4 : ����)
		System.out.println("--- ���� 3 ----");
		//3-1. �ֹι�ȣ���� '-' ������ ���ڸ� ����
		char[] ch = str.toCharArray();
		System.out.println("�ֹι�ȣ���� '-' ������ ���� : " + ch[7]);
		//3-2. ���� ���� ���� �� �� ���

		if(ch[7] == '1' || ch[7] == '3') {
			System.out.println("����");
		} else if(ch[7] == '2' || ch[7] == '4'){
			System.out.println("����");
		} else {
			System.out.println("[����] �������� 1~4�� �ƴմϴ�.");
		}
		

		//����4. ������ �� ����
		System.out.println("--- ���� 4 ----");
		//		(�� : 1~12, �� : 1~31)
		//4-1. �ֹι�ȣ�� 3~4��° ���� �� �����ϰ� 1~12 ������ ������ Ȯ��(if�� ���)
		int month1 = Integer.parseInt(str.substring(2,4));
		System.out.println("�ֹι�ȣ�� 3~4��° �� : " + str.substring(2,4));
		System.out.println(month1);
		if(month1 >= 1 && month1 <= 12) {
			System.out.println(month1 + ", 1~12 ������ �ȿ� �ֽ��ϴ�");
		} else {
			System.out.println("1~12 ������ ������ϴ�.");
		}
		//4-2. �ֹι�ȣ�� 5~6��° ���� �� �����ϰ� 1~31 ������ ������ Ȯ��(if�� ���)
		System.out.println("�ֹι�ȣ�� 5~6��° �� : " + str.substring(4,6));
		int day1 = Integer.parseInt(str.substring(4,6));
		System.out.println(day1);
		if(day1 >= 1 && day1 <= 31) {
			System.out.println(day1 + ", 1~31 ������ �ȿ� �ֽ��ϴ�.");
		} else {
			System.out.println("1~31 ������ ������ϴ�.");
		}

		
//		System.out.println("�ֹι�ȣ�� 3~4��° �� : " + str.substring(2,4));
//		System.out.println("�ֹι�ȣ�� 5~6��° �� : " + str.substring(4,6));
//		int month2 = Integer.parseInt(str.substring(2,4));
//		int day2 = Integer.parseInt(str.substring(4,6));
//		int num = 0;
//		
//		if(month2 == 1 || month2 == 3 || month2 == 5 || month2 == 7 || month2 == 8 || month2 == 10 || month2 == 12) {
//			if(day2 == 31) {
//				System.out.println("���� ���� �˸°� �Է��ϼ̽��ϴ�.");
//			} else {
//				System.out.println("���� ���� �ٽ� �Է��ϼ���.");
//			}
//		} else if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11){
//				if(day2 == 30) {
//					System.out.println("���� ���� �˸°� �Է��ϼ̽��ϴ�.");
//				} else {
//				System.out.println("���� ���� �ٽ� �Է��ϼ���.");
//				} 
//		} else {
//			System.out.println(" ���� ���� �˸°� �Է��ϼ̽��ϴ�.");
//		}
//	
//	}
	}
}
