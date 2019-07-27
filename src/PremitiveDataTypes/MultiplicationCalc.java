package PremitiveDataTypes;

import java.util.Scanner;

public class MultiplicationCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("This Calculator can calculate only do Multiplication");
		 
		 System.out.println("Please enter your first intiger value");
		 int avalue = scan.nextInt();
		 
		 System.out.println("Plese Enter your second intiger value");
		 int bvalue = scan.nextInt();
		 
		 int atotal = avalue * bvalue;
		 System.out.println("You are multiplying "+avalue +" to "+bvalue);
		 System.out.println(avalue +" x "+bvalue +" = "+atotal);
		 
		 scan.close();


	}

}
