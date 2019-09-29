package PolymorphismPractice;

public class Car {
	
	private String name;
	private String make;
	
	public Car (String name , String make) {
		this.name = name;
		this.make = make;
	}

	public String getMake() {
		return make;
	}
	
	public static String gettype() {
		return "There are different types of cars based on the engine types";
	}
	
	public String getName() {
		return name;
	}
	
	public String getmake() {
		return make;
	}
	
}
