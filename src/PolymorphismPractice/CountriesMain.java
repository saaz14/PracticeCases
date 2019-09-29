package PolymorphismPractice;

public class CountriesMain {
	
	public static Countries generateNum() {
		
		int num = (int) ((Math.random()) * 4) + 1;
		System.out.println("Random nymber generated is: " + num);
		
		switch(num) {
		
		case 1:
			return new USA();
		case 2:
			return new Pakistan();
		case 3:
			return new England();
		case 4:
			return new Japan();
		}
		return null;
	}

	public static void main(String[] args) {
		
		for (int i=1; i<5; i++) {
			
			Countries country = generateNum();
			 System.out.println("Currency of " + country.getName() + " is " + country.Currency());
		}
	}

}
