package com.mystudy.am;

public class Ex02_array2 {

	public static void main(String[] args) {
		// 1~100������ �� �߿� Ȧ���� �� ���ϱ�(�迭���)
		
		// ����1. �迭�� ������� 50�� ���
		// ������������ int Ÿ���� ���� ������ �� �ִ� ũ�� 50�� �迭 ����
		// 1~100 ���� �� Ȧ������ �迭�� ����
		// �迭�� ����� ���� ��� ���� �� ��� ���
		
		//��������
		int[] odd = new int[50];
		int sum = 0;
		for(int i=0; i<odd.length; i++) {
			odd[i] = i * 2 + 1; //1, 3, 5, 7, 9
		}
		
		//�迭�� ���
		for(int i=0; i<odd.length; i++) {
			System.out.println("�ε��� : " + i + " �� : " + odd[i] + " ");
		}
		System.out.println();
		
		//�迭�� ���� sum�� �ջ��ؼ� ���
		//1~100���� ���� �� Ȧ�� �հ� : ?
		
		for(int i=0; i<odd.length; i++) {
			sum += odd[i];
		}
		System.out.println("1~100���� ���� �� Ȧ�� �հ� : " + sum);
		
		//////////////////////////////
		//1~100������ �� �߿��� Ȧ���� �� ���ϱ�(�迭���)
		//1~100������ ���ڸ� �迭�� ����
		//1. �迭����
		//2. �迭 �ʱ�ȭ
		//3. �迭 �� �� Ȧ�� �� �����ؼ� �ջ�
		
		System.out.println("====================================================");
		//Ȧ�������� ��
		//1. �迭����(int Ÿ���� �� 100�� ����)
		int[] num = new int[100];
		System.out.println("nums�� ũ�� : " + num.length);
		
		System.out.println("-----------------------");
		
		//2-1. �Էµ� �� Ȯ��
		for (int i=0; i<num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		//3. �迭 �� �� Ȧ�� �� �����ؼ� �ջ�
		sum = 0;
		for (int i=0; i<num.length; i+=2) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println();
		System.out.println("Ȧ�� �� : " + sum);
		
		
		
		System.out.println("=================");
		sum = 0;
		for (int i=0; i<num.length; i++) {
			if(num[i] % 2 == 1) {
				sum += num[i];
			}
		}
		System.out.println("Ȧ�� �� : " + sum);
		
		//�迭�� �ִ� �� �� ¦���� ¦������ �ջ�, Ȧ���� Ȧ������ �ջ��ؼ� ��� ���
		
		int oddSum = 0;
		int evenSum = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i] % 2 == 1) {
				oddSum += num[i];
			} else {
				evenSum += num[i];
			}
		}
		System.out.println("Ȧ�� �� : " + oddSum);
		System.out.println("¦�� �� : " + evenSum);
		

	}
	
}


