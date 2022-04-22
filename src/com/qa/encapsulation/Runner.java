package com.qa.encapsulation;

public class Runner {

	public static void main(String[] args) {

		Encapsulation example = new Encapsulation();

		example.setAccountNumber(2313326453234555555L);
		example.setAge(34);
		example.setBankBalance(0.01f);
		example.setHeight(5.2);
		example.setName("Jeremy");
		
		
		System.out.println(example);
	
	}

}
