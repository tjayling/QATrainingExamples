package com.qa.examples;

public class Anagram {
	public static void main(String[] awrgs) {

		while (true) {
			String word1 = Utilities.getInput("Enter your first word: ");
			String word2 = Utilities.getInput("Enter your second word: ");

			System.out.println(anagram(word1, word2));
		}
	}

	public static Boolean anagram(String w1, String w2) {
		Boolean anagram = true;
		for (char c : w1.toCharArray()) {
			if (w2.contains(String.valueOf(c))) {
				w2 = w2.replace(String.valueOf(c), "");
			} else {
				anagram = false;
			}
		}
		return anagram;
	}

}