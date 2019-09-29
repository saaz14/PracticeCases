package Testinheritence;

public class Dog extends Animal {

	
	@Override
public void walk() {
	System.out.println("Dog walks and runs");		
}

	
	@Override
public void makeSound() {
	System.out.println("Dog eats bones");	
}
}