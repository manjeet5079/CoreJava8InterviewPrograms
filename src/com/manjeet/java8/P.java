package com.manjeet.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P {

	/*
	 * 1.Given a list of integers, find out all the even numbers that exist in the
	 * list using Stream functions?
	 */

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(5,7,8,9,10,45,88,44,22,35,66,72,82,92,62,32,52);

		List<Integer> evenNumberList = asList.stream().filter(x->x%2==0).collect(Collectors.toList());
		evenNumberList.forEach(System.out::println);

		//asList.stream().filter(x->x%2==0).forEach(System.out::println);

		/* find the even number When numbers are given as Array int[] arr = {5,7,8,9,10,45,88,44,22,35,66,72,82,92,62,32,52}; */
		int[] arr = {5,7,8,9,10,45,88,44,22,35,66,72,82,92,62,32,52};
		Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x->x%2==0));
		System.out.println("collect : "+collect);

	}
}
