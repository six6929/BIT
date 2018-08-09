package com.mystudy.am01_hashmap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExam {

	public static void main(String[] args) {
		// Map : Ű(Key) - ��(value) ������ �����͸� ����
		// - ������ ����(�� TreeMap�� ��� key�� �������� ���ĵǾ� ����)
		// - Ű(key) : �ߺ���� ���� ����
		// - ��(value) : �ߺ��� ���
		
		HashMap map = new HashMap();
		//       key    value
		map.put("ȫ�浿", 100);
		map.put("������", new Integer(95));
		map.put("������", 88);
		map.put("���", 88);
		map.put("ȫ�浿", 93); //������ key���� �����ϸ� ����ó����
		System.out.println(map);
		
		HashMap map2 = new HashMap();
		map2.put("������", 92);
		map2.put("����ġ", 92);
		System.out.println(map2);
		
		System.out.println("map.isEmpty() : " + map.isEmpty());
		System.out.println("map.get(\"ȫ�浿\") : " + map.get("ȫ�浿"));
		System.out.println("map.get(\"��������\") : " + map.get("��������"));
		System.out.println("map.containsKey(\"��������\") : " + map.containsKey("��������"));
		System.out.println("map.containsValue(\"��������\") : " + map.containsValue("��������"));
	
		//////////////////////////////////////////////////////////////////
		//Map�� Ű(key), value(��)�� �Բ� �����ؼ� ���
		System.out.println("---- Ű(key) - ��(value) ���� : entrySet() ----");
		Set set = map.entrySet();
		System.out.println(set);
		Iterator ite = set.iterator();//�����Ͱ� �ֳİ� ���°� Iterator();
		while(ite.hasNext()) {
			Map.Entry e = (Entry)ite.next(); //Map.entry �ʾȿ� �ִ� Entry�� �ǹ�
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}
		
		
		System.out.println("---- Ű(key) - ��(value) ���� : entrySet() ----");
		set = map.keySet();
		System.out.println(set);
	
		ite = set.iterator();
		while (ite.hasNext()) {
			String key = (String) ite.next();
			Integer value = (Integer) map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
		
		//-------------
		System.out.println("---- ��(value)�� ���� ��� : values() ----");
		Collection values = map.values();
		ite = values.iterator();
		
		int sum = 0;
		while(ite.hasNext()) {
			Integer num = (Integer) ite.next();
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println(" \n�����հ� : " + sum);
	}

}
