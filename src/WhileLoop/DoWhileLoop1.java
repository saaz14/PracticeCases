package WhileLoop;

import java.util.Scanner;

public class DoWhileLoop1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int value = 0;
		
		do {
			System.out.println(" Enter a number: ");
			value = scan.nextInt();
		}
		while (value != 5); // as long as we enter the value of value not equal to 5, while loop will be true and continue to loop
		System.out.println("Congratulations!"); // This line will only print if the while statement becomes false and the loop terminates.

	}

}
