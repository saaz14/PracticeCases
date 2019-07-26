package ourFirstJavaPrograme;

import java.util.Scanner;

public class GallonToLiters {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);

System.out.println("Enter Gallons ");
double Gallon = input.nextDouble();

Gallon = (Gallon*3.78);
System.out.println("Liters= " + Gallon);

	}

}