package WhileLoop;

import java.util.Scanner;

public class Forloop {

	public static Scanner Table;

	public static void main(String[] args) {
		tables();
	}

	public static void tables() {
		Table = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = Table.nextInt();

		System.out.println("Table of " + number + " is\n");
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			System.out.println(number + " × " + i + " = " + result);
		}

		System.out.println("\nDo you want to try another table?\n\nPress 1 for YES\nPress 2 for NO");
		int choice = Table.nextInt();
		if (choice == 1) {
			tables();
		} else {
			System.out.println("\n<<< HAVE S NICE DAY. >>>");
		}
	}
}
