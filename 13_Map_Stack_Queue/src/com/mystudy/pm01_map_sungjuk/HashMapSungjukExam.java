package com.mystudy.pm01_map_sungjuk;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapSungjukExam {
	
	public static void main(String[] args) {
		
		//1. HashMap<String, Integer> 타입의 변수 map을 선언하고
		//2. map에 이름:점수 형태의 아래의 데이타를 입력
		//   "홍길동:100, 강감찬:90, 을지문덕:95, 계백:87, 김유신:92"
		//3. 입력된 데이타를 조회해서 점수의 총점을 tot에 저장
		//4. 총점(tot)의 값을 인원 수로 나눈 평균 값을 avg에 저장
		//5. 출력하시오.
		//   성명  점수
		//   -----------
		//   이름: 점수
		//   이름: 점수
		//   ...
		//   이름: 점수
		//   ==========
		//   총점: ???
		//   평균: ???
		////////////////////////////////////////////
		
		//1.HashMap<String, Integer> 타입의 변수 map을 선언
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//2. map에 (이름:점수) 형태의 아래의 데이타를 입력
		//   "홍길동:100, 강감찬:90, 을지문덕:95, 계백:87, 김유신:92"
		
		map.put("홍길동", 100);
		map.put("강감찬", 90);
		map.put("을지문덕", 95);
		map.put("계백", 87);
		map.put("김유신", 92);
		System.out.println(map);
		
		Set set = map.entrySet();
		System.out.println(set);
		
		//3. 입력된 데이타를 조회해서 점수의 총점을 tot에 저장
		
		Iterator ite = set.iterator();
		Collection values = map.values();
		ite = values.iterator();
		
		int tot = 0;
		while(ite.hasNext()) {
			Integer num = (Integer) ite.next();
			tot += num;
		}
		System.out.println("총점 : " + tot);
		
		//4. 총점(tot)의 값을 인원 수로 나눈 평균 값을 avg에 저장
		
		double avg = (tot * 100) / map.size() / 100.0 ;
		System.out.println("평균 값 : " + avg);
		
		//5. 출력하시오.
		System.out.println("성명     점수");
		System.out.println("--------");
		
		ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next() + "\n");
		}
		System.out.println("--------");
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}
}
