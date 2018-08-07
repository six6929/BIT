package com.mystudy.pm05_interface;

public abstract class Animal implements I_Animal {

	@Override
	public void eat() {
		System.out.println(">> ¸Ô´Â´Ù");
		
	}

	@Override
	public void sleep() {
		System.out.println(">> ÀÜ´Ù");
		
	}

	@Override
	public abstract void sound();
	
}
