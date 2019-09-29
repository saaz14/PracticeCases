package Overriding;

public class CallingSub {

	public static void main(String[] args) {

		Company a = new Company();
		TechTraining b = new TechTraining();
		Company c = new TechTraining();     //This is OverRiding
		NotASubClass d = new NotASubClass(); // This class is has no relation with Parent class
		
		
	a.address();
	b.address();
	c.address();
	d.address();
	b.TestingArray();
	}

}
