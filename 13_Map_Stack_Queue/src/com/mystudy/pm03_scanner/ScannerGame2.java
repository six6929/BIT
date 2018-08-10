package com.mystudy.pm03_scanner;

import java.util.Scanner;

public class ScannerGame2 {

	public static void main(String[] args) {
		// 컴퓨터가 랜덤으로 1~100까지 하나의 숫자 선택
		// 숫자입력 : ~~
		// 컴퓨터 : ~~그 숫자보다 크다
		// 숫자입력 : ~~~
		// 컴퓨터 : ~~~ 더 작다.
		// ...
		// 5번 기회 안에 성공하면 성공 // 실패하면 실패하면서 정답알려주기
		
		
		//컴퓨터가 랜덤으로 1~100까지 하나의 숫자 선택
		

		int rNum = 1;
		
		rNum = (int)(Math.random() * 100);
			int Cnt = 1;
			
		while(Cnt <= 5) {
			
			//숫자입력
			System.out.println("1~100까지 숫자 중 하나를 선택하세요.");	
			Scanner sc = new Scanner(System.in);
			int numSelect = (Integer.parseInt(sc.nextLine()));
			
			if(rNum > numSelect) {
				System.out.println(numSelect + "보다 큰 숫자입니다.");
			} else if (rNum < numSelect) {
				System.out.println(numSelect + "보다 작은 숫자입니다.");
			} else if (rNum == numSelect) {
				System.out.println("5번 안에 정답을 맞추었습니다.");
				return;
			} else if (numSelect < 0 || numSelect > 100) {
				System.out.println("1~100을 벗어난 숫자입니다.");
				continue;
			}
			Cnt++;
		}	
		System.out.println("5번 안에 정답을 맞히지 못하였습니다.");
	
			
		
			
			
	}

}
