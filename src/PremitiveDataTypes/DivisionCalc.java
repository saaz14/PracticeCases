package PremitiveDataTypes;

import java.util.Scanner;

public class DivisionCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("This Calculator can calculate only do Division");
		 
		 System.out.println("Please enter your first intiger value");
		 double avalue = scan.nextDouble();
		 
		 System.out.println("Plese Enter your second intiger value");
		 double bvalue = scan.nextDouble();
		 
		 double atotal = avalue / bvalue;
		 System.out.println("You are dividing "+avalue +" to "+bvalue);
		 System.out.println(avalue +" / "+bvalue +" = "+atotal);
		 
		 scan.close();

	}

}
