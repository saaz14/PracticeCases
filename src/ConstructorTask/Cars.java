package ConstructorTask;

public class Cars {
	
	String Make;
	String Model;
	int Cylender;
	String Color;
	
	public Cars() {
		System.out.println("This is a default constructor");
	}
	
	public Cars(String Make, String Model, int Cylender, String Color) {
		
		this.Make = Make;
		this.Model = Model;
		this.Cylender = Cylender;
		this.Color = Color;
		
		System.out.println("Car Make is: " + Make + "," + Model + " " + Color + " color. It has " + Cylender + " cylenders");
	}
	
	
	
	
	
	
	
//	public Dog() {
//		System.out.println("This prints out before anything");
//	}
//	
//	
//	//Create parameterized constructor of the Dog
//	public Dog(String breed,int age ,String color ) {
//		
//		this.breed = breed;
//		this.age = age;
//		this.color = color;
//		//Dog.numberOfLegs = numberOfLegs;
//		System.out.println("Printing from parameterized constructor");
//		System.out.println("Dog breed : " + breed +" , age : "+ age + " , color "+ color );

}
