package com.mystudy.pm01_hashset;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set lottoSet = new HashSet();
	
		//Set을 이용한 로또 만들기 : 1~45 숫자 6개를 set에 저장
		//로또 번호 6개를 추첨하고, 작은 숫자부터 순서대로 화면에 표시
		//Math.random()
		//출력결과
		//금주의 로또번호 : 5, 8, 10 , 25, 39, 45

//		while (lottoSet.size() < 6) {
//			lottoSet.add((int)(Math.random() * 45) + 1);
//		}
//		
//		List lottoSetList = new ArrayList(lottoSet);
//		Collections.sort(lottoSetList);
//		System.out.println("금주의 로또 번호는 : " +
//		lottoSetList);
	
		
		for(int i=0; lottoSet.size() < 6; i++) {
			
			lottoSet.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(lottoSet);
		lottoSet.clear();
		
		System.out.println("-------");
		for(; lottoSet.size() < 6;) {
			lottoSet.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(lottoSet);
		
		System.out.println("-------");
		lottoSet.clear();
	
		while (lottoSet.size() < 6) {
			lottoSet.add((int)(Math.random() * 45) + 1);
		}

		//로또번호 발표
		//Set -> List
		ArrayList list = new ArrayList(lottoSet);
		Collections.sort(list);
		System.out.println(list.size());
		
		
		System.out.println("로또당첨번호 : " + list);
		//Set에 있는 데이터를 Iterator를 사용해서 조회하고 List에 추가
		
	}
}
