package com.mystudy.pm;

import java.util.StringTokenizer;

public class Ex05_StringControlExam {

	public static void main(String[] args) {
		/* 문자열 다루기
		0.문자열 데이터
		  String str1 = "홍길동 이순신   이순신 Tom 홍길동"
		  String str2 = "     TOM    을지문덕 김유신 연개소문"
		1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		2. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력
		   (String.split() 또는 StringTokenizer 사용)
		3. 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		   (출력예: 홍길동,이순신,이순신,Tom,홍길동,TOM,을지문덕,김유신,연개소문)
		4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		   (예: 홍,이,이,T,홍,T,을,김,연) 
		5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		       출력예: 
		   6:을지문덕
		   8:연개소문
		********************************/
		String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		String str2 = "     TOM    을지문덕 김유신 연개소문";
		//"홍길동 이순신   이순신 Tom 홍길동 	TOM		을지문덕 김유신 연계소문"
		
		//1번
	
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str2);
		StringBuilder sb = sb1.append(sb2);
		System.out.println("1번의 답 : " +  sb);
		
		
		//2번
		System.out.println("=============2번 답================");
		String str = new String(sb); //StringBuilder의 값을 String으로 전환
		StringTokenizer sbToken = new StringTokenizer(str, " ");
		System.out.println("저장된 토큰의 갯수 : " + sbToken.countTokens());
		while(sbToken.hasMoreTokens()) {
			String token = sbToken.nextToken();
			System.out.print(token + " ");
		}
		System.out.println();
		
		//3번
		System.out.println("============3번 답================");
		str = new String(sb);
		System.out.println(sb.toString());
		sbToken = new StringTokenizer(str, " ");
		System.out.println("저장된 토큰의 갯수 : " + sbToken.countTokens());
		while(sbToken.hasMoreTokens()) {
			String token = sbToken.nextToken();
			System.out.print(token + ",");
		}
		System.out.println();
		
		//4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		//   (예: 홍,이,이,T,홍,T,을,김,연)
		sbToken = new StringTokenizer(str, " ");



	}

}
