package com.mystudy.am02_myexception;

public class MyExceptionTest {

	public static void main(String[] args) {
		System.out.println("--- main() ���� ----");
		
		try {
			firstMethod();
		} catch (MyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(">> main-catch : ");
			System.out.println(">> �����޽��� : " + e.getMessage());
		}
		
		
		System.out.println("--- main() ���� ----");
	}
	
	static void firstMethod() throws MyException {
		System.out.println("-- firstMethod() ���� --");
		secondMethod();
		System.out.println("-- firstMethod() ���� --");
	}

	private static void secondMethod() throws MyException {
		System.out.println("-- secondMethod() ���� --");
		//���� �߻� ��Ű��
		throw new MyException("secondMethod()���� ���ܹ߻�");
//		System.out.println("-- secondMethod() ���� --");
	}

}
