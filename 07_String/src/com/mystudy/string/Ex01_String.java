package com.mystudy.string;

import java.util.Arrays;

public class Ex01_String { //Ex01String으로 보통 사용

	public static void main(String[] args) {
		// 문자열 처리 : String 클래스
		// String 클래스 사용 형식 2가지
		// String str = "홍길동"; // 기본 데이터 타입처럼 사용
		// String str = new String("홍길동"); //객체 생성 사용
		String str1 = "Java";
		String str2 = "World";
		String strObj1 = new String("Java");
		String strObj2 = new String("World");
		System.out.println("str1 : " + str1);
		System.out.println("strObj1 : " + strObj1);
		
		String str11 = "Java";
		String str22 = "World";
		
		//== : 참조값 비교(객체 비교)
		if(str1 == str11) {
			System.out.println("str1 == str11 : " + (str1 == str11));
			System.out.println("str1 : " + str1);
			System.out.println("str11 : " + str11);
			
			
			System.out.println("--- str1 vs 객체생성 strObj1 ---");
			System.out.println("str1 == strObj1: " + (str1 == strObj1));
			System.out.println("str1 : " + str1);
			System.out.println("strObj1 : " + strObj1);
			
			//equals : value(값) 저장하고 있는 문자열 값 비교
			System.out.println("--- equals 비교 ---");
			System.out.println("str1.equals(strObj1) : " + str1.equals(strObj1));
			System.out.println("str11.equals(strObj1) : " + str11.equals(strObj1));
			System.out.println("str1.equals(str11) : " + str1.equals(str11));
			
			//-------------------------------
			String strObj21 = new String("Java");
			String strObj22 = new String("Java");
			System.out.println("strObj21 == strObj22 : " + (strObj21 == strObj22));
			System.out.println("strObj21.equals(strObj22) : " + strObj21.equals(strObj22));
			
			///////////////////////////////////////
			System.out.println("===========================");
			System.out.println("--- concat() ---");
			String a = "Hello";
			String b = "Java";
			String c = "World";
			System.out.println("a + b + c : " + (a + b + c));
			
			System.out.println("a.concat(b).concat(c) : " + a.concat(b).concat(c)); // chainning 기법(체이닝 기법)
			
			
			System.out.println("--- charAt() ---");
			String d = "Java World";
			System.out.println("d : " + d);
			char ch = d.charAt(0); //리턴 값을 저장하려면 리턴타입과 동일한 변수에 저장
			System.out.println("d.charAt(0) : " + d.charAt(0));
			
//			char[] ch2 = {d.charAt(0), d.charAt(1), d.charAt(2)};
			char[] ch2 = new char[4];
			for(int i=0; i<ch2.length; i++) {
				ch2[i] = d.charAt(i);
			}
			System.out.println(Arrays.toString(ch2));// [J, a, v, a]
			
			//compareTo 앞에께 더 크면 양수, 같으면 0, 뒤에께 더 크면 음수 
			System.out.println("----- compareTo() -----");
			System.out.println("java vs java : " + "java".compareTo("java"));
			System.out.println("aaa vs bbb : " + "aaa".compareTo("bbb"));
			System.out.println("ccc vs aaa : " + "ccc".compareTo("aaa"));
			
			
			System.out.println("--- copyValueOf() ---");
			char[] ch3 = {'a', 'b', 'c', 'd'};
			String str3 = String.copyValueOf(ch3);
			System.out.println(Arrays.toString(ch3));
			
			System.out.println(str3.startsWith("abd")); //str3의 문자열이 bc로 시작하는지 묻는 구문 startsWith // 시작 문자열 여부 확인
			
			
			//////////////////////////////////////////
			
			
			
			
			
			
		}
		

	}

}
