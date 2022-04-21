package com.qa.examples;

import java.util.Scanner;

public class Flowcharts {
	public static void main(String[] args) {
		while (true) {
			String[] strings = getInputs();
			int[] nums = getInts(strings);
			boolean bool = getOp(strings[2].charAt(0));
			System.out.println("\nResult: " + simpleCalc(nums[0], nums[1], bool));

		}
	}

	public static String[] getInputs() {
		// Initialise strings list
		String[] strings = new String[3];
		// Initialise scanner object
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter number 1: ");
		strings[0] = input.nextLine();
		System.out.print("Enter number 2: ");
		strings[1] = input.nextLine();
		System.out.print("+ or *: ");
		strings[2] = input.nextLine();

		return strings;
	}

	public static int[] getInts(String[] strings) {
		int[] ints = new int[2];
		ints[0] = Integer.parseInt(strings[0]);
		ints[1] = Integer.parseInt(strings[1]);
		return ints;
	}

	public static boolean getOp(char op) {
		switch (op) {
		case '+':
			return true;
		case '*':
			return false;
		default:
			return false;
		}
	}

	public static int simpleCalc(int num1, int num2, boolean bool) {
		if (bool) {
			return (num1 + num2);
		} else {
			return (num1 * num2);
		}
	}

}
