package com.mystudy.manager;

import java.util.ArrayList;

public class StudentManager {
	private ArrayList<StudentVO> list;

	static final String TITLE = "�̸�\t����\t����\t����\t����\t���";
	static final String LINE = "-----------------------" + "------------------------------";

	StudentManager() {
		list = new ArrayList<>();
	}

	StudentManager(ArrayList<StudentVO> list) {
		this.list = list;
	}

	public StudentVO selectOne(String id) {
		StudentVO result = null;
		// list�� �ִ� ����Ÿ�� ���޹��� id�� ������ �̸��� ����Ÿ�� ������ ����
		// ������ null ����

		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				result = list.get(i);
				System.out.println(">> ��ȸ�� " + "\"" + id + "\" ������ �Դϴ�.");
				System.out.println(result + "\n");
			} else {
				return null;
			}
		}

		return result;
	}

	public StudentVO selectOne(StudentVO vo) {
		StudentVO result = null;
		// list�� �ִ� ����Ÿ�� ���޹��� vo�� id�� ������ �̸��� ����Ÿ�� ������ ����
		// ������ null ����

		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				result = list.get(i);
				System.out.println(">> ��ȸ�� " + "\"" + vo.getId() + "\" ������ �Դϴ�.");
				System.out.println(result + "\n");
			} else {
				return null;
			}
		}
		return result;
	}

	public ArrayList<StudentVO> selectAll() {
		ArrayList<StudentVO> result = null;
		// ��ü ����Ÿ�� ���� ó��
		for (int i = 0; i < list.size(); i++) {
			result.add(list.get(i));
		}

		return result;
	}

	public int insert(StudentVO vo) {
		int result = 0;
		// list.add(vo);
		// ���޹��� vo�� id�� list�� ������ list�� �߰�(1 ����)
		// ���޹��� vo�� id�� list�� ������ "�̹� �����ϴ� ����Ÿ" ���(0 ����)
		// vo.getId().equals(list.get(i).getId())
		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				System.out.println("�̹� �����ϴ� ������.\n");
				result = 0;
				return result;
			}
		}
		list.add(vo);
		result = 1;
		return result;
	}

	public int update(StudentVO vo) {
		int result = 0;
		// ���޹��� vo�� id�� list�� ������ ����ó��(1 ����)
		// (Ű���� id�� �����ϰ� ��� ����Ÿ�� ����ó��)
		// ���޹��� vo�� id�� list�� ������ "����Ÿ ��� ��������" ���(0 ����)
		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				list.set(i, vo);
				System.out.println("������ �Ϸ�ƽ��ϴ�.\n");
				result = 1;
				return result;
			}
		}
		System.out.println("������ ��� ���� ����.\n");
		result = 0;
		return result;
	}

	public int delete(StudentVO vo) {
		int result = 0;
		// ���޹��� vo�� id�� list�� ������ ����ó��(������ 1 ����, ���н� 0����)
		// ���޹��� vo�� id�� list�� ������ "����Ÿ ��� ���� ����" ���(0 ����)
		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				list.remove(vo);
				System.out.println("������ �Ϸ�ƽ��ϴ�.\n");
				result = 1;
				return result;
			}
		}
		System.out.println("������ ��� ���� ����.\n");
		result = 0;
		return result;
	}

	public int delete(String id) {
		int result = 0;
		// ���޹��� id�� list�� ������ ����ó��(������ 1 ����, ���н� 0����)
		// ���޹��� id�� list�� ������ "����Ÿ ����" ���(0 ����)
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				list.remove(list.get(i));
				System.out.println("������ �Ϸ�ƽ��ϴ�.\n");
				result = 1;
				return result;
			}
		}
		System.out.println("������ ��� ���� ����.\n");
		result = 0;
		return result;
	}

	// ��ü ����Ÿ ���(Ÿ��Ʋ ��¾��� ����Ÿ��)
	// list�� �ִ� ����Ÿ�� ��ü ȭ�� ���

	void displayAll() {
		// list �ʵ忡 ����ִ� ����Ÿ�� ���
		for (StudentVO vo : list) {
			printDataOne(vo, "\t"); // ������ delim ������ ����
		}

	}

	// �ϳ��� ����Ÿ�� ���(VO�� ��±�����)
	void printDataOne(StudentVO vo, String delim) {
		if (vo == null)
			return;
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

	public boolean displayOne(StudentVO vo) {
		// list�� �ִ� ����Ÿ �� vo�� id�� ��ġ�ϴ� ����Ÿ ȭ�� ���
		// ������ "����Ÿ ����" ȭ�� ���

		boolean result = false;
		for (int i = 0; i < list.size(); i++) {
			if (vo.getId() == list.get(i).getId()) {
				System.out.println(LINE);
				System.out.println("��ȸ�� �Ϸ�ƽ��ϴ�.\n");
				System.out.println(list.get(i));
				System.out.println();
				result = true;
				return result;
			} else {
				int j = i;
				System.out.println(i);
				System.out.println(list.size());
				if ((j + 1) == list.size()) {// ����Ʈ�� ������ �����Ϳ����� �����Ͱ� ���� ���
					System.out.println(LINE);
					System.out.println("�ش� ID " + vo.getId() + " �� ������ ��� ��ȸ ����.\n");
					result = false;
				}
			}
		}
		return result;
	}

	public boolean displayOne(String id) {
		// list�� �ִ� ����Ÿ �� id�� ��ġ�ϴ� ����Ÿ ȭ�� ���
		// ������ "����Ÿ ����" ȭ�� ���

		boolean result = false;
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				list.get(i);
				System.out.println(LINE);
				System.out.println("��ȸ�� �Ϸ�ƽ��ϴ�.\n");
				System.out.println(list.get(i));
				System.out.println();
				result = true;
				return result;
			} else if (id.contains(list.get(i).getId()) == false) {
				int j = i;
				if ((j + 1) == list.size()) { // ����Ʈ�� ������ �����Ϳ����� �����Ͱ� ���� ���
					System.out.println(LINE);
					System.out.println("�ش� ID " + id + " �� ������ ��� ��ȸ ����.\n");
					result = false;
				}
			}
		}
		return result;
	}

	public void printSungjuk() {
		// list�� �ִ� ����Ÿ ��ü�� ��Ŀ� ���� ȭ�鿡 ���
		// ���� ���� ���� ���� ���� ���
		// ------------------------------
		// ȫ�浿 100 90 80 270 90.0
		// .....
		printTitle();
		displayAll();
		System.out.println(LINE);
		System.out.println();
	}
}
