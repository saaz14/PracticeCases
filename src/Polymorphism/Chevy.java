package Polymorphism;

public class Chevy extends Car {
   
	    public Chevy(String name, int Cylender) {
	        super(name, Cylender);
	    }

	    @Override
	    public String startEngine() {
	        return "Chevy -> startEngine()";
	    }

	    @Override
	    public String accelerate() {
	        return "Chevy -> accelerate()";
	    }

	    @Override
	    public String brake() {
	        return "Chevy -> brake()";
	    }
	    
}
