package com.mystudy.am01_random;

import java.util.Calendar;
import java.util.Random;

public class RandomExam03 {

	public static void main(String[] args) {
		//실습 : Calendar, Math,random(), Random사용
		//오늘 날짜 당신의 행운지수(0~100)
		//Calender 클래스 이용해서 오늘 날짜 구하고, 
		//Math.random(), Random 클래스 이용해서 행운지수 값
		//실행결과
		//2018년 8월 30일 당신의 행운지수(0~100)는 ??입니다.
		
		
		//오늘 날짜 값(년, 월, 일) 구하기
		//월을 셀 때 0~11까지 셈
		
		Calendar cal= Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//		System.out.println(cal.get(Calendar.AM_PM));
		//행운지수 값 만들기
		Random ran = new Random();
		
		int num = 0;
		num = (int)(Math.random() * ran.nextInt(101));
//		System.out.println(num);
		
		//결과출력
		System.out.println(year + "년" + month + "월" + date + "일"+ "\n당신의 행운지수(0~100)은 " + num + "입니다.");
	}

	
}
