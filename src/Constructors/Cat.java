package Constructors;

public class Cat {
	int CatAge;
	
	public Cat(String name) {
		System.out.println("Name Chosen is: " + name);
	}
	
	public void setAge(int age) {
		this.CatAge = age;
	}
	
	public int getAge() {
		System.out.println("Cat's age is: " + CatAge);
		return CatAge;
	}
	
	public static void main(String[] args) {
		Cat kitty = new Cat("Simba");
		
		kitty.setAge(3);
		
		kitty.getAge();
		
		System.out.println("Variable Value: " + kitty.CatAge);
	}

}
