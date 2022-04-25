package com.qa.garage;

public class Car extends Vehicle {
	public Car(int value, int ID) {
		super("car", value, ID);
		this.valueMultiplier = 100;
	}
}
