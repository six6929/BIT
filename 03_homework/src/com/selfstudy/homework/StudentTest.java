package com.selfstudy.homework;

import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		StudentVO stu1 = new StudentVO("��", 100, 80, 90);
		StudentVO stu2 = new StudentVO("��", 95, 75, 95);
		StudentVO stu3 = new StudentVO("��", 80, 90, 100);
		StudentVO stu4 = new StudentVO("��", 50, 60, 70);
		StudentVO stu5 = new StudentVO("��", 100, 80, 100);
	
//		System.out.println(stu1.toString());
//		ArrayList list1 = new ArrayList(5);
//		ArrayList list2 = new ArrayList(5);
//		ArrayList list3 = new ArrayList(5);
//		ArrayList list4 = new ArrayList(5);
//		ArrayList list5 = new ArrayList(5);
//		
//		System.out.println("------ 1��° �л� ����------");
//		list1.add(stu1);
//		printData(list1);
//		System.out.println();
//		System.out.println("----1��° �л� ���� ���� ----");
//		stu1.setKor(80);
//		printData(list1);
//		
//		System.out.println();
//		System.out.println("------ 2��° �л� ���� ------");
//		list2.add(stu2);
//		printData(list2);
//		
//		System.out.println();
//		System.out.println("------ 3��° �л� ���� ------");
//		list3.add(stu3);
//		printData(list3);
//		
//		System.out.println();
//		System.out.println("------ 4��° �л� ���� ------");
//		list4.add(stu4);
//		printData(list4);
//		System.out.println();
//		System.out.println("------ 4��° �л� ���� ���� ------");
//		stu4.setEng(85);
//		stu4.setKor(76);
//		stu4.setMath(93);
//		printData(list4);
//		
//		System.out.println();
//		System.out.println("------ 5��° �л� ���� ------");
//		list5.add(stu5);
//		printData(list5);
//		
		ArrayList list = new ArrayList(5);

		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
		
		printData(list);
		System.out.println("-------stu1 ����� ���� --------");
		stu1.setKor(55);
		printData(list);
		
		System.out.println("-------stu4 ���� ���� ---------");
		stu4.setKor(75);
		stu4.setEng(97);
		stu4.setKor(63);
		printData(list);
		
	}
	
	static void printData(ArrayList list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println("[index :" + i + "] " + list.get(i));
		}
	}
}
