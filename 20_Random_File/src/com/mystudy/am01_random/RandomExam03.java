package com.mystudy.am01_random;

import java.util.Calendar;
import java.util.Random;

public class RandomExam03 {

	public static void main(String[] args) {
		//�ǽ� : Calendar, Math,random(), Random���
		//���� ��¥ ����� �������(0~100)
		//Calender Ŭ���� �̿��ؼ� ���� ��¥ ���ϰ�, 
		//Math.random(), Random Ŭ���� �̿��ؼ� ������� ��
		//������
		//2018�� 8�� 30�� ����� �������(0~100)�� ??�Դϴ�.
		
		
		//���� ��¥ ��(��, ��, ��) ���ϱ�
		//���� �� �� 0~11���� ��
		
		Calendar cal= Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//		System.out.println(cal.get(Calendar.AM_PM));
		//������� �� �����
		Random ran = new Random();
		
		int num = 0;
		num = (int)(Math.random() * ran.nextInt(101));
//		System.out.println(num);
		
		//������
		System.out.println(year + "��" + month + "��" + date + "��"+ "\n����� �������(0~100)�� " + num + "�Դϴ�.");
	}

	
}
