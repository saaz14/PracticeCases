package PremitiveDataTypes;

import java.util.Scanner;

public class AdditionCalc {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("This Calculator can calculate only do Addition");
		 
		 System.out.println("Please enter your first intiger value");
		 int avalue = scan.nextInt();
		 
		 System.out.println("Plese Enter your second intiger value");
		 int bvalue = scan.nextInt();
		 
		 int atotal = avalue + bvalue;
		 System.out.println("You are adding "+avalue +" to "+bvalue);
		 System.out.println(avalue +" + "+bvalue +" = "+atotal);
		 
		 scan.close();
		 
				 

	}

}
