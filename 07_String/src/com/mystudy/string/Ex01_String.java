package com.mystudy.string;

import java.util.Arrays;

public class Ex01_String { //Ex01String���� ���� ���

	public static void main(String[] args) {
		// ���ڿ� ó�� : String Ŭ����
		// String Ŭ���� ��� ���� 2����
		// String str = "ȫ�浿"; // �⺻ ������ Ÿ��ó�� ���
		// String str = new String("ȫ�浿"); //��ü ���� ���
		String str1 = "Java";
		String str2 = "World";
		String strObj1 = new String("Java");
		String strObj2 = new String("World");
		System.out.println("str1 : " + str1);
		System.out.println("strObj1 : " + strObj1);
		
		String str11 = "Java";
		String str22 = "World";
		
		//== : ������ ��(��ü ��)
		if(str1 == str11) {
			System.out.println("str1 == str11 : " + (str1 == str11));
			System.out.println("str1 : " + str1);
			System.out.println("str11 : " + str11);
			
			
			System.out.println("--- str1 vs ��ü���� strObj1 ---");
			System.out.println("str1 == strObj1: " + (str1 == strObj1));
			System.out.println("str1 : " + str1);
			System.out.println("strObj1 : " + strObj1);
			
			//equals : value(��) �����ϰ� �ִ� ���ڿ� �� ��
			System.out.println("--- equals �� ---");
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
			
			System.out.println("a.concat(b).concat(c) : " + a.concat(b).concat(c)); // chainning ���(ü�̴� ���)
			
			
			System.out.println("--- charAt() ---");
			String d = "Java World";
			System.out.println("d : " + d);
			char ch = d.charAt(0); //���� ���� �����Ϸ��� ����Ÿ�԰� ������ ������ ����
			System.out.println("d.charAt(0) : " + d.charAt(0));
			
//			char[] ch2 = {d.charAt(0), d.charAt(1), d.charAt(2)};
			char[] ch2 = new char[4];
			for(int i=0; i<ch2.length; i++) {
				ch2[i] = d.charAt(i);
			}
			System.out.println(Arrays.toString(ch2));// [J, a, v, a]
			
			//compareTo �տ��� �� ũ�� ���, ������ 0, �ڿ��� �� ũ�� ���� 
			System.out.println("----- compareTo() -----");
			System.out.println("java vs java : " + "java".compareTo("java"));
			System.out.println("aaa vs bbb : " + "aaa".compareTo("bbb"));
			System.out.println("ccc vs aaa : " + "ccc".compareTo("aaa"));
			
			
			System.out.println("--- copyValueOf() ---");
			char[] ch3 = {'a', 'b', 'c', 'd'};
			String str3 = String.copyValueOf(ch3);
			System.out.println(Arrays.toString(ch3));
			
			System.out.println(str3.startsWith("abd")); //str3�� ���ڿ��� bc�� �����ϴ��� ���� ���� startsWith // ���� ���ڿ� ���� Ȯ��
			
			
			//////////////////////////////////////////
			
			
			
			
			
			
		}
		

	}

}
