package com.mystudy.manager;

import java.util.ArrayList;

public class StudentManager {
	private ArrayList<StudentVO> list;
	
	StudentManager() {
		list = new ArrayList<>();
	}
	
	StudentManager(ArrayList<StudentVO> list) {
		this.list = list;
	}

	public StudentVO selectOne(String id) {
		StudentVO result = null;
		//list�� �ִ� ����Ÿ�� ���޹��� id�� ������ �̸��� ����Ÿ�� ������ ����
		//������ null ����
		
		return result;
	}
	public StudentVO selectOne(StudentVO vo) {
		StudentVO result = null;
		//list�� �ִ� ����Ÿ�� ���޹��� vo�� name�� ������ �̸��� ����Ÿ�� ������ ����
		//������ null ����
		
		return result;
	}
	
	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> result = null;
		//��ü ����Ÿ�� ���� ó��
		
		return result;
	}
	
	public int insert(StudentVO vo) {
		int result = 0;
		//���޹��� vo�� id�� list�� ������ list�� �߰�(1 ����)
		//���޹��� vo�� id�� list�� ������ "�̹� �����ϴ� ����Ÿ" ���(0 ����)
		
		
		return result;
	}
	
	public int update(StudentVO vo) {
		int result = 0;
		//���޹��� vo�� id�� list�� ������ ����ó��(1 ����)
		// (Ű���� id�� �����ϰ� ��� �����͸� ����ó��
		//���޹��� vo�� id�� list�� ������ "����Ÿ ����" ���(0 ����)
		
		
		return result;
	}
	public int delete(StudentVO vo) {
		int result = 0;
		//���޹��� vo�� name�� list�� ������ ����ó��(������ 1 ����, ���н� 0����)
		//���޹��� vo�� name�� list�� ������ "����Ÿ ��� ���� ����" ���(0 ����)
		
		
		return result;
	}
	public int delete(String id) {
		int result = 0;
		//���޹��� name�� list�� ������ ����ó��(������ 1 ����, ���н� 0����)
		//���޹��� name�� list�� ������ "����Ÿ ����" ���(0 ����)
		
		
		return result;
	}
	
	public void displayAll() {
		//list�� �ִ� ����Ÿ�� ��ü ȭ�� ���
		
	}
	public void displayOne(StudentVO vo) {
		//list�� �ִ� ����Ÿ �� vo�� id�� ��ġ�ϴ� ����Ÿ ȭ�� ���
		//������ "����Ÿ ����" ȭ�� ���
		
	}
	public void displayOne(String id) {
		//list�� �ִ� ����Ÿ �� id�� ��ġ�ϴ� ����Ÿ ȭ�� ���
		//������ "����Ÿ ����" ȭ�� ���
		
	}
	
	public void printSungjuk() {
		//list�� �ִ� ����Ÿ ��ü�� ��Ŀ� ���� ȭ�鿡 ���
		//����     ����    ����    ����     ����     ���
		//------------------------------
		//ȫ�浿  100  90   80   270   90.0
		//.....
	}
}
