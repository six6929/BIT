package com.mystudy.pm02_arraylist;

import java.util.ArrayList;
import java.util.*; // java.util.* -> 자바유틸에 있는 모든 클래스를 의미

public class ArrayListExam {

	public static void main(String[] args) {
		//배열의 속성과 List 속성을 가짐
//		java.util.ArrayList list1 = new java.util.ArrayList();
		ArrayList list1 = new ArrayList();
		System.out.println("list1.size : " + list1.size());
		list1.add(new Integer(5));
		list1.add(1); // int -> Integer 자동 형변환 되어 입력처리
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
		System.out.println("list1 : " + list1); // 오름차순으로 정렬이 됨.
		Collections.sort(list2);
		System.out.println("list2 : " + list2); // 오름차순으로 정렬이 됨.

		
		System.out.println("--------- Collections.reverse() ---------");
		//reverse() : 처음과 끝의 위치를 서로 바꾸는 형태로 동작
		System.out.println("list1 : " + list1);
		Collections.reverse(list1); // list1의 값을 역순으로 다시 바꿈
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
		//retainAll -> list2에 있는 5,6,7만 남기고 다 삭제
		//remove와 헷갈려서는 아니댐
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1,list2);
		
		System.out.println("========================================");
		System.out.println(">> list2에서 list1에 포함된 객체 삭제");
		print(list1,list2);
		
//		System.out.println("list2.removeAll(list1) 실행 : " + list2.removeAll(list1));
//		print(list1,list2);
		
		//삭제는 데이터가 있는지 확인하고 있으면 삭제
		System.out.println("list1.contains(list2.get(0)) : " + list1.contains(list2.get(0)));
		if (list1.contains(list2.get(0))) {
			list2.remove(0);
		}
		print(list1,list2);
		
			
		System.out.println("---- 반복문을 이용한 데이터 삭제 ----");
		System.out.println("list1 : " + list1);
//		int listCnt = list1.size();
		for (int i=0; i<list1.size(); i++) {
			list1.remove(i);
		}
		System.out.println("list1 : " + list1);
		System.out.println("--------------------------");
		print(list1,list2);
		//부분삭제를 하기 위해서는 뒤에서부터 삭제를 해야함
		//배열과다르게 앞부분에서 삭제가 되면 앞으로 땡겨지기 때문에 원하는 숫자가 삭제 안되는 경우가 다수
		
		//데이터 수정(인덱스 위치값 이용)
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
