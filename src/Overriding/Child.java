package Overriding;

public class Child extends Parent{
	
	@Override
	void show() {
		System.out.println("Child's show()");
	}
	
	
	private void m1() {
		System.out.println("From Child's m1()");
	}
	
	@Override
	protected void m2() {
		
		System.out.println("From Child's m2()");
	}

}
