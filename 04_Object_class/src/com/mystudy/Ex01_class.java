package com.mystudy;

public class Ex01_class {
	int num; //필드(멤버변수, 인스턴스 변수), 속성(property, attribute)
	static int staticNum; //클래스변수, 스태틱(static)변수, 인스턴스 공통 변수 
	
//	public Ex01_class() {}

	public static void main(String[] args) {
		 int num1 = 200;
		 System.out.println("num1 : " + num1);
		 int num2 = 100;
		 int result = 0;
		 result = num1 + num2;
		 System.out.println("result : " + result);
		 System.out.println("--------------------");
		 
		 
		 result = add(num1, num2);  // add안에 있는 num1, num2를 매개변수라고 부름
		 //num1과 num2 인자라함(argument)
		 System.out.println("result : " + result);
		 System.out.println("--------------------");
		 
		 //////////////////////////////////////////
		 //객체 생성(인스턴스 생성) 
		 //클래스타입명 변수명;
		 //변수명 = new 클래스생성자();
		 //클래스타입명 변수명 = new 클래스생성자();
		 Ex01_class ex01 = new Ex01_class(); //기본생성자로 객체생성
		 result = ex01.add(num1,num2);
		 ex01.num = 1000;
		 System.out.println("ex01.num : " + ex01.num);
		 
		 //Cannot make a static reference to the non=static field num
//		 num = 2000;
		 
		 
//		 result = sub(num1, num2); 메소드에 static이 붙어있지 않으므로 참조할 수가 없다.???
		 
		 //static 메소드에서 non-static 메소드 사용
		 //생성된 객체를 통해서만 접근 가능
		 result = ex01.sub(num1, num2);
		 System.out.println("ex01.sub(num1, num2) : " + result);
		 System.out.println("ex01 : " + ex01);
	}
	
	
	//메소드 형태
	//return타입 메소드명 () {}
	//return타입 메소드명(파라미터타입 파라미터형, ...) {}
	
	
	
	//2개의 정수값을 전달 받아서 2개의 정수값을 더한 결과를 되돌려줌
	public static int add(int a, int b) { // add라는 메소드를 선언
		// add의 메소드의 리턴 타입을 int로 부여
		// int a, int b를 파라미터(parameter)라고 명칭
		
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}

}
