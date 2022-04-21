package com.qa.examples;

import java.text.DecimalFormat;

public class Coins {

	static String[] cashStr;
	static double[] cash;

	static DecimalFormat numberFormat;
	
	public static void main(String[] args) {
		numberFormat = new DecimalFormat("#.00");
		
		double val = Double.parseDouble(Utilities.getInput("What is the value of your items: "));
		double total = Double.parseDouble(Utilities.getInput("How much cash are you paying with: "));

		double money = total - val;

		cash = new double[11];
		cashStr = new String[11];

		cashStr[0] = "£20 note";
		cashStr[1] = "£10 note";
		cashStr[2] = "£5 note";
		cashStr[3] = "£2 coin";
		cashStr[4] = "£1 coin";
		cashStr[5] = "50p coin";
		cashStr[6] = "20p coin";
		cashStr[7] = "10p coin";
		cashStr[8] = "5p coin";
		cashStr[9] = "2p coin";
		cashStr[10] = "1p coin";

		cash[0] = 20d;
		cash[1] = 10d;
		cash[2] = 5d;
		cash[3] = 2d;
		cash[4] = 1d;
		cash[5] = 0.5d;
		cash[6] = 0.2d;
		cash[7] = 0.1d;
		cash[8] = 0.05d;
		cash[9] = 0.02d;
		cash[10] = 0.01d;

		coins(money);
	}

	public static double coins(double money) {
		double remainder = money;
		System.out.println("Your change will be: ");

		for (int i = 0; i < cash.length; i++) {
			numberFormat.format(remainder); //DecimalFormat numberFormat = new DecimalFormat("#.00");
			double cashes = (remainder - (remainder % cash[i])) / cash[i];
			if (cashes >= 1) {
				System.out.println((int) cashes + " " + cashStr[i]);
				remainder = remainder % cash[i];
			}
			System.out.println(remainder);
		}
		return remainder;
	}

}
