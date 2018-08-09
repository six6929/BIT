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
		//1. List 사용
		//이름등록 : 홍길동, 강감찬, 홍경래, 이순신
		//저장된 데이터를 조회해서 화면에 출력(index : 데이터)
		System.out.println("------ List 사용 ------");
		ArrayList al = new ArrayList();
		al.add("홍길동");
		al.add("강감찬");
		al.add("홍경래");
		al.add("이순신");
		al.add("을지문덕");
		System.out.println(al);
		System.out.println(al.contains("홍길동"));
		al.remove(0);
		
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(i+1 + " : " + al.get(i));
		}
		//////////////////////////////////////
		//2. Set 사용
		//이름등록 : 홍길동, 강감찬 , 홍경래, 이순신
		//저장된 데이터를 조회해서 화면에 출력 (오름차순으로 출력)
		
		System.out.println("----- Set 사용 -----");
		
//		Set set = new TreeSet();
//		set.add("홍길동");
//		set.add("강감찬");
//		set.add("홍경래");
//		set.add("이순신");
//		Iterator ite = set.iterator();
//		while(ite.hasNext()) {
//			System.out.print(ite.next() + " ");
//		}
//		System.out.println();
		
//		Set set = new HashSet();
//		set.add("홍길동");
//		set.add("강감찬");
//		set.add("홍경래");
//		set.add("이순신");
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
		//3. Map 사용
		//k-v : 1810- 홍길동 , 1811-강감찬, 1812-홍경래, 1813-이순신
		//저장된 데이터를 조회해서 화면에 출력(key기준으로 오름차순으로 출력)
		
		System.out.println("----- Map 사용 ------");
		
//		HashMap map = new HashMap();
//		map.put(1810, "홍길동");
//		map.put(1811, "강감찬");
//		map.put(1812, "홍경래");
//		map.put(1813, "이순신");
//		
//		Set set1 = map.keySet();
//		Iterator ite1 = set1.iterator();
//		while (ite1.hasNext()) {
//			Integer key = (Integer) ite1.next();
//			String value = (String) map.get(key);
//			System.out.println(key + " - " + value);
//		}
		
		TreeMap map = new TreeMap();
		map.put(1810, "홍길동");
		map.put(1811, "강감찬");
		map.put(1812, "홍경래");
		map.put(1813, "이순신");
		map.put(1814, "을지문덕");
		
		Set set1 = map.keySet();
		Iterator ite1 = set1.iterator();
		while (ite1.hasNext()) {
			Integer key = (Integer) ite1.next();
			String value = (String) map.get(key);
			System.out.println(key + " - " + value);
		}
	}
}
