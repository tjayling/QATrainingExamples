package com.qa.examples;

public class ComplexString {

	public static void main(String[] args) {

		while (true) {

			String sentence = Utilities.getInput("Enter your sentence: ");
			String s = Utilities.getInput("Enter your string to be found: ");

			// System.out.println(howManyWords(sentence));
			// printVertical(sentence);
			// printReverseVertical(sentence);
			System.out.println(find(sentence, s));
			
			System.out.println();
		}
	}

	public static int howManyWords(String sentence) {
		int count = 1;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.substring(i, i + 1).equals(" ")) {
				count++;
			}
		}
		return count;
	}

	public static void printVertical(String sentence) {
		int start = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.substring(i, i + 1).equals(" ")) {
				System.out.println(sentence.substring(start, i));
				start = i + 1;
			} else if (i == sentence.length() - 1) {
				System.out.println(sentence.substring(start, sentence.length()));
			}
		}
	}

	public static void printReverseVertical(String sentence) {
		int start = sentence.length();
		for (int i = sentence.length() - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.println(sentence.substring(0, start));
			} else if (sentence.substring(i - 1, i).equals(" ")) {
				System.out.println(sentence.substring(i, start));
				start = i - 1;
			}
		}
	}

	public static Boolean find(String sentence, String target) {
		int targetLength = target.length();
		int iPlusLength;
		for (int i = 0; i < sentence.length(); i++) {
			iPlusLength = i + targetLength;
			if (iPlusLength <= sentence.length()) {
				if (sentence.substring(i, i + targetLength).equals(target)) {
					return true;
				}
			}
		}
		return false;
	}
}
