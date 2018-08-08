package com.mystudy.pm01_hashset;

import java.util.HashSet;
import java.util.Iterator;

class Person {
	String name; 
	int age;
	String jumin;
	
	public Person(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		return true;
	}


	
	
}
public class HashSetExam2 {
	public static void main(String[] args) {
		//Set�� �ߺ������ʹ� �ϳ��� ����
		//������ �������� ���� ������ ���δ� equals �޼ҵ� ���� 
		HashSet set = new HashSet();
		set.add("ab");
		set.add("abc");
		set.add("abc");
		set.add(new Person("�ſ�ȣ", 25, "940000-0000000"));
		Person person = new Person("��ҿ�", 21, "980000-0000000");
		set.add(person);
		Person person2 = person;
		set.add(person);
		
		
		
		
		//��ü ������ ��ȸ�ؼ� ȭ�� ���(�ǽ�)
		System.out.println("---------------------------------------------");
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		//--------------------------
		System.out.println("=-------------------------------------------------");

		//��ü ������ ��ȸ
		set.add(new Person("�ſ�ȣ", 25, "940000-0000000"));
		ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
	}

}
