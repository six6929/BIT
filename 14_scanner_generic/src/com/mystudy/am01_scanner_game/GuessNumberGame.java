package com.mystudy.am01_scanner_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GuessNumberGame {

	int comNo = 0;
	int meNo = 0;
	int tryCnt = 0;
	Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		// ��ǻ�Ͱ� 1~100 ������ ���ڸ� ���ϸ� ����� ���ߴ� ����
		// ���� ��ȸ 5ȸ
		// �� ���� : 70�� ���
		// ����� ������ ���ڰ� ũ��(80) : �۴ٴ� �޽��� ���
		// ����� ������ ���ڰ� ������(50) : ũ�ٴ� �޽��� ���
		// 5�� �̳��� ���߸� : ����!!! n�� ���� ������ϴ�.(ȭ�����)
		// 5���� �ѱ�� : ����~~ ���� ������ ���ڴ� 70�Դϴ�.(ȭ�����)
		// ----------
		// �ٽ� �����Ͻðڽ��ϱ�?

//���� �� ��
//		int rNum = 1;
//		int Cnt = 1;
//		
//		rNum = (int)(Math.random() * 100);
//		
//			
//		while(Cnt <= 5) {
//			
//			//�����Է�
//			System.out.println("1~100���� ���� �� �ϳ��� �����ϼ���.");	
//			Scanner sc = new Scanner(System.in);
//			int numSelect = (Integer.parseInt(sc.nextLine()));
//			
//			if (numSelect < 0 || numSelect > 100) {
//				System.out.println("1~100�� ��� �����Դϴ�.");
//				continue;
//			} else if(rNum > numSelect) {
//				System.out.println(numSelect + "���� ū �����Դϴ�.\n");
//			} else if (rNum < numSelect) {
//				System.out.println(numSelect + "���� ���� �����Դϴ�.\n");
//			} else if (rNum == numSelect) {
//				System.out.println("5�� �ȿ� ������ ���߾����ϴ�.\n");
//				return;
//			}
//			Cnt++;
//		}	
//		System.out.println("5�� �ȿ� ������ ������ ���Ͽ����ϴ�. \n���� ������ ���ڴ� : " + rNum);
//		System.out.println("�ٽ� �����Ͻðڽ��ϱ�? (Y,N)" );
		
		
//		String replay = "";
//		Scanner sc1 = new Scanner(System.in);
//		String Y = sc1.nextLine();
//		if (Y == replay) {
//			while(Cnt <= 5) {
//				
//				//�����Է�
//				System.out.println("1~100���� ���� �� �ϳ��� �����ϼ���.");	
//				Scanner sc = new Scanner(System.in);
//				int numSelect = (Integer.parseInt(sc.nextLine()));
//				
//				if(rNum > numSelect) {
//					System.out.println(numSelect + "���� ū �����Դϴ�.\n");
//				} else if (rNum < numSelect) {
//					System.out.println(numSelect + "���� ���� �����Դϴ�.\n");
//				} else if (rNum == numSelect) {
//					System.out.println("5�� �ȿ� ������ ���߾����ϴ�.\n");
//					return;
//				} else if (numSelect < 0 || numSelect > 100) {
//					System.out.println("1~100�� ��� �����Դϴ�.");
//					continue;
//				}
//				Cnt++;
//			}	
//		} else if (Y != replay) {
//			System.out.println("����");
//		}
	/////////////////////////////////////////////////////////////////////
	
	
	GuessNumberGame game = new GuessNumberGame();
		
// ����� ��
	//1. �޽��� ��� �� ��ǻ�Ͱ� 1~100���� ���� �� �ϳ��� �����ؼ� ���ϱ�
	game.gameStart();

	}// main end
	
	void gameStart() {
		while(true) {
			//�����÷���
			playGame();
			//������ ������ ����
			if(!tryAgain()) {
				System.out.println(">> �����ϱ�");
				break;
			}
		}
		
	}
	boolean tryAgain() {
		boolean result = false;
		System.out.println("--------------------------------------");
		System.out.println(">> �ٽ� �����Ͻðڽ��ϱ�?(y/n");
		String tryYesNo = scan.nextLine();
		if("y".equalsIgnoreCase(tryYesNo)) {
			result = true; // �ѹ� ��
			
			;
		}
		System.out.println();
		return result; 
	}
	void playGame() {
		tryCnt = 0;
		comNo = (int)(Math.random() * 100) + 1;
		System.out.println("1~100���� ���� �߿� �ϳ��� �����߽��ϴ�." + "���纸����.");
		
	//	ArrayList<Integer> list = new ArrayList<>();
	//	for(int i=0; i<1000; i++) {
	//		comNo = (int)(Math.random() * 100) + 1; 
	//		list.add(comNo);
	//	}
	//	Collections.sort(list);
	//	for(int i=0; i<list.size(); i++) {
	//		System.out.println(list.get(i));
	//		if(i % 100 == 0) {
	//			System.out.println();
	//		}
	//	}
	//	System.out.println("��ǻ�� ���� ���� : " + comNo);
		
		while (tryCnt < 5) {
			tryCnt++; //1~
			if (tryCnt < 5) {
				//2. ������� �����ϵ��� �޽��� ���, ���� �Է� �ޱ�
				System.out.print("("+ tryCnt + "��°)���ڸ� ���� : ");
				meNo = Integer.parseInt(scan.nextLine());
				
				//3. �Է��� ���� ��ǻ���� ���� ��(>, ==, <)
				if (comNo > meNo) {
					System.out.println(">> " + meNo+ "���� Ů�ϴ�.");
				}
				if (comNo < meNo) {
					System.out.println(">> " + meNo+ "���� �۽��ϴ�.");
				}
				if (comNo == meNo) {
					System.out.println(">> ������ϴ�.");
					System.out.println("������ �����մϴ�. �ٽ� �����ϼ���");
					break;
				}
			} else {
				//5��° ó�� --------------------------------
				//���� : �����մϴ�. n��° �õ��� ���� 
				//���� : ����~~ ���� ������ ���ڴ� xx�Դϴ�.
				//���� : ������ ����
				//-----------------------------------------
				//2. ������� �����ϵ��� �޽��� ���, ���� �Է� �ޱ�
				System.out.print("(������)���ڸ� ���� : ");
				meNo = Integer.parseInt(scan.nextLine());
				
				//3. �Է��� ���� ��ǻ���� ���� ��(>, ==, <)
				if (comNo > meNo) {
					System.out.println(">> ����~~ ���� ������ ���ڴ� "
							+ comNo + "�Դϴ�");
				}
				if (comNo < meNo) {
					System.out.println(">> ����~~ ���� ������ ���ڴ� "
							+ comNo + "�Դϴ�");
				}
				
				if (comNo == meNo) {
					System.out.println(">> ������ϴ�.");
					System.out.println("������ �����մϴ�. �ٽ� �����ϼ���");
				}
				break; //while ����
			}
		}
	}
	
}// class end
