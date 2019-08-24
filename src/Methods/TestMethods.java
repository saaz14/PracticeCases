package Methods;

public class TestMethods {
	

	static void myMethod() {
		System.out.println("Hello World");
	}
	
	static void myMethod(String name) {
		System.out.println(name + " Abbas");
	}
	
	static int myMethod(int x) {
		return 5 + x ;
	}
	
	public static void main(String[] args) {
		
		
		myMethod();
		myMethod("Aqeel");
		System.out.println(myMethod(3));
		
	}
	
	  

}
