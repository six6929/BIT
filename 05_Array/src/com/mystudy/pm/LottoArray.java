package com.mystudy.pm;

public class LottoArray {

	public static void main(String[] args) {
		//���� �� ���ڸ� ����� 
		//Math.random() : 0.0 <= ���ϰ� < 1
		//0.0 * 10 <= ���� <= 0.9999 * 10 = 0.00 ~ 9.9999999
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		
		for(int i=0; i<100; i++) {
			System.out.print((int)(Math.random() * 45) + " "); // 0~44������ ���ڰ� ����
		}
		
		System.out.println();
		System.out.println("=====================");
		///////////////////////////
		//�ζ� �����
		//1. ������ 45���� ������ �� �ִ� �迭 ����
		int lotto[] = new int[45];
		
		//2. ���� 1~45�� �迭�� ����
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i + 1;
		}
		printArray(lotto);
		
		int rNum; // 0~44������ ���ڸ� ������ �뵵
		int temp; 
		
		for(int i=0; i<10000; i++) {
			rNum = (int)(Math.random() * 45); //0~44 ���� �߻�
//			System.out.println("rNum : " + rNum);
			//lotto[0] <-> lotto[loc]
			temp = lotto[0];
			
			lotto[0] = lotto[rNum];
			lotto[rNum] = temp;
		}
		
		printArray(lotto);
		
		//�ζǹ�ȣ���� : �� �տ��� 6�� ����
		System.out.println("<�ζǹ�ȣ ��÷ ���>");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		
	}
	

	static void printArray(int[] lotto) {
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}
