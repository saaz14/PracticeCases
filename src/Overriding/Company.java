package Overriding;

public class Company {
	
	public void address() {
		System.out.println("This is from super class called Company...");
	}
	
	public void TestingArray() {
		
		String str = "TechCircle";
		
		char[] charArr = str.toCharArray();
		
		try {
			for (int i = 0 ; i<=str.length() ; i++) {
				System.out.println("Printin Chr: " + charArr[i]);
			}
		} catch (Exception e) {
			System.out.println("Array Index Problem");
		
		}
	}

}
