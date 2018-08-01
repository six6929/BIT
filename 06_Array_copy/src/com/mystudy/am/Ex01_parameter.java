package com.mystudy.am;

public class Ex01_parameter {
	public static void main(String[] args) {
		//�Ķ���� ���� ������ ��
		//1. ���� ���޵Ǵ� ��� : �⺻������ Ÿ��
		//2. �ּҰ��� ���޵Ǵ� ��� : ������ ������ Ÿ��
		//   ������ ������ Ÿ���� ���޹޾� ���� ����� ������������ ���� �����
		int num = 100;
		int[] arr = {100,200,300};
		
		System.out.println("���� num : " + num);
		changeData(num);
		System.out.println("changeData���� �� num : " + num);
		
		System.out.println("--- ������ ������ ���� ---");
		System.out.print("�����迭 arr : ");
		printData(arr);
		
		changeData(arr);
		
		System.out.print("changeData ������ arr : ");
		printData(arr);
		

	}
	
	//�޼ҵ� �����ε�(method overloading)
	//�ϳ��� Ŭ���� ���� ������ ������ �޼ҵ������ �Ķ���͸� �ٸ��� �����Ͽ� 
	//������ �޼ҵ������ �ٸ��� �����ϵ��� ó������
	static void changeData(int intValue) {
		System.out.println(">> ���޹��� int : " + intValue);
		intValue = 999;
		System.out.println(">> ���޹��� int : " + intValue);	
	}
	
	static void changeData(int[] intArr) {
		System.out.print(">> ���޹��� int�迭 : ");
		printData(intArr);
		
		//�迭�� ����
		intArr[0] = 999;
		System.out.print(">> ���� �� int�迭 : ");
		printData(intArr);
	}
	
	static void printData(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
