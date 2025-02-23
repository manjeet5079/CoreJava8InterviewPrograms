package com.manjeet.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("MAnjeet","Sanjeet","Ranjeet","Raju","Satish","Nitish","Jyotish");
		Comparator<String> sort=(a,b)->{
		int l1=	a.length();
		int l2=	b.length();
		if(l1>l2) {
			return 1;
		} else if(l1<l2) {
			return -1;
		} else {
			return 0;
		}
		};

		List<String> collect = asList.stream().sorted(sort).collect(Collectors.toList());
		System.out.println("sorted : "+collect);

		Comparator<String> sort1=(a,b)->{
			int l1=	a.length();
			int l2=	b.length();
			return (l1>l2)?1 : (l1<l2)?-1 :0;
			};

	   List<String> collect1 = asList.stream().sorted(sort1).collect(Collectors.toList());
	   System.out.println("sorted1 : "+collect1);

	   Comparator<String> sort2=(a,b)->{
				int l1=	a.length();
				int l2=	b.length();
				return Integer.compare(l1, l2);
				};

	   List<String> collect2 = asList.stream().sorted(sort2).collect(Collectors.toList());
	   System.out.println("sorted2 : "+collect2);


	   List<String> collect3 = asList.stream().sorted((a,b)->Integer.compare(a.length(), b.length())).collect(Collectors.toList());
	   System.out.println("sorted3 : "+collect3);

	   List<String> collect4 = asList.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
	   System.out.println("sorted4 : "+collect4);

       List<String> collect5 = asList.stream().sorted(Comparator.comparingInt(String::length)).sorted((a,b)->(b.length()-a.length())).collect(Collectors.toList());
	   System.out.println("sorted5 : "+collect5);

	   Optional<String> min = asList.stream().min(sort2);
	   System.out.println("min : "+min);

	   Optional<String> max = asList.stream().max(sort2);
	   System.out.println("max : "+max);

	}
}
