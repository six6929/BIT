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
		//char Ÿ���� ������ 5���� ������ �� �ִ� �迭�� ����� ���
		//�迭�� ������ : ch
		
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

		//���1 �迭 ��ü�� '*'�� ä��� ���������� ���
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
		//���2 ���������� '*'�� �����鼭 �迭�� ��ü ���
		//*
		//**
		//***
		//ù��° ��ġ�� '*' �Է��� ��ü ���
		//�ι�° ��ġ�� '*' �Է��� ��ü ���
		
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
