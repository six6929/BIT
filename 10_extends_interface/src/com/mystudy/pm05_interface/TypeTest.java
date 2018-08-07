package com.mystudy.pm05_interface;

public class TypeTest {

	public static void main(String[] args) {
		//�߻�Ŭ���� Animal�� ��ü ���� �� �� ����
		//Animal an = new Animal();
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Chicken ch = new Chicken();
		Pig pig = new Pig();
		Sheep sheep = new Sheep();
		
		//an.sound();
		cat.sound();
		dog.sound();
		ch.sound();
		pig.sound();
		sheep.sound();
//		
		System.out.println("---- sound(Animal) ȣ�� --- ");
		sound(cat);
		sound(dog);
		sound(ch);
		sound(pig);
		sound(sheep);
	}
	
	private static void sound(Animal animal) {
		//instanceof ��� - Ÿ��Ȯ�� �� �ش� Ÿ���� sound �޼ҵ� ȣ��
		//Animal Ÿ���� ��� "��������" ���
		/*
		if (animal instanceof Cat) {
			((Cat) animal).sound();
		} else if (animal instanceof Dog) {
			((Dog) animal).sound();
		} else if (animal instanceof Chicken) {
			((Chicken) animal).sound();
		} else if (animal instanceof Pig) {
			((Pig) animal).sound();
		} else {
			System.out.println(">> ��������");
		}
		*/
		
		animal.sound();
	}

//	private static void sound(Cat cat) {
//		cat.sound();
//	}
}
