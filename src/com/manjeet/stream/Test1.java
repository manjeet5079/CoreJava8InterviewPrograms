package com.manjeet.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Apple","Banana","Mango","Cherry");
		Stream<String> stream = asList.stream();
		stream.forEach(System.out::println);

		String[] strArray= {"APPLE","BANANA","MANGO","CHERRY"};
		Stream<String> stream2 = Arrays.stream(strArray);
		stream2.forEach(System.out::println);

		Stream<String> stream3=Stream.of("ABC","DEF","GHI","XYZ");
		stream3.forEachOrdered(System.out::println);

		Stream<Integer> stream4 = Stream.iterate(0,n->n+1).limit(100);
		stream4.forEach(System.out::println);

		Stream<Double> stream5 = Stream.generate(()->Math.random() *100).limit(100);
		stream5.forEach(System.out::println);
	}
}
