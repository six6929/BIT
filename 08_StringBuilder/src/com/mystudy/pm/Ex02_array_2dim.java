package com.mystudy.pm;

import javax.print.attribute.standard.NumberUpSupported;

public class Ex02_array_2dim {

	public static void main(String[] args) {
		// 2���� �迭
		/* ���� �� ��ü ����
		 Ÿ��[][] ������ = new Ÿ��[2����ũ��][1����ũ��];
		 Ÿ�� ������[][] = new Ÿ��[][] {{...}, {...}, {������}}
		 Ÿ��[][] = {{...}, {...}, {...}, {..}}
		 */
		int[][] nums = {{10, 20}, //10 : [0][0], 20 : [0][1]
						{30, 40}, //30 : [1][0], 40 : [1][1]
						{50, 60}, //50 : [2][0], 60 : [2][1]
						{70, 80},  //70 : [3][0], 80 : [3][1]
						{90,100,110} //90 : [4][0], 100 : [4][1], 110 : [4][2]
						};
		System.out.println("nums : " + nums);
		System.out.println("nums[0] : " + nums[0]);
		System.out.println("nums[0][0] : " + nums[0][0]);
		System.out.println("--------------------");
		System.out.println("nums.length : " + nums.length);
		System.out.println("nums[0].length : " + nums[0].length);
		System.out.println("nums[4].length : " + nums[4].length);
		
		System.out.println("-----------------------");
		System.out.println(nums[0][0]);
		System.out.println(nums[0][1]);
		
		System.out.println("----2�����迭�� ù��° �迭�� ��� ----");
		
		System.out.println("nums[0].length : " + nums[0].length);
		for (int i=0; i<nums[0].length; i++) {
			System.out.println(nums[0][i]);
		}
		for (int i=0; i<nums[1].length; i++) {
			System.out.println(nums[1][i]);
		}
		
		System.out.println("---- 2���� �迭 ��ü ��� ---");
		
		for(int k=0; k<nums.length; k++) {
			for (int i=0; i<nums[k].length; i++) {
				System.out.print(nums[k][i] + " ");
			}
			System.out.println();
		}
		//--------------------------------------------
		//2������ �迭 ����
		int[][] copyNum = new int[nums.length][];
	}
}
