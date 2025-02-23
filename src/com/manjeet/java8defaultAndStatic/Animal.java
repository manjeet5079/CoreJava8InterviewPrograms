package com.manjeet.java8defaultAndStatic;

public interface Animal {

	public abstract void run();

	void eat();

	public default void sleep() {
		System.out.println("Animal is sleeping...");
	}

	default void bark() {
		System.out.println("Animal is Barking...");
	}

	public static void walk() {
		System.out.println("Animal is Walking...");
	}

	static void hiMessagae() {
		System.out.println("Hi Animal...");
	}
}
