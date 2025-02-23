package com.manjeet.stream;

import java.util.Arrays;

//Find even Number and count
public class Test5 {

	public static void main(String[] args) {

		long countEvenNumber = Arrays.asList(8,5,4,566,77,478,5,4,5,24,5656,25).stream().filter(x->x%2==0).distinct().count();
		System.out.println("countEvenNumber : "+countEvenNumber);


	}
}
