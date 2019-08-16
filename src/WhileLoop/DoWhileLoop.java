package WhileLoop;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		/*
		 * int valueX = 18;
		 * 
		 * do { System.out.println("value of X on line 10 is: " + valueX); ++valueX;
		 * System.out.println("value of X on ine 20 is: " + valueX); } while (valueX <=
		 * 20);
		 */
		
//		int valueA = 25;
		
//		do {
//			System.out.println("Value of A at line 18 is: " + valueA);
//			++valueA;
//			if (valueA == 50) {
//				System.out.println("It will print the value of A which is: " + valueA);
//				break;
//			}
//		}
//		while (valueA <= 55);
		
		int valueB = 30;
		do {
			System.out.println("Value of B is: " + valueB);
			++valueB;
			if (valueB == 50) {
				System.out.println("It will print the value of B which is: " + valueB + "and then continue with the loop since we are commanding CONTINUE");
				continue;
			}
			
			if (valueB == 55) {
				System.out.println("It will print the value of B now as: " + valueB);
			}
		}
		while (valueB <= 60);
		
	}

}
