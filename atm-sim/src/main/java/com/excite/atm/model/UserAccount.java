package com.excite.atm.model;

import java.util.Locale;

public class UserAccount {

	private double availableBal = 80;
	private double totalBal = 100;

	private int accountNumber;
	private int pin;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getAvailableBal() {
		return availableBal;
	}

	public double getTotalBal() {
		return totalBal;
	}

	public void setAvailableBal(double availableBal) {
		this.availableBal = availableBal;
	}

	public void setTotalBal(double totalBal) {
		this.totalBal = totalBal;
	}

}
