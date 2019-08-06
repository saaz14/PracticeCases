package ourFirstJavaPrograme;

import java.util.Scanner;

public class InformationForm {

	public static void main(String[] args) {
		
		// Creating data fields
		 Scanner InputField = new Scanner(System.in);
		 System.out.println("First Name:");
		 String FirstName = InputField.nextLine();
		 
		 System.out.println("Last Name:");
		 String LastName = InputField.nextLine();
		
		 System.out.println("Date Of Birth:");
		 String DateOfBirth = InputField.nextLine();
		 
		 System.out.println("Patient's Complete Address:");
		 String Address = InputField.nextLine();
		 
		 System.out.println("Phone Number:");
		 long PhoneNumber = InputField.nextLong();
		 
		 System.out.println("Height:");
		 double Height = InputField.nextDouble();
		 
		 System.out.println("I have had a Blood Test Done in last 6 Months: (True or False)");
		 boolean BloodTest = InputField.nextBoolean();
		 
		 // Compiling Everything Together
		 System.out.println("Patient's First and Last Name: "  + FirstName + " " + LastName);
		 System.out.println("Patient's Date Of Birth: " + DateOfBirth);
		 System.out.println("Patient's Address is: " + Address);
		 System.out.println("Patient's Phone Number: " + PhoneNumber);
		 System.out.println("Patient's Height: " + Height);
		 System.out.println("Blood Test performed within last 6 months: " + BloodTest);
		 
		 
		 InputField.close();
	}

}
