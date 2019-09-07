package Constructors;

public class Puppy {
	
	public Puppy() {

		System.out.println(":-)");
	}

	public Puppy(String name) {
		System.out.println("Name is: " + name);
	}

	public static void main(String[] args) {

		Puppy myPuppy = new Puppy("Tommy");
	}

}
