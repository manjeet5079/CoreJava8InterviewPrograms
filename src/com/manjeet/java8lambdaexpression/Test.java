package com.manjeet.java8lambdaexpression;

public class Test {

	public static void main(String[] args) {

		Walkable walkable=()-> System.out.println("Walking...");
		walkable.walk();

		Movable movable =str-> str;
		System.out.println("Moving : "+movable.move("Manjeet"));

		Operationable operationable = (i1,i2)-> i1*i2;
		System.out.println("Result : "+operationable.operation(10, 20));
	}
}
