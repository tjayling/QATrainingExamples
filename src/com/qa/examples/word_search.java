package com.qa.examples;

import java.util.Scanner;

public class word_search {
	public static Boolean search(String s, String w) {
		if (s.contains(w)) { ;
			return true;
		}
		else {
			return false;
			}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter sentence: ");
			String sentence = input.nextLine();
			System.out.println("Enter word to find in sentence: ");
			String word = input.nextLine();
			System.out.println(search(sentence, word));
		}
	}
}
