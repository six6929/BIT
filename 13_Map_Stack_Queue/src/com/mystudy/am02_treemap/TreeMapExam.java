package com.mystudy.am02_treemap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExam {

	public static void main(String[] args) {
		//// Map : 키(Key) - 값(value) 쌍으로 데이터를 관리
		// - 순서가 없다(단 TreeMap의 경우 key가 오름차순 정렬되어 저장)
		// - 키(key) : 중복허용 되지 않음
		// - 값(value) : 중복이 허용
		
		TreeMap map = new TreeMap();
		//       key    value
		map.put("홍길동", 100);
		map.put("김유신", new Integer(95));
		map.put("강감찬", 88);
		map.put("계백", 88);
		map.put("홍길동", 93);
		map.put("A", 93); //동일한 key값이 존재하면 수정처리됨
		map.put("*", 93); //동일한 key값이 존재하면 수정처리됨
		map.put("100", 93); //동일한 key값이 존재하면 수정처리됨
		System.out.println(map);
		
		HashMap map2 = new HashMap();
		map2.put("일지매", 92);
		map2.put("전우치", 92);
		System.out.println(map2);
		
		System.out.println("map.isEmpty() : " + map.isEmpty());
		System.out.println("map.get(\"홍길동\") : " + map.get("홍길동"));
		System.out.println("map.get(\"을지문덕\") : " + map.get("을지문덕"));
		System.out.println("map.containsKey(\"을지문덕\") : " + map.containsKey("을지문덕"));
		System.out.println("map.containsValue(\"을지문덕\") : " + map.containsValue("을지문덕"));
	
		//////////////////////////////////////////////////////////////////
		//Map의 키(key), value(값)을 함께 추출해서 사용
		System.out.println("---- 키(key) - 값(value) 추출 : entrySet() ----");
		Set set = map.entrySet();
		System.out.println(set);
		Iterator ite = set.iterator();//데이터가 있냐고 묻는게 Iterator();
		while(ite.hasNext()) {
			Map.Entry e = (Entry)ite.next(); //Map.entry 맵안에 있는 Entry를 의미
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		
		System.out.println("---- 키(key) - 값(value) 추출 : entrySet() ----");
		set = map.keySet();
		System.out.println(set);
	
		ite = set.iterator();
		while (ite.hasNext()) {
			String key = (String) ite.next();
			Integer value = (Integer) map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
		
		//-------------
		System.out.println("---- 값(value)만 추출 사용 : values() ----");
		Collection values = map.values();
		ite = values.iterator();
		
		int sum = 0;
		while(ite.hasNext()) {
			Integer num = (Integer) ite.next();
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println(" \n점수합계 : " + sum);
	}
}
