package com.manjeet.streams;

public class Employee3 {

	private String name;
	private double salary;


	public Employee3() {
	}


	public Employee3(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", salary=" + salary + "]";
	}






}
