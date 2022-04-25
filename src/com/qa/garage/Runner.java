package com.qa.garage;

public class Runner {

	public static void main(String[] args) {

		Garage myGarage = new Garage();

		myGarage.addVehicle("truck", 10);

		myGarage.getVehicles();

	}

}
