package com.programs;

abstract class BankAccount{
	
	private final String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	protected void setBalance(double b) {
		this.balance=b;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	
}