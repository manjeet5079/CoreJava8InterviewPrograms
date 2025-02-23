package com.manjeet.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample4 {

	public static void main(String[] args) {

		IntStream.iterate(2, i->i+2).limit(10).forEach(System.out::println);

		List<Integer> asList = Arrays.asList(5,2,4,7,9,3,5,8,6,4,1,3,2,5);
		asList.forEach(System.out::println);
		System.out.println("--------------");

		List<Integer> collect = asList.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("collect : "+collect);

	}
}
