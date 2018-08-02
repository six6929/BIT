package com.mystudy.pm;

import java.util.StringTokenizer;

public class Ex05_StringControlExam {

	public static void main(String[] args) {
		/* ���ڿ� �ٷ��
		0.���ڿ� ������
		  String str1 = "ȫ�浿 �̼���   �̼��� Tom ȫ�浿"
		  String str2 = "     TOM    �������� ������ �����ҹ�"
		1. ���� ���ڿ��� StringBuilder ���� sb�� �̿��ؼ� �ϳ��� ���ڿ��� �����,
		2. sb�� ���ڿ��� ��ĭ(" ")�� �����ڷ� �߶�(�̸��� ����) ȭ�� ���
		   (String.split() �Ǵ� StringTokenizer ���)
		3. ������ �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		   (��¿�: ȫ�浿,�̼���,�̼���,Tom,ȫ�浿,TOM,��������,������,�����ҹ�)
		4. �������� ù���ڸ� �����ؼ� �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		   (��: ȫ,��,��,T,ȫ,T,��,��,��) 
		5. �迭�� ���ڿ��� �̸��� ���ڼ��� 4 �̻��� ���� "�ε�����ȣ:�̸�" ���
		       ��¿�: 
		   6:��������
		   8:�����ҹ�
		********************************/
		String str1 = "ȫ�浿 �̼���   �̼��� Tom ȫ�浿";
		String str2 = "     TOM    �������� ������ �����ҹ�";
		//"ȫ�浿 �̼���   �̼��� Tom ȫ�浿 	TOM		�������� ������ ����ҹ�"
		
		//1��
	
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str2);
		StringBuilder sb = sb1.append(sb2);
		System.out.println("1���� �� : " +  sb);
		
		
		//2��
		System.out.println("=============2�� ��================");
		String str = new String(sb); //StringBuilder�� ���� String���� ��ȯ
		StringTokenizer sbToken = new StringTokenizer(str, " ");
		System.out.println("����� ��ū�� ���� : " + sbToken.countTokens());
		while(sbToken.hasMoreTokens()) {
			String token = sbToken.nextToken();
			System.out.print(token + " ");
		}
		System.out.println();
		
		//3��
		System.out.println("============3�� ��================");
		str = new String(sb);
		System.out.println(sb.toString());
		sbToken = new StringTokenizer(str, " ");
		System.out.println("����� ��ū�� ���� : " + sbToken.countTokens());
		while(sbToken.hasMoreTokens()) {
			String token = sbToken.nextToken();
			System.out.print(token + ",");
		}
		System.out.println();
		
		//4. �������� ù���ڸ� �����ؼ� �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		//   (��: ȫ,��,��,T,ȫ,T,��,��,��)
		sbToken = new StringTokenizer(str, " ");



	}

}
