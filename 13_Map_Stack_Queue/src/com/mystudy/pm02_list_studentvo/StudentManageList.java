package com.mystudy.pm02_list_studentvo;

import java.util.*;

public class StudentManageList {
	private ArrayList<StudentVO> sungjuk = new ArrayList();
	static final String TITLE = "�̸�\t����\t����\t����\t����\t���";
	static final String LINE = "-----------------------"
				+ "------------------------------";
	void inputBasicData() {
		sungjuk.add(new StudentVO("ȫ�浿", 100,90,81));
		sungjuk.add(new StudentVO("������", 90,90,90));
		sungjuk.add(new StudentVO("ȫ�淡", 80,80,80));
	}
	
	void inputData(StudentVO vo) {
		sungjuk.add(vo);
	}
	
	void inputData(String name, int kor, int eng, int math) {
		sungjuk.add(new StudentVO(name, kor, eng, math));
	}
	
	//[�����ǽ�] ���޹��� VO�� name�� sungjuk ��Ͽ� �ִ� VO�� name�� ���� ������ ����
	boolean deleteData(StudentVO vo) {
		//StudentVO Ÿ���� ���� ���޹޾� sungjuk ��Ͽ��� ����
		boolean result = false;
	
		return result;
	}
	
	//[�����ǽ�]
	boolean deleteData(String name) {
		//�̸��� ���޹޾� sungjuk���� ����
		boolean result = false;
		
		return result;
	}
	
	//[�����ǽ�] ���޹��� VO�� name��
	//sungjuk ��Ͽ� �ִ� VO�� name�� ���� ������ ����
	boolean updateData(StudentVO vo) {
		//1. �̸��� ���޹޾� sungjuk ���� ã��
		//2. ã������ ���޹��� VO�� ����, ����, ������� sungjuk���� ã�� VO�� ����
		boolean result = false;
		
		System.out.println(vo);
		return result;
	}
	//[�����ǽ�]
	StudentVO getData(String name) {
		StudentVO result = null;
		//���޹��� �̸��� ������ �ִ� StudentVO ��ü�� ã��
		return result;
	}
	
	//[�����ǽ�]
	//���� �̻��� ��� ��� ��ȸ
	ArrayList<StudentVO> getData(double avg) {
		ArrayList<StudentVO> result = null;
		//list�� �ִ� �����Ϳ��� ���޹��� ��հ�(avg) �̻��Τ� ������ ã�Ƽ�
		//result�� ��Ƽ� ����
		
		return result;
	}
	
	void printDataAll() {
		//sungjuk �ʵ忡 ����ִ� ����Ÿ�� ���
		for (StudentVO vo : sungjuk) {
			printDataOne(vo, "\t");
		}
		
	}
	
	//�ϳ��� ����Ÿ�� ���(VO�� ��±�����)
	void printDataOne(StudentVO vo, String delim) {
		if (vo == null) return;
		System.out.print(vo.getName());
		System.out.print(delim + vo.getKor());
		System.out.print(delim + vo.getEng());
		System.out.print(delim + vo.getMath());
		System.out.print(delim + vo.getTot());
		System.out.print(delim + vo.getAvg());
		System.out.println();
	}
	void printTitle() {
		System.out.println(TITLE);
		System.out.println(LINE);
	}
	void printSungjuk() {
		printTitle();
		printDataAll();
		
		
	}
}
