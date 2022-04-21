package com.qa.examples;

import java.util.Scanner;

public class reverse {
	public static String reverse_word(String s) {
		String reversed = "";
		for (String word : s.split(" ")) {
			reversed = String.join(word, " ", reversed);
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string to be reversed: ");
		String to_reverse = input.nextLine();
		System.out.println(reverse_word(to_reverse));
	}
}
