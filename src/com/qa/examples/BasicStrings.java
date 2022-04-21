package com.qa.examples;

public class BasicStrings {

	public static void main(String[] args) {

		String s1 = "yesterday it was raining";
		String s2 = "today it is sunny";

		String newString = (s2 + ", " + s1).toUpperCase();
		System.out.println(newString);
		
		String newSubString = s2.substring(0, 12).concat(s1.substring(17, 24));
		System.out.println(newSubString);
	}

}
