package com.manjeet.java8.string;

import java.util.StringJoiner;

public class Test1 {

	public static void main(String[] args) {

		StringJoiner strJoiner=new StringJoiner(",");
		strJoiner.add("ABC");
		strJoiner.add("DEF");
		strJoiner.add("GHI");
		strJoiner.add("KLM");
		strJoiner.add("XYZ");

		System.out.println("strJoiner : "+strJoiner);

		StringJoiner strJoiner1=new StringJoiner(",","[","]");
		strJoiner1.add("ABC");
		strJoiner1.add("DEF");
		strJoiner1.add("GHI");
		strJoiner1.add("KLM");
		strJoiner1.add("XYZ");

		System.out.println("strJoiner1 : "+strJoiner1);

		StringJoiner strJoiner2=new StringJoiner(";");
		strJoiner2.add("a");
		strJoiner2.add("b");
		strJoiner2.setEmptyValue("This is empty !!");

		System.out.println("strJoiner2 : "+strJoiner2);
		System.out.println("strJoiner2 length : "+strJoiner2.length());

	}
}
