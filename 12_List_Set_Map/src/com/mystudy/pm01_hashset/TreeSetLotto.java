package com.mystudy.pm01_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		//TreeSet : Set Ư�� + �������� ����
		
		//Set�� �̿��� �ζ� ����� : 1~45 ���� 6���� set�� ����
		//�ζ� ��ȣ 6���� ��÷�ϰ�, ���� ���ں��� ������� ȭ�鿡 ǥ��
		//Math.random()
		//��°��
		//������ �ζǹ�ȣ : 5, 8, 10 , 25, 39, 45

//		while (lottoSet.size() < 6) {
//			lottoSet.add((int)(Math.random() * 45) + 1);
//		}
//		
//		List lottoSetList = new ArrayList(lottoSet);
//		Collections.sort(lottoSetList);
//		System.out.println("������ �ζ� ��ȣ�� : " +
//		lottoSetList);
	
		
		Set<Integer>lottoSet = new TreeSet<Integer>();
		//Integer�� ������������� integerŸ�Ը� �Է��� �� ����
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
		//set �������̽����� 
		
		
		ArrayList list = new ArrayList(lottoSet);
		Collections.sort(list);
		
		
		
		//�ζǹ�ȣ ��ǥ
		//Set -> List
		//TreeSet�� ����ϴ� ��쿡�� �����Ͱ� ���ĵǾ� �����Ƿ� ���� �ʿ� ����
//		System.out.println(list.size());
//		
//		
//		System.out.println("�ζǴ�÷��ȣ : " + list);
		//Set�� �ִ� �����͸� Iterator�� ����ؼ� ��ȸ�ϰ� List�� �߰�
	}
	
}
