package com.bankApp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.bankApp.entities.Customer;
import com.bankApp.exceptions.LessDigitsException;
import com.bankApp.exceptions.StartingWithZeroException;
import com.bankApp.exceptions.WrongInputException;

import com.bankApp.exceptions.WrongInputException;

public class BankApp {
	public static ArrayList<Customer> customersList = new ArrayList<Customer>();
	public static void main(String[] args) {

		BankApp bankAppObj = new BankApp();
		boolean appRunning = true;
		Scanner sc = new Scanner(System.in);
		int userChoice = 0;
		Customer cust;
		String phoneNo;
		int amount=0;
		while(appRunning) {
			System.out.println();
			System.out.println("Welcome to Our Bank !");
			System.out.println("Please enter your option.");
			System.out.println("1. Add a new Customer.");
			System.out.println("2. Deposit Money.");
			System.out.println("3. Withdraw Money.");
			System.out.println("4. Show all Customers.");
			System.out.println("0. Exit.");
			System.out.println("Enter your choice : ");
			try {
				userChoice = sc.nextInt();
				if(userChoice > 4) {
					throw new WrongInputException("Choice can not be more than 4");
				}else if(userChoice < 1) {
					throw new WrongInputException("Choice can not be less than 1");
				}

			} catch(InputMismatchException e) {
				System.out.println("You have entered an invalid input");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
			}
			sc.nextLine();// to clear the buffer; if we dont clear the buffer the while loop will go inside an endless loop
			switch(userChoice) {
			case 0: 
				System.out.println("Bye !");
				appRunning = false;
				break;
			case 1: 
				cust = bankAppObj.addnewCustomer();
				customersList.add(cust);
				break;

			case 2: 
				System.out.print("Enter Customer Phone Number : ");
				phoneNo = sc.next();
				try {
					if(bankAppObj.phoneNoExists(phoneNo) != -1) {
						System.out.println("Enter the amount you want to add : ");
						amount = sc.nextInt();

						if(amount > 0) {
							Customer c = customersList.get(bankAppObj.phoneNoExists(phoneNo));
							c.setAccountBalance(c.getAccountBalance()+amount);
						}
					}else {
						System.out.println("Customer not Found");
					}
				}catch(InputMismatchException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3: 
				System.out.print("Enter Customer Phone Number : ");
				phoneNo = sc.next();
				if(bankAppObj.phoneNoExists(phoneNo) != -1) {
					System.out.println("Enter the amount you want to withdraw : ");
					try {
						amount = sc.nextInt();

						if(amount > 0) {
							Customer c = customersList.get(bankAppObj.phoneNoExists(phoneNo));
							if(amount < c.getAccountBalance()) {
								c.setAccountBalance(c.getAccountBalance()+amount);
							}else {
								System.out.println("You have requested more than the available balances");
							}
						}

					}catch(InputMismatchException e) {
						System.out.println(e.getMessage());
					}
				}else {
					System.out.println("Customer not Found");
				}
				break;
			case 4: 
				for (Customer customer : customersList) {
					System.out.println(customer.toString());
				}
				break;
			}

		}

		sc.close();
	}

	public Customer addnewCustomer() {
		Scanner input = new Scanner(System.in);
		Customer cust;
		String custName = "";
		String phoneNo = "";

		System.out.println("Enter Customer name");
		custName = input.nextLine();
		int phoneNoLength;
		while(phoneNo.length() <= 1) {
			System.out.println("Enter Customer Phone Number (minimum 10 digits, can not start with 0): ");
			try {
				phoneNo = input.next();

				phoneNoLength = phoneNo.length();
				if(phoneNoLength<10) {
					throw new LessDigitsException("phone number length is smaller than 10 digits");
				}else if(phoneNo.charAt(0) == '0'){
					throw new StartingWithZeroException("phone number is less than 10 digits");
				}
			}catch(LessDigitsException e) {
				System.out.println(e.getMessage());
				phoneNo="";
			}catch(StartingWithZeroException e) {
				System.out.println(e.getMessage());
				phoneNo="";
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				phoneNo="";
			}

		}

		cust = new Customer(custName, phoneNo, 0);
		System.out.println("Customer Created : "+ cust.toString());

		return cust;
	}

	public int phoneNoExists(String no) {
		int i = 0;
		for (Customer c : customersList) {
			if(c.getPhoneNo().equals(no)) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
