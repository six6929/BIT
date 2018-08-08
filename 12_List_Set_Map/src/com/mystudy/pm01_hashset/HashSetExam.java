package com.mystudy.pm01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	//Set 인터페이스를 구현한 구현체
//	HashSet set = new HashSet();
	public static void main(String[] args) {
		
		
		Set set = new HashSet();
		set.add("1");
		set.add(new Integer(1));
		//중복을 허락하지 않음
		set.add("홍길동");
		set.add("홍길동");
		System.out.println(set);
		
		set.remove("1");
		System.out.println(set);
		System.out.println("set.contains(\"1\") : " + set.contains("1"));
		
		set.add("김유신");
		set.add("을지문덕");
		
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		//수정 : 김유신 -> 홍경래 : 김유신 삭제 and 홍경래 입력
		System.out.println("김유신이 있냐? " + set.contains("김유신"));
		set.remove("김유신");
		set.add("홍경래");
		ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}
