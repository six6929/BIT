package com.mystudy.pm02.person;

import java.util.ArrayList;

public class PersonManager {

	public static void main(String[] args) {
		//ArrayList<? extends Animal> Animal�� ��ӹ��� Ÿ�Ե��� �� ����� �� �ִ�.
		ArrayList<PersonVO> list = new ArrayList<>();
		
		PersonVO person = new PersonVO("ȫ�浿", 27);
		list.add(person);
		System.out.println("person : " + person);
		System.out.println(list);
		
		
		System.out.println("-----------------------------");
		System.out.println(person);
		person = new PersonVO("������", 30);
		System.out.println("person : " + person);
		list.add(person);
		
		System.out.println(list);

		for(PersonVO vo : list) {
			String name = vo.getName();
			int age = vo.getAge();
			System.out.println("�̸� : " + name + "���� : " + age);
		}

	}

}
