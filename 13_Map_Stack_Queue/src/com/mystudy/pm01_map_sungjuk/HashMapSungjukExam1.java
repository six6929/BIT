package com.mystudy.pm01_map_sungjuk;

import java.util.HashMap;

public class HashMapSungjukExam1 {
	
	
	HashMap<String, Integer> sungjuk;
	int tot ;
	double avg;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapSungjukExam1 exam = new HashMapSungjukExam1();
		exam.sungjuk = new HashMap<String, Integer>();
		exam.inputData();
		exam.displayData();
		exam.computeAvg();
		exam.computeTot();
		System.out.println("tot : " + exam.tot);
		System.out.println("avg : " + exam.avg);
		System.out.println();
		exam.printData();
	}

	 void computeAvg() {
		computeTot();
		avg = (tot * 100) / sungjuk.size() / 100.0 ;
	}
	
	 void computeTot() {
		tot = 0;
		for (String name : sungjuk.keySet()) {
			tot += sungjuk.get(name);
		}
	}
	void inputData() {
		sungjuk.put("홍길동", 100);
		sungjuk.put("강감찬", 90);
		sungjuk.put("을지문덕", 95);
		sungjuk.put("계백", 87);
		sungjuk.put("김유신", 90);
	}
	
	void displayData() {
		for (String name : sungjuk.keySet()) {
			System.out.println(name + " : " + sungjuk.get(name));
		}
	}
	void displayData(String delim) {
		for (String name : sungjuk.keySet()) {
			System.out.println(name + delim + sungjuk.get(name));
		}
	}
	
	 void printData() {
		System.out.println("성명\t점수");
		System.out.println("-----------------------");
		
		//데이터 출력
		displayData(" :\t");
		
		System.out.println("=======================");
		System.out.println("총점\t " + tot);
		System.out.println("평균\t " + avg);
	}
}
