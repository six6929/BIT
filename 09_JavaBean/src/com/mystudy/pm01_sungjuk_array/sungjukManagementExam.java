package com.mystudy.pm01_sungjuk_array;

import java.util.Arrays;

public class sungjukManagementExam {

	public static void main(String[] args) {
	//2차원 배열을 사용한 성적 처리
		//실습문제. 
		//  국어, 영어, 수학 점수 3개를 저장한 2차원 배열(sungjuk) 만들고
		//  성적을 입력하고 개인별 총점과 평균을 계산 하여 화면에 데이터 출력
		/*
			국어	 영어	  수학	  총점	       평균
			-------------------------------------
			100  90  80  270   90.0
			100  90  81  271   90.33
			100  90  80  270   90.0
			-------------------------------------
		*/
		
		int[][] score = {
				{100,90,80},
				{100,90,81},
				{100,90,80}
		};
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0; 
		double avg1 = 0;
		double avg2 = 0;
		double avg3 = 0;
		System.out.println("국어   영어   수학   총점     평균");
		System.out.println("------------------");
		for(int j=0; j<score.length; j++ ) {
			for(int i=0; i<score[j].length; i++) {
				if(i == 0) {
					sum1 += score[i][j];
				} else if (i == 1){
					sum2 += score[i][j];
				} else {
					sum3 += score[i][j];
				}
				System.out.print(score[j][i]+ " ");
			} 
			System.out.println();
			avg1 = sum1 /score[j].length;
			avg2 = (sum2 * 100) /score[j].length / 100.0;
			avg3 = sum3 /score[j].length;
		}

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(avg1);
		System.out.println(avg2);
		System.out.println(avg3);
		System.out.println("------------------");
		
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		double korAvg = 0;
		double engAvg = 0;
		double mathAvg = 0;
		for(int j=0; j<score.length; j++ ) {
			for(int i=0; i<score[j].length; i++) {
				if(j == 0) {
					korTotal += score[i][j];
				} else if (j == 1){
					engTotal += score[i][j];
				} else {
					mathTotal += score[i][j];
				}
			} 
			System.out.println();
			korAvg = (korTotal * 100) /score[j].length / 100.0;
			engAvg = (engTotal * 100) /score[j].length / 100.0;
			mathAvg = (mathTotal * 100) /score[j].length / 100.0;
		}
		
		System.out.println(korTotal);
		System.out.println(engTotal);
		System.out.println(mathTotal);
		System.out.println(korAvg);
		System.out.println(engAvg);
		System.out.println(mathAvg);


	}

}
