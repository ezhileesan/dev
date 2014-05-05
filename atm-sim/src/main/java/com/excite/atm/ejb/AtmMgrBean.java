package com.excite.atm.ejb;

import java.util.Scanner;

import com.excite.atm.model.UserAccount;

public class AtmMgrBean implements AtmMgrRemote {

	UserAccount userAccount = null;
	Scanner input = new Scanner(System.in);

	public AtmMgrBean(UserAccount userAcc) {
		userAccount = userAcc;
	}

	public void drawMainMenu() {

		int selection;

		System.out.println("Main Menu");
		System.out.println("1 - View account balance");
		System.out.println("2 - Withdraw funds");
		System.out.println("3 - Add funds");
		System.out.println("4 - Exit");
		System.out.print("Choice: ");
		selection = input.nextInt();

		switch (selection) {
		case 1:
			viewAccountInfo();
			break;
		case 2:
			withdraw();
			break;
		case 3:
			addFunds();
			break;
		case 4:
			System.out.println("Thank you for using this ATM!!!");
		}
	}

	public void viewAccountInfo() {
		System.out.println("Account Information:");
		System.out.println("\t--Total balance: $" + userAccount.getTotalBal());
		System.out.println("\t--Available balance: $"
				+ userAccount.getAvailableBal());
		drawMainMenu();
	}

	public void addFunds() {
		int addSelection;

		System.out.println("Deposit funds:");
		System.out.println("1 - $20");
		System.out.println("2 - $40");
		System.out.println("3 - $60");
		System.out.println("4 - $100");
		System.out.println("5 - Back to main menu");
		System.out.print("Choice: ");
		addSelection = input.nextInt();

		switch (addSelection) {
		case 1:
			deposit(20);
			drawMainMenu();
			break;
		case 2:
			deposit(40);
			drawMainMenu();
			break;
		case 3:
			deposit(60);
			drawMainMenu();
			break;
		case 4:
			deposit(100);
			drawMainMenu();
			break;
		case 5:
			drawMainMenu();
			break;
		}
	}

	public void withdraw() {
		int withdrawSelection;

		System.out.println("Withdraw money:");
		System.out.println("1 - $20");
		System.out.println("2 - $40");
		System.out.println("3 - $60");
		System.out.println("4 - $100");
		System.out.println("5 - Back to main menu");
		System.out.print("Choice: ");
		withdrawSelection = input.nextInt();

		switch (withdrawSelection) {
		case 1:
			checkNsf(20);
			drawMainMenu();
			break;
		case 2:
			checkNsf(40);
			drawMainMenu();
			break;
		case 3:
			checkNsf(60);
			drawMainMenu();
			break;
		case 4:
			checkNsf(100);
			drawMainMenu();
			break;
		case 5:
			drawMainMenu();
			break;
		}
	}

	public void deposit(int depAmount) {
		System.out.println("\n***Please insert your money now...***");
		userAccount.setTotalBal(userAccount.getTotalBal() + depAmount);
		userAccount.setAvailableBal(userAccount.getAvailableBal() + depAmount);
	}

	public void checkNsf(int withdrawAmount) {
		if (userAccount.getTotalBal() - withdrawAmount < 0)
			System.out
					.println("\n***ERROR!!! Insufficient funds in your accout***");
		else {
			userAccount.setTotalBal(userAccount.getTotalBal() - withdrawAmount);
			userAccount.setAvailableBal(userAccount.getAvailableBal()
					- withdrawAmount);
			System.out.println("\n***Please take your money now...***");
		}
	}
}
