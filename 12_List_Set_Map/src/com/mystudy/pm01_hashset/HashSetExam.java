package com.mystudy.pm01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	//Set �������̽��� ������ ����ü
//	HashSet set = new HashSet();
	public static void main(String[] args) {
		
		
		Set set = new HashSet();
		set.add("1");
		set.add(new Integer(1));
		//�ߺ��� ������� ����
		set.add("ȫ�浿");
		set.add("ȫ�浿");
		System.out.println(set);
		
		set.remove("1");
		System.out.println(set);
		System.out.println("set.contains(\"1\") : " + set.contains("1"));
		
		set.add("������");
		set.add("��������");
		
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		//���� : ������ -> ȫ�淡 : ������ ���� and ȫ�淡 �Է�
		System.out.println("�������� �ֳ�? " + set.contains("������"));
		set.remove("������");
		set.add("ȫ�淡");
		ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}
