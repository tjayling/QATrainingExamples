package com.qa.examples;

public class Rice {

	public static void main(String[] args) {

		while (true) {
			int small = Integer.parseInt(Utilities.getInput("How many 1 kilo bags do you have: "));
			int big = Integer.parseInt(Utilities.getInput("How many 5 kilo bags do you have: "));
			int goal = Integer.parseInt(Utilities.getInput("How many kilos to a package: "));

			if (packageRice(big, small, goal)) {
				System.out.println("You have enough rice for a package.");
			} else {
				System.out.println("You don't have enough rice for a package.");
			}
		}
	}

	public static Boolean packageRice(int big, int small, int goal) {
		int totalKilos = ((big * 5) + small);
		if (totalKilos >= goal) {
			return true;
		} else {
			return false;
		}
	}

}
