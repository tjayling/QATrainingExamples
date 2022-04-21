package com.qa.examples;

public class Integers {
	static String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	static String[] tens = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public static void main(String[] args) {

		while (true) {
			int num = Integer.parseInt(Utilities.getInput("Enter your number: "));
			System.out.println(returnString(num));
		}
	}

	public static void addDig(String num) {
		int num1 = num.charAt(0);
		int num2 = num.charAt(1);
		System.out.println(num1 + num2);
	}

	public static String returnString(int num) {
		if (num == 0) {
			return ones[0];
		} else if (num < 20) {
			return ones[num];
		} else if (num < 100) {
			return tens[((num - (num % 10)) / 10) - 2] + " " + ones[num % 10];
		} else if (num < 1000) {
			return returnHundreds(num);
		} else if (num < 10000) {
			return returnThousands(num);
		} else {
			return "Number is too high.";
		}
	}

	public static String returnThousands(int num) {
		return ones[(num - num % 1000)/1000] + " thousand " + returnHundreds(num-(num-(num%1000)));
	}

	public static String returnHundreds(int num) {
		String s = ones[(num - (num % 100)) / 100] + " hundred and ";

		if (num % 100 < 20) {
			s += ones[num % 100];
		} else {
			int t = (num - (num - (num % 100)));
			t = ((t - (t % 10)) / 10) - 2;
			int o = (num - (num - (num % 100)));
			o = o % 10;

			s += tens[t] + " " + ones[o];
		}
		return s;
	}
}
