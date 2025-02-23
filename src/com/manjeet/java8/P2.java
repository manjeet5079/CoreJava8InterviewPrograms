package com.manjeet.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P2 {

	/*
	 * 3.How to find duplicate elements in a given integers list in java using
	 * Stream functions?
	 */
public static void main(String[] args) {
	//1. fund the duplicate element
	List<Integer> asList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	Set<Integer> s=new HashSet<>();
	List<Integer> collect = asList.stream().filter(x-> !s.add(x)).sorted().collect(Collectors.toList());
	System.out.println("collect : "+collect);

	//2. show only unique number with assending order
	List<Integer> asList2 = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
	List<Integer> collect2 = asList2.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println("collect2 : "+collect2);

	//find the only unique numver
	List<Integer> asList3 = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
	Set<Integer> set=new HashSet<>(asList3);
	System.out.println("set : "+set);


	//find the unique and  show assending order
	List<Integer> asList4 = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
	Set<Integer> set1=new HashSet<>(asList4);
	List<Integer> collect3 = set1.stream().sorted().collect(Collectors.toList());
	System.out.println("collect3: "+collect3);
	collect3.forEach(System.out::println);

	int[] arr = {10,15,8,49,25,98,98,32,15};
	List<Integer> collect4 = Arrays.stream(arr).boxed().distinct().sorted().collect(Collectors.toList());
	System.out.println("collect4 : "+collect4);
}
}
