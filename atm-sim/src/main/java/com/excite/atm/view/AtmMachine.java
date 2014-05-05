package com.excite.atm.view;

import java.util.Scanner;

import com.excite.atm.controller.AtmController;
import com.excite.atm.model.UserAccount;

public class AtmMachine {

	public static void main(String args[]) {
		UserAccount userAccount = new UserAccount();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your account number: ");
		userAccount.setAccountNumber(input.nextInt());
		System.out.print("Enter your pin number: ");
		userAccount.setPin(input.nextInt());

		AtmController atmController = new AtmController();
		atmController.execute(userAccount);
	}
}