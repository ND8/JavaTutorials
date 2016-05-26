package com.JavaTuts.TuroialPoint;

public class EmployeeTest {

	public static void main(String args[]){
		
		/*create 2 objects using constructor*/
		Employee empOne = new Employee("doug");
		Employee empTwo = new Employee("dean");
		
		/*invoking methods for each object created */
	empOne.empAge(23);
	empOne.empDesignation("senior developer");
	empOne.empSalary(30000);
	empOne.printEmployee();
	
	empTwo.empAge(28);
	empTwo.empDesignation("senior frontend developer");
	empTwo.empSalary(30000);
	empTwo.printEmployee();
	}
	
}
