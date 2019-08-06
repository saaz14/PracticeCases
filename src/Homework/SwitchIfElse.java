package Homework;

import java.util.Scanner;

public class SwitchIfElse {

	public static Scanner atm;
	public static float balance = 0;

	public static void main(String[] args) {

		atm = new Scanner(System.in);

		System.out.println("<<<<<<<< Greetings!! >>>>>>>>\n----------------------------------------------------");

		transaction();

	}

	public static void transaction() {

		System.out.println(
				"<< Main Menu >>\n\nPlease Select from the following:\n1: Balance Inquiry\n2: Withdraw\n3: Deposit \n");
		int choice = atm.nextInt();

		switch (choice) {

		case 1:
			System.out.println("\nYour balance is " + balance + "\n");
			anothertransaction1();
			break;

		case 2:
			System.out.println("\nPlease enter amount to withdraw: ");
			float amount = atm.nextFloat();
			if (amount > balance || amount == 0) {
				System.out.println("You have insufficient funds \n");
				anothertransaction1();
			} else {
				balance = balance - amount;
				System.out.println("You have withdrawn " + amount + "\nYour new balance is " + balance + "\n");
				anothertransaction1();
			}
			break;

		case 3:
			System.out.println("\nPlease enter amount you would like to deposit: ");
			float deposit = atm.nextFloat();
			balance = deposit + balance;
			System.out.println("You have deposited " + deposit + "\nYour new Balance is " + balance + "\n");
			anothertransaction1();
			break;

		default:
			System.out.println("Invalid Selection");
			anothertransaction1();

		}
	}

	public static void anothertransaction1() {

		System.out.println("Do you want another transaction? \n");
		System.out.println("Press 1 for another transaction");
		System.out.println("Press 2 to exit \n");
		int anothertransaction1 = atm.nextInt();
		if (anothertransaction1 == 1) {
			transaction();
		} else if (anothertransaction1 == 2) {
			System.out.println("Thanks for choosing us. \n\n<<<<<<<< Good Bye! >>>>>>>>");
		} else {
			System.out.println("Invalid selection\n");
			anothertransaction1();

		}			
	}
}
