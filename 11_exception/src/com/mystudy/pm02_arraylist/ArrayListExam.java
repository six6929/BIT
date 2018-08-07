package com.mystudy.pm02_arraylist;

import java.util.ArrayList;
import java.util.*; // java.util.* -> �ڹ���ƿ�� �ִ� ��� Ŭ������ �ǹ�

public class ArrayListExam {

	public static void main(String[] args) {
		//�迭�� �Ӽ��� List �Ӽ��� ����
//		java.util.ArrayList list1 = new java.util.ArrayList();
		ArrayList list1 = new ArrayList();
		System.out.println("list1.size : " + list1.size());
		list1.add(new Integer(5));
		list1.add(1); // int -> Integer �ڵ� ����ȯ �Ǿ� �Է�ó��
		list1.add(new Integer(5));
		list1.add(new Integer(6));
		list1.add(new Integer(7));
		list1.add(new Integer(8));

		System.out.println("list1.size : " + list1.size());
		System.out.println(list1);
		System.out.println(list1.toString());
		Collections.reverse(list1);
		System.out.println("reverse() : " + list1);
	
		System.out.println("--------------------------------");
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list2);
		
		System.out.println("--------- Collections.sort() ---------");
		System.out.println("list1 : " + list1);
		Collections.sort(list1);
		System.out.println("list1 : " + list1); // ������������ ������ ��.
		Collections.sort(list2);
		System.out.println("list2 : " + list2); // ������������ ������ ��.

		
		System.out.println("--------- Collections.reverse() ---------");
		//reverse() : ó���� ���� ��ġ�� ���� �ٲٴ� ���·� ����
		System.out.println("list1 : " + list1);
		Collections.reverse(list1); // list1�� ���� �������� �ٽ� �ٲ�
		System.out.println("list1 : " + list1);
		
		
		System.out.println("=======================================");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		list2.add("0");
		list2.add("TEST");
		System.out.println("list2 : " + list2);
		for(int i=0; i<list2.size(); i++) {
			System.out.println("Index"+i + " - " + list2.get(i));
		}
		System.out.println("--------------------------------");
		print(list1,list2);
		//retainAll -> list2�� �ִ� 5,6,7�� ����� �� ����
		//remove�� �򰥷����� �ƴϴ�
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1,list2);
		
		System.out.println("========================================");
		System.out.println(">> list2���� list1�� ���Ե� ��ü ����");
		print(list1,list2);
		
//		System.out.println("list2.removeAll(list1) ���� : " + list2.removeAll(list1));
//		print(list1,list2);
		
		//������ �����Ͱ� �ִ��� Ȯ���ϰ� ������ ����
		System.out.println("list1.contains(list2.get(0)) : " + list1.contains(list2.get(0)));
		if (list1.contains(list2.get(0))) {
			list2.remove(0);
		}
		print(list1,list2);
		
			
		System.out.println("---- �ݺ����� �̿��� ������ ���� ----");
		System.out.println("list1 : " + list1);
//		int listCnt = list1.size();
		for (int i=0; i<list1.size(); i++) {
			list1.remove(i);
		}
		System.out.println("list1 : " + list1);
		System.out.println("--------------------------");
		print(list1,list2);
		//�κл����� �ϱ� ���ؼ��� �ڿ������� ������ �ؾ���
		//�迭���ٸ��� �պκп��� ������ �Ǹ� ������ �������� ������ ���ϴ� ���ڰ� ���� �ȵǴ� ��찡 �ټ�
		
		//������ ����(�ε��� ��ġ�� �̿�)
		System.out.println("list2.set(0,\"A\" : " + list2.set(0,"A"));
		print(list1, list2);
		
		list2.add(1, "BB");
		print(list1, list2);
		
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
