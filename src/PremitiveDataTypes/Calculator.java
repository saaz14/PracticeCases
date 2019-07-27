package PremitiveDataTypes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner calculator = new Scanner(System.in);
		
		System.out.println("Enter first number: ");

		double first = calculator.nextDouble();

		System.out.println("Enter Second number: ");

		double second = calculator.nextDouble();

		System.out.println("Select methods: ");
		System.out.println("1 : +");
		System.out.println("2 : /");
		System.out.println("3 : *");
		System.out.println("4 : -");

		int choice = calculator.nextInt();
		
		if (choice == 1) {
			System.out.println(first + second);
		}
		if (choice == 2) {
			System.out.println(first / second);
		}
		if (choice == 3) {
			System.out.println(first * second);
		}
		if (choice == 4) {
			System.out.println(first - second);
			
			calculator.close();
		}
		
		

	}

}
