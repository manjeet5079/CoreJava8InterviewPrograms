package com.manjeet.stream;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//Imperative approach
		int[] arr= {1,5,3,8,6,4};
		int sum=0;
		for (int element : arr) {

			if(element%2==0) {
				sum+=element;
			}
		}
		System.out.println("Sum : "+sum);

		//Declactive approach
		int[] arr1= {1,5,3,8,6,4};
		int sum2 = Arrays.stream(arr1).filter(a->a%2==0).sum();
		System.out.println("Sum : "+sum2);
	}
}
