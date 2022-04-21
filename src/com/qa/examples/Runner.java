package com.qa.examples;

public class Runner {

	public static void main(String[] args) {

		Person james = new Person("James", 21, 9d, "Developer", 5.9d);
		Person ames = new Person("Ames", 24, 6.5d, "Bartender", 5.2d);
		Person raymond = new Person("Raymond", 54, 12d, "Designer", 6.3);
		Person harry = new Person("Harry", 3, 0.5d, "Geologist", 2.5d);
		Person geoff = new Person("Geoff", 6d);
		
		james.greet();
		james.salute();
		
		ames.greet();
		harry.greet();
		
		ames.salute();
		harry.salute();
		
		raymond.greet();
		raymond.salute();
		
		
		
		
		geoff.setAge(getAge());

		geoff.greet();
		
		geoff.salute();
	}
	
	public static int getAge() {
		return Integer.parseInt(Utilities.getInput("How old are you: "));
	}

}
