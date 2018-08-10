package com.mystudy.am03_scanner_bank;

import java.util.Scanner;

public class BankAtm {

	int account = 0;
	int num;
	int Money;
	int sum;
	Scanner sc = new Scanner(System.in); 
	
	
	public static void main(String[] args) {
		//[�ǽ�]������ ATM
		//1. �Ա� 2. ��� 3. ����Ȯ�� 0.����
		//-------------------------
		//���¸� �ϳ� ����� �Ա�/���/����Ȯ��/����
		BankAtm ba = new BankAtm();
		while(true) {
			if(ba.UseAtm() == false) {
				break;
			}
		}

	}//main ����

	public boolean UseAtm() {
		boolean result = true;
		System.out.println("� ���񽺸� �̿��Ͻðڽ��ϱ�?\n1.�Ա� 2.��� 3.����Ȯ�� 0.����");
		num = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1 :
			System.out.println("�� �Ա��Ͻðڽ��ϱ�?");
			Money = Integer.parseInt(sc.nextLine());
			if (Deposit(Money, sum) > 0) {
				sum = Deposit(Money, sum);
				System.out.println(Money + "���� �ԱݵǾ����ϴ�.");
				break;
			} else if (Deposit(Money, sum) == 0) {
				break;
			}
			
		case 2 :
			System.out.println("�� ����Ͻðڽ��ϱ�?");
			Money = Integer.parseInt(sc.nextLine());
			if (Withdraw(Money, sum) > 0) {
				sum = Withdraw(Money, sum);
				System.out.println(Money + "���� ��ݵǾ����ϴ�.");
				break;
			} else if (Withdraw(Money, sum) == 0) {
				break;
			}
			
		case 3 :
			CheckAccount();
			break;
			
		case 0 :
			AtmExit();
			result = false;
			break;
			
		default :
			System.out.println("1~4�� �������ּ���.");
			break;
		}
		
		return result;
	}
	
	public int Deposit(int Money, int sum) {
		if(Money > 0) {
			sum += Money;
		} else if (Money == 0) {
			System.out.println("0���� �Ա� �Ұ�");
		}
		return sum;
	}
	
	public int Withdraw(int Money, int sum) {
		if(sum > Money || sum == Money) {
			sum -= Money;
		} else if (Money == 0) {
			System.out.println("0���� ��� �Ұ�");
		} else if (sum == 0) {
			System.out.println("���� �ܾ� 0��");
		} else if (sum < Money) {
			System.out.println("��� �ݾ��� ����");
		}
		return sum;
	}
	
	void CheckAccount() {
		System.out.println("���� �����ܾ���" + sum + "�� �����ֽ��ϴ�.");
	}
	
	void AtmExit() {
		System.out.println("�������Ǿ����ϴ�.");
	}
}//class ����
