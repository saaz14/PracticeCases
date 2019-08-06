package ourFirstJavaPrograme;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);

System.out.println("Enter Temperature in Fahrenheit ");
int Temperature = input.nextInt();

Temperature = ((Temperature - 32)*5)/9;
System.out.println("Temperature in Celsius = " + Temperature);

input.close();
	}

}
