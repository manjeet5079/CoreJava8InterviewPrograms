package com.manjeet.java8.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Satish","Nitish","Jyotish");
		List<String> list=new ArrayList<>();
		list.add("Manjeet");
		list.add("Ranjeet");
		list.add("Sanjeet");
		list.add("Raju");
		boolean listChanged = list.addAll(asList);

		System.out.println("List : "+list);
		System.out.println("listChanged : "+listChanged);

		int size = list.size();
		System.out.println("Size : "+size);

		ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        l1.add("C++");
        l1.add("Python");
        list.addAll(7, l1);
        System.out.println("Final List : "+list);

        list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.print(" "+t);

			}
		});

        list.forEach(t -> System.out.println(" "+t));
        System.out.println("---------");
        list.forEach(System.out::println);
	}
}
