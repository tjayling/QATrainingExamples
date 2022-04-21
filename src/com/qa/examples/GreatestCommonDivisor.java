package com.qa.examples;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(Utilities.getInput("Number 1: "));
		int num2 = Integer.parseInt(Utilities.getInput("Number 2: "));
		Utilities.println("Greatest common denominator is: " + getGCD(num1, num2));

	}

	public static int getGCD(int x, int y) {
		for (int i = 2; i < 100; i++) {
			if ((x % i == 0) && (y % i == 0)) {
				return i;
			}
		}
		return 1;
	}

}

