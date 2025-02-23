package com.manjeet.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1 {

	/*
	 * 2.Given a list of integers, find out all the numbers starting with 1 using
	 * Stream functions?
	 */

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10,15,8,49,25,98,32);

		asList.stream()
				.map(s->s+"")
				.filter(x->x.startsWith("1"))
				.forEach(System.out::println);



		int[] arr = {10,15,8,49,25,98,32};
		List<String> collect2 = Arrays.stream(arr)
				.boxed()
				.map(s->s+"")
				.filter(x->x.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("collect2 :"+collect2);
	}
}
