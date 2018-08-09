package com.mystudy.pm01_map_sungjuk;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapSungjukExam {
	
	public static void main(String[] args) {
		
		//1. HashMap<String, Integer> Ÿ���� ���� map�� �����ϰ�
		//2. map�� �̸�:���� ������ �Ʒ��� ����Ÿ�� �Է�
		//   "ȫ�浿:100, ������:90, ��������:95, ���:87, ������:92"
		//3. �Էµ� ����Ÿ�� ��ȸ�ؼ� ������ ������ tot�� ����
		//4. ����(tot)�� ���� �ο� ���� ���� ��� ���� avg�� ����
		//5. ����Ͻÿ�.
		//   ����  ����
		//   -----------
		//   �̸�: ����
		//   �̸�: ����
		//   ...
		//   �̸�: ����
		//   ==========
		//   ����: ???
		//   ���: ???
		////////////////////////////////////////////
		
		//1.HashMap<String, Integer> Ÿ���� ���� map�� ����
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//2. map�� (�̸�:����) ������ �Ʒ��� ����Ÿ�� �Է�
		//   "ȫ�浿:100, ������:90, ��������:95, ���:87, ������:92"
		
		map.put("ȫ�浿", 100);
		map.put("������", 90);
		map.put("��������", 95);
		map.put("���", 87);
		map.put("������", 92);
		System.out.println(map);
		
		Set set = map.entrySet();
		System.out.println(set);
		
		//3. �Էµ� ����Ÿ�� ��ȸ�ؼ� ������ ������ tot�� ����
		
		Iterator ite = set.iterator();
		Collection values = map.values();
		ite = values.iterator();
		
		int tot = 0;
		while(ite.hasNext()) {
			Integer num = (Integer) ite.next();
			tot += num;
		}
		System.out.println("���� : " + tot);
		
		//4. ����(tot)�� ���� �ο� ���� ���� ��� ���� avg�� ����
		
		double avg = (tot * 100) / map.size() / 100.0 ;
		System.out.println("��� �� : " + avg);
		
		//5. ����Ͻÿ�.
		System.out.println("����     ����");
		System.out.println("--------");
		
		ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next() + "\n");
		}
		System.out.println("--------");
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
	}
}
