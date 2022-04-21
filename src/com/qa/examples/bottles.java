package com.qa.examples;

public class bottles {
	static Integer bottles = 99;
	
	public static void printMessage(String bottles, String plural, String nextBottle, String nextPlural, Integer bottleInt) {
		System.out.println(bottles + " bottle" + plural + " of beer on the wall, " + bottles + " bottle" + plural + " of beer.");
		
		if (bottleInt > 0) {
			System.out.println("Take one down , pass it around, " + nextBottle + " bottle" + nextPlural + " of beer on the wall.\n");
		}
		else {
			System.out.println("Go to the store and buy some more, " + nextBottle + " bottle" + nextPlural + " of beer on the wall.\n");
		}
	}
	
	public static String numberOfBottles(Integer bottles) {
		if (bottles > 0) { return bottles.toString(); }
		else { return "No more"; }
	}
	
	public static String plural(Integer bottles) {
		if (bottles != 1) { return "s"; }
		else { return ""; }
	}
	
	public static void main(String[] args) {
		for (Integer i = 0; i < 205; i++) {
			Integer nextBottle = bottles - 1;
			if (nextBottle < 0) { nextBottle = 99; }
			printMessage(numberOfBottles(bottles), plural(bottles), numberOfBottles(nextBottle), plural(nextBottle), bottles);
			bottles = nextBottle;
		}
	}
}
