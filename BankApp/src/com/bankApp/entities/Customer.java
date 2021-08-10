package com.bankApp.entities;

public class Customer {
	String name;
	String phoneNo;
	double accountBalance;
	
	public Customer(String name, String phoneNo, double accountBalance) {
		
		this.name = name;
		this.phoneNo = phoneNo;
		this.accountBalance = accountBalance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNo=" + phoneNo + ", accountBalance=" + accountBalance + "]";
	}
	
	
}
