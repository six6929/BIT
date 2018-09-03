package com.mystudy.io4_printwriter;

import java.util.Calendar;

public class printf_Exam {

	public static void main(String[] args) {
		int a = 20;
		long b = 3000000000L;
		float c = 34.95f;
		double d = 234.234;
		char e = 'A';
		String f = "Hello~";
		boolean g = false;
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.printf("%tF\n", today);
		
		System.out.println(">> " +a +" "+ b +" "+ c +" "+ d +" "+ e +" "+ f +" "+ g);
		
		/* []생략가능항목
		 %[인덱스]$[+|-][크기]형식문자 : %, 형식문자 필수 
		 - 기본은 우측정렬
		 - 좌측정렬 예 : %-10d
		 */
		//퍼센트와 역슬래시는 한개씩 더 써주면됨.
		
		System.out.printf("\\ %% %n\n");
		System.out.printf("%d %d %f %f %c %s %b %n", a,b,c,d,e,f,g);
		
		//[인덱스]$ 사용예
		System.out.printf("%d %d %c %s \n", 65, 65, 'A' , "Hello Java");
		System.out.printf("%1$d %1$d %c %s \n", 100, 'A' , "Hello Java");
		System.out.printf("%1$d %1$d %2$c %1$d %3$s \n", 100, 'A' , "Hello Java");
	
		System.out.println("--- 실수형 데이터 출력 ---");
		System.out.printf("%f %1$a %1$e %1$f %1$g\n", 65.841243234234);
		
		System.out.println("--- 날짜 관련 ---");
		System.out.printf("%1$tm %1$te %1$tY %1$tF %1$tB %1$th \n", today);
	
		System.out.printf("%1$ty %1$tm %1$te \n", today);
		System.out.printf("%1$tI %1$tM %1$tS %1$ta \n", today);
		
		//폭지정
		System.out.println("--- 폭(width) 지정 ---");
		System.out.printf("%1$20f \n", 5678.1234568791);
		System.out.printf("%1$-20f \n", 5678.1234567891);
		System.out.printf("%1$-20.10f \n", 5678.1234567891);
		
		System.out.println("----------------------");
		System.out.printf("%10s %10d %10d %10d", "홍길동", 100, 90, 80);
	}

}
