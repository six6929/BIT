package com.mystudy.pm02.person;

public class PersonVO {

	private String name;
	private int age;
	
	//�����ڴ� �̸�,���̸� �޴� ��
	
	public PersonVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	//setter, getter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	//toString �������̵�
	
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", age=" + age + "]";
	}
	
	
}
