package com.cjc.bankmanagement.serviceImpl;

import com.cjc.bankmanagement.model.Account;
import com.cjc.bankmanagement.service.Rbi;
import java.util.Scanner;

public class Sbi implements Rbi {
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	public void createAccount() {
		ac.setAccNo(78456985);
		ac.setName("Tony Stark");
		ac.setMobNo("9764192065");
		ac.setAdharNo("4569 5822 0144");
		ac.setGnder("Male");
		ac.setAge(23);
		ac.setBalance(45200);
	}

	public void displayAllDetails() {
		System.out.println("\n*****Account holder details*****");
		System.out.println("Account Number :- " + ac.getAccNo());
		System.out.println("Account holder name :- " + ac.getName());
		System.out.println("Mobile Number :- " + ac.getMobNo());
		System.out.println("Adhaar Number :- " + ac.getAdharNo());
		System.out.println("Gender :- " + ac.getGender());
		System.out.println("Age :- " + ac.getAge());
		System.out.println("Account Balance :- " + ac.getBalance()+"\n");
	}

	public void depositeMoney() {
		System.out.print("\nEnter amount to deposite :- ");
		double depositeAmount = sc.nextInt();

		double balance = ac.getBalance();

		double currentBalance = depositeAmount + balance;

		System.out.println("Current balance :- "+ currentBalance+"\n");
	}

	public void withdrawal() {
		System.out.print("\nEnter amount to withdrwal :- ");
		double withdrwalAmount = sc.nextInt();

		double balance = ac.getBalance();

		double currentBalance = balance - withdrwalAmount;

		System.out.print("Current balance :- "+currentBalance );
		System.out.println("\n");
	}

	public void balanceCheck() {
		System.out.print("Cureent balance :- " + ac.getBalance());
	}
}
