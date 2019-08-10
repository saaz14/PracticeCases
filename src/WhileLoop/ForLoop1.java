package WhileLoop;

import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		
//		for (int x = 10; x <= 20; x++) {
//			System.out.println("value of X: " + x);
//		}

		
		Scanner table = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = table.nextInt();

		System.out.println("Table of " + number + " is\n");
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			System.out.println(number + " × " + i + " = " + result);
	}
	}

}
