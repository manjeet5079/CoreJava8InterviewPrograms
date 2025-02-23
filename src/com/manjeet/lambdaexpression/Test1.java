package com.manjeet.lambdaexpression;

interface Animal{
	public abstract void eating();

	void sleeping();

	public default void running() {
		System.out.println("Animal is running...");
	}

	public default void thinking() {
		System.out.println("Animal is thinking...");
	}

	static void barking() {
		System.out.println("Animal is barking...");
	}
}

class Dog implements Animal{

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating...");
	}

	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		System.out.println("Dog is sleeping...");
	}

	@Override
	public void thinking() {
		System.out.println("Dog is thinking...");
	}

}

class Cat implements Animal{

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating...");
	}

	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		System.out.println("Cat is sleeping...");
	}

	@Override
	public void thinking() {
		System.out.println("Cat is thinking...");
	}

	@Override
	public void running() {
		System.out.println("Cat is running...");
	}
}
public class Test1 {

	public static void main(String[] args) {
		Animal a=new Dog();
		a.eating();
		a.sleeping();
		a.thinking();
		a.running();

		//Animal.

	}
}
