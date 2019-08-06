package ourFirstJavaPrograme;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner InputField = new Scanner(System.in);

		System.out.println("What is the Car Make:");
		String Make = InputField.nextLine();

		System.out.println("What is the Model of your car:");
		String Model = InputField.nextLine();

		System.out.println("What year is the make?");
		String year = InputField.nextLine();

		System.out.println("Your current Car is " + Make + " " + Model + " " + year);

		
		InputField.close();
	}

}
