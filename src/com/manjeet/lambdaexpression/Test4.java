package com.manjeet.lambdaexpression;

@FunctionalInterface
interface I4{

	int m4(int a, int b);

}

public class Test4 {

	public static void main(String[] args) {
		I4 i4= (a,b) -> {
			int c=a+b;
			System.out.println("Sum of : "+c);
			return c;
		};
		int m4 = i4.m4(100, 200);
		System.out.println("Result is :"+m4);

	}
}
