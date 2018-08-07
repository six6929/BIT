package com.mystudy.pm03_istanceof2;

public class TypeTest {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Chicken ch = new Chicken();
		Pig pig = new Pig();
		Sheep sheep = new Sheep();
		
		an.sound();
		cat.sound();
		dog.sound();
		ch.sound();
		pig.sound();
		sheep.sound();
		System.out.println("--- sound(Anumal) 호출 ---");
		sound(an);
	
		sound(cat);
	
		sound(dog);

		sound(ch);

		sound(pig);
		
		sound(sheep);

		
	}

	private static void sound(Animal animal) {
		//instanceof 사용 - 타입확인 후 sound 호출
		
//		if(animal instanceof Cat) {
//			((Cat)animal).sound();
//		} else if(animal instanceof Dog) {
//			((Dog)animal).sound();
//		} else if(animal instanceof Chicken) {
//			((Chicken)animal).sound();
//		} else if(animal instanceof Pig) {
//			((Pig)animal).sound();
//		} else {
//			System.out.println(">> 울음없음");
//		}
		animal.sound();
	}
		
	
}
