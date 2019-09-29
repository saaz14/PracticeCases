package Overriding;

public class Parent {
	
	void show() {
		System.out.println("Parent's show()");
	}
	
	private void m1() {
		System.out.println("From Parent's m1()");
	}
	
	protected void m2() {
		
		System.out.println("From Parent's m2()");
	}

}
