package com.manjeet.java8defaultAndStatic;

public class Test {

	public static void main(String[] args) {

		Animal a=new Cat();
		a.bark();
		a.eat();
		a.sleep();

		Animal.walk();
		Animal.hiMessagae();

		Cat.walk();
		Cat.hiMessagae();
	}
}
