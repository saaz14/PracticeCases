package String;

public class Stringcompare {

	public static void main(String[] args) {
		
		String valueA = "Hello Java";
		String valueB = "Hello";
		String valueC = " Java";
		String valueD = "hello java";
		
		//compare A to D
		if (valueA == valueD) {
			System.out.println(" They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
		//Create new string with B and C and compare with D
		String valueE = valueB + valueC;
		
		System.out.println(valueA + "\n" + valueE);
		if (valueA == valueE) {
			System.out.println("They are equal!");
		}
		else {
			System.out.println("They are still not equal!");
		}
		
		if (valueA.contentEquals(valueE)) {
			System.out.println("They are now equal when we use compare statement within if command");
		}

	}

}
