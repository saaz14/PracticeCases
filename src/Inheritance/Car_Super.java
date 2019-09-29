package Inheritance;

public class Car_Super extends Vehicle_super {
	int maxSpeed = 180;
	
	void display() {
		//Print maxSpeed of base class (Vehicle_super)
		System.out.println("Maximum Speed from Vehicle class: " + super.maxSpeed);
		
		System.out.println("Maximum Speed from Car_Super class: " + maxSpeed);
		
	}

}
