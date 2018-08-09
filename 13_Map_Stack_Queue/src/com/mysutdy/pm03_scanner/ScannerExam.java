package com.mysutdy.pm03_scanner;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 1 : ");
		String str = sc.nextLine();
		System.out.println(">>> " + str);
		
		
		System.out.println("문자열 2 : ");
		String str2 = sc.nextLine();
		System.out.println(">>> " + str2);
		
		System.out.println("-----------------------");
		System.out.println("정수값 2개를 입력하면 더한 값 출력");
		System.out.println("숫자 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("숫자2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
	}

}
