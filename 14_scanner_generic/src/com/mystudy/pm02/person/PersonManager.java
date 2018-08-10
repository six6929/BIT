package com.mystudy.pm02.person;

import java.util.ArrayList;

public class PersonManager {

	public static void main(String[] args) {
		//ArrayList<? extends Animal> Animal을 상속받은 타입들은 다 사용할 수 있다.
		ArrayList<PersonVO> list = new ArrayList<>();
		
		PersonVO person = new PersonVO("홍길동", 27);
		list.add(person);
		System.out.println("person : " + person);
		System.out.println(list);
		
		
		System.out.println("-----------------------------");
		System.out.println(person);
		person = new PersonVO("김유신", 30);
		System.out.println("person : " + person);
		list.add(person);
		
		System.out.println(list);

		for(PersonVO vo : list) {
			String name = vo.getName();
			int age = vo.getAge();
			System.out.println("이름 : " + name + "나이 : " + age);
		}

	}

}
