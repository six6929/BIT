package com.mystudy.am02_myexception;

//���� ����� : Exception Ŭ������ ��� �޾Ƽ� �����
public class MyException extends Exception {
	MyException() { //default ������
		super(">> ���� ���� Exception"); //�θ�Ŭ������ ������ ȣ��(���ܸ޽���)
	}
	
	MyException(String msg) {
		super(">>���� ���� Exception : " + msg);
	}
}
