package Operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		Scanner arth = new Scanner(System.in);
		
		System.out.println("Enter your a value:");
		double a = arth.nextDouble();
		
		System.out.println("Enter your b number");
		double b = arth.nextDouble();
		
		System.out.println("Select the Operator:");
		System.out.println("1 : + ");
		System.out.println("2 : - ");
		System.out.println("3 : * ");
		System.out.println("4 : / ");
		System.out.println("5 : % ");
		System.out.println("6 : Prefix++");
		System.out.println("7 : Postfix++");
		
		
		double choice = arth.nextDouble();
		
		if ( choice == 1) {
		System.out.println("a + b = " + (a + b));
		}
		
		else if (choice == 2) {
		System.out.println("a - b = " + (a - b));
		}
		
		else if (choice == 3) {
		System.out.println("a * b = " + (a * b));
		}
		
		else if (choice == 4) {
		System.out.println("a / b = " + (a / b));
		}
		
		else if (choice == 5) {
		System.out.println("a % b = " + (a % b));
		}
	
		else if (choice == 6) {
		System.out.println("Prefix ++a is = " + (++a));
		}
		
		else if (choice == 7) {
		System.out.println(" Postfix a++ is = " + (a++));
		}
		
		arth.close();
		

	}

}
