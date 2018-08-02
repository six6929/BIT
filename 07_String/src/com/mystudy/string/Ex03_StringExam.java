package com.mystudy.string;

public class Ex03_StringExam {

	public static void main(String[] args) {
		/* 문자열 주민번호 처리
		String str = "900108-1234567"; // 주민번호
		문제1. 정확히 입력이 된 데이터인지 확인 
			(전체자리수 14, '-' 위치 : 7번째)
			
		문제2. 생년월일 출력
		문제3. 성별확인하고 출력(1,3 : 남성, 2,4 : 여성)
		문제4. 데이터 값 검증
			  (월 : 1~12, 일 : 1~31)
		참고 : int num = Integer.parseInt("12"); // "12" -> 12
		*/
		
		String str = "900108-1234567";
		//문제1. 정확히 입력이 된 데이터인지 확인
		System.out.println("--- 문제1 ---");
		System.out.println(str.length());
		System.out.println(str.indexOf("-")+1);
		
		System.out.println("==================");
		if(str.length() == 14) {
			System.out.println(str.length() + "자리 정상입니다.");
		} else {
			System.out.println("주민번호가 모두 입력되지 않았습니다.");
		}
		
		if(str.indexOf("-") == 7) {
			System.out.println(str.indexOf("-"));
		} else {
			System.out.println("정확하게 입력되지 않았습니다.");
			System.out.println(str.indexOf("-")+1);
		}
		
		System.out.println();
		
		//문제2. 생년월일 출력
		System.out.println("--- 문제2 ---");
		
		//2-1. 생년값 추출
		System.out.println("생년 : " + str.substring(0,2));
		String year = str.substring(0,2);
		//2-2. 생월값 추출
		System.out.println("생월 : " + str.substring(2,4));
		String month = str.substring(2,4);
		//2-3. 생일값 추출
		System.out.println("생일 : " + str.substring(4,6));
		String day = str.substring(4,6);
		//2-4 생년월일 출력(00년 00월 00일 출생)
		System.out.println(year + "년 " + month + "월 " + day + "일 출생");
		System.out.println(year.concat(month).concat(day));
		
		
		//문제3. 성별확인하고 출력(1,3 : 남성, 2,4 : 여성)
		System.out.println("--- 문제 3 ----");
		//3-1. 주민번호에서 '-' 다음의 숫자를 추출
		char[] ch = str.toCharArray();
		System.out.println("주민번호에서 '-' 다음의 숫자 : " + ch[7]);
		//3-2. 성별 숫자 값과 비교 후 출력

		if(ch[7] == '1' || ch[7] == '3') {
			System.out.println("남성");
		} else if(ch[7] == '2' || ch[7] == '4'){
			System.out.println("여성");
		} else {
			System.out.println("[예외] 성별값이 1~4가 아닙니다.");
		}
		

		//문제4. 데이터 값 검증
		System.out.println("--- 문제 4 ----");
		//		(월 : 1~12, 일 : 1~31)
		//4-1. 주민번호의 3~4번째 숫자 값 추출하고 1~12 범위의 값인지 확인(if문 사용)
		int month1 = Integer.parseInt(str.substring(2,4));
		System.out.println("주민번호의 3~4번째 값 : " + str.substring(2,4));
		System.out.println(month1);
		if(month1 >= 1 && month1 <= 12) {
			System.out.println(month1 + ", 1~12 범위의 안에 있습니다");
		} else {
			System.out.println("1~12 범위를 벗어났습니다.");
		}
		//4-2. 주민번호의 5~6번째 숫자 값 추출하고 1~31 범위의 값인지 확인(if문 사용)
		System.out.println("주민번호의 5~6번째 값 : " + str.substring(4,6));
		int day1 = Integer.parseInt(str.substring(4,6));
		System.out.println(day1);
		if(day1 >= 1 && day1 <= 31) {
			System.out.println(day1 + ", 1~31 범위의 안에 있습니다.");
		} else {
			System.out.println("1~31 범위를 벗어났습니다.");
		}

		
//		System.out.println("주민번호의 3~4번째 값 : " + str.substring(2,4));
//		System.out.println("주민번호의 5~6번째 값 : " + str.substring(4,6));
//		int month2 = Integer.parseInt(str.substring(2,4));
//		int day2 = Integer.parseInt(str.substring(4,6));
//		int num = 0;
//		
//		if(month2 == 1 || month2 == 3 || month2 == 5 || month2 == 7 || month2 == 8 || month2 == 10 || month2 == 12) {
//			if(day2 == 31) {
//				System.out.println("월과 일을 알맞게 입력하셨습니다.");
//			} else {
//				System.out.println("월과 일을 다시 입력하세요.");
//			}
//		} else if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11){
//				if(day2 == 30) {
//					System.out.println("월과 일을 알맞게 입력하셨습니다.");
//				} else {
//				System.out.println("월과 일을 다시 입력하세요.");
//				} 
//		} else {
//			System.out.println(" 월과 일을 알맞게 입력하셨습니다.");
//		}
//	
//	}
	}
}
