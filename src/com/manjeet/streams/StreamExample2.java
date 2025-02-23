package com.manjeet.streams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class StreamExample2 {
	public static void main(String[] args) throws ParseException {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyy");
    Date joiningDateRam = simpleDateFormat.parse("01-01-2000");
    Date joinigDateShyam = simpleDateFormat.parse("01-01-1995");
    Date joiningDateGhanshayam = simpleDateFormat.parse("01-01-1990");
    Date joiningDateManjeet = simpleDateFormat.parse("01-01-1985");
    Date joiningDateRanjeet = simpleDateFormat.parse("01-01-1980");
    Date joiningDateSanjeet = simpleDateFormat.parse("01-01-1975");

    List<Employee2> list = Arrays.asList(
                new Employee2(101,"Ram", 10000.0,joiningDateRam,"M"),
                new Employee2(102,"Shyam", 20000.0,joinigDateShyam,"M"),
                new Employee2(103,"Ghanshyam", 30000.0,joiningDateGhanshayam,"M"),
                new Employee2(104,"Manjeet", 50000.0,joiningDateManjeet,"M"),
                new Employee2(105,"Ranjeet", 40000.0,joiningDateRanjeet,"M"),
                new Employee2(106,"Sanjeet", 80000.0,joiningDateSanjeet,"M")
    );

    Optional<Employee2> maxSalaryEmp = list.stream().max((o1, o2) -> Double.compare(o1.getEmpSalary(), o2.getEmpSalary()));
    maxSalaryEmp.ifPresent(emp-> System.out.println("Max Salary Employee : "+maxSalaryEmp));
	}
}

