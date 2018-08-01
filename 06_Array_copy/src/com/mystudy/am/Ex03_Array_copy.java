package com.mystudy.am;

public class Ex03_Array_copy {

	public static void main(String[] args) {
		// 1���� �迭 ����
		int[] num1 = {10, 20, 30, 40, 50};
		int[] num2 = new int[num1.length]; //num1�� ������ ũ���� �迭 ����
		
		System.out.println("--- �迭�� �ʱⰪ Ȯ�� ---");
		System.out.print("num1 �迭�� : " );
		printData(num1);
		System.out.print("num2 �迭�� : " );
		printData(num2);
		
		System.out.println("--- �ּҰ� ���� ����(���� ����) ---");
		num2 = num1; // num1 ��ü�� �ִ� �ּҰ��� num2�� ����
		printData("num1", num1);
		printData("num2", num2);
		
		
		System.out.println("--- num2�� �ּҰ� ���� ���� ---");
		num2[0] = 999;
		printData("num1", num1);
		printData("num2", num2);
		
		System.out.println("=== �迭�� ���� ���� (num1 -> num3) ===");
		int[] num3 = new int[num1.length];
		printData("num1", num1);
		printData("num3", num3);
		
		System.out.println(">> �� ���� �۾� ������");
		//num1[0] -> num3[0]
		for(int i=0; i<num1.length; i++) {
			num3[i] = num1[i];
		}
		printData("num1", num1);
		printData("num3", num3);
		
		System.out.println("--- num3�� ���� ���� �� Ȯ�� ---");
		num3[0] = 444;
		printData("num1", num1);
		printData("num3", num3);
		
		System.out.println("=============================");
		System.out.println("--- System.arraycopy() ---");
		//System.arraycopy(src, srcPos, dest, destPos, length)
		
		int[] arr = {100, 200, 300, 400, 500};
		int[] arr2 = new int[arr.length];
		printData("arr", arr);
		printData("arr2", arr2);
		
		System.out.println(">> System.arraycopy() ���� �� -----");
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		printData("arr", arr);
		printData("arr2", arr2);
		
		System.out.println("--- arr2 �� ���� �� ---");
		arr2[0] = 999;
		printData("arr", arr);
		printData("arr2", arr2);
		
		//-------------------------
		//arr 2��°���� 3���� arr3�� ����
	}
	
	static void printData(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	static void printData(String name, int[] num) {
		System.out.print(name + " : ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
}
