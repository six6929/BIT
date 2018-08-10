package com.mystudy.am03_scanner_bank;

import java.util.Scanner;

public class BankATM2 {

	private int money; //����
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//[�ǽ�] ������ ATM
		//1.�Ա�  2.���  3.����Ȯ��  0.����
		//------------------------------
		//���¸� �ϳ� ����� �Ա�/���/����Ȯ�� �۾��� ó��
		//
		BankATM2 atm = new BankATM2();
		atm.startBank();
	}
	
	public void startBank() {
		System.out.println(">> �������");
		while (true) {
			if (bankATM() == false) {
				break;
			};
		}
		System.out.println(">>�۾��� �����߽��ϴ�.");
	}
	
	private boolean bankATM() {
		boolean jobContinue = true;
		showMenu();
		int select = 99;
		try {
			select = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("�߸��� ���� �ԷµǾ����ϴ�." 
					+ " �޴�(0~3) ���ڸ� �����ϼ���");
			return jobContinue;
		}
		if (select == 1) {
			//System.out.println("�Ա��۾�ó��~~");
			inputMoney();
		} else if (select == 2) {
//			System.out.println("����۾�ó��~~");
			outputMoney();
			
		} else if (select == 3) {
			//System.out.println("����Ȯ�� �۾�ó��~~");
			checkMoney();
		} else if (select == 0) {
			System.out.println("�����۾�ó��~~");
			jobContinue = false; //�۾������� ��� false ����
		} else {
			System.out.println("�߸��� ���� �ԷµǾ����ϴ�." 
					+ " �޴�(0~3) ���ڸ� �����ϼ���");
		}
		
		return jobContinue;
	}
	private void showMenu() {
		System.out.println("------------------------");
		System.out.println("1.�Ա�  2.���  3.����Ȯ��  0.����");
		System.out.println("------------------------");
		System.out.print(">>�۾����� : ");
	}
	
	private void inputMoney() {
		while (true) {
			System.out.print(">>�Աݾ� : ");
			try {
				money += Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("�߸��� ���� �ԷµǾ����ϴ�." 
						+ " ����(0~9)�� �Է��ϼ���"
						+ "\n�ٽ� �۾������ϼ���.");
				continue;
			}
			break;
		}
	}
	private void checkMoney() {
		System.out.println(">>����ݾ� : " + money + "��");
	}

	private void outputMoney() {
		while (true) {
			System.out.print(">>��ݾ� : ");
			try {
				money -= Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("�߸��� ���� �ԷµǾ����ϴ�." 
						+ " ����(0~9)�� �Է��ϼ���"
						+ "\n�ٽ� �۾������ϼ���.");
				continue;
			}
			break;
		}
	}
}