package com.mystudy.pm;

import java.util.Arrays;

public class Ex04_array_copy_diff {

	public static void main(String[] args) {
		// 2���� �迭 ���� : 1���� �迭�� ũ�Ⱑ �ٸ� ��
		int[][] nums = {{10,20}, {30,40,50}, {60}};
		
		//
		int[][] dest = new int[nums.length][];
//		dest[0] = new int[nums[0].length];
//		dest[1] = new int[nums[1].length];
//		dest[2] = new int[nums[2].length];
		
		//�ݺ������� ����(�ǽ�)
		for(int i=0; i<nums.length; i++) {
			dest[i] = new int[nums[i].length];
		}
		printArrData(dest);
		
		//����(nums) -> ���纹(dest) ����
				

		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				dest[i][j] = nums[i][j];
			}
		}
	
		//���� �� �� üũ����
		
		printArrData(dest);
	} //main �Լ�
	static void printArrData(int[][] arr) {
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}
}
