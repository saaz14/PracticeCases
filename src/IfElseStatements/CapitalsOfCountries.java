package IfElseStatements;
 
import java.util.Scanner;
 
public class CapitalsOfCountries {
	
    public static Scanner input;
 
    public static void main(String[] args) {
       
        statements();
    }
   
    public static void statements() {
       
        input = new Scanner(System.in);
       
       
        System.out.println("Please enter country name:");
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
        String K = "Turkey";
        String L = "Australia";
   
               
        if (Country.equalsIgnoreCase(A)) {
        System.out.println("\nCapital city of " + Country + " is " + "Washington DC");
        anotherstatement();
        }
        else if (Country.equalsIgnoreCase(B)) {
            System.out.println("\nCapital city of " + Country + " is " + "Islamabad");
            anotherstatement();
        }
        else if (Country.equalsIgnoreCase(C)) {
            System.out.println("\nCapital city of " + Country + " is " + "London");
            anotherstatement();
        }
        else if (Country.equalsIgnoreCase(D)) {
            System.out.println("\nCapital city of " + Country + " is " + "Paris");
            anotherstatement();
        }
        else if (Country.equalsIgnoreCase(E)) {
            System.out.println("\nCapital city of " + Country + " is " + "Beiging");
            anotherstatement();
        }
        else if (Country.equalsIgnoreCase(F)) {
            System.out.println("\nCapital city of " + Country + " is " + "Tokyo");
            anotherstatement();
        }
        else if (Country.equalsIgnoreCase(G)) {
            System.out.println("\nCapital city of " + Country + " is " + "Delhi");
            anotherstatement();
        }
        else if (Country.equalsIgnoreCase(H)) {
            System.out.println("\nCapital city of " + Country + " is " + "Urumqi");
            anotherstatement();
        }
        else if (Country.equalsIgnoreCase(I)) {
            System.out.println("\nCapital city of " + Country + " is " + "Riyyadh");
            anotherstatement();
        }
        else if (Country.equalsIgnoreCase(J)) {
            System.out.println("\nCapital city of " + Country + " is " + "Tehran");
            anotherstatement();
        }
        else if (Country.equalsIgnoreCase(K)) {
            System.out.println("\nCapital city of " + Country + " is " + "Istanbul");
            anotherstatement();
        }
            else if (Country.equalsIgnoreCase(L)) {
            System.out.println("\nCapital city of " + Country + " is " + "Canberra");
            anotherstatement();
        }
        else {
            System.out.println("\nUnfortunately this country is not updated yet in system");
            anotherstatement();
        }
 
    }
 
public static void anotherstatement () {
    System.out.println("\nDo you want to continue?");
    System.out.println("Press 1 for Yes \nPress 2 for No");
    int anotherstatement = input.nextInt();
    if ( anotherstatement == 1) {
        statements();
    }
    else {
        System.out.println("\n<<< Good Bye >>>");
    }
}

}