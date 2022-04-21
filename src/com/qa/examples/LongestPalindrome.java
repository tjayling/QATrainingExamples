package com.qa.examples;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s1 = Utilities.getInput("Enter your first string: ");
		String s2 = Utilities.getInput("Enter your second string: ");

		System.out.println(findPalindrome(s1, s2));
	}

	public static String findPalindrome(String s1, String s2) {
		String palindrome = "";

		int start = 0;

		for (int i = 0; i <= s1.length(); i++) {
			if (i == s1.length() || s1.substring(i, i + 1).equals(" ")) {
				String substringCheck = s1.substring(start, i);
				String palindromeCheck = new StringBuilder(s1.substring(start, i)).reverse().toString();

				if (substringCheck.equals(palindromeCheck) && s2.contains(substringCheck)) {
					if (substringCheck.length() > palindrome.length()) {
						palindrome = substringCheck;
					}
				}
				start = i + 1;
			}
		}
		return palindrome;
	}

}
