package com.qa.pet;

public class Runner {

	public static void main(String[] args) {

		Dog ralph = new Dog();
		Cat marley = new Cat();
		
		ralph.noise();
		ralph.doThing();
		
		marley.noise();
		marley.doThing();
		
		marley.setNoise("Hiss");
		
		marley.noise();

	}

}
