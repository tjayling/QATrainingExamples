package com.qa.examples;

public class UniqueSum {

	public static void main(String[] args) {
		while (true) {
			int sum = uniqueSum(Integer.parseInt(Utilities.getInput("Number 1: ")), Integer.parseInt(Utilities.getInput("Number 2: ")),
					Integer.parseInt(Utilities.getInput("Number 3: ")));
			
			System.out.println(sum);
		}
	}

	public static int uniqueSum(int num1, int num2, int num3) {
		
		if (num1 == num2 && num2 == num3) {
			return 0;
		} else if (num1 == num2) {
			return num3;
		} else if (num2 == num3) {
			return num1;
		} else if (num1 == num3) {
			return num2;
		} else {
			return num1 + num2 + num3;
		}
	}
}
