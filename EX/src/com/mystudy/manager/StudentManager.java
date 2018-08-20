package com.mystudy.manager;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManager {
	private ArrayList<StudentVO> list;
	static final String TITLE = "����\t����\t����\t����\t����\t���";
	static final String LINE = "---------------------------------------------";
	
	void printTitle() {
		System.out.println(TITLE);
		System.out.println(LINE);
	}
	
	StudentManager() {
		list = new ArrayList<>();
	}
	
	StudentManager(ArrayList<StudentVO> list) {
		this.list = list;
	}

	public StudentVO selectOne(String id) {
		StudentVO result = null;
		//list�� �ִ� ����Ÿ�� ���޹��� id�� ������ �̸��� �����Ͱ� ������ ����
		//������ null ����
		for(int i=0; i<list.size(); i++) {
			if((list.get(i)).getId() == id) {
				result = list.get(i);
			}
		}
		return result;
	}
	public StudentVO selectOne(StudentVO vo) {
		StudentVO result = null;
		//list�� �ִ� ����Ÿ�� ���޹��� vo�� ID�� ������ id�� ����Ÿ�� ������ ����
		//������ null ����
		for(int i=0; i<list.size(); i++) {
			if((list.get(i)).getId() == vo.getId()) {
				result =list.get(i);
			}
		}
		
		return result;
	}
	
	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> result = null;
		//��ü ����Ÿ�� ���� ó��
		for (StudentVO vo : list) {
			System.out.println(vo + "\t");
		}
		return result;
	}
	
	public int insert(StudentVO vo) {
		int result = 0;
		//���޹��� vo�� id�� list�� ������ list�� �߰�(1 ����)
		//���޹��� vo�� id�� list�� ������ "�̹� �����ϴ� ����Ÿ" ���(0 ����)
		for(int i=0; i<list.size(); i++) {
			if(vo.getId() == (list.get(i)).getId()) {
				System.out.println("�̹� �����ϴ� ������");
				result = 0;
			}
		}
		list.add(vo);
		result = 1;
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
		//���޹��� vo�� id�� list�� ������ ����ó��(������ 1 ����, ���н� 0����)
		//���޹��� vo�� id�� list�� ������ "����Ÿ ��� ���� ����" ���(0 ����)
		for(int i=0; i<list.size(); i++) {
			if(vo.getId() == list.get(i).getId()) {
				list.remove(list.get(i));
				result = 1;
			} else {
				System.out.println("������ ��� ���� ����");
				result = 0;
			}
		}
		
		return result;
	}
	public int delete(String id) {
		int result = 0;
		//���޹��� id�� list�� ������ ����ó��(������ 1 ����, ���н� 0����)
		//���޹��� id�� list�� ������ "����Ÿ ����" ���(0 ����)
		for(int i=0; i<list.size(); i++) {
			if(id == list.get(i).getId()) {
				list.remove(list.get(i));
				result = 1;
			} else {
				System.out.println("������ ��� ���� ����");
				result = 0;
			}
		}
		
		return result;
	}
	
	public void displayAll() {
		//list�� �ִ� ����Ÿ�� ��ü ȭ�� ���
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			ite.next();
		}
	}
	
	public void displayOne(StudentVO vo) {
		//list�� �ִ� ����Ÿ �� vo�� id�� ��ġ�ϴ� ����Ÿ ȭ�� ���
		//������ "����Ÿ ����" ȭ�� ���
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == vo.getId()) {
				System.out.println(list.get(i));
			} else {
				System.out.println("������ ����");
			}
		}
		
	}
	public void displayOne(String id) {
		//list�� �ִ� ����Ÿ �� id�� ��ġ�ϴ� ����Ÿ ȭ�� ���
		//������ "����Ÿ ����" ȭ�� ���
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				System.out.println(list.get(i));
			} else {
				System.out.println("������ ����");
			}
		}
	}
	
	public void printSungjuk() {
		//list�� �ִ� ����Ÿ ��ü�� ��Ŀ� ���� ȭ�鿡 ���
		//����     ����    ����    ����     ����     ���
		//------------------------------
		//ȫ�浿  100  90   80   270   90.0
		//.....
		printTitle();
		displayAll();
	}
}
