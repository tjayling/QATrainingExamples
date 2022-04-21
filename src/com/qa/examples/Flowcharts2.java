package com.qa.examples;

import java.util.Scanner;

public class Flowcharts2 {

	public static void main(String[] args) {
		while (true) {
			run();
		}
	}
	
	public static void run() {
		int a = Integer.parseInt(getInput("Enter your number: "));
		if (a > 2000) {
			println("A");
			if (a > 6000) {
				println("C");
			} else {
				println("B");
				if (a > 4000) {
					println("D");
				} else {
					println("E");
				}
			}
		} else {
			println(1);
			if (a > 100) {
				println(3);
				if (a > 600) {
					println(5);
				} else {
					println(4);
					if (a > 500) {
						println(6);
					} else {
						println(7);
					}
				}
			} else {
				println(2);
			}
		}
	}
	
	public static String getInput(String message) {
				// Initialise scanner object
				Scanner input = new Scanner(System.in);

				System.out.print(message);
				return input.nextLine();
	}
	public static void println(String s) {
		System.out.println(s);
	}
	public static void println(int s) {
		System.out.println(s);
	}
}
