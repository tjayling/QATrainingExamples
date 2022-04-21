package com.qa.examples;

public class Factorial {

	public static void main(String[] args) {
		while (true) {
			int num = Integer.parseInt(Utilities.getInput("Enter number: "));
			System.out.println(factorial(num));
		}
	}

	public static int factorial(int num) {
		int total = 1;
		for (int i = num; i > 0; i--) {
			total *= i;
		}
		return total;
	}

}
