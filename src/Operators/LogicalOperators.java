package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		// && (Both statements has to be true to display true statement)
		// || (Atlest 1 statement has to be true to display true statement)
		// !
		
//		int intValueA = 20;
//		int intValueB = 10;
//		int intValueC = 5;
//		
		
		
		//Lets try && operator (False && False) (True && True)
		
		//1st statement is true as both conditions are true 
//		
//		if (intValueA > intValueB && intValueA > intValueC) {
//			System.out.println("You are right");
//		}
//		else {
//			System.out.println("Please check your number");
//		}
		
		
		//2nd statement is false as one of the statement is false
		
//		if (intValueA > intValueB && intValueA <intValueC) {
//			System.out.println("You are right");
//		}
//		else {
//			System.out.println("Please check your number");
//		}
		
		// Lets try || (Both or any of the statements has to be true to print true)
		
//		if (intValueA > intValueB ||intValueB >intValueC) {
//			System.out.println("You are right");
//		}
//		else {
//			System.out.println("Please check your number");
//		}
		
		
		//Lets try ! && ||
		
		int ValueA = 12;
		int ValueB = 21;
		int ValueC = 111;
		
		 if ( (!(ValueA == ValueB) && !(ValueC <= ValueA))||( (ValueB == ValueA))) {
	            System.out.println("You are correct");
	        } else
	            System.out.println("You are not correct");
	}
}
