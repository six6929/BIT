package com.mystudy.am01_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linkedListExam {

	public static void main(String[] args) {
		//Linkedlist : List �Ӽ� 
		LinkedList list = new LinkedList();
//		list.add("ȫ�浿");
//		list.add("������");
//		System.out.println(list);
		
		String str = "ȫ�浿,������,������,��������,ȫ�淡";
		String[] strs = str.split(",");
		System.out.println("strs : " + Arrays.toString(strs));

		
		//�迭�� �ִ� ���� ����Ʈ�� �߰�
		for (int i=0; i < strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list : " + list);
		printData(list);
		printData("list1", list);
		
		System.out.println("---------------------");
		Collections.reverse(list);
		printData("list", list);
		
		Collections.sort(list);
		printData("list", list);
		
		//������ ����
		list.remove("������");
		printData(list);
		
		//ȫ�浿 -> ȫ�浿2 ����
		//ȫ�浿 �ε����� ã��, set �޼ҵ� ���
		System.out.println("ȫ�浿 ��ġ�� : " + list.indexOf("ȫ�浿"));
		//list.set(3, "ȫ�浿2");
		list.set(list.indexOf("ȫ�浿"), "ȫ�浿2");
//		list.set(3, "ȫ�浿2");
		printData(list);
		
		System.out.println("--- ��ü�����͹�ȣ : �̸� ���� ��� ---");
		//1 : ������
		//2 : ������
		//3 : ��������
		//4 : ȫ�淡
		//5 : ȫ�浿
		//for(int i=0)������ �ۼ�
		
		
		System.out.println("----for��-----");
		for(int i=0; i<strs.length; i++) {
			System.out.println(i+1 + " : " + strs[i]);
		}
		//������ for������ �ۼ�
		
		System.out.println("----������ for��-----");
		int idx = 1;
		for (String s : strs) {
			System.out.println(idx + " : " + s);
			idx++;
		}
		
		//while�� �ۼ�
		System.out.println("----while��-----");
		
		int i = 0;
		
		while (i<strs.length) {
			System.out.println(i+1 + " : " + strs[i]);
			i++;
		}
		
	
	}
	
	
	
	
	static void printData(List list) {
		//null ���� Ȯ��
		if(list == null) return;
		
		System.out.print(list.get(0));
		for(int i=1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}
	
	
	static void printData(String str, List list) {
		//null ���� Ȯ��
		if (list == null) return;
		
		System.out.print(str + ": ");
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}

	
}
