package com.cjc.bankmanagement.client;

import java.util.Scanner;
import com.cjc.bankmanagement.serviceImpl.Sbi;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sbi sbi = new Sbi();
		int num;
		
		do {
			System.out.print("1.Create Account \n2.Account Details \n3.Deposite Money \n"
					+ "4.Withdraw money \n5.Check Balance \n6.Exit \n");
			
			System.out.print("Enter :- ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				sbi.createAccount();
				break;

			case 2:
				sbi.displayAllDetails();
				break;

			case 3:
				sbi.depositeMoney();
				break;

			case 4:
				sbi.withdrawal();
				break;

			case 5:
				sbi.balanceCheck();
				break;
				
			case 6:	
				System.out.println("Thank you");
				break;

			default:
				System.out.println("Invalid Input");
			}

		} while (num<6);

	}
}
