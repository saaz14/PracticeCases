package Class31Aug;

public class UnicodeTesting {

	public static void main(String[] args) {

		int additionTotal = calc(33, 33, "addition");

		int subtractionTotal = calc(43, 33, "subtraction");

		int multiplicationTotal = calc(3, 3, "multiplication");

		int divisionTotal = calc(3, 3, "division");

		if (additionTotal == 66) {
			System.out.println("for addition you are correct");
		} else {
			System.out.println("There is something wrong your calculator method");
		}

		
		if (subtractionTotal == 10) {
			System.out.println("for Subtraction you are correct");
		} else {
			System.out.println("There is something wrong your calculator method");
		}
		
		if (multiplicationTotal == 9) {
			System.out.println("for Multiplication you are correct");
		} else {
			System.out.println("There is something wrong your calculator method");
		}
		
		if (divisionTotal == 1) {
			System.out.println("For division you are correct");
		} else {
			System.out.println("There is something wrong your calculator method");
		}
	}

	public static int calc(int num1, int num2, String operation) {

		int total = 0;

		switch (operation) {
		case "addition":
			total = adding2number(num1, num2);
			break;

		case "subtraction":
			total = subtract2number(num1, num2);
			break;

		case "multiplication":
			total = multiply2number(num1, num2);
			break;

		case "division":
			total = divide2number(num1, num2);
			break;
		default:
			System.out.println("Please implement new operator");

		}
		return total;
	}

	public static int adding2number(int a, int b) {
		int total = a + b;
		return total;
	}

	public static int subtract2number(int a, int b) {
		int total = a - b;
		return total;
	}

	public static int multiply2number(int a, int b) {
		int total = a * b;
		return total;
	}

	public static int divide2number(int a, int b) {
		int total = a / b;
		return total;
	}

}
