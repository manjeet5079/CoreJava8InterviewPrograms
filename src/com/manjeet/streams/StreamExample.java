package com.manjeet.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(75,25,35,75,95,15,45,65,22,44,88,66,99);

		List<Integer> geraterThan35 = asList.stream().filter(i->i>35).sorted().collect(Collectors.toList());
		System.out.println("geraterThan35 : "+geraterThan35);

		List<Integer> lessThan35WithGrace5 = asList.stream().filter(i->i<35).map(i->i+5).sorted().collect(Collectors.toList());
		System.out.println("lessThan35WithGrace5 : "+lessThan35WithGrace5);

		long countlessThan35WithGrace5 = asList.stream().filter(i->i>35).map(j->j+5).count();
		System.out.println("countlessThan35WithGrace5 : "+countlessThan35WithGrace5);

		List<Integer> sortedInAssendingOrder = asList.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedInAssendingOrder : "+sortedInAssendingOrder);

		List<Integer> sortedInAssendingOrder1 = asList.stream().sorted((a,b)->a-b).collect(Collectors.toList());
		System.out.println("sortedInAssendingOrder1 : "+sortedInAssendingOrder1);

		List<Integer> sortedInAssendingOrder3 = asList.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		System.out.println("sortedInAssendingOrder3 : "+sortedInAssendingOrder3);

		List<Integer> sortedByDecending = asList.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println("sortedByDecending : "+sortedByDecending);

		List<Integer> sortedByDecending2 = asList.stream().sorted((a,b)->(a<b)?1:(a>b)?-1:0).collect(Collectors.toList());
		System.out.println("sortedByDecending2 : "+sortedByDecending2);

		List<Integer> sortedByDecending3 = asList.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println("sortedByDecending3 : "+sortedByDecending3);

		List<Integer> sortedByDecending4 = asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("sortedByDecending4 : "+sortedByDecending4);
	}

}
