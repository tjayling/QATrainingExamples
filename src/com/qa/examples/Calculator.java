package com.qa.examples;

public class Calculator {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 200;
		char op = 'd';
		Double result = calculate(num1, num2, op);
		System.out.println(result);
	}

	public static double calculate(int num1, int num2, char operator) {
		switch (operator) {
		case 'a':
			return ((double) num1 + num2);
		case 's':
			return ((double) num1 - num2);
		case 'm':
			return ((double) num1 * num2);
		case 'd':
			return ((double) num1 / num2);
		}
		return (0d);
	}
}
