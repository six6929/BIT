package com.mysutdy.pm03_scanner;

import java.util.Scanner;

public class ScannerGame {

	public static void main(String[] args) {
		//Scanner�� �̿��� ���� ���� �� ����
		//��ǻ�Ϳ� �Բ��ϴ� ����(1),����(2),��(3) ����
		//1. ����, ����, �� ���� �޴� ���
		//2. ���ð� �Է�
		//3. ��ǻ�͵� ����(Math.random())
		//4. ��� ���� ����, ���� ����
		while(true) {
			//1. ����, ����, �� ���� �޴� ���
			System.out.println("����, ����, �� �߿� �ϳ��� �����ϼ���.");
			System.out.println("1.���� 2.���� 3.�� 0.����");
			System.out.println(">>����� ������(1~3)?");
			
			//2. ���ð� �Է�
			Scanner sc = new Scanner(System.in);
			int select = (Integer.parseInt(sc.nextLine())); //nextline�� ���ڿ��� ���� -> ����ȯ�ʿ�
		
			String strPerson = "";
			if(select == 1) {
				strPerson = "����";
			} else if (select == 2) {
				strPerson = "����";
			} else if (select == 3) {
				strPerson = "��";
			} else if (select == 0) {
				System.out.println(">>> ����Ǿ����ϴ�.");
				return;
			} else {
				System.out.println("1~3 �߿��� �����ؾ� �մϴ�. �ٽ� �����ϼ���.");
				continue;
			}
			
			
			//3. ��ǻ�͵� ����(Math.random())
			int comSelect = (int)(Math.random() * 3 + 1); //3���� ��� �� + 1�� ���� 1~3���� ���ð���
			String strComputer = "";
			
			switch (comSelect) {
			case 1 :
				strComputer ="����";
				break;
			case 2 :
				strComputer ="����";
				break;
			case 3 : strComputer ="��";
				break;
			default :
				System.out.println("1~3�߿��� �����ؾ��մϴ�.");
				break;
					
			}
			
			System.out.println(">>��� ���� : " + strPerson);
			System.out.println(">>��ǻ�� ���� : " + strComputer);
			
			//4. ��� ���� ����, ���� ����
			String result = "";
			if(strPerson.equals("����")) {
				//��ǻ�� : ����, ����, ��
				if(strComputer.equals("����")) {
					result = "�� ���� �����ϴ�.";
					System.out.println(result);
				} else if (strComputer.equals("����")) {
					result = "��ǻ�Ͱ� �̰���ϴ�.";
					System.out.println(result);
				} else {
					result = "����� �̰���ϴ�.";
					System.out.println(result);
				}
			}
			//����� ������ ���
			if(strPerson.equals("����")) {
				//��ǻ�� : ����, ����, ��
				if(strComputer.equals("����")) {
					result = "����� �̰���ϴ�.";
					System.out.println(result);
				} else if (strComputer.equals("����")) {
					result = "�����ϴ�.";
					System.out.println(result);
				} else {
					result = "����� �����ϴ�.";
					System.out.println(result);
				}
			}
			
			//����� ���� ���
			if(strPerson.equals("��")) {
				//��ǻ�� : ����, ����, ��
				if(strComputer.equals("����")) {
					result = "����� �����ϴ�.";
					System.out.println(result);
				} else if (strComputer.equals("����")) {
					result = "����� �̰���ϴ�.";
					System.out.println(result);
				} else {
					result = "�����ϴ�.";
					System.out.println(result);
				}
			}
			
			//��� ���
			System.out.println("----- ��� -----");
			System.out.println(">>> " + result);
			System.out.println();
		}
	}

}
