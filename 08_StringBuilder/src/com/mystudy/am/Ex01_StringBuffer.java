package com.mystudy.am;

public class Ex01_StringBuffer {
	public static void main(String[] args) {
		//StringBuffer Ŭ���� 
		String str = new String("Hello World!!!");
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Hello World!!!");
		System.out.println(sb);
		System.out.println("Sb.length : " + sb.length()); 
		System.out.println("sb.capacity(): " + sb.capacity()); //StringBuffer���� ũ��, �뷮�� ���ϴ� capacity�� ����(������������ ����)
		
		str = str +  "�ݰ����ϴ�.";
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println("---------------------");
		System.out.println(str.replace("l", "L")); //method�� ������� ���� �ٲ� �����͸� ���������� ������ �ٲ�°� �ƴϴ�.
		System.out.println(str);
		
		System.out.println("--- StringBuffer ---");
		sb.append("�ݰ����ϴ�.");
		System.out.println(sb.toString());
		
		System.out.println(sb.reverse());
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("---- delete(), insert(), replace() ----");
		System.out.println("sb.delete : " + sb.delete(0, 6)); //ó������, �ڴ� ���� X
		System.out.println("sb : " + sb); //StringBuffer�� ���������Ͱ� �ٲ�.
		
		System.out.println("sb.insert(0, \"Hello \") : " + sb.insert(0, "Hello "));
		System.out.println("sb : " + sb);
		
		System.out.println(sb.replace(0, 6, "Bye "));
		System.out.println("sb : " + sb);
		//replace�� �������� ������ delete�� ��ٰ� insert�� �����ϴ� ������� ��ü�ص� ��
		
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity(): " + sb.capacity());
		
		System.out.println("----------------------------------");
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println("-----------------------------------");
//		sb2.append("�ȳ��ϼ���. �ݰ����ϴ�.!");
		sb2.append("�ȳ��ϼ���.").append(" �ݰ����ϴ�!!");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println("-- trimToSize() ���� �� ---");
		sb2.trimToSize();
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity()); // trimToSize�� �ʿ���� ��������� �����ִ� ������ ��
		
		System.out.println(">> append ���� ��");
		sb2.append(" �ڹٰ�����~");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println("--- setLength() ������ ---");
		sb2.setLength(5);
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		
		
	}

}
