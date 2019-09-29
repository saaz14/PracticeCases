package Polymorphism;

public class Toyota extends Car {
	
		   
	    public Toyota(String name, int Cylender) {
	        super(name, Cylender);
	    }

	    @Override
	    public String startEngine() {
	    	return getClass().getSimpleName() +  " -> startEngine()";
	    }

	    @Override
	    public String accelerate() {
	    	return getClass().getSimpleName() +  " -> accelerate()";
	    }

	    @Override
	    public String brake() {
	    	//getClass() returns the name of the class.
	    	return getClass().getSimpleName() +  " -> brake()";
	    }
	    

}
