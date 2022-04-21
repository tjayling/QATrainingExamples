package com.qa.examples;

public class Person {
	private String name;
	private int age;
	private double shoeSize;
	private String jobTitle;
	private double height;

	public Person(String name, int age, double shoeSize, String jobTitle, double height) {
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
		this.height = height;
	}

	public Person(String name, double height) {
		this.name = name;
		this.age = 0;
		this.shoeSize = 0d;
		this.jobTitle = "Unemployed";
		this.height = height;
	}

	public void greet() {
		System.out.println("Hello, my name is " + name + ".");
		System.out.println("I am " + age + " years old.");
		System.out.println("My shoes size is " + shoeSize + ".");
		if (jobTitle.equals("Unemployed")) {
			System.out.println("I am " + jobTitle);
		} else {
			System.out.println("I work as a " + jobTitle);
		}
		System.out.println("I am " + height + " feet tall.");
		System.out.println();
	}
	
	public void salute() {
		System.out.println("I've been " + name + ". See you later!");
		System.out.println();
	}
}
