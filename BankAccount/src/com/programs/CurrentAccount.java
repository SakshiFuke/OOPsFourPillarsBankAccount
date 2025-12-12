package com.programs;

class CurrentAccount extends BankAccount{
	
	private double overdraftLimit;
	public CurrentAccount(String accountNumber,double overdraftLimit,double balance) {
		super(accountNumber, balance);
		this.overdraftLimit=overdraftLimit;
		}
	@Override
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("invalid amount..");
			return;
		}
		else {
			 setBalance(amount+getBalance()); 
			 System.out.println("successfully deposit. new balance = "+getBalance());
		}
		setBalance(getBalance()+amount);
		System.out.println("new balance is "+getBalance());
	}
	@Override
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("invalid amount..");
			return;
		}
		double newbalance=getBalance()-amount;
		if(newbalance<-overdraftLimit) {
			System.out.println("withdraw denied. overdraft limit is exceed.");
			return;
		}
		setBalance(newbalance);
		System.out.println("new balace after withdra "+amount+" is "+getBalance());
	}
}