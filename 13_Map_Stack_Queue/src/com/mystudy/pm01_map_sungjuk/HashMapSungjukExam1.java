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
		sungjuk.put("ȫ�浿", 100);
		sungjuk.put("������", 90);
		sungjuk.put("��������", 95);
		sungjuk.put("���", 87);
		sungjuk.put("������", 90);
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
		System.out.println("����\t����");
		System.out.println("-----------------------");
		
		//������ ���
		displayData(" :\t");
		
		System.out.println("=======================");
		System.out.println("����\t " + tot);
		System.out.println("���\t " + avg);
	}
}
