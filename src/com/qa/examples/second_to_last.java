package com.qa.examples;

import java.util.Scanner;

public class second_to_last {
	public static String find(String str, Integer n) {
		return str.split(" ")[n];
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		System.out.println("Enter which word to find: ");
		Integer n = Integer.parseInt(input.nextLine());
		System.out.println(find(sentence, n));
	}
}
