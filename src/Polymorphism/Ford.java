package Polymorphism;

public class Ford extends Car {

	public Ford(String name, int Cylender) {
        super(name, Cylender);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
    

}
