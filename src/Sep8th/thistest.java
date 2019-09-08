package Sep8th;

public class thistest {
	
	
	int variable = 5;
	
	void method(int variable) {
		variable = 10;
		System.out.println("Value of Instance variable: " + this.variable);
		System.out.println("Value of Variable: " + variable);
	}
	
	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable: " + this.variable);
		System.out.println("Value of Variable: " + variable);
	}
	
	thistest () {
		this("WELLCOME TO THE FUTURE!!");
		System.out.println("Inside Constructor without parameter");
	}
	
	thistest(String str) {
		System.out.println("Inside Constructor with String parameter as " + str);
	}
	
	
	public static void main(String[] args) {
		thistest obj = new thistest();
		obj.method(20);
		obj.method();
	}

}
