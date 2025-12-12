package com.programs;
//In this program we are using four pilers concept i.e abstraction , encapsulation
//polymorphisum and inheritance 

public class MainClass {
	public static void main(String[] args) {
	
		SavingsAccount sa=new SavingsAccount("ASB1002", 500);
		CurrentAccount ca=new CurrentAccount("ICC2001", 200, 500);
		
		System.out.println("TRANSACTION FOR SAVING ACCOUNT ");
		sa.deposit(50);
		sa.withdraw(500.70);
		sa.withdraw(50);
		System.out.println();
		System.out.println("TRANSACTION FOR CURRENT ACCOUNT ");
		ca.deposit(100);
		ca.withdraw(600);
		ca.deposit(4000);
		ca.withdraw(500);
		
	}
}
