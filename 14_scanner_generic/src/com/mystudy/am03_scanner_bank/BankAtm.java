package com.mystudy.am03_scanner_bank;

import java.util.Scanner;

public class BankAtm {

	int account = 0;
	int num;
	int Money;
	int sum;
	Scanner sc = new Scanner(System.in); 
	
	
	public static void main(String[] args) {
		//[실습]은행의 ATM
		//1. 입금 2. 출금 3. 통장확인 0.종료
		//-------------------------
		//계좌를 하나 만들고 입금/출금/통장확인/종료
		BankAtm ba = new BankAtm();
		while(true) {
			if(ba.UseAtm() == false) {
				break;
			}
		}

	}//main 종료

	public boolean UseAtm() {
		boolean result = true;
		System.out.println("어떤 서비스를 이용하시겠습니까?\n1.입금 2.출금 3.통장확인 0.종료");
		num = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1 :
			System.out.println("얼마 입금하시겠습니까?");
			Money = Integer.parseInt(sc.nextLine());
			if (Deposit(Money, sum) > 0) {
				sum = Deposit(Money, sum);
				System.out.println(Money + "원이 입금되었습니다.");
				break;
			} else if (Deposit(Money, sum) == 0) {
				break;
			}
			
		case 2 :
			System.out.println("얼마 출금하시겠습니까?");
			Money = Integer.parseInt(sc.nextLine());
			if (Withdraw(Money, sum) > 0) {
				sum = Withdraw(Money, sum);
				System.out.println(Money + "원이 출금되었습니다.");
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
			System.out.println("1~4를 선택해주세요.");
			break;
		}
		
		return result;
	}
	
	public int Deposit(int Money, int sum) {
		if(Money > 0) {
			sum += Money;
		} else if (Money == 0) {
			System.out.println("0원은 입금 불가");
		}
		return sum;
	}
	
	public int Withdraw(int Money, int sum) {
		if(sum > Money || sum == Money) {
			sum -= Money;
		} else if (Money == 0) {
			System.out.println("0원은 출금 불가");
		} else if (sum == 0) {
			System.out.println("통장 잔액 0원");
		} else if (sum < Money) {
			System.out.println("출금 금액이 부족");
		}
		return sum;
	}
	
	void CheckAccount() {
		System.out.println("현재 통장잔액은" + sum + "원 남아있습니다.");
	}
	
	void AtmExit() {
		System.out.println("사용종료되었습니다.");
	}
}//class 종료
