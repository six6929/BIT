package com.mystudy.am;

import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		// String.split() vs StringTokenizer
		System.out.println("--- String.split() ---");
		String str = "사과,배,복숭아,,포도";
		System.out.println("str : " + str);
		String[] strSplit = str.split(",");
		System.out.println("--- str.split(\",\") 결과 ---");
		for(int i=0; i<strSplit.length; i++) {
			System.out.println(strSplit[i] + "-");
		}
		System.out.println();
		
		//개선된 for문
		//for (데이터타입 변수명 : 집합객체) {} //전체데이터를 일괄처리할 때!!
		for(String str2 : strSplit) {
			System.out.println(str2 + "-");
		}
		System.out.println();
		System.out.println("배열에 저장된 데이타터 갯수 : " + strSplit.length);
		System.out.println("=========================");
		System.out.println("--- StringTokenizer 사용 ----");
		System.out.println("str : " + str); //"사과,배,복숭아,,포도"
		
		StringTokenizer strToken = new StringTokenizer(str, ",");
		System.out.println("저장된 토큰 갯수: " + strToken.countTokens());
		
		while(strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.print(token + " - ");
		}
		System.out.println();
		System.out.println("저장된 토큰 갯수: " + strToken.countTokens());
		
		//String.split은 빈문자열도 포함하지만 
		//StringTokenizer는 빈문자열은 포함하지 않는다,
		
		System.out.println("---- for문 사용 ------");
		strToken = new StringTokenizer(str, ",");
		System.out.println("저장된 토큰 갯수 : " + strToken.countTokens());
		int tokenCnt = strToken.countTokens();
		for(int i=0; i<tokenCnt; i++) {
			String token = strToken.nextToken();
			System.out.println((i+1) + " : " + token);
		}
		System.out.println();
		
		System.out.println("---- while문 사용 ----");
		//실습 : 위의 결과 값과 동일하게 while문으로 사용
		
		
		strToken = new StringTokenizer(str, ",");
		System.out.println("저장된 토큰 갯수는 : " + strToken.countTokens());
		int i=0;
		while(strToken.hasMoreTokens()) {
			System.out.println((i+1) + " : " + strToken.nextToken());
			i++;
		}
		System.out.println();
	}

}
