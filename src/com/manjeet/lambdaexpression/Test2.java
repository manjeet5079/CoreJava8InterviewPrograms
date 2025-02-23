package com.manjeet.lambdaexpression;


interface I2{
	void m2();
}


public class Test2 {

	public static void main(String[] args) {
		I2 i2= () -> System.out.println("Hello ....");
		i2.m2();
	}
}
