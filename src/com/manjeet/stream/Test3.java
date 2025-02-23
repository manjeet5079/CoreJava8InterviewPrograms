package com.manjeet.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {

		List<Integer> collect = Stream.iterate(0, x->x+1)
		.limit(100)
		.filter(x->x%2==0)
		.map(x->x/10)
		.distinct()
		.skip(1)
		.sorted()
		.collect(Collectors.toList());

		System.out.println("collect : "+collect);
	}
}
