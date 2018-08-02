package com.mystudy.am;

public class Ex04_Wrapper {

	public static void main(String[] args) {
		//Wrapper Class : 기본 데이터 타입을 기능확장해놓은 클래스 총칭
		//기본데이터 타입 : 전체 소문자, char, int
		//Wrapper Class : 기본 데이터 타입의 첫 글자 대문자. Character, Integer
		//char - Character, int - Integer
		int num = 100;
		System.out.println("num : " + num);
		
		Integer intNum = new Integer(100);
		intNum = new Integer("100");
		
		System.out.println("intNum : " + intNum);
		
		intNum = 900; // Integer <- int : 자동형변환
		num = intNum; // int <- Integer : 자동형변환
		
		System.out.println("정수형 int 최대값 : " + Integer.MAX_VALUE);
		System.out.println("정수형 int 최대값 : " + Integer.MIN_VALUE);
		
		num = Integer.parseInt("999"); // Int <- String
		intNum = Integer.valueOf("999"); //Integer <- String
		
		//-------------------------------------------
		System.out.println("---- Boolean ----");
		Boolean bool = true;
		bool = new Boolean(true);
		bool = new Boolean("true"); 
		System.out.println("bool : " + bool);
		bool = new Boolean("true1");
		System.out.println("bool : " + bool);
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		//String타입 -> Boolean
		//대소문자 구분없이 True처리 해준다.
		
		bool = Boolean.valueOf("true"); //true
		System.out.println(bool);
		bool = Boolean.valueOf("true1");
		System.out.println(bool);
		bool = Boolean.valueOf("True"); //true
		System.out.println(bool);
		bool = Boolean.valueOf("TRUE"); //true
		System.out.println(bool);
		
		
		//---------------------------------------------
		//Float
		Float f = 10.5f; // Float <- float
		f = new Float(12.5f);
		f = new Float("12.5f");
//		f = new Float("12.a5f"); runtime 오류발생 // 정확한 숫자타입이 와야만 출력가능
		System.out.println("12.a5f : " + f);

		
		String str = String.valueOf(f);  //String.valueOf() -> 괄호안에 있는 어떠한 타입을 String타입으로 바꿔준다.
		System.out.println(str);
		f = Float.valueOf(str);
		System.out.println(f);
		
		Double d = 10.5; //Double <-> double
		d = new Double(12.5);
		d = new Double("12.5d");
		d = Double.valueOf("12.5");
		System.out.println(d);
	}

}
