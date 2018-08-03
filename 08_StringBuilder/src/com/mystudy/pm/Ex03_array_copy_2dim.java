package com.mystudy.pm;

import java.util.Arrays;

public class Ex03_array_copy_2dim {

	public static void main(String[] args) {
		//1차원, 2차원 배열 복사
		//1차원 배열 복사
		int[] num1 = {10, 20, 30}; //1차원 배열 생성
		System.out.println("int[] num1 : " + num1);
		System.out.println(Arrays.toString(num1));
		
		int[] numcopy = num1; //주소값 복사로 동일한 객체를 참조함
		
		//40 숫자를 추가하려면 위의 배열에는 추가할 수가 없다
		int[] num2 = new int[num1.length + 1]; //40숫자를 추가하기 위한 새로운 변수에 저장공간 생성
		
		for(int i=0; i<num1.length; i++) {
			num2[i] =num1[i];
		}
		System.out.println(Arrays.toString(num2));
		num2[3] =40;
		System.out.println(Arrays.toString(num2));
		
		//----------------------------
		System.out.println("====================");
		int[][] num2dim = {{10,20}, {30,40}, {50,60}};
		
		//Q1 : 2차원 배열 num2dim 값을 화면에 출력

		for(int i=0; i<num2dim.length; i++) {
			for(int j=0; j<num2dim[i].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("-------------------------");
		//Q2 : num2dim에서 세번째 값인 30의 값을 100으로 변경하고 전체 화면 출력
		num2dim[1][0] = 100; 
		for(int i=0; i<num2dim.length; i++) {
			for(int j=0; j<num2dim[i].length; j++) {
				System.out.print(num2dim[i][j] + " ");
			}
		}
		
		
		System.out.println();
		System.out.println("==========================");
		//Q3 : num2dim와 동일한 형태의 배열 num2Copy를 선언하고 만드세요.
		int[][] num2Copy = new int[num2dim.length][num2dim[0].length]; // 같은저장공간을 형성
		
		//저장공간에 값들읇 복사
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
		
		
		//System.arraycopy 사용
		for(int i=0; i<num2Copy.length; i++) {
			System.arraycopy(num2dim[i], 0, num2Copy[i], 0, num2dim[i].length);
		}
		//복사 상태 체크
		num2Copy[0][0] = 999;
		//원본 출력
		System.out.println("원본출력 : ");
		printArrData(num2dim);
		System.out.println();
		System.out.println("복사본출력 : ");
		printArrData(num2Copy);
		
		System.out.println(Arrays.toString(num2Copy));
		
		//----------------------------------------------
		System.out.println("--- 배열.clone() 복사 ---");
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
