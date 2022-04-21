package com.qa.examples;

import java.util.Scanner;

public class Utilities {
	public static String getInput(String message) {
		// Initialise scanner object
		Scanner input = new Scanner(System.in);

		System.out.print(message);
		
		
		return input.nextLine();
	}
	public static void println(String s) {
		System.out.println(s);
	}
	public static void println(int a) {
		System.out.println(a);
	}
}
