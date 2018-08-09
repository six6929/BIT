package com.mysutdy.pm03_scanner;

import java.util.Scanner;

public class ScannerGame {

	public static void main(String[] args) {
		//Scanner를 이용한 가위 바위 보 게임
		//컴퓨터와 함께하는 가위(1),바위(2),보(3) 게임
		//1. 가위, 바위, 보 선택 메뉴 출력
		//2. 선택값 입력
		//3. 컴퓨터도 선택(Math.random())
		//4. 결과 비교후 승자, 패자 결정
		while(true) {
			//1. 가위, 바위, 보 선택 메뉴 출력
			System.out.println("가위, 바위, 보 중에 하나를 선택하세요.");
			System.out.println("1.가위 2.바위 3.보 0.종료");
			System.out.println(">>당신의 선택은(1~3)?");
			
			//2. 선택값 입력
			Scanner sc = new Scanner(System.in);
			int select = (Integer.parseInt(sc.nextLine())); //nextline은 문자열로 받음 -> 형전환필요
		
			String strPerson = "";
			if(select == 1) {
				strPerson = "가위";
			} else if (select == 2) {
				strPerson = "바위";
			} else if (select == 3) {
				strPerson = "보";
			} else if (select == 0) {
				System.out.println(">>> 종료되었습니다.");
				return;
			} else {
				System.out.println("1~3 중에서 선택해야 합니다. 다시 시작하세요.");
				continue;
			}
			
			
			//3. 컴퓨터도 선택(Math.random())
			int comSelect = (int)(Math.random() * 3 + 1); //3가지 방법 중 + 1을 통해 1~3까지 선택가능
			String strComputer = "";
			
			switch (comSelect) {
			case 1 :
				strComputer ="가위";
				break;
			case 2 :
				strComputer ="바위";
				break;
			case 3 : strComputer ="보";
				break;
			default :
				System.out.println("1~3중에서 선택해야합니다.");
				break;
					
			}
			
			System.out.println(">>사람 선택 : " + strPerson);
			System.out.println(">>컴퓨터 선택 : " + strComputer);
			
			//4. 결과 비교후 승자, 패자 결정
			String result = "";
			if(strPerson.equals("가위")) {
				//컴퓨터 : 가위, 바위, 보
				if(strComputer.equals("가위")) {
					result = "두 명은 비겼습니다.";
					System.out.println(result);
				} else if (strComputer.equals("바위")) {
					result = "컴퓨터가 이겼습니다.";
					System.out.println(result);
				} else {
					result = "당신이 이겼습니다.";
					System.out.println(result);
				}
			}
			//사람이 바위인 경우
			if(strPerson.equals("바위")) {
				//컴퓨터 : 가위, 바위, 보
				if(strComputer.equals("가위")) {
					result = "당신이 이겼습니다.";
					System.out.println(result);
				} else if (strComputer.equals("바위")) {
					result = "비겼습니다.";
					System.out.println(result);
				} else {
					result = "당신이 졌습니다.";
					System.out.println(result);
				}
			}
			
			//사람이 보인 경우
			if(strPerson.equals("보")) {
				//컴퓨터 : 가위, 바위, 보
				if(strComputer.equals("가위")) {
					result = "당신이 졌습니다.";
					System.out.println(result);
				} else if (strComputer.equals("바위")) {
					result = "당신이 이겼습니다.";
					System.out.println(result);
				} else {
					result = "비겼습니다.";
					System.out.println(result);
				}
			}
			
			//결과 출력
			System.out.println("----- 결과 -----");
			System.out.println(">>> " + result);
			System.out.println();
		}
	}

}
