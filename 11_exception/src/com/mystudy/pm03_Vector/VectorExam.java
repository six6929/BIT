package com.mystudy.pm03_Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		//Vector 클래스
		Vector v = new Vector(5); //용량(capacity) 5인
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println(v);
		String temp = v.toString();
		System.out.println(temp);
		
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		v.remove(2);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		v.trimToSize();
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		v.addElement("4");
		System.out.println(v);
		v.add("AA");
		System.out.println(v);
		v.add(2);
		System.out.println(v);
		v.remove("2");
		System.out.println(v);
		
		v.add(2, "BB"); // 수정처리됨
		System.out.println(v);
		v.set(2, "CCC");
		System.out.println(v);
		
		System.out.println("--- clone() 실행 후 ---");
		Vector v2 = (Vector) v.clone();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		System.out.println("--- clear() 실행후 ---");
		v2.clear();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		//---------------------------------------
		System.out.println("-----------------------");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) { //nextElement는 데이터만 가지고 오는거
			//hasMoreElements는 다음 데이터가 있는지 물어보는거?
			System.out.println("enu.nextElement() : " + enu.nextElement());
//			System.out.println("enu.nextElement() : " + enu.nextElement());
		}
		System.out.println(v);
		
		System.out.println("----- Iterator 활용 조회 -----");
		Iterator ite = v.iterator();
		while(ite.hasNext()) {
			System.out.println("ite.next() : " + ite.next());
		}
		System.out.println("ite.hasNext() : " + ite.hasNext());
		
		v.remove(0);
		System.out.println(v);
	}

}
