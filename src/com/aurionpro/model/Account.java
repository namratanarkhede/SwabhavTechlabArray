package com.aurionpro.model;

public class Account {
	private int accountNumber;
	
	private String name;
	
	private double balance;
	
	private String accountType;
	
//	public Account( ) {
//		this.accountNumber =accountNumber ;
//		this.name = name;
//		this.balance = balance;
//		this.accountType = accountType;
//	}
	
	public Account(int accountNumber, String name, double balance, String accountType) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		return this.accountType;
	}
	
	
	public void credit(double creditAmount) {
		if(creditAmount>0) {
			balance += creditAmount;
			System.out.println("Amount credited is : "+creditAmount + " \n Total Balance is :  " +balance);
		}
		else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
	}
	public void debit(double debitAmount) {
		if(debitAmount > 0) {
			if(balance >= debitAmount) {
				balance -= debitAmount;
				System.out.println("Amount debited is : "+debitAmount + " \nTotal Balance is :  " +balance);
			}
			else {
				System.out.println("Insufficient Balance.");
			}
		}else {
            System.out.println("Invalid amount. Please enter a positive value.");
		}
		
	}
	public void showDetails() {
		System.out.println("Account Number : " + this.accountNumber);
		System.out.println("Account Holder Name : "+this.name);
		System.out.println("Balance : "+ this.balance);
		System.out.println("Account Type : "+this.accountType);
		System.out.println("--------------------------------------------");
	}
	
}
