package com.JavaTuts.TuroialPoint;

public class Employee {

	private String name;				
	private int age;
	private String designation;
	private double salary;

	public Employee(String name) {  		// Constructor
		this.name = name;
	}

	//all can be classed as setters
	public void empAge(int empAge) {		//assign the age to the variable age
		age = empAge;
	}

	public void empDesignation(String empDesig) {	//assign designation to the variable designation
		designation = empDesig;
	}

	public void empSalary(double empSalary) { 		//assign salary to the variable salary
		salary = empSalary;

	}

	public void printEmployee(){ 					//print employee details.
	System.out.println("name :" + name);
	System.out.println("Age :" + age);
	System.out.println("designation :" + designation);
	System.out.println("salary:" + salary);
	}
}
