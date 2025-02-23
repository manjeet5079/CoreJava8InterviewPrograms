package com.manjeet.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(11,55,22,33,77,88,99,111,45,257,78,15,4,2,8,6,12,22,24,2,4,8);

		List<Integer> collect = asList.stream().filter(x->x%2==0).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("collect : "+collect);

		System.out.println("-----------");

		List<Integer> collect2 = collect.stream().map(x->x/2).collect(Collectors.toList());
		collect2.forEach(System.out::println);
		System.out.println("collect2 : "+collect2);

		System.out.println("-----------");

		List<Integer> collect3 = asList.stream().filter(x->x%2==0).map(x->x/2).collect(Collectors.toList());
		System.out.println("collect3 : "+collect3);

		List<Integer> collect4 = asList.stream().filter(x->x%2==0).map(x->x/2).distinct().collect(Collectors.toList());
		System.out.println("collect4 : "+collect4);

		List<Integer> collect5 = asList.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted().collect(Collectors.toList());
		System.out.println("collect5 : "+collect5);

		List<Integer> collect6 = asList.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b)->(b-a)).collect(Collectors.toList());
		System.out.println("collect6 : "+collect6);

		List<Integer> collect7 = asList.stream()
				.filter(x->x%2==0)
				.map(x->x/2)
				.distinct()
				.sorted((a,b)->(b-a))
				.limit(5)
				.skip(1)
				.collect(Collectors.toList());
		System.out.println("collect7 : "+collect7);
	}
}
