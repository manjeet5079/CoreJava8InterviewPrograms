package com.manjeet.stream;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1,8,2,4,3,9,7,5,3,5,48,4,5,6);

		Integer integer = asList.stream()
		.filter(x->x%2==0)
		.map(x->x/4)
		.distinct()
		.peek(System.out::println)
		.max((a,b)->a-b)
		.get();

		System.out.println("integer : "+integer);

		long count = asList.stream()
		.filter(x->x%2==0)
		.map(x->x/4)
		.distinct()
		.count();

		System.out.println("count : "+count);
	}
}
