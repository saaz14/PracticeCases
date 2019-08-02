package IfElseStatements;

import java.util.Scanner;

public class CapitalsOfCountries {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter country name. (1st Alphabet has to be capital)");
		String Country = input.nextLine();
		String A = "USA";
		String B = "Pakistan";
		String C = "England";
		String D = "France";
		String E = "China";
		String F = "Japan";
		String G = "India";
		String H = "Uyghuristan";
		String I = "Saudi Arabia";
		String J = "Iran";
	
				
		if (Country.equals(A)) {
		System.out.println("Capital city of " + Country + " is " + "Washington DC");
		}
		else if (Country.equals(B)) {
			System.out.println("Capital city of " + Country + " is " + "Islamabad");
		}
		else if (Country.equals(C)) {
			System.out.println("Capital city of " + Country + " is " + "London");
		}
		else if (Country.equals(D)) {
			System.out.println("Capital city of " + Country + " is " + "Paris");
		}
		else if (Country.equals(E)) {
			System.out.println("Capital city of " + Country + " is " + "Beiging");
		}
		else if (Country.equals(F)) {
			System.out.println("Capital city of " + Country + " is " + "Tokyo");
		}
		else if (Country.equals(G)) {
			System.out.println("Capital city of " + Country + " is " + "Delhi");
		}
		else if (Country.equals(H)) {
			System.out.println("Capital city of " + Country + " is " + "Urumqi");
		}
		else if (Country.equals(I)) {
			System.out.println("Capital city of " + Country + " is " + "Riyyadh");
		}
		else if (Country.equals(J)) {
			System.out.println("Capital city of " + Country + " is " + "Tehran");
		}
		else {
			System.out.println("Unfortunately this country is not updated yet in system");
		}

	}

}
