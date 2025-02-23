package com.manjeet.java8.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Manjeet", 35);
		map.put("Ranjeet", 33);
		map.put("Sanjeet", 29);
		map.put("Raju", 27);
		map.put("Satish", 31);
		map.put("Nitish", 26);
		map.put("Jyotish", 24);

		map.forEach((name,age)-> System.out.println("name : "+name +" age : "+age));
	}
}
