package com.mystudy.pm;

import java.util.Arrays;

public class Ex04_array_copy_diff {

	public static void main(String[] args) {
		// 2차원 배열 복사 : 1차원 배열의 크기가 다를 때
		int[][] nums = {{10,20}, {30,40,50}, {60}};
		
		//
		int[][] dest = new int[nums.length][];
//		dest[0] = new int[nums[0].length];
//		dest[1] = new int[nums[1].length];
//		dest[2] = new int[nums[2].length];
		
		//반복문으로 변경(실습)
		for(int i=0; i<nums.length; i++) {
			dest[i] = new int[nums[i].length];
		}
		printArrData(dest);
		
		//원본(nums) -> 복사복(dest) 복사
				

		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				dest[i][j] = nums[i][j];
			}
		}
	
		//복사 후 값 체크까지
		
		printArrData(dest);
	} //main 함수
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
