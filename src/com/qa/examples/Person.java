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
		System.out.println("Hello, my name is " + this.name + ".");
		System.out.println("I am " + this.age + " years old.");
		System.out.println("My shoes size is " + this.shoeSize + ".");
		if (this.jobTitle.equals("Unemployed")) {
			System.out.println("I am " + this.jobTitle);
		} else {
			System.out.println("I work as a " + this.jobTitle);
		}
		System.out.println("I am " + this.height + " feet tall.");
		System.out.println();
	}
	
	public void salute() {
		System.out.println("I've been " + name + ". See you later!");
		System.out.println();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setShoeSize(double shoeSize) {
		this.shoeSize = shoeSize;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
