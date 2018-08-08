package com.mystudy.pm01_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		//TreeSet : Set 특성 + 데이터의 정렬
		
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
	
		
		Set<Integer>lottoSet = new TreeSet<Integer>();
		//Integer로 한정지어놓으면 integer타입만 입력할 수 있음
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
		System.out.println(lottoSet);
		
		((TreeSet)lottoSet).pollFirst();
		((TreeSet)lottoSet).pollLast();
		System.out.println(lottoSet);
		//set 인터페이스에는 
		
		
		ArrayList list = new ArrayList(lottoSet);
		Collections.sort(list);
		
		
		
		//로또번호 발표
		//Set -> List
		//TreeSet을 사용하는 경우에는 데이터가 정렬되어 있으므로 정렬 필요 없음
//		System.out.println(list.size());
//		
//		
//		System.out.println("로또당첨번호 : " + list);
		//Set에 있는 데이터를 Iterator를 사용해서 조회하고 List에 추가
	}
	
}
