package com.manjeet.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExample3 {

	public static void main(String[] args) {

		List<Employee3> employees = Arrays.asList(
                new Employee3("Alice", 50000),
                new Employee3("Bob", 60000),
                new Employee3("Charlie", 75000),
                new Employee3("David", 55000)
        );

		Optional<Employee3> maxSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee3::getSalary));
		 maxSalaryEmployee.ifPresent(employee -> System.out.println("Employee with max salary: " + employee));

		Optional<Employee3> maxSalary = employees.stream().max((a,b)-> Double.compare(a.getSalary(), b.getSalary()));
		maxSalary.ifPresent(emp-> System.out.println("maxSalary emp : "+maxSalary));

	}
}
