package com.qa.examples;

public class Results {
	static double physics;
	static double chemistry;
	static double biology;
	static double total;
	static double percentage;

	public static void main(String[] args) {
		physics = 75;
		chemistry = 99;
		biology = 102;
		total = 150;
		String individualResults = individual();
		String totalResults = total();
		System.out.println(individualResults);
		System.out.println("");
		System.out.println(totalResults);
	}

	private static String individual() {
		double chemPercentage = (chemistry / total) * 100;
		double phyPercentage = (physics / total) * 100;
		double bioPercentage = (biology / total) * 100;
		
		String chemPass = "Fail";
		String bioPass = "Fail";
		String phyPass = "Fail";
		
		if (chemPercentage >= 60) {
			chemPass = "Pass";
		}
		if (bioPercentage >= 60) {
			bioPass = "Pass";
		}
		if (phyPercentage >= 60) {
			phyPass = "Pass";
		}
		return ("Chemistry score: " + chemistry + "\nChemistry percentage: " + chemPercentage + " " + chemPass +
				"\nBiology score: " + biology + "\nBiology percentage: " + bioPercentage + " " + bioPass +
				"\nPhysics score: " + physics + "\nPhysics percentage: " + phyPercentage + " " + phyPass);
	}
	private static String total() {
		double totalScore = chemistry + physics + biology;
		double totalMax = 450;
		double totalPercentage = (totalScore / totalMax) * 100;
		return ("Total score was: " + totalScore + "\nTotal percentage was: " + totalPercentage);
	}
}
