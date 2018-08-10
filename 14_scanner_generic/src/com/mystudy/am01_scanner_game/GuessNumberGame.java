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
		// 컴퓨터가 1~100 사이의 숫자를 정하면 사람이 맞추는 게임
		// 선택 기회 5회
		// 컴 숫자 : 70인 경우
		// 사람이 선택한 숫자가 크면(80) : 작다는 메시지 출력
		// 사람이 선택한 숫자가 작으면(50) : 크다는 메시지 출력
		// 5번 이내에 맞추면 : 성공!!! n번 만에 맞췄습니다.(화면출력)
		// 5번을 넘기면 : 실패~~ 내가 생각한 숫자는 70입니다.(화면출력)
		// ----------
		// 다시 도전하시겠습니까?

//내가 한 답
//		int rNum = 1;
//		int Cnt = 1;
//		
//		rNum = (int)(Math.random() * 100);
//		
//			
//		while(Cnt <= 5) {
//			
//			//숫자입력
//			System.out.println("1~100까지 숫자 중 하나를 선택하세요.");	
//			Scanner sc = new Scanner(System.in);
//			int numSelect = (Integer.parseInt(sc.nextLine()));
//			
//			if (numSelect < 0 || numSelect > 100) {
//				System.out.println("1~100을 벗어난 숫자입니다.");
//				continue;
//			} else if(rNum > numSelect) {
//				System.out.println(numSelect + "보다 큰 숫자입니다.\n");
//			} else if (rNum < numSelect) {
//				System.out.println(numSelect + "보다 작은 숫자입니다.\n");
//			} else if (rNum == numSelect) {
//				System.out.println("5번 안에 정답을 맞추었습니다.\n");
//				return;
//			}
//			Cnt++;
//		}	
//		System.out.println("5번 안에 정답을 맞히지 못하였습니다. \n제가 생각한 숫자는 : " + rNum);
//		System.out.println("다시 도전하시겠습니까? (Y,N)" );
		
		
//		String replay = "";
//		Scanner sc1 = new Scanner(System.in);
//		String Y = sc1.nextLine();
//		if (Y == replay) {
//			while(Cnt <= 5) {
//				
//				//숫자입력
//				System.out.println("1~100까지 숫자 중 하나를 선택하세요.");	
//				Scanner sc = new Scanner(System.in);
//				int numSelect = (Integer.parseInt(sc.nextLine()));
//				
//				if(rNum > numSelect) {
//					System.out.println(numSelect + "보다 큰 숫자입니다.\n");
//				} else if (rNum < numSelect) {
//					System.out.println(numSelect + "보다 작은 숫자입니다.\n");
//				} else if (rNum == numSelect) {
//					System.out.println("5번 안에 정답을 맞추었습니다.\n");
//					return;
//				} else if (numSelect < 0 || numSelect > 100) {
//					System.out.println("1~100을 벗어난 숫자입니다.");
//					continue;
//				}
//				Cnt++;
//			}	
//		} else if (Y != replay) {
//			System.out.println("종료");
//		}
	/////////////////////////////////////////////////////////////////////
	
	
	GuessNumberGame game = new GuessNumberGame();
		
// 강사님 답
	//1. 메시지 출력 및 컴퓨터가 1~100까지 숫자 중 하나를 생각해서 정하기
	game.gameStart();

	}// main end
	
	void gameStart() {
		while(true) {
			//게임플레이
			playGame();
			//게임을 더할지 결정
			if(!tryAgain()) {
				System.out.println(">> 종료하기");
				break;
			}
		}
		
	}
	boolean tryAgain() {
		boolean result = false;
		System.out.println("--------------------------------------");
		System.out.println(">> 다시 도전하시겠습니까?(y/n");
		String tryYesNo = scan.nextLine();
		if("y".equalsIgnoreCase(tryYesNo)) {
			result = true; // 한번 더
			
			;
		}
		System.out.println();
		return result; 
	}
	void playGame() {
		tryCnt = 0;
		comNo = (int)(Math.random() * 100) + 1;
		System.out.println("1~100까지 숫자 중에 하나를 생각했습니다." + "맞춰보세요.");
		
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
	//	System.out.println("컴퓨터 생각 숫자 : " + comNo);
		
		while (tryCnt < 5) {
			tryCnt++; //1~
			if (tryCnt < 5) {
				//2. 사람에게 선택하도록 메시지 출력, 값을 입력 받기
				System.out.print("("+ tryCnt + "번째)숫자를 선택 : ");
				meNo = Integer.parseInt(scan.nextLine());
				
				//3. 입력한 값과 컴퓨터의 숫자 비교(>, ==, <)
				if (comNo > meNo) {
					System.out.println(">> " + meNo+ "보다 큽니다.");
				}
				if (comNo < meNo) {
					System.out.println(">> " + meNo+ "보다 작습니다.");
				}
				if (comNo == meNo) {
					System.out.println(">> 맞췄습니다.");
					System.out.println("게임을 종료합니다. 다시 시작하세요");
					break;
				}
			} else {
				//5번째 처리 --------------------------------
				//성공 : 축하합니다. n번째 시도에 성공 
				//실패 : 실패~~ 내가 생각한 숫자는 xx입니다.
				//공통 : 무조건 종료
				//-----------------------------------------
				//2. 사람에게 선택하도록 메시지 출력, 값을 입력 받기
				System.out.print("(마지막)숫자를 선택 : ");
				meNo = Integer.parseInt(scan.nextLine());
				
				//3. 입력한 값과 컴퓨터의 숫자 비교(>, ==, <)
				if (comNo > meNo) {
					System.out.println(">> 실패~~ 내가 생각한 숫자는 "
							+ comNo + "입니다");
				}
				if (comNo < meNo) {
					System.out.println(">> 실패~~ 내가 생각한 숫자는 "
							+ comNo + "입니다");
				}
				
				if (comNo == meNo) {
					System.out.println(">> 맞췄습니다.");
					System.out.println("게임을 종료합니다. 다시 시작하세요");
				}
				break; //while 종료
			}
		}
	}
	
}// class end
