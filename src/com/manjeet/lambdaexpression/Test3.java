package com.manjeet.lambdaexpression;

@FunctionalInterface
interface I3{

	void m3(int a, int b);
}

public class Test3 {

	public static void main(String[] args) {
		I3 i3=(a,b) -> System.out.println("Test a and b :"+a+" : "+b);
		i3.m3(10, 20);

	}
}
