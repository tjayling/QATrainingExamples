package com.qa.pet;

public class Pet {
	String noise;
	
	public Pet( ) {
		this.noise = "I'm mute";
	}
	
	public void noise() {
		System.out.println(this.noise);
	}
	
	public void doThing() {
		System.out.println("Grr");
	}
	
	public String getNoise() {
		return this.noise;
	}
	
	public void setNoise(String noise) {
		this.noise = noise;
	}
}
