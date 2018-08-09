package com.mystudy.am04_list_set_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class List_Set_Map {

	public static void main(String[] args) {
		//1. List ���
		//�̸���� : ȫ�浿, ������, ȫ�淡, �̼���
		//����� �����͸� ��ȸ�ؼ� ȭ�鿡 ���(index : ������)
		System.out.println("------ List ��� ------");
		ArrayList al = new ArrayList();
		al.add("ȫ�浿");
		al.add("������");
		al.add("ȫ�淡");
		al.add("�̼���");
		al.add("��������");
		System.out.println(al);
		System.out.println(al.contains("ȫ�浿"));
		al.remove(0);
		
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(i+1 + " : " + al.get(i));
		}
		//////////////////////////////////////
		//2. Set ���
		//�̸���� : ȫ�浿, ������ , ȫ�淡, �̼���
		//����� �����͸� ��ȸ�ؼ� ȭ�鿡 ��� (������������ ���)
		
		System.out.println("----- Set ��� -----");
		
//		Set set = new TreeSet();
//		set.add("ȫ�浿");
//		set.add("������");
//		set.add("ȫ�淡");
//		set.add("�̼���");
//		Iterator ite = set.iterator();
//		while(ite.hasNext()) {
//			System.out.print(ite.next() + " ");
//		}
//		System.out.println();
		
//		Set set = new HashSet();
//		set.add("ȫ�浿");
//		set.add("������");
//		set.add("ȫ�淡");
//		set.add("�̼���");
//		Iterator ite = set.iterator();
//		while(ite.hasNext()) {
//			System.out.print(ite.next() + " ");
//		}
//		System.out.println();
//		
		Set set = new HashSet(al);
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		System.out.println();
		
		////////////////////////////////////////
		//3. Map ���
		//k-v : 1810- ȫ�浿 , 1811-������, 1812-ȫ�淡, 1813-�̼���
		//����� �����͸� ��ȸ�ؼ� ȭ�鿡 ���(key�������� ������������ ���)
		
		System.out.println("----- Map ��� ------");
		
//		HashMap map = new HashMap();
//		map.put(1810, "ȫ�浿");
//		map.put(1811, "������");
//		map.put(1812, "ȫ�淡");
//		map.put(1813, "�̼���");
//		
//		Set set1 = map.keySet();
//		Iterator ite1 = set1.iterator();
//		while (ite1.hasNext()) {
//			Integer key = (Integer) ite1.next();
//			String value = (String) map.get(key);
//			System.out.println(key + " - " + value);
//		}
		
		TreeMap map = new TreeMap();
		map.put(1810, "ȫ�浿");
		map.put(1811, "������");
		map.put(1812, "ȫ�淡");
		map.put(1813, "�̼���");
		map.put(1814, "��������");
		
		Set set1 = map.keySet();
		Iterator ite1 = set1.iterator();
		while (ite1.hasNext()) {
			Integer key = (Integer) ite1.next();
			String value = (String) map.get(key);
			System.out.println(key + " - " + value);
		}
	}
}
