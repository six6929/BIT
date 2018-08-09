package com.mystudy.pm01_hashset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExam2 {

	public static void main(String[] args) {
		// Map�� ����� �����͸� Ȯ��
		Map<String, String> map = new HashMap<String, String>();
//		map.put("k1", 100); //100�� Int�� ����
		map.put("Ű1", "��1");
		map.put("Ű2", "��2");
		map.put("Ű3", "��3");
		map.put("Ű4", "��4");
		map.put("Ű5", "��5");
		System.out.println(map);
		
		int[] num = {1,2,3,4};
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.println("--- ������ for��(ForEach) �̿� �迭�� ���---");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		//Map ��½� ������ for�� ���
		System.out.println("--- Map�� ������ for������ ��ȸ ----");
		for(String key : map.keySet()) {
			System.out.println("Key : " + key + " value : " + map.get(key));
		}
		
		
		//(�ǽ�)Ű(Key)Entry Ÿ���� ���� �޾Ƽ� ���(iterator)
		System.out.println("---- Map.Entry Ÿ���� ������ ��ȸ ----");
		System.out.println("--- ������ for �� ��� ---");

		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("---- Map.Entry Ÿ���� ������ ��ȸ ----");
		
		Set <Map.Entry<String, String>> entrySet = map.entrySet();
//		Iterator ite = entrySet.iterator();
		Iterator <Map.Entry<String, String>>ite = entrySet.iterator();
		while(ite.hasNext()) {
			Map.Entry<String, String> entry = ite.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		//(�ǽ�)Ű(Key) ���� �޾Ƽ� Ű~�� ��ȸ(iterator)
		System.out.println("---- Map���� Ű(Key)�� �޾Ƽ� iterator �� ��ȸ ----");
		
		Iterator<String> iteString = map.keySet().iterator();
		while(iteString.hasNext()) {
			String key = iteString.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}

}
