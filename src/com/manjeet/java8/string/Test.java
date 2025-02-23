package com.manjeet.java8.string;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		String joinStr = String.join("/", "src","bin","lib");
		System.out.println("joinStr : "+joinStr);

		List<String> list=new ArrayList<>();
		list.add("Manjeet");
		list.add("Ranjeet");
		list.add("Sanjeet");
		list.add("Raju");

		String joinStr1 = String.join(",", list);
		System.out.println("joinStr1 : "+joinStr1);

	}
}
