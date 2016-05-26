package com.JavaTuts.TuroialPoint;

public class Horse {

	int horseAge;

	public Horse(String name) {
		System.out.println("name chosen is :" + name);
	}

	public void setage(int age) {
		horseAge = age;
	}

	public int getAge() {
		System.out.println("horses age is :" + horseAge);
		return horseAge;
	}

	public static void main(String[] args) {

		/* object creation */

		Horse myHorse = new Horse("doug");

		// call class method to set horses age
		myHorse.setage(10);

		// call another class method to get horses age
		myHorse.getAge();

		// you can access instance variables as follows as well
		System.out.println("Variable Value :" + myHorse.horseAge);
	}
}
