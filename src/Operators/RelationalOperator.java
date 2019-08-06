package Operators;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 20;
//		
//		System.out.println("a == b ? = " + "The answer is " + (a == b));
//		System.out.println("a != b ? = " + "The answer is " + (a != b));
//		System.out.println("a > b ? = " + "The answer is " + (a > b));
//		System.out.println("a < b ? = " + "The answer is " + (a < b));
//		System.out.println("b >= a ? = " + "The answer is " + (b >= a));
//		System.out.println("b <= a ? = " + "The answer is " + (b <= a));
//		
		// We can also try this method with taking input
		
		Scanner Relational = new Scanner (System.in);
		
		System.out.println("Please enter the value for A: ");
		        double c = Relational.nextDouble();
		
		System.out.println("Please enter the value for B: "); 
				double d = Relational.nextDouble();
				
		System.out.println("Select the Relational Operator:");
		System.out.println("1 : == ");
		System.out.println("2 : != ");
		System.out.println("3 : > ");
		System.out.println("4 : < ");
		System.out.println("5 : >= ");
		System.out.println("6 : <=");
		
		int choice = Relational.nextInt();
		
		
		//We can try if else if method
		
//		if (choice == 1) {
//			System.out.println("A == B ? = " + "The answer is " + (c == d));
//		}
//		
//		else if (choice == 2) {
//			System.out.println("A != B ? = " + "The answer is " + (c != d));
//		}
//		
//		else if (choice == 3) {
//			System.out.println("A > B ? = " + "The answer is " + (c > d));
//		}
//		
//		else if (choice == 4) {
//			System.out.println("A < B ? = " + "The answer is " + (c < d));
//		}
//		
//		else if (choice == 5) {
//			System.out.println("A >= B ? = " + "The answer is " + (c >= d));
//		}
//		
//		else if (choice == 6) {
//			System.out.println("A <= B ? = " + "The answer is " + (c <= d));
//		}
		
		//We can also try same output with switch
		
		switch (choice) {
		
		case 1:
			System.out.println("A == B ? = " + "The answer is " + (c == d));
			break;
		
		case 2:
			System.out.println("A != B ? = " + "The answer is " + (c != d));
			break;
			
		case 3:
			System.out.println("A > B ? = " + "The answer is " + (c > d));
			break;
			
		case 4:
			System.out.println("A < B ? = " + "The answer is " + (c < d));
			break;
			
		case 5:
			System.out.println("A >= B ? = " + "The answer is " + (c >= d));
			break;
			
		case 6:
			System.out.println("A <= B ? = " + "The answer is " + (c <= d));
			break;
			
		default:
			System.out.println("Your Selection is invalid ! ");
			
		
		}
		
		Relational.close();

	}

}
