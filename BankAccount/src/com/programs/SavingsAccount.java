package com.programs;

class SavingsAccount extends BankAccount{
	
	//private for accessecibility //static same for all obj //final the value will not change 
		private static final double min_balance=500.00;
		
		public SavingsAccount(String accountNumber, double balance) {
			super(accountNumber, balance);
		}
		
		@Override
		public void deposit(double amount) {
			if(amount<=0) {
				System.out.println("Invalid amoount..");
				//Early exit
				return;
			}
			else {
				 setBalance(amount+getBalance()); 
				 System.out.println("successfully deposit. new balance = "+getBalance());
			}
		}
		@Override
		public void withdraw(double amount) {
			if(amount<=0) {
				System.out.println("Invalid amoount..");
				//Early exit
				return;
			}
			double newbalance=getBalance()-amount;
			if(newbalance<min_balance) {
				System.out.println("withdraw denide. saving account must be contain min balace  "+min_balance);
				return;
			}
			setBalance(newbalance);
			System.out.println("new blance after withdraw "+amount+" is "+getBalance());
		}
		
	}