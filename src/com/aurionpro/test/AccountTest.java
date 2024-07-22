package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		System.out.println("Enter the number of account to create : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Account[] accounts = new Account[n];
		System.out.println("Enter the account details");
		for(int i = 0; i < accounts.length; i++) {
			System.out.println("\n Account " +(i+1)+ " : " );
			int accountNumber = random.nextInt(1000000000);
			System.out.println("Enter Account Holder Name : ");
			String name = sc.next();
			System.out.println("Enter Account Balance : ");
			double balance = sc.nextDouble();
			System.out.println("Enter Account Type ( saving /current ): ");
			String accountType = sc.next();
			
			accounts[i] = new Account(accountNumber,name,  balance, accountType);
		}
		
		for(int i = 0; i<accounts.length; i++) {
			accounts[i].showDetails();
		}
		
		Account maxBalanceAccount = getMaximumBalanceAccount(accounts);
		System.out.println("\nAccount with the maximum balance:");
        maxBalanceAccount.showDetails();

        sc.close();
		
	}
	public static Account getMaximumBalanceAccount(Account[] accounts) {
		Account maxBalanceAccount = accounts[0];
		for(int i = 1; i<accounts.length;i++) {
			if(accounts[i].getBalance() > maxBalanceAccount.getBalance()) {
				maxBalanceAccount= accounts[i];
			}
			
		}
		return maxBalanceAccount;
		
	}

}
