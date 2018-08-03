package com.mystudy.pm;

import java.util.Arrays;

public class Ex03_array_copy_2dim {

	public static void main(String[] args) {
		//1����, 2���� �迭 ����
		//1���� �迭 ����
		int[] num1 = {10, 20, 30}; //1���� �迭 ����
		System.out.println("int[] num1 : " + num1);
		System.out.println(Arrays.toString(num1));
		
		int[] numcopy = num1; //�ּҰ� ����� ������ ��ü�� ������
		
		//40 ���ڸ� �߰��Ϸ��� ���� �迭���� �߰��� ���� ����
		int[] num2 = new int[num1.length + 1]; //40���ڸ� �߰��ϱ� ���� ���ο� ������ ������� ����
		
		for(int i=0; i<num1.length; i++) {
			num2[i] =num1[i];
		}
		System.out.println(Arrays.toString(num2));
		num2[3] =40;
		System.out.println(Arrays.toString(num2));
		
		//----------------------------
		System.out.println("====================");
		int[][] num2dim = {{10,20}, {30,40}, {50,60}};
		
		//Q1 : 2���� �迭 num2dim ���� ȭ�鿡 ���

		for(int i=0; i<num2dim.length; i++) {
			for(int j=0; j<num2dim[i].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("-------------------------");
		//Q2 : num2dim���� ����° ���� 30�� ���� 100���� �����ϰ� ��ü ȭ�� ���
		num2dim[1][0] = 100; 
		for(int i=0; i<num2dim.length; i++) {
			for(int j=0; j<num2dim[i].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		
		
		System.out.println();
		System.out.println("==========================");
		//Q3 : num2dim�� ������ ������ �迭 num2Copy�� �����ϰ� ���弼��.
		int[][] num2Copy = new int[num2dim.length][num2dim[0].length]; // ������������� ����
		
		//��������� ���韽 ����
		for(int i=0; i<num2dim.length; i++) {
			for(int j=0; j<num2dim[i].length; j++) {
				num2Copy[i][j] = num2dim[i][j];
				System.out.print(num2Copy[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("================================");
		printArrData(num2Copy);
		System.out.println();
		
		
		//System.arraycopy ���
		for(int i=0; i<num2Copy.length; i++) {
			System.arraycopy(num2dim[i], 0, num2Copy[i], 0, num2dim[i].length);
		}
		//���� ���� üũ
		num2Copy[0][0] = 999;
		//���� ���
		System.out.println("������� : ");
		printArrData(num2dim);
		System.out.println();
		System.out.println("���纻��� : ");
		printArrData(num2Copy);
		
		System.out.println(Arrays.toString(num2Copy));
		
		//----------------------------------------------
		System.out.println("--- �迭.clone() ���� ---");
		int[][] num2clone = num2Copy.clone();
		System.out.println(Arrays.toString(num2Copy));
		System.out.println(Arrays.toString(num2clone));
		printArrData(num2Copy);
		System.out.println();
		printArrData(num2clone);


	}
	static void printArrData(int[][] arr) {
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}
	//--------------------------------------------
	
}
