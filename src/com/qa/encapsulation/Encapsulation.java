package com.qa.encapsulation;

public class Encapsulation {
	private String name;
	private int age;
	private double height;
	private float bankBalance;
	private long accountNumber;
	
	public Encapsulation(String name, int age, double height, float bankBalance, long accountNumber) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.bankBalance = bankBalance;
		this.accountNumber = accountNumber;
	}
	public Encapsulation() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public float getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(float bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", age=" + age + ", height=" + height + ", bankBalance=" + bankBalance
				+ ", accountNumber=" + accountNumber + "]";
	}

	
	
}
