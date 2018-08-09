package com.mystudy.pm01_hashset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExam2 {

	public static void main(String[] args) {
		// Map에 저장된 데이터를 확인
		Map<String, String> map = new HashMap<String, String>();
//		map.put("k1", 100); //100이 Int라서 오류
		map.put("키1", "값1");
		map.put("키2", "값2");
		map.put("키3", "값3");
		map.put("키4", "값4");
		map.put("키5", "값5");
		System.out.println(map);
		
		int[] num = {1,2,3,4};
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		System.out.println("--- 개선된 for문(ForEach) 이용 배열값 출력---");
		for(int n : num) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		//Map 출력시 개선된 for문 사용
		System.out.println("--- Map을 개선된 for문으로 조회 ----");
		for(String key : map.keySet()) {
			System.out.println("Key : " + key + " value : " + map.get(key));
		}
		
		
		//(실습)키(Key)Entry 타입의 값을 받아서 출력(iterator)
		System.out.println("---- Map.Entry 타입의 데이터 조회 ----");
		System.out.println("--- 개선된 for 문 사용 ---");

		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("---- Map.Entry 타입의 데이터 조회 ----");
		
		Set <Map.Entry<String, String>> entrySet = map.entrySet();
//		Iterator ite = entrySet.iterator();
		Iterator <Map.Entry<String, String>>ite = entrySet.iterator();
		while(ite.hasNext()) {
			Map.Entry<String, String> entry = ite.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		//(실습)키(Key) 값을 받아서 키~값 조회(iterator)
		System.out.println("---- Map에서 키(Key)을 받아서 iterator 로 조회 ----");
		
		Iterator<String> iteString = map.keySet().iterator();
		while(iteString.hasNext()) {
			String key = iteString.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}

}
