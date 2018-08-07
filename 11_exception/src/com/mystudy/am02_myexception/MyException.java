package com.mystudy.am02_myexception;

//예외 만들기 : Exception 클래스를 상속 받아서 만들기
public class MyException extends Exception {
	MyException() { //default 생성자
		super(">> 내가 만든 Exception"); //부모클래스의 생성자 호출(예외메시지)
	}
	
	MyException(String msg) {
		super(">>내가 만든 Exception : " + msg);
	}
}
