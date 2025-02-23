package com.manjeet.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P3 {
	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
		List<Integer> collect = asList.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("collect: " + collect);
		collect.forEach(System.out::println);

		List<Integer> collect3 = IntStream.of(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656).boxed()
				.distinct().sorted().collect(Collectors.toList());
		// List<Integer> collect2 =
		// num.distinct().sorted().collect(Collectors.toList());
		System.out.println("collect3 : " + collect3);
		collect3.forEach(System.out::println);
	}
}
