package com.mystudy.am;

public class Ex03_array3 {

	public static void main(String[] args) {
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 */
		//////////////
		//char 타입의 데이터 5개를 저장할 수 있는 배열을 만들고 출력
		//배열의 변수명 : ch
		
		char ch[] = new char[5];
		for(int i=0; i<ch.length; i++) {
			ch[i] = '*';
			for(int j=0; j<=i; j++) {
				System.out.print(ch[i]);				
			}
			System.out.println();
		}
		
		char ch1[] = new char[5];
		for(int i=0; i<ch.length; i++) {
			ch[i]= '*';
			for(int j=5; j-i>0; j--) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}

		//방법1 배열 전체에 '*'로 채우고 선택적으로 출력
		//*
		//**
		char[] ch2 = new char[5];
		for (int i=0; i<ch2.length; i++) {
			ch2[i] = '*';
		}
		
		for (int i=0; i<ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		
		System.out.println("--------------");
		for (int starCnt=1; starCnt<=5; starCnt++) {
			for (int i=0; i<starCnt; i++) {
				System.out.print(ch2[i]);
			}
			System.out.println();
		}
		
		System.out.println("========================");
		//방법2 순차적으로 '*'를 넣으면서 배열값 전체 출력
		//*
		//**
		//***
		//첫번째 위치에 '*' 입력후 전체 출력
		//두번째 위치에 '*' 입력후 전체 출력
		
		char[] stars = new char[5];
		stars[0] = '*';
//		
		for (int i=0; i<stars.length; i++) {
			stars[i] = '*';
			printArray(stars);
		}
	}
	
	
	
	static void printArray(char[] stars) {
		for(int i=0; i<stars.length; i++) {
			System.out.print(stars[i]);
		}
		System.out.println();
	}
}
