package com.qa.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		stringList();
		intList();
	}
	
	public static void intList() {
		List<Integer> ages = new ArrayList<>(List.of(12, 43, 5, 17, 19, 89, 62, 35));
		System.out.println(ages);
		
		Collections.sort(ages);
		
		System.out.println(ages);
	}
	
	public static void stringList() {
		List<String> names = new ArrayList<>();

		names.add("Tom");
		names.add("Zishan");
		names.add("James");
		names.add("Pete");
		names.add("George");

		System.out.println(names);
		System.out.println(names.get(0));

		// setting an item in the list then removing the name at index 4
		names.set(0, "Angela");
		names.remove(4);
		System.out.println(names);

		// sorting the list alphabetically
		Collections.sort(names);
		System.out.println(names);

		// printing the last name in the list
		System.out.println(names.get(names.size() - 1));
		System.out.println();

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		for (String name : names) {
			System.out.println(name);
		}

		Collections.swap(names, 0, 3);
		System.out.println(names);
	}
}
