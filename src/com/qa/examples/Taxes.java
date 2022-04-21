package com.qa.examples;

import java.util.Scanner;

public class Taxes {

	public static void main(String[] args) {
		while (true) {
			int salary = Integer.parseInt(getInput("Enter salary: "));
			System.out.println(finalPay(salary, percentage(salary)));
		}
	}

	public static int percentage(int salary) {
		if (salary < 15000) {
			return 0;
		} else if (salary < 20000) {
			return 10;
		} else if (salary < 30000) {
			return 15;
		} else if (salary < 45000) {
			return 20;
		} else {
			return 25;
		}
	}

	public static double finalPay(double salary, double percentage) {
		return (salary * ((100-percentage)/100));
	}

	public static String getInput(String message) {
		// Initialise scanner object
		Scanner input = new Scanner(System.in);

		System.out.print(message);
		return input.nextLine();
	}
}
