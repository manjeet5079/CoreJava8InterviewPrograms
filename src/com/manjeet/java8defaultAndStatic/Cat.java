package com.manjeet.java8defaultAndStatic;

public class Cat implements Animal {

	@Override
	public void run() {
		System.out.println("Cat is Running...");

	}

	@Override
	public void eat() {
	System.out.println("Cat is Eating...");
	}
	@Override
	public void sleep() {
		System.out.println("Cat is sleeping...");
	}
	@Override
	public void bark() {
		System.out.println("Cat is Barking...");
	}

	public static void walk() {
		System.out.println("Cat is Walking...");
	}

	static void hiMessagae() {
		System.out.println("Hi Cat...");
	}
}
