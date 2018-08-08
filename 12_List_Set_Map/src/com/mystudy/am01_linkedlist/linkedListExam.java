package com.mystudy.am01_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linkedListExam {

	public static void main(String[] args) {
		//Linkedlist : List 속성 
		LinkedList list = new LinkedList();
//		list.add("홍길동");
//		list.add("김유신");
//		System.out.println(list);
		
		String str = "홍길동,김유신,강감찬,을지문덕,홍경래";
		String[] strs = str.split(",");
		System.out.println("strs : " + Arrays.toString(strs));

		
		//배열에 있는 값을 리스트에 추가
		for (int i=0; i < strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list : " + list);
		printData(list);
		printData("list1", list);
		
		System.out.println("---------------------");
		Collections.reverse(list);
		printData("list", list);
		
		Collections.sort(list);
		printData("list", list);
		
		//김유신 삭제
		list.remove("김유신");
		printData(list);
		
		//홍길동 -> 홍길동2 수정
		//홍길동 인덱스값 찾기, set 메소드 사용
		System.out.println("홍길동 위치값 : " + list.indexOf("홍길동"));
		//list.set(3, "홍길동2");
		list.set(list.indexOf("홍길동"), "홍길동2");
//		list.set(3, "홍길동2");
		printData(list);
		
		System.out.println("--- 전체데이터번호 : 이름 형태 출력 ---");
		//1 : 강감찬
		//2 : 김유신
		//3 : 을지문덕
		//4 : 홍경래
		//5 : 홍길동
		//for(int i=0)문으로 작성
		
		
		System.out.println("----for문-----");
		for(int i=0; i<strs.length; i++) {
			System.out.println(i+1 + " : " + strs[i]);
		}
		//개선된 for문으로 작성
		
		System.out.println("----개선된 for문-----");
		int idx = 1;
		for (String s : strs) {
			System.out.println(idx + " : " + s);
			idx++;
		}
		
		//while문 작성
		System.out.println("----while문-----");
		
		int i = 0;
		
		while (i<strs.length) {
			System.out.println(i+1 + " : " + strs[i]);
			i++;
		}
		
	
	}
	
	
	
	
	static void printData(List list) {
		//null 여부 확인
		if(list == null) return;
		
		System.out.print(list.get(0));
		for(int i=1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}
	
	
	static void printData(String str, List list) {
		//null 여부 확인
		if (list == null) return;
		
		System.out.print(str + ": ");
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
	}

	
}
