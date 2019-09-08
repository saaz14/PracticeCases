package ObjectsAndClasses;

import java.util.ArrayList;

public class CallingDog1 {

	public static void main(String[] args) {
		Dog abc = new Dog();
		
		abc.breed = "PitBull";
		abc.age = 5;
		abc.color = "Black";
		
		System.out.println("Breed of Dof is: " + abc.breed);
		System.out.println("Age of " + abc.breed + " is " + abc.age);
		System.out.println("The Color of this " + abc.breed + " is " + abc.color);
		
		abc.barking();

	}

}
