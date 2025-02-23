package com.manjeet.lambdaexpression;

public class Test {

	public static void main(String[] args) {
		Runnable r= ()-> System.out.println("Hello !! Welcome to lambda Expression program ..");
		r.run();
		Thread t= new Thread(r);
		t.start();
	}

}
