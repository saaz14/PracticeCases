package Polymorphism;

public class Car {
	
	private String name;
	private int Cylender;
	private int wheels;
	private boolean engine;
	
	public Car (String name, int Cylender) {
		
		this.name = name;	
		this.Cylender = Cylender;
		this.wheels = 4;
		this.engine = true;
	}	
	
	public String name() {
		return name;
	}
	
	public int getCylender() {
		return Cylender;
	}
	
	public String startEngine() {
		return "Car >>> startEngine()";
	}
	
	public String accelerate() {
		return "Car >>> acceletare()";
	}
	
	public String brake() {
        return "Car >>> brake()";
    }
	
	
	

}
